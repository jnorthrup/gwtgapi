package org.sgx.gapi.client.apis.customsearch;

import org.sgx.gapi.client.apis.GAPIBase;
/**
 * @see https://developers.google.com/custom-search/v1/using_rest
 * @author sg
 *
 */
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

/**
 * 
 * @return
 */
public native final String htmlTitle() /*-{
return this["htmlTitle"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResultItem htmlTitle(String val) /*-{
this["htmlTitle"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String link() /*-{
return this["link"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResultItem link(String val) /*-{
this["link"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String displayLink() /*-{
return this["displayLink"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResultItem displayLink(String val) /*-{
this["displayLink"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String snippet() /*-{
return this["snippet"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResultItem snippet(String val) /*-{
this["snippet"] = val; 
return this; 
}-*/;

/**
 * 
 * @return
 */
public native final String htmlSnippet() /*-{
return this["htmlSnippet"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final CustomSearchResultItem htmlSnippet(String val) /*-{
this["htmlSnippet"] = val; 
return this; 
}-*/;


//TODO: pagemap
}
