package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIResult;
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
 * This test call urlshortener service that do not require any authentication
 * 
 * @author sg
 * 
 */
public class UrlShortener1 implements EntryPoint, Test {

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
		
		ModuleDefinition moduleDef = new ModuleDefinition("urlshortener", "v1");
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
		
		new UrlShortenerGetRequest("http://goo.gl/fbsS").execute(new GAPICallback<UrlResource>() {			
			@Override
			public void call(UrlResource result) {
				if(result.error()!=null) 
					Gallery.getInstance().log("ERROR: "+JsUtil.dumpObj(result.error(), true));
				else 
					Gallery.getInstance().log("Long url : "+result.longUrl());
			}
		}); 
		
		//insert
		
		UrlShortenerInsertRequest insertReq = new UrlShortenerInsertRequest("http://stackoverflow.com/questions/258668/gwt-overlay-types-converting-to-json");
		insertReq.execute(new GAPICallback<UrlResource>() {
			
			@Override
			public void call(UrlResource result) {
				if(result.error()!=null) 
					Gallery.getInstance().log("INSERT ERROR: "+result.error().message()); 
				else 
					Gallery.getInstance().log("INSERT new short url: "+result.id()); 
			}
		}); 
		
		
		
		

		//another way : manually create the request:
		
		ClientRequest reqDef = ClientRequest.create()
				.path("/urlshortener/v1/url/")
				.params(JsObject.one("shortUrl", "http://goo.gl/fbsS")); 
		HttpRequest req = gapi.client().request(reqDef);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult resp, String rawResp) {
				if(resp.error()!=null) 
					Gallery.getInstance().log("ERROR: "+JsUtil.dumpObj(resp.error(), true));
				else 
					Gallery.getInstance().log("Long url : "+resp.objGetString("longUrl"));
			}
		}); 
		
		
	}

	
	@Override
	public String getId() {
		return "UrlShortener1";
	}
	
	@Override
	public String getDescription() {
		return "Example of using get and insert urlshortener";
	}

	@Override
	public Map<String, TextResource> getResources() {
		HashMap<String, TextResource> m = new HashMap<String, TextResource>(); 
		m.put("UrlShortener1.java", TestResources.INSTANCE.UrlShortener1());
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
