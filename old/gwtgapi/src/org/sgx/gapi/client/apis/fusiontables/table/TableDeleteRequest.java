package org.sgx.gapi.client.apis.fusiontables.table;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

/**
 * Deletes a table
 * 
 * @see https://developers.google.com/fusiontables/docs/v1/reference/table/delete
 * @author sg
 * 
 */
public class TableDeleteRequest implements GAPIRequest<TableDeleteResult> {

	String tableId;

	public TableDeleteRequest(String tableId) {
		super();
		this.tableId = tableId;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	@Override
	public void execute(final GAPICallback<TableDeleteResult> c) {
		ClientRequest clientReq = ClientRequest.create().path("/fusiontables/v1/tables/" + getTableId())
				.method("delete").params(JsObject.one("tableId", getTableId()));
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {

			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((TableDeleteResult) jsonResp);
			}
		});
	}

}
