//package org.sgx.gapi.client.client;
//
//import org.sgx.jsutil.client.JsObject;
//
///**
// * It is JSON, and can be parsed to an object which includes body, headers, status, and statusText fields.
// * 
// * @author sg
// * 
// */
//public class HTTPRawResponse extends JsObject {
//	protected HTTPRawResponse() {
//	}
//
//	/**
//	 * 
//	 * @return
//	 */
//	public native final String body() /*-{
//		return this["body"];
//	}-*/;
//
//	/**
//	 * 
//	 * @param val
//	 * @return this - for setter chaining
//	 */
//	public native final HTTPRawResponse body(String val) /*-{
//		this["body"] = val;
//		return this;
//	}-*/;
//
//	/**
//	 * 
//	 * @return
//	 */
//	public native final String status() /*-{
//		return this["status"] + "";
//	}-*/;
//
//	/**
//	 * 
//	 * @param val
//	 * @return this - for setter chaining
//	 */
//	public native final HTTPRawResponse status(String val) /*-{
//		this["status"] = val;
//		return this;
//	}-*/;
//
//	/**
//	 * 
//	 * @return
//	 */
//	public native final String headers() /*-{
//		return this["headers"];
//	}-*/;
//
//	/**
//	 * 
//	 * @param val
//	 * @return this - for setter chaining
//	 */
//	public native final HTTPRawResponse headers(String val) /*-{
//		this["headers"] = val;
//		return this;
//	}-*/;
//
//	/**
//	 * 
//	 * @return
//	 */
//	public native final String statusText() /*-{
//		return this["statusText"];
//	}-*/;
//
//	/**
//	 * 
//	 * @param val
//	 * @return this - for setter chaining
//	 */
//	public native final HTTPRawResponse statusText(String val) /*-{
//		this["statusText"] = val;
//		return this;
//	}-*/;
//}
