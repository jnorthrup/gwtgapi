package org.sgx.gapi.client.util;

import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.Callback;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.user.client.Window;

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

}
