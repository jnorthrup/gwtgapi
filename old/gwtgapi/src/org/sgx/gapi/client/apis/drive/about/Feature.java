package org.sgx.gapi.client.apis.drive.about;

import org.sgx.jsutil.client.JsObject;
/**
 * features enabled on this account.
 * @author sg
 *
 */
public class Feature extends JsObject{
protected Feature(){}
/**
 * The name of the feature.
 * @return
 */
public native final String featureName() /*-{
return this["featureName"]; 
}-*/;

/**
 * The name of the feature.
 * @param val
 * @return this - for setter chaining
 */
public native final Feature featureName(String val) /*-{
this["featureName"] = val; 
return this; 
}-*/;

/**
 *  	The request limit rate for this feature, in queries per second.
 * @return
 */
public native final double featureRate() /*-{
return this["featureRate"]; 
}-*/;

/**
 *  	The request limit rate for this feature, in queries per second.
 * @param val
 * @return this - for setter chaining
 */
public native final Feature featureRate(double val) /*-{
this["featureRate"] = val; 
return this; 
}-*/;
}
