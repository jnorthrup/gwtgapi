package org.sgx.gapi.client.apis.siteVerification;

import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArray;

public class SiteVerificationListResult extends GAPIResult {
protected SiteVerificationListResult(){}
/**
 * 
 * @return
 */
public native final JsArray<SiteVerificationWebResource> items() /*-{
return this["items"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final SiteVerificationListResult items(JsArray<SiteVerificationWebResource> val) /*-{
this["items"] = val; 
return this; 
}-*/; 
}
