package org.sgx.gapi.client.apis.webfonts;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/webfonts/docs/developer_api
 * @author sg
 * 
 */
public class WebFontsRequest implements GAPIRequest<WebFontList> {

	/**
	 * <p>
	 * The list of families is returned in no particular order by default. It is possible however to sort the list using the sort parameter:
	 * </p>
	 * The possible sorting values are: </p>
	 * <ul>
	 * <li>alpha: Sort the list alphabetically</li>
	 * <li>date: Sort the list by date added (most recent font added or updated first)</li>
	 * <li>popularity: Sort the list by popularity (most popular family first)</li>
	 * <li>style: Sort the list by number of styles available (family with most styles first)</li>
	 * <li>trending: Sort the list by families seeing growth in usage (family seeing the most growth first)</li>
	 * </ul>
	 */
	String sort=null;

	public WebFontsRequest() {
		super();
	}

	
	public WebFontsRequest(String sort) {
		super();
		this.sort = sort;
	}


	@Override
	public void execute(final GAPICallback<WebFontList> c) {
		JsObject params = JsObject.createObject().cast();
		if (sort != null)
			params.objPut("sort", sort);
		ClientRequest clientReq = ClientRequest.create().path("/webfonts/v1/webfonts").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((WebFontList) jsonResp);
			}
		});
	}

	/**
	 * <p>
	 * The list of families is returned in no particular order by default. It is possible however to sort the list using the sort parameter:
	 * </p>
	 * The possible sorting values are: </p>
	 * <ul>
	 * <li>alpha: Sort the list alphabetically</li>
	 * <li>date: Sort the list by date added (most recent font added or updated first)</li>
	 * <li>popularity: Sort the list by popularity (most popular family first)</li>
	 * <li>style: Sort the list by number of styles available (family with most styles first)</li>
	 * <li>trending: Sort the list by families seeing growth in usage (family seeing the most growth first)</li>
	 * </ul>
	 * 
	 * @return
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * <p>
	 * The list of families is returned in no particular order by default. It is possible however to sort the list using the sort parameter:
	 * </p>
	 * The possible sorting values are: </p>
	 * <ul>
	 * <li>alpha: Sort the list alphabetically</li>
	 * <li>date: Sort the list by date added (most recent font added or updated first)</li>
	 * <li>popularity: Sort the list by popularity (most popular family first)</li>
	 * <li>style: Sort the list by number of styles available (family with most styles first)</li>
	 * <li>trending: Sort the list by families seeing growth in usage (family seeing the most growth first)</li>
	 * </ul>
	 * 
	 * @param sort
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

}
