package org.sgx.gapi.client.apis.fusiontables.table;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

public class TableListRequest implements GAPIRequest<TableListResult>{

	@Override
	public void execute(final GAPICallback<TableListResult> c) {
			ClientRequest clientReq = ClientRequest.create()
					.path("/fusiontables/v1/tables")
//					.params(JsObject.one("userId", getUserId()))
					; 
			HttpRequest req = GAPI.get().client().request(clientReq);
			req.execute(new ClientRequestCallback() {
				
				@Override
				public void call(JsObject jsonResp, String rawResp) {
					c.call((TableListResult)jsonResp); 
				}
			}); 
	}
}
