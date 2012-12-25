package org.sgx.gapi.client.apis.customsearch;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

public class CustomSearchRequest implements  GAPIRequest<CustomSearchResult>{

	String q, cx; 
	
	
	
	public CustomSearchRequest(String cx, String q) {
		super();
		this.q = q;
		this.cx = cx;
	}

	@Override
	public void execute(final GAPICallback<CustomSearchResult> c) {
		JsObject params = JsObject.one("q", q).objPut("cx", cx).objPut("alt", "json"); 
		ClientRequest clientReq = ClientRequest.create()
			.path("/customsearch/v1")
			.params(params)
			; 
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((CustomSearchResult)jsonResp); 
			}
		}); 
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getCx() {
		return cx;
	}

	public void setCx(String cx) {
		this.cx = cx;
	}
	
	

}
