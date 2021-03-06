package org.sgx.gapi.client.client;

import org.sgx.jsutil.client.JsObject;
/**
 * Similar to gapi.client.HttpRequest except this object encapsulates requests generated by registered methods
 * @author sg
 *
 */
public class RpcRequest extends JsObject {
protected RpcRequest(){}
/**
 * Executes the request and runs the supplied callback with the response. 
 * @param val The callback function which will execute when the request succeeds or fails. jsonResp contains the response parsed as JSON. If the response is not JSON, this field will be false. rawResp is the same as jsonResp, except it is a raw string that has not been parsed. It is typically used when the response is not JSON. 
 */
public native final void execute(ClientRequestCallback val) /*-{
var fn = $entry(function(r1, r2) {
	if(!r1)r1=null;
	return val.@org.sgx.gapi.client.client.ClientRequestCallback::call(Lorg/sgx/gapi/client/apis/GAPIResult;Ljava/lang/String;)(r1, r2); //call(Lorg/sgx/jsutil/client/JsObject;Ljava/lang/String;)(r1, r2);
	//call(Lorg/sgx/jsutil/client/JsObject;Lorg/sgx/gapi/client/client/HTTPRawResponse;)(r1, r2);
});
this.execute(fn);
}-*/;

}
