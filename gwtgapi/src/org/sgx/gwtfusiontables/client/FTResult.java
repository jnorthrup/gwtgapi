package org.sgx.gwtfusiontables.client;

import java.util.Collection;

import org.sgx.jsutil.client.JsObject;


import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class FTResult extends FTBase {
	protected FTResult() {
	}
	
/**
 * 
 * @return
 */
public native final FTError error() /*-{
return this["error"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final FTResult error(FTError val) /*-{
this["error"] = val; 
return this; 
}-*/;


///**
// * 
// * @param val
// * @return this - for setter chaining
// */
//public native final FTResult columns(JsArrayString val) /*-{
//	this["columns"] = val; 
//	return this; 
//}-*/;
///**
// * Returns 'columns' property (JavaScript array)
// * @return
// */
//public native final JsArrayString columns() /*-{
//	return this["columns"]; 
//}-*/;
///**
// * Returns 'columns' property (Java Collection)
// * @return
// */
//public native final Collection<String> getColumns() /*-{	
//	return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["columns"]); 
//}-*/;

}
