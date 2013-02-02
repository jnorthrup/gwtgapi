package org.sgx.gapi.client.client;

import org.sgx.jsutil.client.JsObject;

/**
 * An object encapsulating an HTTP request. This object is not instantiated directly, rather it is returned by gapi.client.request.
 * 
 * @author sg
 * 
 */
public class HttpRequest extends JsObject {
	protected HttpRequest() {
	}

	/**
	 * Executes the request and runs the supplied callback on response.
	 * 
	 * @param val
	 *            The callback function which will execute when the request succeeds or fails. jsonResp contains the response parsed as JSON. If the response is not JSON, this
	 *            field will be false. rawResp is the HTTP response. It is JSON, and can be parsed to an object which includes body, headers, status, and statusText fields.
	 */
	public native final void execute(ClientRequestCallback val) /*-{
		var fn = $entry(function(r1, r2) {
			if(!r1)r1=null;
//			$wnd.alert(r1+""); 
			return val.@org.sgx.gapi.client.client.ClientRequestCallback::call(Lorg/sgx/gapi/client/apis/GAPIResult;Ljava/lang/String;)(r1, r2);  
			//Lorg/sgx/jsutil/client/JsObject;Lorg/sgx/gapi/client/client/HTTPRawResponse;)(r1, r2);
		});
		this.execute(fn);
	}-*/;

}
