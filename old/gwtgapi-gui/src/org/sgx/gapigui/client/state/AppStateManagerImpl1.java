package org.sgx.gapigui.client.state;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.fusiontables.FTModule;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.loader.AuthDefinition;
import org.sgx.gapi.client.loader.AuthUITrigger;
import org.sgx.gapi.client.loader.GAPILoader;
import org.sgx.gapi.client.loader.GAPILoaderCallback;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapi.client.util.GAPIUtil;
import org.sgx.gapigui.client.Main;
import org.sgx.gapigui.client.ui.GapiAuthView;
import org.sgx.gapigui.client.ui.Introduction;
import org.sgx.gapigui.client.ui.actions.ft.Queries;
import org.sgx.gapigui.client.ui.actions.ft.Tables;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

/**
 * impl using gwt history. Because this class is responsible of starting the different states views and because each state requires one or more different gapi modules to be loaded
 * this class is also repsonsbile of loading the required gapi modules and authenticate the user before loading the ui
 * 
 * @author sg
 * 
 */
public class AppStateManagerImpl1 implements AppStateManager {

	// Panel mainPanel;
	Map<String, State> states;

	Map<String, GAPIModule> modules;

	public AppStateManagerImpl1() {
//		Panel mainPanel = Main.layout().body().getMainPanel();
		states = new HashMap<String, State>();
		modules = new HashMap<String, GAPIModule>();
		listeners = new LinkedList<StateListener>();

		initStates();
		initModules();

		registerForHistoryEvents();
	}

	private void initModules() {
		GAPIModule module = new GAPIModule(new FTModule(), "https://www.googleapis.com/auth/fusiontables");
		modules.put(STATE_FT_TABLES, module);

		// GAPIUtil.buildAuthUITriggerFrom(Main.layout())
		// AuthDefinition auth = new AuthDefinitionImpl(GAPIConstants.CLIENT_ID, "", authUITrigger)
		// mod = new AuthModuleDefinitionImpl();
	}

	private void initStates() {

		State state = null;
		Widget view = null;

		state = new State();
		state.setName(STATE_FT_TABLES);
		view = new Tables();
		state.setStateView(view);
		states.put(state.getName(), state);

		state = new State();
		state.setName(STATE_FT_QUERIES);
		view = new Queries();
		state.setStateView(view);
		states.put(state.getName(), state);

		state = new State();
		state.setName(STATE_INTRODUCTION);
		view = new Introduction();
		state.setStateView(view);
		states.put(state.getName(), state);
	}

	private void registerForHistoryEvents() {

		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			public void onValueChange(ValueChangeEvent<String> event) {

				String historyToken = event.getValue();
				System.out.println("value changed: " + historyToken);

				// Parse the history token
				// try {
				if (historyToken != null && historyToken.startsWith(HISTORY_PREFIX)) {// .substring(0, HISTORY_PREFIX.length()).equals("page")) {

					State state = searchStateInHistoryToken(historyToken);
					if (state != null) {
						navigate(state.getName());
					}
					// else {
					// navigate(STATE_DEFAULT);
					// }

					// String tabIndexToken = historyToken.substring(4, 5);
					// int tabIndex = Integer.parseInt(tabIndexToken);
					// Select the specified tab panel
					// tabPanel.selectTab(tabIndex);
				} else {
					// tabPanel.selectTab(0);
					navigate(STATE_DEFAULT);
				}

				// } catch (IndexOutOfBoundsException e) {
				// // tabPanel.selectTab(0);
				// }
			}
		});
	}

	protected State searchStateInHistoryToken(String historyToken) {
		if (historyToken.contains(STATE_FT_TABLES)) {
			return states.get(STATE_FT_TABLES);
		} else if (historyToken.contains(STATE_FT_QUERIES)) {
			return states.get(STATE_FT_QUERIES);
		} else if (historyToken.contains(STATE_INTRODUCTION)) {
			return states.get(STATE_INTRODUCTION);
		}

		return null;
	}

	@Override
	public void navigate(String name) {
		GAPIModule module = modules.get(name);
		if (module == null)
			return;

		loadModule(new ModuleLoadedListener() {
			@Override
			public void loaded(String name) {
				State state = states.get(name);
				if (state == null)
					return;
				Main.layout().body().showView(state.getStateView());
				History.newItem(HISTORY_PREFIX + name);
				notifyAllStateListeners();
			}
		}, name);
	}

	private void loadModule(ModuleLoadedListener l, String name) {
		GAPIModule module = modules.get(name);
		if (module == null)
			return;
		if (module.isLoaded())
			l.loaded(name);
		else {
			_loadModule(module, l, name);
		}
	}

	private void _loadModule(final GAPIModule module, final ModuleLoadedListener l, final String name) {
		GAPI.load(new GAPILoadCallback() {
			@Override
			public void loaded() {
//				
				GapiAuthView authPanel = Main.layout().createNewAuthPanel(); 
				Button authButton = authPanel.getAuthButton(); 
				AuthUITrigger authUITrigger = GAPIUtil.buildAuthUITriggerFrom(authButton);
				GAPI.get().client().setApiKey(GAPIConstants.API_KEY);

//				ModuleDefinition moduleDef = new FTModule(); 
				AuthDefinition authDefinition = new AuthDefinition(GAPIConstants.CLIENT_ID, module.getAuthScope(), authUITrigger);
				GAPILoader loader = new GAPILoader(authDefinition, module.getModule());
//				System.out.println("gapi loaded12: "+authDefinition+", "+module.getModule());
				loader.load(new GAPILoaderCallback() {
					@Override
					public void loaded(AuthResponse authResp) {
//						System.out.println("module laoded");
						module.setLoaded(true);
						l.loaded(name);
						System.out.println("MODULE "+module.getModule().getModuleName()+" loaded!");
						Main.layout().hideAuthPanel();
					}
				});
			}
		});
		
	}

	public static interface ModuleLoadedListener {
		void loaded(String name);
	}

	private void notifyAllStateListeners() {
		for (StateListener l : listeners) {
			l.notifyStateChange(this);
		}
	}

	/**
	 * gwts the state name from url. if not state is found returns null.
	 * 
	 * @param url
	 * @return
	 */
	public String urlContainsState(String url) {
		int i = url.lastIndexOf("#");
		if (i > 0) {
			String historyToken = null;
			try {
				historyToken = url.substring(i + 1, url.length());
			} catch (Exception e) {
			}
			State state = searchStateInHistoryToken(historyToken);
			if (state == null)
				return null;
			else
				return state.getName();
		}
		return null;
	}

	// String url = JsUtil.getCurrentAddressUrl();
	// if

	// state listeners
	List<StateListener> listeners;

	@Override
	public void addStateListener(StateListener l) {
		listeners.add(l);
	}

}
