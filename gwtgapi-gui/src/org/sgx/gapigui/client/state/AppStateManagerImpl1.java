package org.sgx.gapigui.client.state;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapigui.client.Main;
import org.sgx.gapigui.client.ui.Introduction;
import org.sgx.gapigui.client.ui.actions.ft.Queries;
import org.sgx.gapigui.client.ui.actions.ft.Tables;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.HistoryListener;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

/**
 * impl using gwt history
 * 
 * @author sg
 * 
 */
public class AppStateManagerImpl1 implements AppStateManager {

	// Panel mainPanel;
	Map<String, State> states;

	public AppStateManagerImpl1() {
		Panel mainPanel = Main.layout().body().getMainPanel();
		states = new HashMap<String, State>();

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

		registerForHistoryEvents();

	}

	private void registerForHistoryEvents() {
		
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			public void onValueChange(ValueChangeEvent<String> event) {
				
				String historyToken = event.getValue();
				System.out.println("value changed: "+historyToken);

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
		State state = states.get(name);
		if (state == null)
			return;
		Main.layout().body().showView(state.getStateView());
		History.newItem(HISTORY_PREFIX + name);
	}
	/**
	 * gwts the state name from url. if not state is found returns null. 
	 * @param url
	 * @return
	 */
	public String urlContainsState(String url) {
		int i = url.lastIndexOf("#");
		if(i>0) {
			String historyToken = null; 
			try {
				historyToken = url.substring(i+1, url.length());
			} catch (Exception e) {
			}
			State state = searchStateInHistoryToken(historyToken);
			if(state==null)
				return null; 
			else 
				return state.getName(); 
		}
		return null;
	}
//	String url = JsUtil.getCurrentAddressUrl();
//	if
	
	
	

}
