package org.sgx.gapi.client.auth;

import org.sgx.gapi.client.GAPI;
import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsArrayString;

public class AuthRequest extends JsObject {
protected AuthRequest(){}
public static final native AuthRequest create()/*-{
return {}; 
}-*/;
/**
 * The application's client ID.  Visit the <a href="https://code.google.com/apis/console/" rel="nofollow">Google API Console</a> to get an OAuth 2.0 client ID. 
 * @return
 */
public native final String client_id() /*-{
return this["client_id"]; 
}-*/;

/**
 * The application's client ID.  Visit the <a href="https://code.google.com/apis/console/" rel="nofollow">Google API Console</a> to get an OAuth 2.0 client ID. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthRequest client_id(String val) /*-{
this["client_id"] = val; 
return this; 
}-*/;

/**
 *  If true, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to the user. 
 * @return
 */
public native final boolean immediate() /*-{
return this["immediate"]; 
}-*/;

/**
 *  If true, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to the user. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthRequest immediate(boolean val) /*-{
this["immediate"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String response_type() /*-{
return this["response_type"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthRequest response_type(String val) /*-{
this["response_type"] = val; 
return this; 
}-*/;

/**
 * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation. 
 * @return
 */
public native final JsArrayString scope() /*-{
return this["scope"]; 
}-*/;

/**
 * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthRequest scope(JsArrayString val) /*-{
this["scope"] = val; 
return this; 
}-*/;
/**
 * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthRequest scope(String...val) /*-{
this["scope"] = @jsu; 
return this; 
}-*/;
}
