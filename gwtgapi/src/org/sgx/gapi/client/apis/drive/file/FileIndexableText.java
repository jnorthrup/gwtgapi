package org.sgx.gapi.client.apis.drive.file;

import org.sgx.jsutil.client.JsObject;

public class FileIndexableText extends JsObject {
	protected FileIndexableText() {
	}

	/**
	 * The text to be indexed for this file.
	 * 
	 * @return
	 */
	public native final String text() /*-{
		return this["text"];
	}-*/;

	/**
	 * The text to be indexed for this file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FileIndexableText text(String val) /*-{
		this["text"] = val;
		return this;
	}-*/;
}
