package org.sgx.gwtgapitest1.client;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.siteVerification.SiteVerificationGetRequest;
import org.sgx.gapi.client.apis.siteVerification.SiteVerificationListRequest;
import org.sgx.gapi.client.apis.siteVerification.SiteVerificationListResult;
import org.sgx.gapi.client.apis.siteVerification.SiteVerificationWebResource;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.loader.AuthDefinition;
import org.sgx.gapi.client.loader.AuthUITrigger;
import org.sgx.gapi.client.loader.GAPILoader;
import org.sgx.gapi.client.loader.GAPILoaderCallback;
import org.sgx.gapi.client.loader.ModuleDefinition;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapi.client.util.GAPIUtil;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class GAPITest1 implements EntryPoint {

		private String apiKey;
		private String scope;
		private String clientId;
		private Button authButton;


		@Override
		public void onModuleLoad() {
			System.out.println("seee");
			test(RootPanel.getBodyElement()); 
		}

		public void test(Element parent) {
			GAPI.load(new GAPILoadCallback() {
				@Override
				public void loaded() {
					main();
				}
			});
		}

		protected void main() {

			authButton = new Button("authenticate");
			RootPanel.get().add(authButton);
			AuthUITrigger authUITrigger = GAPIUtil.buildAuthUITriggerFrom(authButton); 		
			
			clientId = CLIENT_ID;

			scope = "https://www.googleapis.com/auth/siteverification";

			apiKey = API_KEY;

			GAPI.get().client().setApiKey(apiKey);		

			ModuleDefinition moduleDef = new ModuleDefinition("siteverification", "v1");
			
			AuthDefinition authDefinition = new AuthDefinition(clientId, scope, authUITrigger); 
			GAPILoader loader = new GAPILoader(authDefinition, moduleDef); 
			loader.load(new GAPILoaderCallback() {
				
				@Override
				public void loaded(AuthResponse authResp) {
					callApi(); 
				}
			}); 

		}

		protected void callApi() {

			// java friendly way

			new SiteVerificationListRequest().execute(new GAPICallback<SiteVerificationListResult>() {
				@Override
				public void call(SiteVerificationListResult result) {
					if(result.error()!=null)
						log("site verification ERR: " + result.error().message());
					else
						log("site verification RESULT: " + result.items().length() + " - " + result.items().get(0).id());
				}
			});
			
			new SiteVerificationGetRequest("http://cancerberonia.blogspot.com").execute(new GAPICallback<SiteVerificationWebResource>() {
				
				@Override
				public void call(SiteVerificationWebResource result) {
					
					if(result.error()!=null)
						log("site verification 2 ERR: " + result.error().message());
					else
						log("Site verified 2 ownership: "+result.owners().get(0));
					 
				}
			}); 

		}


		protected void log(String s) {
			System.out.println(s);
		}


		public static String CLIENT_ID = "1081991926563-e64k9pb3cnmqqpegegaj85kim22vk0np.apps.googleusercontent.com";
		public static String API_KEY = "AIzaSyAeX11OLg0zyBDlpYr2lqs4POPEjyWrooY";

		
}
