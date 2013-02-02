package org.sgx.gapi.client.auth;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sg
 *
 */
public class AuthResponse extends JavaScriptObject {
protected AuthResponse(){}

/**
 * authentication error if any of null if no error. 
 * @return
 */
public native final AuthError error() /*-{
return this["error"]; 
}-*/;

/**
 * authentication error if any of null if no error. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthResponse error(AuthError val) /*-{
this["error"] = val; 
return this; 
}-*/;
}
