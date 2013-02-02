package org.sgx.gapi.client.apis.drive.permission;

import org.sgx.gapi.client.apis.GAPIBase;

import com.google.gwt.core.client.JsArrayString;

/**
 * @see https://developers.google.com/drive/v2/reference/permissions#resource
 * @author sg
 * 
 */
public class Permission extends GAPIBase {
	protected Permission() {
	}

	/**
	 * The ID of the permission.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this["id"];
	}-*/;

	/**
	 * The ID of the permission.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission id(String val) /*-{
		this["id"] = val;
		return this;
	}-*/;

	/**
	 * A link back to this permission.
	 * 
	 * @return
	 */
	public native final String selfLink() /*-{
		return this["selfLink"];
	}-*/;

	/**
	 * A link back to this permission.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission selfLink(String val) /*-{
		this["selfLink"] = val;
		return this;
	}-*/;

	/**
	 * The name for this permission.
	 * 
	 * @return
	 */
	public native final String name() /*-{
		return this["name"];
	}-*/;

	/**
	 * The name for this permission.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission name(String val) /*-{
		this["name"] = val;
		return this;
	}-*/;

	/**
	 * The primary role for this user. Allowed values are: owner, reader, writer
	 * 
	 * @return
	 */
	public native final String role() /*-{
		return this["role"];
	}-*/;

	/**
	 * The primary role for this user. Allowed values are: owner, reader, writer
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission role(String val) /*-{
		this["role"] = val;
		return this;
	}-*/;

	/**
	 * Additional roles for this user. Only commenter is currently allowed.
	 * 
	 * @return
	 */
	public native final JsArrayString additionalRoles() /*-{
		return this["additionalRoles"];
	}-*/;

	/**
	 * Additional roles for this user. Only commenter is currently allowed.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission additionalRoles(JsArrayString val) /*-{
		this["additionalRoles"] = val;
		return this;
	}-*/;

	/**
	 * The account type. Allowed values are: user, group, domain, anyone
	 * 
	 * @return
	 */
	public native final String type() /*-{
		return this["type"];
	}-*/;

	/**
	 * The account type. Allowed values are: user, group, domain, anyone
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission type(String val) /*-{
		this["type"] = val;
		return this;
	}-*/;

	/**
	 * The authkey parameter required for this permission.
	 * 
	 * @return
	 */
	public native final String authKey() /*-{
		return this["authKey"];
	}-*/;

	/**
	 * The authkey parameter required for this permission.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission authKey(String val) /*-{
		this["authKey"] = val;
		return this;
	}-*/;

	/**
	 * Whether the link is required for this permission.
	 * 
	 * @return
	 */
	public native final boolean withLink() /*-{
		return this["withLink"];
	}-*/;

	/**
	 * Whether the link is required for this permission.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission withLink(boolean val) /*-{
		this["withLink"] = val;
		return this;
	}-*/;

	/**
	 * A link to the profile photo, if available.
	 * 
	 * @return
	 */
	public native final String photoLink() /*-{
		return this["photoLink"];
	}-*/;

	/**
	 * A link to the profile photo, if available.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission photoLink(String val) /*-{
		this["photoLink"] = val;
		return this;
	}-*/;

	/**
	 * The email address or domain name for the entity. This is not populated in responses. You can use the alias me as the value for this property to refer to the current
	 * authorized user.
	 * 
	 * @return
	 */
	public native final String value() /*-{
		return this["value"];
	}-*/;

	/**
	 * The email address or domain name for the entity. This is not populated in responses. You can use the alias me as the value for this property to refer to the current
	 * authorized user.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Permission value(String val) /*-{
		this["value"] = val;
		return this;
	}-*/;

}
