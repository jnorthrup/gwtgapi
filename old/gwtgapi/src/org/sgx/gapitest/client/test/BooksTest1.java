package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.books.BooksModule;
import org.sgx.gapi.client.apis.books.VolumeList;
import org.sgx.gapi.client.apis.books.VolumeListRequest;
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
import org.sgx.gapitest.client.app.Gallery;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * show how to use the books API. No auth required. 
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
		
		ModuleDefinition moduleDef = new BooksModule(); 
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
		new VolumeListRequest("zaraturstra").execute(new GAPICallback<VolumeList>() {
			
			@Override
			public void call(VolumeList resp) {
				if(resp.error()!=null) 
					Gallery.getInstance().log("ERROR: "+JsUtil.dumpObj(resp.error(), true));
				else 
					Gallery.getInstance().log("Long url : "+resp.items().length());				
			}
		});
		
	}

	
	@Override
	public String getId() {
		return "books1";
	}
	
	@Override
	public String getDescription() {
		return "show how to use the books API. No auth required. ";
	}

	@Override
	public Map<String, GAPITestTextResource> getResources() {
		HashMap<String, GAPITestTextResource> m = new HashMap<String, GAPITestTextResource>();
		m.put("BooksTest1.java", new GAPITestTextResource(TestResources.INSTANCE.BooksTest1()));
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
