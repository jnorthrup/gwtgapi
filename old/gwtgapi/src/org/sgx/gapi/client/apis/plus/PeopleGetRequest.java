package org.sgx.gapi.client.apis.plus;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

public class PeopleGetRequest<T extends PeopleGetResult> implements GAPIRequest<T> {
//	<PeopleGetResult>
	String userId; 
	
	
	public PeopleGetRequest(String userId) {
		super();
		this.userId = userId;
	}
@Override
public void execute(final GAPICallback<T> c) {
	ClientRequest clientReq = ClientRequest.create()
			.path("/plus/v1/people/get")
			.params(JsObject.one("userId", getUserId())); 
	HttpRequest req = GAPI.get().client().request(clientReq);
	req.execute(new ClientRequestCallback() {
		
		@Override
		public void call(GAPIResult jsonResp, String rawResp) {
			c.call((T)jsonResp.cast()); 
		}
	}); 
}
//	@Override
//	public ClientRequest getClientRequest() {
//		return ClientRequest.create()
//			.path("/plus/v1/people/get")
//			.params(JsObject.one("userId", getUserId()));
//	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	

}
