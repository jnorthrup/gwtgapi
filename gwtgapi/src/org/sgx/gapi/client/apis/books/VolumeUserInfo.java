package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

/**
 * User specific information related to this volume. (e.g. page this user last read or whether they purchased this book)
 * 
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 * 
 */
public class VolumeUserInfo extends JsObject {
	protected VolumeUserInfo() {
	}

	/**
	 * This user's review of this volume, if one exists.
	 * 
	 * @return
	 */
	public native final JsObject review() /*-{
		return this["review"];
	}-*/;

	/**
	 * This user's review of this volume, if one exists.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeUserInfo review(JsObject val) /*-{
		this["review"] = val;
		return this;
	}-*/;

	/**
	 * The user's current reading position in the volume, if one is available. (In LITE projection.). TODO: type
	 * 
	 * @return
	 */
	public native final JsObject readingPosition() /*-{
		return this["readingPosition"];
	}-*/;

	/**
	 * The user's current reading position in the volume, if one is available. (In LITE projection.). TODO: type
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeUserInfo readingPosition(JsObject val) /*-{
		this["readingPosition"] = val;
		return this;
	}-*/;

	/**
	 * Whether or not this volume was purchased by the authenticated user making the request. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final boolean isPurchased() /*-{
		return this["isPurchased"];
	}-*/;

	/**
	 * Whether or not this volume was purchased by the authenticated user making the request. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeUserInfo isPurchased(boolean val) /*-{
		this["isPurchased"] = val;
		return this;
	}-*/;

	/**
	 * Timestamp when this volume was last modified by a user action, such as a reading position update, volume purchase or writing a review. (RFC 3339 UTC date-time format).
	 * 
	 * @return
	 */
	public native final String updated() /*-{
		return this["updated"];
	}-*/;

	/**
	 * Timestamp when this volume was last modified by a user action, such as a reading position update, volume purchase or writing a review. (RFC 3339 UTC date-time format).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeUserInfo updated(String val) /*-{
		this["updated"] = val;
		return this;
	}-*/;

	/**
	 * Whether or not this volume was pre-ordered by the authenticated user making the request. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final boolean isPreordered() /*-{
		return this["isPreordered"];
	}-*/;

	/**
	 * Whether or not this volume was pre-ordered by the authenticated user making the request. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeUserInfo isPreordered(boolean val) /*-{
		this["isPreordered"] = val;
		return this;
	}-*/;

}
