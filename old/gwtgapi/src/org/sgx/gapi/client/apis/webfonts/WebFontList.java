package org.sgx.gapi.client.apis.webfonts;

import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArray;

/**
 * @see https://developers.google.com/webfonts/docs/developer_api
 * @author sg
 * 
 */
public class WebFontList extends GAPIResult {
	protected WebFontList() {
	}

	/**
	 * the webfonts
	 * 
	 * @return
	 */
	public native final JsArray<WebFont> items() /*-{
		return this["items"];
	}-*/;

	/**
	 * the webfonts
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final WebFontList items(JsArray<WebFont> val) /*-{
		this["items"] = val;
		return this;
	}-*/;
}
