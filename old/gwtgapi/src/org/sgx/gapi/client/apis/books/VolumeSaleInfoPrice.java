package org.sgx.gapi.client.apis.books;

import org.sgx.jsutil.client.JsObject;

/**
 * Suggested retail price.
 * 
 * @see https://developers.google.com/books/docs/v1/reference/volumes#resource
 * @author sg
 * 
 */
public class VolumeSaleInfoPrice extends JsObject {
	protected VolumeSaleInfoPrice() {
	}

	/**
	 * Amount in the currency listed below. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final double amount() /*-{
		return this["amount"];
	}-*/;

	/**
	 * Amount in the currency listed below. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfoPrice amount(double val) /*-{
		this["amount"] = val;
		return this;
	}-*/;

	/**
	 * An ISO 4217, three-letter currency code. (In LITE projection.)
	 * 
	 * @return
	 */
	public native final String currencyCode() /*-{
		return this["currencyCode"];
	}-*/;

	/**
	 * An ISO 4217, three-letter currency code. (In LITE projection.)
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeSaleInfoPrice currencyCode(String val) /*-{
		this["currencyCode"] = val;
		return this;
	}-*/;
}
