package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

/**
 * Any information about a volume related to the eBookstore and/or purchaseability. This information can depend on the country where the request originates from (i.e. books may not
 * be for sale in certain countries).
 * 
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 * 
 */
public class VolumeSaleInfo extends JsObject {
	protected VolumeSaleInfo() {
	}

	/**
	 * The two-letter ISO_3166-1 country code for which this sale information is valid. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String country() /*-{
		return this["country"];
	}-*/;

	/**
	 * The two-letter ISO_3166-1 country code for which this sale information is valid. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfo country(String val) /*-{
		this["country"] = val;
		return this;
	}-*/;

	/**
	 * Whether or not this book is available for sale or offered for free in the Google eBookstore for the country listed above. Possible values are FOR_SALE, FREE, NOT_FOR_SALE,
	 * or FOR_PREORDER.
	 * 
	 * @return
	 */
	public native final String saleability() /*-{
		return this["saleability"];
	}-*/;

	/**
	 * Whether or not this book is available for sale or offered for free in the Google eBookstore for the country listed above. Possible values are FOR_SALE, FREE, NOT_FOR_SALE,
	 * or FOR_PREORDER.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfo saleability(String val) /*-{
		this["saleability"] = val;
		return this;
	}-*/;

	/**
	 * Whether or not this volume is an eBook (can be added to the My eBooks shelf
	 * 
	 * @return
	 */
	public native final boolean isEbook() /*-{
		return this["isEbook"];
	}-*/;

	/**
	 * Whether or not this volume is an eBook (can be added to the My eBooks shelf
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfo isEbook(boolean val) /*-{
		this["isEbook"] = val;
		return this;
	}-*/;

	/**
	 * Suggested retail price
	 * 
	 * @return
	 */
	public native final VolumeSaleInfoPrice listPrice() /*-{
		return this["listPrice"];
	}-*/;

	/**
	 * Suggested retail price
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfo listPrice(VolumeSaleInfoPrice val) /*-{
		this["listPrice"] = val;
		return this;
	}-*/;

	/**
	 * The actual selling price of the book. This is the same as the suggested retail or list price unless there are offers or discounts on this volume. (in LITE projection)
	 * 
	 * @return
	 */
	public native final VolumeSaleInfoPrice retailPrice() /*-{
		return this["retailPrice"];
	}-*/;

	/**
	 * The actual selling price of the book. This is the same as the suggested retail or list price unless there are offers or discounts on this volume. (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfo retailPrice(VolumeSaleInfoPrice val) /*-{
		this["retailPrice"] = val;
		return this;
	}-*/;

	/**
	 * URL to purchase this volume on the Google Books site. (in LITE projection)
	 * 
	 * @return
	 */
	public native final String buyLink() /*-{
		return this["buyLink"];
	}-*/;

	/**
	 * URL to purchase this volume on the Google Books site. (in LITE projection)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfo buyLink(String val) /*-{
		this["buyLink"] = val;
		return this;
	}-*/;

	/**
	 * The date on which this book is available for sale.
	 * 
	 * @return
	 */
	public native final String onSaleDate() /*-{
		return this["onSaleDate"];
	}-*/;

	/**
	 * The date on which this book is available for sale.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfo onSaleDate(String val) /*-{
		this["onSaleDate"] = val;
		return this;
	}-*/;
}
