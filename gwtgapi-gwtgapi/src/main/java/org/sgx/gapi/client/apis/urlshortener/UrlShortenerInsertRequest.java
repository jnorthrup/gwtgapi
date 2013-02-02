package org.sgx.gapi.client.apis.urlshortener;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.json.client.JSONObject;

/**
 * The url.insert method creates a new short URL.
 * 
 * <p>
 * Authentication is optional for the url.insert method. If an authentication token with access to https://www.googleapis.com/auth/urlshortener is provided, the method creates a
 * short URL for the authenticated user. The short URL created will appear in the authenticated user's list method results and on their dashboard at http://goo.gl/. If no
 * authentication is provided, the short URL that the method creates is not associated with any particular account.
 * </p>
 * 
 * <p>
 * When creating a new short URL, you must supply a URL Resource as the message body. Note that for a new short URL, only the longUrl property is required.
 * </p>
 * 
 * <p>
 * This method requires one query parameter:
 * 
 * Your API key (using the key query parameter). Note: You can omit the query parameter when making a limited number of calls, such as during the testing phase.
 * </p>
 * 
 * 
 * <p>
 * The returned resource contains the short URL and the long URL. Note that the returned long URL may be loosely canonicalized, e.g. to convert "google.com" into
 * "http://google.com/".
 * </p>
 * 
 * @see https://developers.google.com/url-shortener/v1/url/insert
 * @author sg
 * 
 */
public class UrlShortenerInsertRequest implements GAPIRequest<UrlResource> {

	String longUrl; 
	
	public UrlShortenerInsertRequest(String longUrl) {
		super();
		this.longUrl = longUrl;
	}

	@Override
	public void execute(final GAPICallback<UrlResource> c) {
		
		//POST https://www.googleapis.com/urlshortener/v1/url
		JsObject bodyObj = JsObject.one("longUrl", getLongUrl());
		String bodyString = new JSONObject(bodyObj).toString();
		ClientRequest clientReq = ClientRequest.create().path("/urlshortener/v1/url/")
				.method("POST").body(bodyString);
		
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((UrlResource) jsonResp);
			}
		});
	}

	public String getLongUrl() {
		return longUrl;
	}

	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}

}
