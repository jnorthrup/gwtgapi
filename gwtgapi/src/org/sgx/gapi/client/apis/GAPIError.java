package org.sgx.gapi.client.apis;

import org.sgx.jsutil.client.JsObject;


public class GAPIError extends JsObject {
protected GAPIError(){}

//TODO: errors
/**
 * 
 * @return
 */
public native final int code() /*-{
return this["code"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GAPIError code(int val) /*-{
this["code"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String message() /*-{
return this["message"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final GAPIError message(String val) /*-{
this["message"] = val; 
return this; 
}-*/;
}
