package org.sgx.gapi.client.client;

import org.sgx.jsutil.client.JsFunction;
import org.sgx.jsutil.client.JsObject;


/**
 * An object encapsulating the various arguments for this method. The path is required, the rest are optional.
 * 
 * @author sg
 * 
 */
public class ClientRequest extends JsObject {
	protected ClientRequest() {
	}

	public static final native ClientRequest create()/*-{
		return {};
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String path() /*-{
		return this["path"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ClientRequest path(String val) /*-{
		this["path"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String method() /*-{
		return this["method"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ClientRequest method(String val) /*-{
		this["method"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JsObject params() /*-{
		return this["params"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ClientRequest params(JsObject val) /*-{
		this["params"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JsObject headers() /*-{
		return this["headers"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ClientRequest headers(JsObject val) /*-{
		this["headers"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String body() /*-{
		return this["body"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ClientRequest body(String val) /*-{
		this["body"] = val;
		return this;
	}-*/;

	/**
	 * If supplied, the request is executed immediately and no gapi.client.HttpRequest object is returned.
	 * 
	 * @return
	 */
	public native final JsFunction callback() /*-{
		return this["callback"];
	}-*/;

	/**
	 * If supplied, the request is executed immediately and no gapi.client.HttpRequest object is returned.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ClientRequest callback(JsFunction val) /*-{
		this["callback"] = val;
		return this;
	}-*/;

	/**
	 * If supplied, the request is executed immediately and no gapi.client.HttpRequest object is returned.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ClientRequest callback(ClientRequestCallback val) /*-{
		var fn = $entry(function(r1, r2) {
			if(!r1)r1=null;
			return val.@org.sgx.gapi.client.client.ClientRequestCallback::call(Lorg/sgx/gapi/client/apis/GAPIResult;Ljava/lang/String;)(r1, r2); //::call(Lorg/sgx/jsutil/client/JsObject;Ljava/lang/String;)(r1, r2); 
			//call(Lorg/sgx/jsutil/client/JsObject;Lorg/sgx/gapi/client/client/HTTPRawResponse;)(r1, r2); 
		});
		this["callback"] = fn;
		return this;
	}-*/;
}
