package org.sgx.gapi.client.apis.customsearch;

import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArray;

public class CustomSearchResult extends GAPIResult{
protected CustomSearchResult(){}
/**
 * 
 * @return
 */
public native final JsArray<CustomSearchResultItem> items() /*-{
return this["items"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResult items(JsArray<CustomSearchResultItem> val) /*-{
this["items"] = val; 
return this; 
}-*/;
}
