package org.sgx.gapi.client.apis.customsearch;

import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.jsutil.client.JsObject;

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


public static class Queries extends JsObject {
protected Queries(){}
/**
 * 
 * @return
 */
public native final CustomSearchQuery request() /*-{
return this["request"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResult.Queries request(CustomSearchQuery val) /*-{
this["request"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final CustomSearchQuery nextPage() /*-{
return this["nextPage"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final Queries nextPage(CustomSearchQuery val) /*-{
this["nextPage"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final CustomSearchQuery previousPage() /*-{
return this["previousPage"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResult.Queries previousPage(CustomSearchQuery val) /*-{
this["previousPage"] = val; 
return this; 
}-*/;
}

public static class Context extends JsObject {
	protected Context(){}
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
public native final CustomSearchResult.Context title(String val) /*-{
this["title"] = val; 
return this; 
}-*/;
}
}
