package org.sgx.gapi.client.apis.customsearch;

import org.sgx.gapi.client.apis.GAPIBase;
import org.sgx.jsutil.client.JsObject;

public class CustomSearchResultItem extends GAPIBase {
protected CustomSearchResultItem(){}
/**
 * 
 * @return
 */
public native final String title() /*-{
return this["title"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResultItem title(String val) /*-{
this["title"] = val; 
return this; 
}-*/;
}
