package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

/**
 * Any information about a volume related to reading or obtaining that volume text. This information can depend on country (books may be public domain in one country but not in
 * another, e.g.).
 * 
 * @author sg
 * 
 */
public class VolumeAccessInfo extends JsObject {
	protected VolumeAccessInfo() {
	}

	/**
	 * Whether text-to-speech is permitted for this volume. Values can be ALLOWED, ALLOWED_FOR_ACCESSIBILITY, or NOT_ALLOWED.
	 * 
	 * @return
	 */
	public native final String textToSpeechPermission() /*-{
		return this["textToSpeechPermission"];
	}-*/;

	/**
	 * Whether text-to-speech is permitted for this volume. Values can be ALLOWED, ALLOWED_FOR_ACCESSIBILITY, or NOT_ALLOWED.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo textToSpeechPermission(String val) /*-{
		this["textToSpeechPermission"] = val;
		return this;
	}-*/;

	/**
	 * The two-letter ISO_3166-1 country code for which this access information is valid. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String country() /*-{
		return this["country"];
	}-*/;

	/**
	 * The two-letter ISO_3166-1 country code for which this access information is valid. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo country(String val) /*-{
		this["country"] = val;
		return this;
	}-*/;

	/**
	 * The read access of a volume. Possible values are PARTIAL, ALL_PAGES, NO_PAGES or UNKNOWN. This value depends on the country listed above. A value of PARTIAL means that the
	 * publisher has allowed some portion of the volume to be viewed publicly, without purchase. This can apply to eBooks as well as non-eBooks. Public domain books will always
	 * have a value of ALL_PAGES.
	 * 
	 * @return
	 */
	public native final String viewability() /*-{
		return this["viewability"];
	}-*/;

	/**
	 * The read access of a volume. Possible values are PARTIAL, ALL_PAGES, NO_PAGES or UNKNOWN. This value depends on the country listed above. A value of PARTIAL means that the
	 * publisher has allowed some portion of the volume to be viewed publicly, without purchase. This can apply to eBooks as well as non-eBooks. Public domain books will always
	 * have a value of ALL_PAGES.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo viewability(String val) /*-{
		this["viewability"] = val;
		return this;
	}-*/;

	/**
	 * Information about epub content. (in LITE projection)
	 * 
	 * @return
	 */
	public native final VolumeAccessInfoContent epub() /*-{
		return this["epub"];
	}-*/;

	/**
	 * Information about epub content. (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo epub(VolumeAccessInfoContent val) /*-{
		this["epub"] = val;
		return this;
	}-*/;

	/**
	 * Information about pdf content. (in LITE projection)
	 * 
	 * @return
	 */
	public native final VolumeAccessInfoContent pdf() /*-{
		return this["pdf"];
	}-*/;

	/**
	 * Information about pdf content. (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo pdf(VolumeAccessInfoContent val) /*-{
		this["pdf"] = val;
		return this;
	}-*/;

	/**
	 * Combines the access and viewability of this volume into a single status field for this user. Values can be FULL_PURCHASED, FULL_PUBLIC_DOMAIN, SAMPLE or NONE. (In LITE
	 * projection.)
	 * 
	 * @return
	 */
	public native final String accessViewStatus() /*-{
		return this["accessViewStatus"];
	}-*/;

	/**
	 * Combines the access and viewability of this volume into a single status field for this user. Values can be FULL_PURCHASED, FULL_PUBLIC_DOMAIN, SAMPLE or NONE. (In LITE
	 * projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo accessViewStatus(String val) /*-{
		this["accessViewStatus"] = val;
		return this;
	}-*/;

	/**
	 * Whether this volume can be embedded in a viewport using the Embedded Viewer AP
	 * 
	 * @return
	 */
	public native final boolean embeddable() /*-{
		return this["embeddable"];
	}-*/;

	/**
	 * Whether this volume can be embedded in a viewport using the Embedded Viewer AP
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo embeddable(boolean val) /*-{
		this["embeddable"] = val;
		return this;
	}-*/;

	/**
	 * Whether or not this book is public domain in the country listed above
	 * 
	 * @return
	 */
	public native final boolean publicDomain() /*-{
		return this["publicDomain"];
	}-*/;

	/**
	 * Whether or not this book is public domain in the country listed above
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo publicDomain(boolean val) /*-{
		this["publicDomain"] = val;
		return this;
	}-*/;

	/**
	 * URL to read this volume on the Google Books site. Link will not allow users to read non-viewable volumes.
	 * 
	 * @return
	 */
	public native final String webReaderLink() /*-{
		return this["webReaderLink"];
	}-*/;

	/**
	 * URL to read this volume on the Google Books site. Link will not allow users to read non-viewable volumes.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo webReaderLink(String val) /*-{
		this["webReaderLink"] = val;
		return this;
	}-*/;

	/**
	 * Information about a volume's download license access restrictions.
	 * 
	 * @return
	 */
	public native final VolumeAccessInfoDownloadAccess downloadAccess() /*-{
		return this["downloadAccess"];
	}-*/;

	/**
	 * Information about a volume's download license access restrictions.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfo downloadAccess(VolumeAccessInfoDownloadAccess val) /*-{
		this["downloadAccess"] = val;
		return this;
	}-*/;
}
