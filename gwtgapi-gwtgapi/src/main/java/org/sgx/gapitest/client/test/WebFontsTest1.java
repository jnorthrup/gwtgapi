package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.webfonts.WebFontList;
import org.sgx.gapi.client.apis.webfonts.WebFontsModule;
import org.sgx.gapi.client.apis.webfonts.WebFontsRequest;
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
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * show how to use the webfonts API. No auth required.
 * 
 * @author sg
 * 
 */
public class WebFontsTest1 extends AbstractTest implements EntryPoint {

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

		ModuleDefinition moduleDef = new WebFontsModule();
		GAPILoader loader = new GAPILoader(moduleDef);
		loader.load(new GAPILoaderCallback() {
			@Override
			public void loaded(AuthResponse authResp) {
				callApi();
			}
		});

	}

	protected void callApi() {

		new WebFontsRequest().execute(new GAPICallback<WebFontList>() {

			@Override
			public void call(WebFontList result) {
				if (result.error() != null) {
					log("webfonts error: " + result.error().message());
					return;
				}
				String s = "";
				for (int i = 0; i < result.items().length(); i++) {
					s += result.items().get(i).family() + ", ";
				}
				log("webfonts : " + s);

			}
		});

	}

	@Override
	public String getId() {
		return "webFonts1";
	}

	@Override
	public String getDescription() {
		return "show how to use the webfonts API. No auth required.";
	}

	@Override
	public Map<String, GAPITestTextResource> getResources() {
		HashMap<String, GAPITestTextResource> m = new HashMap<String, GAPITestTextResource>();
		m.put("WebFontsTest1.java", new GAPITestTextResource(TestResources.INSTANCE.WebFontsTest1()));
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
