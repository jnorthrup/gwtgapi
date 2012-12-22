package org.sgx.gwtfusiontablestest.client;

import org.sgx.gwtfusiontables.client.FTResult;
import org.sgx.jsutil.client.FTUtil;
import org.sgx.jsutil.client.JsArrayCollectionTest;
import org.sgx.jsutil.client.JsUtil;

import com.google.api.gwt.oauth2.client.Auth;
import com.google.api.gwt.oauth2.client.AuthRequest;
import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.AreaElement;
import com.google.gwt.dom.client.BodyElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.TextAreaElement;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class FusionTablesTest implements EntryPoint {

	private TextAreaElement ta;

	@Override
	public void onModuleLoad() {

		oauthTest();

		// JsArrayCollectionTest.main(null);

	}

	private void oauthTest() {
		ta = Document.get().createTextAreaElement();
		Document.get().getBody().appendChild(ta);

		String FT_OAUTH2_RW_SCOPE = "https://www.googleapis.com/auth/fusiontables", FTOAUTH2_R_SCOPE = "https://www.googleapis.com/auth/fusiontables.readonly";

		String GOOGLE_AUTH_URL = "https://accounts.google.com/o/oauth2/auth";

		// oauth - see https://code.google.com/apis/console/?pli=1#project:1081991926563:access and https://code.google.com/p/gwt-oauth2/wiki/GettingStarted

		/*
		 * client_id : This app's personal client ID assigned by the Google APIs Console. get it from https://code.google.com/apis/console/.
		 * 
		 * In the case of localhost, the url must be exactly the same. In this case was type: Web Application, redirect URIs :
		 * http://127.0.0.1:8888/org.sgx.gwtfusiontablestest.FusionTablesTest/oauthWindow.html JavaScript origins: http://127.0.0.1:8888
		 */
		String CLIENT_ID = "1081991926563-klu3mb1snupl8ei4ja4tiii21jgdeok7.apps.googleusercontent.com";// 1081991926563.project.googleusercontent.com"; // available from the APIs
																										// console

		// Use the implementation of Auth intended to be used in the GWT client app.
		final Auth AUTH = Auth.get();

		final AuthRequest req = new AuthRequest(GOOGLE_AUTH_URL, CLIENT_ID).withScopes(FT_OAUTH2_RW_SCOPE);

		// Calling login() will display a popup to the user the first time it is
		// called. Once the user has granted access to the application,
		// subsequent calls to login() will not display the popup, and will
		// immediately result in the callback being given the token to use.
		AUTH.login(req, new Callback<String, Throwable>() {
			@Override
			public void onSuccess(String token) {
				Window.alert("Got an OAuth token:\n" + token + "\n" + "Token expires in " + AUTH.expiresIn(req)
						+ " ms\n");

				doFTTest1(token);
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Error:\n" + caught.getMessage());
			}
		});
		// }

	}

	protected void doFTTest1(String access_token) {

		String key = "AIzaSyAeX11OLg0zyBDlpYr2lqs4POPEjyWrooY";
		String url =
		//

		// //list all tables of user
				"https://www.googleapis.com/fusiontables/v1/tables";
		//
		// //get table columns
		// // "https://www.googleapis.com/fusiontables/v1/tables/1KxVV0wQXhxhMScSDuqr-0Ebf0YEt4m4xzVplKd4/columns";
		//
		// //query from a table
		// // "https://www.googleapis.com/fusiontables/v1/query?sql=SELECT%20*%20FROM%201KxVV0wQXhxhMScSDuqr-0Ebf0YEt4m4xzVplKd4";
		//
		url += "?key=" + key;// + "&access_token=" + access_token;
		FTUtil.main(url, new AsyncCallback<FTResult>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("onFailure: " + caught);
			}

			@Override
			public void onSuccess(FTResult result) {

				 String s = JsUtil.dumpObjPrintTypes(result);
				 System.out.println("hall: "+result.toSource());
				 
				// System.out.println(result.error().message());
				// System.out.println("SSS: "+result.objGetString("kind"));JsUtil.dumpObjPrintTypes(result));//.objGetObj("error")));//result.columns().get(0)+"");
				// JsUtil.isArray());
				// ta.setValue(s);
				// Window.alert("onSuccess: "+result);
			}
		});
	}

}
