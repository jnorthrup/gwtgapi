package org.sgx.gapi.client.apis.drive.about;

import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
/**
 * Information about supported additional roles per file type. The most specific type takes precedence.
 * @author sg
 *
 */
public class RoleInfo extends JsObject{
protected RoleInfo(){}

/**
 *  	The content type that this additional role info applies to.
 * @return
 */
public native final String type() /*-{
return this["type"]; 
}-*/;

/**
 *  	The content type that this additional role info applies to.
 * @param val
 * @return this - for setter chaining
 */
public native final RoleInfo type(String val) /*-{
this["type"] = val; 
return this; 
}-*/;

/**
 *  	The supported additional roles per primary role.
 * @return
 */
public native final JsArray<RoleSet> roleSets() /*-{
return this["roleSets"]; 
}-*/;

/**
 *  	The supported additional roles per primary role.
 * @param val
 * @return this - for setter chaining
 */
public native final RoleInfo roleSets(JsArray<RoleSet> val) /*-{
this["roleSets"] = val; 
return this; 
}-*/;
}
