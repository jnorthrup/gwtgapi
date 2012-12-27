package org.sgx.gapi.client.apis.drive.about;

import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsArrayString;

/**
 * 
 * @author sg
 * 
 */
public class Format extends JsObject {
	protected Format() {
	}

	/**
	 * The imported file's content type to convert from.
	 * @return
	 */
	public native final String source() /*-{
		return this["source"];
	}-*/;

	/**
	 * The imported file's content type to convert from.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Format source(String val) /*-{
		this["source"] = val;
		return this;
	}-*/;

	/**
	 * The possible content types to convert to.
	 * @return
	 */
	public native final JsArrayString targets() /*-{
		return this["targets"];
	}-*/;

	/**
	 * The possible content types to convert to.
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Format targets(JsArrayString val) /*-{
		this["targets"] = val;
		return this;
	}-*/;

}
