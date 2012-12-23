package org.sgx.gapi.client.apis.fusiontables.table;

import org.sgx.gapi.client.apis.fusiontables.FTResult;
import org.sgx.gapi.client.apis.fusiontables.FTTable;

import com.google.gwt.core.client.JsArray;

public class TableListResult extends FTResult {
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
 * @param val
 * @return this - for setter chaining
 */
public native final TableListResult items(JsArray<FTTable> val) /*-{
this["items"] = val; 
return this; 
}-*/;
}
