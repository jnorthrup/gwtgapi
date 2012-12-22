package org.sgx.gapi.client.client;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * @see http://code.google.com/p/google-api-javascript-client/wiki/ReferenceDocs
 * @author sg
 *
 */
public class GAPIClient extends JavaScriptObject {
	protected GAPIClient() {
	}

	public static final native GAPIClient get()/*-{
//		var fn = @org.sgx.jsutil.client.JsUtil::tojs
		return $wnd.gapi.client;
	}-*/;

}
