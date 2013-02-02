package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 * 
 */
public class VolumeInfoDimensions extends JsObject {
	protected VolumeInfoDimensions() {
	}

	/**
	 * Height or length of this volume (in cm)
	 * 
	 * @return
	 */
	public native final String height() /*-{
		return this["height"];
	}-*/;

	/**
	 * Height or length of this volume (in cm)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoDimensions height(String val) /*-{
		this["height"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String width() /*-{
		return this["width"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoDimensions width(String val) /*-{
		this["width"] = val;
		return this;
	}-*/;

	/**
	 * Thickness of this volume (in cm).
	 * 
	 * @return
	 */
	public native final String thickness() /*-{
		return this["thickness"];
	}-*/;

	/**
	 * Thickness of this volume (in cm).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoDimensions thickness(String val) /*-{
		this["thickness"] = val;
		return this;
	}-*/;
}
