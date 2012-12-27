package org.sgx.gapitest.client.test;

import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.apis.customsearch.CustomSearchRequest;
import org.sgx.gapi.client.apis.customsearch.CustomSearchResult;
import org.sgx.gapi.client.apis.urlshortener.UrlResource;
import org.sgx.gapi.client.apis.urlshortener.UrlShortenerGetRequest;
import org.sgx.gapi.client.apis.urlshortener.UrlShortenerInsertRequest;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.gapi.client.loader.GAPILoader;
import org.sgx.gapi.client.loader.GAPILoaderCallback;
import org.sgx.gapi.client.loader.ModuleDefinition;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapitest.client.GAPITestConstants;
import org.sgx.gapitest.client.app.Gallery;
import org.sgx.gapitest.client.app.Test;
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * test the customsearch api
 * 
 * @author sg
 * 
 */
public class CustomSearchTest1 implements EntryPoint, Test {

	private String apiKey;
	private GAPI gapi;

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

		apiKey = GAPITestConstants.API_KEY;

		gapi = GAPI.get();

		gapi.client().setApiKey(apiKey);
		
		ModuleDefinition moduleDef = new ModuleDefinition("customsearch", "v1");
		GAPILoader loader = new GAPILoader(moduleDef); 
		loader.load(new GAPILoaderCallback() {			
			@Override
			public void loaded(AuthResponse authResp) {
				callApi();
			}
		}); 

	}

	protected void callApi() {
		
		//the cx is the context and one can be created here http://www.google.com/cse/manage/create/3?cx=013649759924195437647:1p4ryvgnqvm
		String cx = "013649759924195437647:1p4ryvgnqvm", query = "gwt";		
			      
		new CustomSearchRequest(cx, query).execute(new GAPICallback<CustomSearchResult>() {
			
			@Override
			public void call(CustomSearchResult result) {
				if(result.error()!=null) 
					Gallery.getInstance().log("INSERT ERROR: "+result.error().message()); 
				else 
					Gallery.getInstance().log("custom search results : "+result.items().length()); 
			}
		});		
	}
	
	@Override
	public String getId() {
		return "CustomSearchTest1";
	}
	
	@Override
	public String getDescription() {
		return "test the customsearch api";
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
