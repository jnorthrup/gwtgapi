package org.sgx.gapi.client.apis.fusiontables.table;

import java.util.List;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;
import org.sgx.gapi.client.apis.fusiontables.FTColumn; 

import com.google.gwt.core.client.JsArray;
/**
 * Creates a new table
 * 
 * @see https://developers.google.com/fusiontables/docs/v1/reference/table/insert
 * @author sg
 * 
 */
public class TableInsertRequest implements GAPIRequest<FTTable> {
	
	JsArray<FTColumn> columns; 
	boolean isExportable; 
	String name, attribution, attributionLink, description; 
	
	public TableInsertRequest(JsArray<FTColumn> columns, boolean isExportable, String name) {
		super();
		this.columns = columns;
		this.isExportable = isExportable;
		this.name = name;
	}
	public TableInsertRequest(List<FTColumn> columns, boolean isExportable, String name) {
		super();
		this.columns = JsUtil.toJsArray(columns);
		this.isExportable = isExportable;
		this.name = name;
	}
	@Override
	public void execute(final GAPICallback<FTTable> c) {
//		System.out.println(getColumns().length());
		JsObject params = JsObject.one("columns", getColumns())
				.objPut("isExportable", isExportable())
				.objPut("name", getName()); 
		//TODO: other properties
		
		ClientRequest clientReq = ClientRequest.create()
				.path("/fusiontables/v1/tables/")
				.method("post")
				.body(params)
				;
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((FTTable) jsonResp);
			}
		});
	}


	public JsArray<FTColumn> getColumns() {
		return columns;
	}


	public void setColumns(JsArray<FTColumn> columns) {
		this.columns = columns;
	}


	public boolean isExportable() {
		return isExportable;
	}


	public void setExportable(boolean isExportable) {
		this.isExportable = isExportable;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAttribution() {
		return attribution;
	}


	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}


	public String getAttributionLink() {
		return attributionLink;
	}


	public void setAttributionLink(String attributionLink) {
		this.attributionLink = attributionLink;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	
}
