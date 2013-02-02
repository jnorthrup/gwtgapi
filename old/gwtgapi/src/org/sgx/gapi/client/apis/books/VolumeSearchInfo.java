package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

/**
 * Search result information related to this volume.
 * 
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 */
public class VolumeSearchInfo extends JsObject {
	protected VolumeSearchInfo() {
	}

	/**
	 * A text snippet containing the search query
	 * 
	 * @return
	 */
	public native final String textSnippet() /*-{
		return this["textSnippet"];
	}-*/;

	/**
	 * A text snippet containing the search query
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSearchInfo textSnippet(String val) /*-{
		this["textSnippet"] = val;
		return this;
	}-*/;
}
