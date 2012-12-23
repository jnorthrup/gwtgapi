package org.sgx.gapi.client.client;

import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * @see http://code.google.com/p/google-api-javascript-client/wiki/ReferenceDocs
 * @author sg
 *
 */
public class GAPIClient extends JavaScriptObject {
	protected GAPIClient() {
	}

	public static final native GAPIClient get()/*-{
		return $wnd.gapi.client;
	}-*/;

	/**
	 * Loads the client library interface to a particular API. The new API interface will be in the form gapi.client.api.collection.method. For example, the Moderator API would create methods like gapi.client.moderator.series.list. Coming soon: per-API documentation.


	 * @param name The name of the API to load. 
	 * @param version The version of the API to load.

	 * @param c Optional function that is called once the API interface is loaded. 
	 */
public final native void load(String name, String version, ClientLoadCallback c)/*-{
var fn = $entry(function(){
c.@org.sgx.gapi.client.client.ClientLoadCallback::loaded()(); 
}); 
this.load(name, version, fn); 
}-*/;

/**
 * Registers an individual method in the gapi.client namespace. This method is used by gapi.client.load to register all methods associated with the loaded API. When the registered method is executed it returns a gapi.client.RpcRequest. 
 * @param method The method name to register. Ex. plus.activities.search. 
 */
public final native void register(String method)/*-{
	this.register(method); 
}-*/;
/**
 * Creates a HTTP request for making RESTful requests. 
 * @param req An object encapsulating the various arguments for this method. The path is required, the rest are optional.
 * @return gapi.client.HttpRequest|undefined. If no callback is supplied, a request object is returned. The request can then be executed via gapi.client.HttpRequest.execute(callback). 
 */
public final native HttpRequest request(ClientRequest req)/*-{
return this.request(req); 
}-*/;
//public final native HttpRequest request(GAPIRequest req)/*-{
//return this.request(req.@org.sgx.gapi.client.apis.GAPIRequest::getClientRequest()()); 
//}-*/;
/**
 * Creates an RPC GAPIRequest directly. The method name and version identify the method to be executed and the RPC params are provided upon RPC creation. 
 * @param method The method to be executed. For example, 'plus.people.search' from the G+ API. 
 * @param version The version of the API which defines the method to be executed. Defaults to 'v1' 
 * @param rpcParams A key-value pair of the params to supply to this RPC.  
 * @return The RPC request.
 */
public final native RpcRequest rpcRequest(String method, String version, JsObject rpcParams)/*-{
return this.rpcRequest(method, version, rpcParams); 
}-*/;
/**
 * Sets the API key for the app, which can be found in the Developer Console. Some APIs require this to be set in order to work. 
 * @param apiKey The API key to set. 
 */
public final native void setApiKey(String apiKey)/*-{
this.setApiKey(apiKey); 
}-*/;
}
