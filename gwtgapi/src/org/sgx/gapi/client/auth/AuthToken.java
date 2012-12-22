package org.sgx.gapi.client.auth;

import org.sgx.jsutil.client.JsObject;
/** 
 * The OAuth 2.0 token object represents the OAuth 2.0 token and any associated data. 
 * @author sg
 *
 */
public class AuthToken extends JsObject {
protected AuthToken(){}
/**
 * The OAuth 2.0 token. Only present in successful responses. 
 * @return
 */
public native final String access_token() /*-{
return this["access_token"]; 
}-*/;

/**
 * The OAuth 2.0 token. Only present in successful responses. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthToken access_token(String val) /*-{
this["access_token"] = val; 
return this; 
}-*/;
/**
 * Details about the error. Only present in error responses. 
 * @return
 */
public native final String error() /*-{
return this["error"]; 
}-*/;

/**
 * Details about the error. Only present in error responses. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthToken error(String val) /*-{
this["error"] = val; 
return this; 
}-*/;

/**
 * The duration, in seconds, the token is valid for. Only present in successful responses. 
 * @return
 */
public native final String expires_in() /*-{
return this["expires_in"]; 
}-*/;

/**
 * The duration, in seconds, the token is valid for. Only present in successful responses. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthToken expires_in(String val) /*-{1º
this["expires_in"] = val; 
return this; 
}-*/;

/**
 * The Google API scopes related to this token. 
 * @return
 */
public native final String state() /*-{
return this["state"]; 
}-*/;

/**
 * The Google API scopes related to this token. 
 * @param val
 * @return this - for setter chaining
 */
public native final AuthToken state(String val) /*-{
this["state"] = val; 
return this; 
}-*/;
}
