package org.sgx.gapi.client.apis.books;

import java.util.Collection;

import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 * 
 */
public class VolumeInfo extends JsObject {
	protected VolumeInfo() {
	}

	/**
	 * Volume title. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String title() /*-{
		return this["title"];
	}-*/;

	/**
	 * Volume title. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo title(String val) /*-{
		this["title"] = val;
		return this;
	}-*/;

	/**
	 * Volume subtitle. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String subtitle() /*-{
		return this["subtitle"];
	}-*/;

	/**
	 * Volume subtitle. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo subtitle(String val) /*-{
		this["subtitle"] = val;
		return this;
	}-*/;

	/**
	 * The names of the authors and/or editors for this volume. (In LITE projection)
	 * 
	 * @return
	 */
	public native final JsArrayString authors() /*-{
		return this["authors"];
	}-*/;

	/**
	 * The names of the authors and/or editors for this volume. (In LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo authors(JsArrayString val) /*-{
		this["authors"] = val;
		return this;
	}-*/;

	/**
	 * Publisher of this volume. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String publisher() /*-{
		return this["publisher"];
	}-*/;

	/**
	 * Publisher of this volume. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo publisher(String val) /*-{
		this["publisher"] = val;
		return this;
	}-*/;

	/**
	 * Date of publication. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String publishedDate() /*-{
		return this["publishedDate"];
	}-*/;

	/**
	 * Date of publication. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo publishedDate(String val) /*-{
		this["publishedDate"] = val;
		return this;
	}-*/;

	/**
	 * A synopsis of the volume. The text of the description is formatted in HTML and includes simple formatting elements, such as b, i, and br tags. (in LITE projection)
	 * 
	 * @return
	 */
	public native final String description() /*-{
		return this["description"];
	}-*/;

	/**
	 * A synopsis of the volume. The text of the description is formatted in HTML and includes simple formatting elements, such as b, i, and br tags. (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo description(String val) /*-{
		this["description"] = val;
		return this;
	}-*/;

	/**
	 * Industry standard identifiers for this volume.
	 * 
	 * @return
	 */
	public native final JsArray<VolumeInfoIndustryIdentifier> industryIdentifiers() /*-{
		return this["industryIdentifiers"];
	}-*/;

	/**
	 * Industry standard identifiers for this volume.
	 * 
	 * @return
	 */
	public native final Collection<VolumeInfoIndustryIdentifier> industryIdentifiersCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["industryIdentifiers"]);
	}-*/;

	/**
	 * Industry standard identifiers for this volume.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo industryIdentifiers(JsArray<VolumeInfoIndustryIdentifier> val) /*-{
		this["industryIdentifiers"] = val;
		return this;
	}-*/;

	/**
	 * Total number of pages.
	 * 
	 * @return
	 */
	public native final int pageCount() /*-{
		return this["pageCount"];
	}-*/;

	/**
	 * Total number of pages.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo pageCount(int val) /*-{
		this["pageCount"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final VolumeInfoDimensions dimensions() /*-{
		return this["dimensions"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo dimensions(VolumeInfoDimensions val) /*-{
		this["dimensions"] = val;
		return this;
	}-*/;

	/**
	 * Type of publication of this volume. Possible values are BOOK or MAGAZINE.
	 * 
	 * @return
	 */
	public native final String printType() /*-{
		return this["printType"];
	}-*/;

	/**
	 * Type of publication of this volume. Possible values are BOOK or MAGAZINE.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo printType(String val) /*-{
		this["printType"] = val;
		return this;
	}-*/;

	/**
	 * A list of subject categories, such as "Fiction", "Suspense", etc.
	 * 
	 * @return
	 */
	public native final JsArrayString categories() /*-{
		return this["categories"];
	}-*/;

	/**
	 * A list of subject categories, such as "Fiction", "Suspense", etc.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo categories(JsArrayString val) /*-{
		this["categories"] = val;
		return this;
	}-*/;

	/**
	 * The mean review rating for this volume. (min = 1.0, max = 5.0)
	 * 
	 * @return
	 */
	public native final double averageRating() /*-{
		return this["averageRating"];
	}-*/;

	/**
	 * The mean review rating for this volume. (min = 1.0, max = 5.0)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo averageRating(double val) /*-{
		this["averageRating"] = val;
		return this;
	}-*/;

	/**
	 * The number of review ratings for this volume.
	 * 
	 * @return
	 */
	public native final int ratingsCount() /*-{
		return this["ratingsCount"];
	}-*/;

	/**
	 * The number of review ratings for this volume.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo ratingsCount(int val) /*-{
		this["ratingsCount"] = val;
		return this;
	}-*/;

	/**
	 * An identifier for the version of the volume content (text & images). (In LITE projection)
	 * 
	 * @return
	 */
	public native final String contentVersion() /*-{
		return this["contentVersion"];
	}-*/;

	/**
	 * An identifier for the version of the volume content (text & images). (In LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo contentVersion(String val) /*-{
		this["contentVersion"] = val;
		return this;
	}-*/;

	/**
	 * A list of image links for all the sizes that are available. (in LITE projection)
	 * 
	 * @return
	 */
	public native final VolumeInfoImageLinks imageLinks() /*-{
		return this["imageLinks"];
	}-*/;

	/**
	 * A list of image links for all the sizes that are available. (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo imageLinks(VolumeInfoImageLinks val) /*-{
		this["imageLinks"] = val;
		return this;
	}-*/;

	/**
	 * Best language for this volume (based on content). It is the two-letter ISO 639-1 code such as 'fr', 'en', etc.
	 * 
	 * @return
	 */
	public native final String language() /*-{
		return this["language"];
	}-*/;

	/**
	 * Best language for this volume (based on content). It is the two-letter ISO 639-1 code such as 'fr', 'en', etc.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo language(String val) /*-{
		this["language"] = val;
		return this;
	}-*/;

	/**
	 * The main category to which this volume belongs. It will be the category from the categories list returned below that has the highest weight.
	 * 
	 * @return
	 */
	public native final String mainCategory() /*-{
		return this["mainCategory"];
	}-*/;

	/**
	 * The main category to which this volume belongs. It will be the category from the categories list returned below that has the highest weight.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo mainCategory(String val) /*-{
		this["mainCategory"] = val;
		return this;
	}-*/;

	/**
	 * URL to preview this volume on the Google Books site.
	 * 
	 * @return
	 */
	public native final String previewLink() /*-{
		return this["previewLink"];
	}-*/;

	/**
	 * URL to preview this volume on the Google Books site.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo previewLink(String val) /*-{
		this["previewLink"] = val;
		return this;
	}-*/;

	/**
	 * URL to view information about this volume on the Google Books site. (In LITE projection)
	 * 
	 * @return
	 */
	public native final String infoLink() /*-{
		return this["infoLink"];
	}-*/;

	/**
	 * URL to view information about this volume on the Google Books site. (In LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo infoLink(String val) /*-{
		this["infoLink"] = val;
		return this;
	}-*/;

	/**
	 * Canonical URL for a volume. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String canonicalVolumeLink() /*-{
		return this["canonicalVolumeLink"];
	}-*/;

	/**
	 * Canonical URL for a volume. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeInfo canonicalVolumeLink(String val) /*-{
		this["canonicalVolumeLink"] = val;
		return this;
	}-*/;

}
