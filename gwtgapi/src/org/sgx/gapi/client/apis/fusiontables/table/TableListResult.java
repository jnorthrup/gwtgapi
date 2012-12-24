package org.sgx.gapi.client.apis.fusiontables.table;

import java.util.Collection;

import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.apis.fusiontables.FTTable;

import com.google.gwt.core.client.JsArray;

public class TableListResult extends GAPIResult {
protected TableListResult(){}

/**
 * 
 * @return
 */
public native final JsArray<FTTable> items() /*-{
return this["items"]; 
}-*/;
/**
 * 
 * @return
 */
public native final Collection<FTTable> itemsCol() /*-{
return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["items"]); 
}-*/;
/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final TableListResult items(JsArray<FTTable> val) /*-{
this["items"] = val; 
return this; 
}-*/;
}
