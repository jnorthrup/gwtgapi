package org.sgx.gapi.client.apis.urlshortener;

import org.sgx.gapi.client.apis.GAPIResult;
/**
 * an UrlResource resource 
 * @see https://developers.google.com/url-shortener/v1/url#resource
 * @author sg
 *
 */
public class UrlResource extends GAPIResult {
protected UrlResource(){}
public static final native UrlResource create()/*-{
	return {}; 
}-*/;
/**
 *  	Short URL, e.g. "http://goo.gl/l6MS".
 * @return
 */
public native final String id() /*-{
return this["id"]; 
}-*/;

/**
 *  	Short URL, e.g. "http://goo.gl/l6MS".
 * @param val
 * @return this - for setter chaining
 */
public native final UrlResource id(String val) /*-{
this["id"] = val; 
return this; 
}-*/;

/**
 * Long URL, e.g. "http://www.google.com/". Might not be present if the status is "REMOVED"
 * @return
 */
public native final String longUrl() /*-{
return this["longUrl"]; 
}-*/;

/**
 * Long URL, e.g. "http://www.google.com/". Might not be present if the status is "REMOVED"
 * @param val
 * @return this - for setter chaining
 */
public native final UrlResource longUrl(String val) /*-{
this["longUrl"] = val; 
return this; 
}-*/;

/**
 * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED". A URL might be marked "REMOVED" if it was flagged as spam, for example.
 * @return
 */
public native final String status() /*-{
return this["status"]; 
}-*/;

/**
 * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED". A URL might be marked "REMOVED" if it was flagged as spam, for example.
 * @param val
 * @return this - for setter chaining
 */
public native final UrlResource status(String val) /*-{
this["status"] = val; 
return this; 
}-*/;

/**
 * Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format, e.g. "2010-10-14T19:01:24.944+00:00".
 * @return
 */
public native final String created() /*-{
return this["created"]; 
}-*/;

/**
 * Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format, e.g. "2010-10-14T19:01:24.944+00:00".
 * @param val
 * @return this - for setter chaining
 */
public native final UrlResource created(String val) /*-{
this["created"] = val; 
return this; 
}-*/;
}
