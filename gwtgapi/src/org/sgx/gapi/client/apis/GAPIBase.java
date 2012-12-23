package org.sgx.gapi.client.apis;

import org.sgx.gapi.client.apis.fusiontables.FTResult;
import org.sgx.jsutil.client.JsObject;

public class GAPIBase extends JsObject {
protected GAPIBase(){}


/**
 * The kind of item this is.
 * @return
 */
public native final String kind() /*-{
return this["kind"]; 
}-*/;

/**
 * The kind of item this is.
 * @param val
 * @return this - for setter chaining
 */
public native final FTResult kind(String val) /*-{
this["kind"] = val; 
return this; 
}-*/;
}
