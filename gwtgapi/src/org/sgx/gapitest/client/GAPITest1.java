package org.sgx.gapitest.client;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
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
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;
import org.sgx.jsutil.client.SimpleCallback;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
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
public class GAPITest1 implements EntryPoint {

	private String clientId;
	private String apiKey;
	private String scope;
	private GAPI gapi;
	private Button authButton;
	private AuthCallback handleAuthResult;

	@Override
	public void onModuleLoad() {

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
				System.out.println("HHH: " + JsUtil.dumpObj(r) + " - " + JsUtil.dumpObj(r.error()));
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
		clientId = TestConstants.CLIENT_ID;

		apiKey = TestConstants.API_KEY;

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

		System.out.println("gapi loaded");
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

				// execute request - easy way

				new PeopleGetRequest<PeopleGetResult>("me").execute(new GAPICallback<PeopleGetResult>() {
					@Override
					public void call(PeopleGetResult result) {
						System.out.println("RESULT: " + result.displayName());
					}
				});

				// execute request - manually. The first Java sollution is based on this.

				ClientRequestCallback requestCallback = new ClientRequestCallback() {
					@Override
					public void call(JsObject jsonResp, String rawResp) {
						System.out.println("executed");
						System.out.println(JsUtil.dumpObj(jsonResp));
						System.out.println(rawResp);
					}
				};
				HttpRequest req = gapi.client().request(
						ClientRequest.create().path("/plus/v1/people/get").params(JsObject.one("userId", "me")));

			}
		});
	}

}
