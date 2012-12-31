package org.sgx.gapi.client.apis.books;

import org.sgx.gapi.client.apis.GAPIResult;

/**
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 * 
 */
public class Volume extends GAPIResult {
	protected Volume() {
	}

	/**
	 * Unique identifier for a volume. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this["id"];
	}-*/;

	/**
	 * Unique identifier for a volume. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Volume id(String val) /*-{
		this["id"] = val;
		return this;
	}-*/;

	/**
	 * URL to this resource. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String selfLink() /*-{
		return this["selfLink"];
	}-*/;

	/**
	 * URL to this resource. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Volume selfLink(String val) /*-{
		this["selfLink"] = val;
		return this;
	}-*/;

	/**
	 * User specific information related to this volume. (e.g. page this user last read or whether they purchased this book)
	 * 
	 * @return
	 */
	public native final VolumeUserInfo userInfo() /*-{
		return this["userInfo"];
	}-*/;

	/**
	 * User specific information related to this volume. (e.g. page this user last read or whether they purchased this book)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Volume userInfo(VolumeUserInfo val) /*-{
		this["userInfo"] = val;
		return this;
	}-*/;

	/**
	 * Search result information related to this volume.
	 * 
	 * @return
	 */
	public native final VolumeSearchInfo searchInfo() /*-{
		return this["searchInfo"];
	}-*/;

	/**
	 * Search result information related to this volume.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Volume searchInfo(VolumeSearchInfo val) /*-{
		this["searchInfo"] = val;
		return this;
	}-*/;

	/**
	 * Any information about a volume related to reading or obtaining that volume text. This information can depend on country (books may be public domain in one country but not in
	 * another, e.g.).
	 * 
	 * @return
	 */
	public native final VolumeAccessInfo accessInfo() /*-{
		return this["accessInfo"];
	}-*/;

	/**
	 * Any information about a volume related to reading or obtaining that volume text. This information can depend on country (books may be public domain in one country but not in
	 * another, e.g.).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Volume accessInfo(VolumeAccessInfo val) /*-{
		this["accessInfo"] = val;
		return this;
	}-*/;
}
