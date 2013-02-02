package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

public class VolumeAccessInfoContent extends JsObject {
	protected VolumeAccessInfoContent() {
	}

	/**
	 * URL to download content. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String downloadLink() /*-{
		return this["downloadLink"];
	}-*/;

	/**
	 * URL to download content. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoContent downloadLink(String val) /*-{
		this["downloadLink"] = val;
		return this;
	}-*/;

	/**
	 * URL to retrieve ACS token for content download. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String acsTokenLink() /*-{
		return this["acsTokenLink"];
	}-*/;

	/**
	 * URL to retrieve ACS token for content download. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoContent acsTokenLink(String val) /*-{
		this["acsTokenLink"] = val;
		return this;
	}-*/;

	/**
	 * Is a flowing text content available either as public domain or for purchase. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final boolean isAvailable() /*-{
		return this["isAvailable"];
	}-*/;

	/**
	 * Is a flowing text content available either as public domain or for purchase. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoContent isAvailable(boolean val) /*-{
		this["isAvailable"] = val;
		return this;
	}-*/;
}
