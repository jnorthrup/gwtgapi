package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 * 
 */
public class VolumeInfoImageLinks extends JsObject {
	protected VolumeInfoImageLinks() {
	}

	/**
	 * Image link for thumbnail size (width of ~128 pixels). (in LITE projection)
	 * 
	 * @return
	 */
	public native final String thumbnail() /*-{
		return this["thumbnail"];
	}-*/;

	/**
	 * Image link for thumbnail size (width of ~128 pixels). (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoImageLinks thumbnail(String val) /*-{
		this["thumbnail"] = val;
		return this;
	}-*/;

	/**
	 * Image link for small size (width of ~300 pixels). (in LITE projection)
	 * 
	 * @return
	 */
	public native final String small() /*-{
		return this["small"];
	}-*/;

	/**
	 * Image link for small size (width of ~300 pixels). (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoImageLinks small(String val) /*-{
		this["small"] = val;
		return this;
	}-*/;

	/**
	 * Image link for medium size (width of ~575 pixels). (in LITE projection)
	 * 
	 * @return
	 */
	public native final String medium() /*-{
		return this["medium"];
	}-*/;

	/**
	 * Image link for medium size (width of ~575 pixels). (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoImageLinks medium(String val) /*-{
		this["medium"] = val;
		return this;
	}-*/;

	/**
	 * Image link for large size (width of ~800 pixels). (in LITE projection)
	 * 
	 * @return
	 */
	public native final String large() /*-{
		return this["large"];
	}-*/;

	/**
	 * Image link for large size (width of ~800 pixels). (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoImageLinks large(String val) /*-{
		this["large"] = val;
		return this;
	}-*/;

	/**
	 * Image link for small thumbnail size (width of ~80 pixels). (in LITE projection)
	 * 
	 * @return
	 */
	public native final String smallThumbnail() /*-{
		return this["smallThumbnail"];
	}-*/;

	/**
	 * Image link for small thumbnail size (width of ~80 pixels). (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoImageLinks smallThumbnail(String val) /*-{
		this["smallThumbnail"] = val;
		return this;
	}-*/;

	/**
	 * Image link for extra large size (width of ~1280 pixels). (in LITE projection)
	 * 
	 * @return
	 */
	public native final String extraLarge() /*-{
		return this["extraLarge"];
	}-*/;

	/**
	 * Image link for extra large size (width of ~1280 pixels). (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfoImageLinks extraLarge(String val) /*-{
		this["extraLarge"] = val;
		return this;
	}-*/;
}
