package org.sgx.gapi.client.apis.webfonts;

import org.sgx.gapi.client.apis.GAPIBase;

import com.google.gwt.core.client.JsArrayString;

/**
 * @see https://developers.google.com/webfonts/docs/developer_api
 * @author sg
 * 
 */
public class WebFont extends GAPIBase {
	protected WebFont() {
	}

	/**
	 * The name of the family
	 * 
	 * @return
	 */
	public native final String family() /*-{
		return this["family"];
	}-*/;

	/**
	 * The name of the family
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final WebFont family(String val) /*-{
		this["family"] = val;
		return this;
	}-*/;

	/**
	 * A list of scripts supported by the family
	 * 
	 * @return
	 */
	public native final JsArrayString subsets() /*-{
		return this["subsets"];
	}-*/;

	/**
	 * A list of scripts supported by the family
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final WebFont subsets(JsArrayString val) /*-{
		this["subsets"] = val;
		return this;
	}-*/;

	/**
	 * The different styles available for the family
	 * 
	 * @return
	 */
	public native final JsArrayString variants() /*-{
		return this["variants"];
	}-*/;

	/**
	 * The different styles available for the family
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final WebFont variants(JsArrayString val) /*-{
		this["variants"] = val;
		return this;
	}-*/;
}
