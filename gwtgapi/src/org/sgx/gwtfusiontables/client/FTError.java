package org.sgx.gwtfusiontables.client;

import org.sgx.jsutil.client.JsObject;


public class FTError extends JsObject {
protected FTError(){}

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
public native final FTError code(int val) /*-{
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
public native final FTError message(String val) /*-{
this["message"] = val; 
return this; 
}-*/;
}
