package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 * 
 */
public class VolumeInfoIndustryIdentifier extends JsObject {
	protected VolumeInfoIndustryIdentifier() {
	}

	/**
	 * Identifier type. Possible values are ISBN_10, ISBN_13, ISSN and OTHER.
	 * 
	 * @return
	 */
	public native final String type() /*-{
		return this["type"];
	}-*/;

	/**
	 * Identifier type. Possible values are ISBN_10, ISBN_13, ISSN and OTHER.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoIndustryIdentifier type(String val) /*-{
		this["type"] = val;
		return this;
	}-*/;

	/**
	 * Industry specific volume identifier.
	 * 
	 * @return
	 */
	public native final String identifier() /*-{
		return this["identifier"];
	}-*/;

	/**
	 * Industry specific volume identifier.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoIndustryIdentifier identifier(String val) /*-{
		this["identifier"] = val;
		return this;
	}-*/;
}
