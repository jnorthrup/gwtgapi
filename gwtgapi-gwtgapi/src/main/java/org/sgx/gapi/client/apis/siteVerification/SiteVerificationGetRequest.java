package org.sgx.gapi.client.apis.siteVerification;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIRequestAbstract;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.apis.customsearch.CustomSearchResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;

/**
 * Gets the list of the authenticated user's verified websites and domains. Try it now.
 * 
 * Only sites that are owned by the authenticated user are returned.
 * 
 * @see https://developers.google.com/site-verification/v1/webResource/get
 * @author sg
 * 
 */
public class SiteVerificationGetRequest
extends GAPIRequestAbstract<SiteVerificationWebResource>
//implements GAPIRequest<SiteVerificationWebResource> 
{

	String id; 

	public SiteVerificationGetRequest(String id) {
		super();
		this.id = id;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void execute(final GAPICallback<SiteVerificationWebResource> c) {
		JsObject params = getParams(); 
//		params.objPut("id", getId()); 
//		JsObject params = JsObject.one("q", q).objPut("cx", cx).objPut("alt", "json");
		String path = "/siteVerification/v1/webResource/"+JsUtil.encodeURIComponent(getId());
		
		System.out.println(path);
		ClientRequest clientReq = ClientRequest.create().path(path).params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {

			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((SiteVerificationWebResource) jsonResp);
			}
		});
	}

}
