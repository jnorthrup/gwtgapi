package org.sgx.gapi.client.apis.drive.about;

import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsArrayString;

public class RoleSet extends JsObject {
	protected RoleSet(){}
/**
 * A primary permission role.
 * @return
 */
public native final String primaryRole() /*-{
return this["primaryRole"]; 
}-*/;

/**
 * A primary permission role.
 * @param val
 * @return this - for setter chaining
 */
public native final RoleSet primaryRole(String val) /*-{
this["primaryRole"] = val; 
return this; 
}-*/;

/**
 * The supported additional roles with the primary role.
 * @return
 */
public native final JsArrayString additionalRoles() /*-{
return this["additionalRoles"]; 
}-*/;

/**
 * The supported additional roles with the primary role.
 * @param val
 * @return this - for setter chaining
 */
public native final RoleSet additionalRoles(JsArrayString val) /*-{
this["additionalRoles"] = val; 
return this; 
}-*/;

}