package org.sgx.gapi.client;

import org.sgx.gapi.client.auth.GAPIAuth;
import org.sgx.gapi.client.client.GAPIClient;
import org.sgx.gapi.client.util.GAPILoadCallback;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * @see http://code.google.com/p/google-api-javascript-client/wiki/ReferenceDocs
 * @author sg
 *
 */
public class GAPI extends JavaScriptObject {
	protected GAPI() {
	}

	public static final native GAPI get()/*-{
		return $wnd.gapi; 
	}-*/;

/**
 * 
 * @return
 */
public static native final void load(GAPILoadCallback c) /*-{
@org.sgx.gapi.client.util.GAPIUtil::install(Lorg/sgx/gapi/client/util/GAPILoadCallback;)(c); 
}-*/;
	
/**
 * 
 * @return
 */
public native final GAPIAuth auth() /*-{
return this["auth"]; 
}-*/;

/**
 * 
 * @return
 */
public native final GAPIClient client() /*-{
return this["client"]; 
}-*/;
}
