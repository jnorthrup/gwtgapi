package org.sgx.gapi.client.apis.drive.file;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

public class DriveFileListRequest implements GAPIRequest<FileListResource> {
	/**
	 * Maximum number of files to return.
	 */
	int maxResults;
	/**
	 * Page token for files.
	 */
	String pageToken;
	/**
	 * This parameter is deprecated and has no function. Acceptable values are: - "BASIC": Deprecated - "FULL": Deprecated
	 */
	String projection;

	/**
	 * Query string for searching files. See Searching for files for more information about supported fields and operations. https://developers.google.com/drive/search-parameters
	 */
	String q;

	public DriveFileListRequest() {
	}

	@Override
	public void execute(final GAPICallback<FileListResource> c) {
		JsObject params = JsObject.createObject().cast();
		if(maxResults>0)
			params.objPut("maxResults", maxResults); 
		if(pageToken!=null)
			params.objPut("pageToken", pageToken); 
		if(projection!=null)
			params.objPut("projection", projection); 
		if(q!=null)
			params.objPut("q", q); 
		ClientRequest clientReq = ClientRequest.create().path("/drive/v2/files").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((FileListResource) jsonResp);
			}
		});
	}

	/**
	 * Maximum number of files to return.
	 * 
	 * @return
	 */
	public int getMaxResults() {
		return maxResults;
	}

	/**
	 * Maximum number of files to return.
	 * 
	 * @param maxResults
	 */
	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

	/**
	 * Page token for files.
	 * 
	 * @return
	 */
	public String getPageToken() {
		return pageToken;
	}

	/**
	 * Page token for files.
	 * 
	 * @param pageToken
	 */
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}

	/**
	 * This parameter is deprecated and has no function. Acceptable values are: - "BASIC": Deprecated - "FULL": Deprecated
	 * 
	 * @return
	 */
	public String getProjection() {
		return projection;
	}

	/**
	 * This parameter is deprecated and has no function. Acceptable values are: - "BASIC": Deprecated - "FULL": Deprecated
	 * 
	 * @param projection
	 */
	public void setProjection(String projection) {
		this.projection = projection;
	}

	/**
	 * Query string for searching files. See Searching for files for more information about supported fields and operations.
	 * 
	 * @return
	 */
	public String getQ() {
		return q;
	}

	/**
	 * Query string for searching files. See Searching for files for more information about supported fields and operations.
	 * 
	 * @param q
	 */
	public void setQ(String q) {
		this.q = q;
	}

}
