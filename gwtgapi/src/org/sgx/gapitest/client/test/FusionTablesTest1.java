package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.fusiontables.FTModule;
import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gapi.client.apis.fusiontables.table.TableListRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.gapi.client.auth.AuthCallback;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.client.ClientLoadCallback;
import org.sgx.gapi.client.loader.AuthDefinition;
import org.sgx.gapi.client.loader.AuthUITrigger;
import org.sgx.gapi.client.loader.AuthUtil;
import org.sgx.gapi.client.loader.GAPILoader;
import org.sgx.gapi.client.loader.GAPILoaderCallback;
import org.sgx.gapi.client.loader.ModuleDefinition;
import org.sgx.gapi.client.loader.ModuleDefinitionImpl;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapi.client.util.GAPIUtil;
import org.sgx.gapitest.client.GAPITestConstants;
import org.sgx.gapitest.client.app.AbstractTest;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * This test is similar uses oauth for accessing fusiontables. 
 * Use java class AuthUtil for easing the auth stuff but not the .
 * 
 * @author sg
 * 
 */
public class FusionTablesTest1 extends AbstractTest implements EntryPoint {

	private String clientId;
	private String apiKey;
	private String scope;
//	private GAPI gapi;
	private Button authButton;

	@Override
	public void test(Element parent) {
		GAPI.load(new GAPILoadCallback() {
			@Override
			public void loaded() {
				main();
			}
		});
	}

	protected void main() {

		clientId = GAPITestConstants.CLIENT_ID;

		apiKey = GAPITestConstants.API_KEY;

		scope = "https://www.googleapis.com/auth/fusiontables";

		authButton = new Button("authenticate");
		RootPanel.get().add(authButton);
		AuthUITrigger authUITrigger = GAPIUtil.buildAuthUITriggerFrom(authButton); 	
		
//		gapi = GAPI.get();

		GAPI.get().client().setApiKey(apiKey);

		
		ModuleDefinition moduleDef = new FTModule(); //("siteverification", "v1");		
		AuthDefinition authDefinition = new AuthDefinition(clientId, scope, authUITrigger); 
		GAPILoader loader = new GAPILoader(authDefinition, moduleDef); 
		loader.load(new GAPILoaderCallback() {			
			@Override
			public void loaded(AuthResponse authResp) {
				makeApiCall(); 
			}
		}); 
		
//		AuthUtil authUtil = new AuthUtil();
//		authUtil.authenticate(clientId, authButton, scope, new AuthCallback() {
//
//			@Override
//			public void authenticated(AuthResponse r) {
//				makeApiCall();
//			}
//		});
	}

	protected void makeApiCall() {
//		gapi.client().load("fusiontables", "v1", new ClientLoadCallback() {
//			@Override
//			public void loaded() {
				new TableListRequest().execute(new GAPICallback<TableListResult>() {
					@Override
					public void call(TableListResult result) {
						if (result.error() != null) {
							log("error : " + result.error().message());
						} else {
							String s = "";
							for (FTTable table : result.itemsCol()) {
								s += ", " + table.name();
							}
							log("TABLES names: " + s);
							// log("RESULT2: " + JsUtil.dumpObj(result));
						}
					}
				});
//			}
//		});
	}

	// test stuff
	@Override
	public String getId() {
		return "FusionTables1";
	}

	@Override
	public String getDescription() {
		return "This test is similar uses oauth for accessing fusiontables. Use java class AuthUtil for easing the auth stuff.";
	}

	@Override
	public Map<String, TextResource> getResources() {
		HashMap<String, TextResource> m = new HashMap<String, TextResource>();
		m.put("FusionTables.java", TestResources.INSTANCE.FusionTablesTest1());
		return m;
	}

	@Override
	public String[] getTags() {
		return null;
	}

	@Override
	public void onModuleLoad() {
		test(RootPanel.getBodyElement());
	}

}
