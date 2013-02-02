package org.sgx.gapi.client.apis;

import org.sgx.jsutil.client.JsObject;

public class GAPIBase extends JsObject {
	protected GAPIBase() {
	}

	/**
	 * The kind of item this is.
	 * 
	 * @return
	 */
	public native final String kind() /*-{
		return this["kind"];
	}-*/;

	/**
	 * The kind of item this is.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GAPIBase kind(String val) /*-{
		this["kind"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String etag() /*-{
		return this["etag"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GAPIBase etag(String val) /*-{
		this["etag"] = val;
		return this;
	}-*/;
}
