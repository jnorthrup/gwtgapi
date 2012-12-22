package org.sgx.jsutil.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsonp.client.JsonpRequest;
import com.google.gwt.jsonp.client.JsonpRequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class FTUtil {
	public static <T extends JavaScriptObject> void main(String url, AsyncCallback<T> callback) {
		JsonpRequestBuilder b = new JsonpRequestBuilder();
		JsonpRequest<T> req = b.requestObject(url, callback);
	}
}
