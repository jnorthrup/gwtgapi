package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.translate.TranslateModule;
import org.sgx.gapi.client.apis.translate.TranslateRequest;
import org.sgx.gapi.client.apis.translate.TranslateResponse;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.loader.GAPILoader;
import org.sgx.gapi.client.loader.GAPILoaderCallback;
import org.sgx.gapi.client.loader.ModuleDefinition;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapitest.client.AbstractTest;
import org.sgx.gapitest.client.GAPITestConstants;
import org.sgx.gapitest.client.GAPITestTextResource;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * show how to use the translate API. No auth required. 
 * 
 * @author sg
 * 
 */
public class BooksTest1 extends AbstractTest implements EntryPoint {

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
		GAPI.get().client().setApiKey(GAPITestConstants.API_KEY);
		
		ModuleDefinition moduleDef = new TranslateModule(); 
		GAPILoader loader = new GAPILoader(moduleDef); 
		loader.load(new GAPILoaderCallback() {			
			@Override
			public void loaded(AuthResponse authResp) {
				callApi();
			}
		}); 

	}

	protected void callApi() {
		
		//java friendly way
		new TranslateRequest("en", "es", "doing").execute(new GAPICallback<TranslateResponse>() {
			
			@Override
			public void call(TranslateResponse result) {
				if(result.error()!=null)
					log("translate error: "+result.error().message());
				else
					log("translate : "+result.data().translations().get(0).translatedText());
			}
		}); 
		
	}

	
	@Override
	public String getId() {
		return "translate1";
	}
	
	@Override
	public String getDescription() {
		return "show how to use the translate API. No auth required. ";
	}

	@Override
	public Map<String, GAPITestTextResource> getResources() {
		return null; 
//		HashMap<String, TextResource> m = new HashMap<String, TextResource>(); 
//		m.put("TranslateTest1.java", TestResources.INSTANCE.TranslateTest1());
//		return m;
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
