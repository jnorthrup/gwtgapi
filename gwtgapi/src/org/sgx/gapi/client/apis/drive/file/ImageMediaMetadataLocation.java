package org.sgx.gapi.client.apis.drive.file;

import org.sgx.jsutil.client.JsObject;

/**
 * 
 * @author sg
 * 
 */
public class ImageMediaMetadataLocation extends JsObject {
	protected ImageMediaMetadataLocation() {
	}

	/**
	 * The latitude stored in the image.
	 * 
	 * @return
	 */
	public native final double latitude() /*-{
		return this["latitude"];
	}-*/;

	/**
	 * The latitude stored in the image.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataLocation latitude(double val) /*-{
		this["latitude"] = val;
		return this;
	}-*/;

	/**
	 * The longitude stored in the image.
	 * 
	 * @return
	 */
	public native final double longitude() /*-{
		return this["longitude"];
	}-*/;

	/**
	 * The longitude stored in the image.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataLocation longitude(double val) /*-{
		this["longitude"] = val;
		return this;
	}-*/;

	/**
	 * The altitude stored in the image.
	 * 
	 * @return
	 */
	public native final double altitude() /*-{
		return this["altitude"];
	}-*/;

	/**
	 * The altitude stored in the image.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataLocation altitude(double val) /*-{
		this["altitude"] = val;
		return this;
	}-*/;
}
