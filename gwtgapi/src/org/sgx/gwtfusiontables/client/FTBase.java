package org.sgx.gwtfusiontables.client;

import org.sgx.jsutil.client.JsObject;

public class FTBase extends JsObject{
protected FTBase(){}


/**
 * 
 * @return
 */
public native final String kind() /*-{
return this["kind"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final FTResult kind(String val) /*-{
this["kind"] = val; 
return this; 
}-*/;



}
