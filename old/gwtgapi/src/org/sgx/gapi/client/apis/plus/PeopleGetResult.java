package org.sgx.gapi.client.apis.plus;

import org.sgx.gapi.client.apis.GAPIBase;

public class PeopleGetResult extends GAPIBase {
protected PeopleGetResult(){}
/**
 * 
 * @return
 */
public native final String displayName() /*-{
return this["displayName"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final PeopleGetResult displayName(String val) /*-{
this["displayName"] = val; 
return this; 
}-*/;
}
