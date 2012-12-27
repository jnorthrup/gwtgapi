package org.sgx.gapi.client.apis.drive.about;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

public class DriveAboutGetRequest implements GAPIRequest<DriveAboutResource> {

	/**
	 * When calculating the number of remaining change IDs, whether to include shared files and public files the user has opened. When set to false, this counts only change IDs for
	 * owned files and any shared or public files that the user has explictly added to a folder in Drive. (Default: true)
	 */
	boolean includeSubscribed=true;

	/**
	 * Maximum number of remaining change IDs to count
	 */
	int maxChangeIdCount=0;

	/**
	 * Change ID to start counting from when calculating number of remaining change IDs
	 */
	int startChangeId=0;

	public DriveAboutGetRequest() {
	}

	@Override
	public void execute(final GAPICallback<DriveAboutResource> c) {
		JsObject params = JsObject.createObject().cast(); 
		
		params.objPut("includeSubscribed", includeSubscribed);
		if(maxChangeIdCount>0)
			params.objPut("maxChangeIdCount", maxChangeIdCount); 
		if(startChangeId>0)
			params.objPut("startChangeId", startChangeId); 
		ClientRequest clientReq = ClientRequest.create().path("/drive/v2/about").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((DriveAboutResource) jsonResp);
			}
		});
	}

	/**
	 * When calculating the number of remaining change IDs, whether to include shared files and public files the user has opened. When set to false, this counts only change IDs for
	 * owned files and any shared or public files that the user has explictly added to a folder in Drive. (Default: true)
	 * 
	 * @return
	 */
	public boolean isIncludeSubscribed() {
		return includeSubscribed;
	}

	/**
	 * When calculating the number of remaining change IDs, whether to include shared files and public files the user has opened. When set to false, this counts only change IDs for
	 * owned files and any shared or public files that the user has explictly added to a folder in Drive. (Default: true)
	 * 
	 * @param includeSubscribed
	 */
	public void setIncludeSubscribed(boolean includeSubscribed) {
		this.includeSubscribed = includeSubscribed;
	}

	/**
	 * Maximum number of remaining change IDs to count
	 * 
	 * @return
	 */
	public int getMaxChangeIdCount() {
		return maxChangeIdCount;
	}

	/**
	 * Maximum number of remaining change IDs to count
	 * 
	 * @param maxChangeIdCount
	 */
	public void setMaxChangeIdCount(int maxChangeIdCount) {
		this.maxChangeIdCount = maxChangeIdCount;
	}

	/**
	 * Change ID to start counting from when calculating number of remaining change IDs
	 * 
	 * @return
	 */
	public int getStartChangeId() {
		return startChangeId;
	}

	/**
	 * Change ID to start counting from when calculating number of remaining change IDs
	 * 
	 * @param startChangeId
	 */
	public void setStartChangeId(int startChangeId) {
		this.startChangeId = startChangeId;
	}

}
