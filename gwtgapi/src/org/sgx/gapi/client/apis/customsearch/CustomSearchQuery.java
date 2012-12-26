package org.sgx.gapi.client.apis.customsearch;

import org.sgx.jsutil.client.JsObject;

/**
 * in the response. @see https://developers.google.com/custom-search/v1/using_rest
 * 
 * @author sg
 * 
 */
public class CustomSearchQuery extends JsObject {
	protected CustomSearchQuery() {
	}

	public static final native CustomSearchQuery create()/*-{
		return {}; 
	}-*/;

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
	public native final CustomSearchQuery title(String val) /*-{
		this["title"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int totalResults() /*-{
		return this["totalResults"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CustomSearchQuery totalResults(int val) /*-{
		this["totalResults"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String searchTerms() /*-{
		return this["searchTerms"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CustomSearchQuery searchTerms(String val) /*-{
		this["searchTerms"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int count() /*-{
		return this["count"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CustomSearchQuery count(int val) /*-{
		this["count"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int startIndex() /*-{
		return this["startIndex"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CustomSearchQuery startIndex(int val) /*-{
		this["startIndex"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String inputEncoding() /*-{
		return this["inputEncoding"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CustomSearchQuery inputEncoding(String val) /*-{
		this["inputEncoding"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String outputEncoding() /*-{
		return this["outputEncoding"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CustomSearchQuery outputEncoding(String val) /*-{
		this["outputEncoding"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String cx() /*-{
		return this["cx"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CustomSearchQuery cx(String val) /*-{
		this["cx"] = val;
		return this;
	}-*/;
}
