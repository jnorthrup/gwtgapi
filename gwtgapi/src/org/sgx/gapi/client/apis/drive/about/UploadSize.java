package org.sgx.gapi.client.apis.drive.about;

import org.sgx.jsutil.client.JsObject;

public class UploadSize extends JsObject {
	protected UploadSize() {
	}

	/**
	 * The file type
	 * 
	 * @return
	 */
	public native final String type() /*-{
		return this["type"];
	}-*/;

	/**
	 * The file type
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploadSize type(String val) /*-{
		this["type"] = val;
		return this;
	}-*/;

	/**
	 * The max upload size for this type.
	 * 
	 * @return
	 */
	public native final int size() /*-{
		return this["size"];
	}-*/;

	/**
	 * The max upload size for this type.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final UploadSize size(int val) /*-{
		this["size"] = val;
		return this;
	}-*/;
}
