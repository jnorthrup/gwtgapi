package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.apis.fusiontables.table.TableListRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.gapi.client.apis.plus.PeopleGetRequest;
import org.sgx.gapi.client.apis.plus.PeopleGetResult;
import org.sgx.gapi.client.auth.AuthCallback;
import org.sgx.gapi.client.auth.AuthRequest;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.client.ClientLoadCallback;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapitest.client.GAPITestConstants;
import org.sgx.gapitest.client.app.AbstractTest;
import org.sgx.gapitest.client.app.Gallery;
import org.sgx.gapitest.client.app.Test;
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;
import org.sgx.jsutil.client.SimpleCallback;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * an full contained example analog to http://code.google.com/p/google-api-javascript-client/source/browse/samples/authSample.html
 * 
 * Here we do auth manually and show two different ways of accessing the api.
 * 
 * @author sg
 * 
 */
public class GAPITest1 extends AbstractTest implements EntryPoint, Test {

	private String clientId;
	private String apiKey;
	private String scope;
	private GAPI gapi;
	private Button authButton;
	private AuthCallback handleAuthResult;

	@Override
	public void test(Element parent) {
		// load the google api client js first of all
		GAPI.load(new GAPILoadCallback() {
			@Override
			public void loaded() {
				// when it is loaded run some test.
				main();
			}
		});
	}

	protected void main() {

		// authorization and a call

		handleAuthResult = new AuthCallback() {
			@Override
			public void authenticated(AuthResponse r) {
				if (r != null && r.error() == null) {
					authButton.removeFromParent();
					makeApiCall();
				} else {
					authButton.setEnabled(true);
					authButton.addClickHandler(new ClickHandler() {
						@Override
						public void onClick(ClickEvent e) {
							e.preventDefault();
							handleAuthClick();
						}
					});
				}
			}
		};
		clientId = GAPITestConstants.CLIENT_ID;

		apiKey = GAPITestConstants.API_KEY;

		scope = "https://www.googleapis.com/auth/plus.me";

		authButton = new Button("authenticate");
		RootPanel.get().add(authButton);
		authButton.setEnabled(false);

		gapi = GAPI.get();

		gapi.client().setApiKey(apiKey);

		JsUtil.setTimeout(new SimpleCallback() {
			@Override
			public void call() {
				gapi.auth().authorize(AuthRequest.create().client_id(clientId).scope(scope).immediate(true),
						handleAuthResult);
			}
		}, 1);

		// System.out.println("gapi loaded");
	}

	void checkAuth() {
		gapi.auth().authorize(AuthRequest.create().client_id(clientId).scope(scope).immediate(true), handleAuthResult);
	}

	protected void handleAuthClick() {
		gapi.auth().authorize(AuthRequest.create().client_id(clientId).scope(scope).immediate(false), handleAuthResult);
	}

	// 192.168.1.102:8888/index.html
	protected void makeApiCall() {
		gapi.client().load("plus", "v1", new ClientLoadCallback() {

			@Override
			public void loaded() {

				// we perform two operations, one using the Java easy api:

				new PeopleGetRequest<PeopleGetResult>("me").execute(new GAPICallback<PeopleGetResult>() {
					@Override
					public void call(PeopleGetResult result) {
						log("RESULT1: " +						
							result.displayName() // access the result using the Java API
							+ " - " + 
							result.objGetString("displayName")); // access the result using the JSO directly
					}
				});

				// and the other operation doing manual work. The first Java solution is based on this:

				ClientRequestCallback requestCallback = new ClientRequestCallback() {
					@Override
					public void call(GAPIResult jsonResp, String rawResp) {
						log("RESULT2: " + jsonResp.objGetString("displayName"));
					}
				};
				ClientRequest reqDef = ClientRequest.create().path("/plus/v1/people/get")
						.params(JsObject.one("userId", "me"));
				HttpRequest req = gapi.client().request(reqDef);
				req.execute(requestCallback);

			}
		});
	}

	// test stuff
	@Override
	public String getId() {
		return "GAPITest1";
	}

	@Override
	public String getDescription() {
		return "an full contained example analog to http://code.google.com/p/google-api-javascript-client/source/browse/samples/authSample.html. Here we do auth manually and show two different ways of accessing the api.";
	}

	@Override
	public Map<String, TextResource> getResources() {
		HashMap<String, TextResource> m = new HashMap<String, TextResource>(); 
		m.put("GAPITest1.java", TestResources.INSTANCE.GAPITest1());
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
