package org.sgx.gapi.client.apis.drive.apps;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/drive/v2/reference/apps/list
 * 
 * @author sg
 *
 */
public class DriveAppListRequest implements GAPIRequest<AppsList> {
	

	public DriveAppListRequest() {
	}

	@Override
	public void execute(final GAPICallback<AppsList> c) {
		JsObject params = JsObject.createObject().cast();
		ClientRequest clientReq = ClientRequest.create().path("/drive/v2/apps").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((AppsList) jsonResp);
			}
		});
	}
}
