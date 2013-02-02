package org.sgx.gapi.client.util;

import org.sgx.gapi.client.loader.AuthUITrigger;
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.Callback;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FocusWidget;

/**
 * 
 * @author sg
 * 
 */
public class GAPIUtil {
	public static final String CLIENT_JS_URL = "https://apis.google.com/js/client.js";

	public static void install(GAPILoadCallback c) {
		ScriptElement script = Document.get().createScriptElement();
		String callbackFunctionName = "_gapiClientCallback";
		linkCallback(callbackFunctionName, c); 

		// complete url like https://apis.google.com/js/client.js?onload=handleClientLoad
		String url = CLIENT_JS_URL + "?onload=" + callbackFunctionName;

		script.setSrc(url);
		
		Document.get().getBody().appendChild(script); 
	}

	private static native final void linkCallback(String callbackId, GAPILoadCallback c) /*-{

		var fn = $entry(function() {
			return c.@org.sgx.gapi.client.util.GAPILoadCallback::loaded()();
		});

		$wnd[callbackId] = fn;

	}-*/;

	public static AuthUITrigger buildAuthUITriggerFrom(final FocusWidget t) {
		return new AuthUITrigger() {
			
			@Override
			public void setEnabled(boolean enabled) {
				t.setEnabled(enabled); 
			}
			
			@Override
			public void addTriggerHandler(final Runnable r) {
				t.addClickHandler(new ClickHandler() {					
					@Override
					public void onClick(ClickEvent event) {
						r.run(); 
					}
				}); 
			}
		};
	}

	public static void paramPut(JsObject params, String name, String val) {
		if(val!=null)
			params.objPut(name, val);		
	}

	public static void paramPut(JsObject params, String name, int val, int def) {
		if(val!=def)
			params.objPut(name, val);			
	}

	public static void paramPut(JsObject params, String name, boolean val) {
		params.objPut(name, val);			
	}

	public static String toJSON(JsObject params) {
		return new JSONObject(params).toString(); 
	}

}
