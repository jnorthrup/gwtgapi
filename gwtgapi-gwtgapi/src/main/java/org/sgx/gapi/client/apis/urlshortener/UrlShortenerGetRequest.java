package org.sgx.gapi.client.apis.urlshortener;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

/**
 * <p>
 * The url.get method gets expansion information for a specified short URL. Try it now.
 * </p>
 * 
 * <p>
 * For the given short URL, the url.get method returns the corresponding long URL and the status.
 * </p>
 * 
 * <p>
 * This method requires two query parameters:
 * </p>
 * 
 * <p>
 * Your API key (using the key query parameter). Note: You can omit the query parameter when making a limited number of calls, such as during the testing phase.
 * </p>
 * <p>
 * The short URL (using the shortUrl query parameter). Note: The short URL should include the protocol, e.g. "http://goo.gl/fbsS".
 * </p>
 * 
 * 
 * <p>
 * It also supports an optional query parameter:
 * </p>
 * 
 * Additional information to return (using the projection query parameter). Possible values are:<br/>
 * "FULL" - returns the creation timestamp and all available analytics<br/>
 * "ANALYTICS_CLICKS" - returns only click counts<br/>
 * "ANALYTICS_TOP_STRINGS" - returns only top string counts (e.g. referrers, countries, etc)<br/>
 * 
 * 
 * <p>
 * Note that with the projection parameter, analytics might not be returned if data is currently unavailable.
 * </p>
 * 
 * @see https://developers.google.com/url-shortener/v1/url/get
 * @author sg
 * 
 */
public class UrlShortenerGetRequest implements GAPIRequest<UrlResource> {

	String shortUrl, projection;

	public UrlShortenerGetRequest(String shortUrl, String projection) {
		super();
		this.shortUrl = shortUrl;
		this.projection = projection;
	}
	public UrlShortenerGetRequest(String shortUrl) {
		this(shortUrl, null); 
	}
	@Override
	public void execute(final GAPICallback<UrlResource> c) {
		JsObject params = JsObject.createObject().cast(); 
		if(getShortUrl()!=null)
			params.objPut("shortUrl", getShortUrl());
		if(getProjection()!=null)
			params.objPut("projection", getProjection());
		ClientRequest clientReq = ClientRequest.create()
			.path("/urlshortener/v1/url/").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((UrlResource) jsonResp);
			}
		});
	}

	/**
	 * The short URL, including the protocol.
	 * @return
	 */
	public String getShortUrl() {
		return shortUrl;
	}

	/**
	 * The short URL, including the protocol.
	 * @param shortUrl
	 */
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	/**
	 * <p>
	 * Additional information to return. Acceptable values are:
	 * </p>
	 * 
	 * "ANALYTICS_CLICKS" - Returns only click counts.<br/>
	 * "ANALYTICS_TOP_STRINGS" - Returns only top string counts.<br/>
	 * "FULL" - Returns the creation timestamp and all available analytics.<br/>
	 * 
	 * @return
	 */
	public String getProjection() {
		return projection;
	}

	/**
	 * <p>
	 * Additional information to return. Acceptable values are:
	 * </p>
	 * 
	 * "ANALYTICS_CLICKS" - Returns only click counts.<br/>
	 * "ANALYTICS_TOP_STRINGS" - Returns only top string counts.<br/>
	 * "FULL" - Returns the creation timestamp and all available analytics.<br/>
	 * 
	 * @param projection
	 */
	public void setProjection(String projection) {
		this.projection = projection;
	}

}
