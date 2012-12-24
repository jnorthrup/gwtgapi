package org.sgx.gapitest.client.test;

import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.fusiontables.table.TableListRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.gapi.client.auth.AuthCallback;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.client.ClientLoadCallback;
import org.sgx.gapi.client.loader.AuthUtil;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapitest.client.TestConstants;
import org.sgx.gapitest.client.app.Gallery;
import org.sgx.gapitest.client.app.Test;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * This test is similar uses oauth for accessing fusiontables. Use java class AuthUtil for easing the auth stuff.
 * 
 * @author sg
 * 
 */
public class GAPITest2 implements EntryPoint, Test {

	private String clientId;
	private String apiKey;
	private String scope;
	private GAPI gapi;
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

		clientId = TestConstants.CLIENT_ID;

		apiKey = TestConstants.API_KEY;

		scope = "https://www.googleapis.com/auth/fusiontables";

		authButton = new Button("authenticate");
		RootPanel.get().add(authButton);

		gapi = GAPI.get();

		gapi.client().setApiKey(apiKey);

		AuthUtil authUtil = new AuthUtil();
		authUtil.authenticate(clientId, authButton, scope, new AuthCallback() {

			@Override
			public void authenticated(AuthResponse r) {
				makeApiCall();
			}
		});
	}

	protected void makeApiCall() {
		gapi.client().load("fusiontables", "v1", new ClientLoadCallback() {
			@Override
			public void loaded() {

				new TableListRequest().execute(new GAPICallback<TableListResult>() {
					@Override
					public void call(TableListResult result) {
						if (result.error() != null) {
							Gallery.getInstance().getConsole().append("error : " + result.error()); 
							return;
						}
						else {
							Gallery.getInstance().getConsole().append("RESULT2: " + JsUtil.dumpObj(result));
						}
					}
				});

			}
		});
	}

	// test stuff
	@Override
	public String getId() {
		return "GAPITest2";
	}

	@Override
	public String getDescription() {
		return "This test is similar uses oauth for accessing fusiontables. Use java class AuthUtil for easing the auth stuff.";
	}

	@Override
	public Map<String, TextResource> getResources() {
		return null;
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
