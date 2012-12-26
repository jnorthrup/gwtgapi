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

/**
 * Gets the list of the authenticated user's verified websites and domains. Try it now.
 * 
 * Only sites that are owned by the authenticated user are returned.
 * 
 * @see https://developers.google.com/site-verification/v1/webResource/list
 * @author sg
 * 
 */
public class SiteVerificationListRequest extends 
GAPIRequestAbstract<SiteVerificationListResult> 
//implements GAPIRequest<SiteVerificationListResult> 
{

	@Override
	public void execute(final GAPICallback<SiteVerificationListResult> c) {
//		JsObject params = JsObject.one("q", q).objPut("cx", cx).objPut("alt", "json");
		JsObject params = getParams(); 
		ClientRequest clientReq = ClientRequest.create().path("/siteVerification/v1/webResource").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {

			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((SiteVerificationListResult) jsonResp);
			}
		});
	}

}
