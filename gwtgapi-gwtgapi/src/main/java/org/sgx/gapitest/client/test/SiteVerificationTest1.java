package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

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
import org.sgx.gapi.client.loader.ModuleDefinitionImpl;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapi.client.util.GAPIUtil;
import org.sgx.gapitest.client.AbstractTest;
import org.sgx.gapitest.client.GAPITestConstants;
import org.sgx.gapitest.client.GAPITestTextResource;
import org.sgx.gapitest.client.app.Gallery;

import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * in this example we test the site-verification api and use the GAPILoader java utility for easily authenticate and loads a module. 
 * 
 * @author sg
 * 
 */
public class SiteVerificationTest1 extends AbstractTest {

	private String apiKey;
	private String scope;
	private String clientId;
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

		authButton = new Button("authenticate");
		RootPanel.get().add(authButton);
		AuthUITrigger authUITrigger = GAPIUtil.buildAuthUITriggerFrom(authButton); 		
		
		clientId = GAPITestConstants.CLIENT_ID;

		scope = "https://www.googleapis.com/auth/siteverification";

		apiKey = GAPITestConstants.API_KEY;

		GAPI.get().client().setApiKey(apiKey);		

		ModuleDefinition moduleDef = new ModuleDefinitionImpl("siteverification", "v1");
		
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

	@Override
	public String getId() {
		return "siteVerification1";
	}

	@Override
	public String getDescription() {
		return "tin this example we test the site-verification api and use the GAPILoader java utility for easily authenticate and loads a module.";
	}

	@Override
	public Map<String, GAPITestTextResource> getResources() {
		HashMap<String, GAPITestTextResource> m = new HashMap<String, GAPITestTextResource>();
		m.put("SiteVerificationTest1.java", new GAPITestTextResource(TestResources.INSTANCE.SiteVerificationTest1()));
		return m;
	}

	@Override
	public String[] getTags() {
		return null;
	}

}
