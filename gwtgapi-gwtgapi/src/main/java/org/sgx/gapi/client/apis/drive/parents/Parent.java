package org.sgx.gapi.client.apis.drive.parents;

import org.sgx.gapi.client.apis.GAPIBase;

/**
 * A reference to a file's parent.
 * 
 * @see https://developers.google.com/drive/v2/reference/parents#resource
 * @author sg
 * 
 */
public class Parent extends GAPIBase {
	protected Parent() {
	}

	/**
	 * The ID of the parent.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this["id"];
	}-*/;

	/**
	 * The ID of the parent.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Parent id(String val) /*-{
		this["id"] = val;
		return this;
	}-*/;

	/**
	 * A link back to this reference.
	 * 
	 * @return
	 */
	public native final String selfLink() /*-{
		return this["selfLink"];
	}-*/;

	/**
	 * A link back to this reference.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Parent selfLink(String val) /*-{
		this["selfLink"] = val;
		return this;
	}-*/;

	/**
	 * A link to the parent.
	 * 
	 * @return
	 */
	public native final String parentLink() /*-{
		return this["parentLink"];
	}-*/;

	/**
	 * A link to the parent.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Parent parentLink(String val) /*-{
		this["parentLink"] = val;
		return this;
	}-*/;

	/**
	 * Whether or not the parent is the root folder.
	 * 
	 * @return
	 */
	public native final boolean isRoot() /*-{
		return this["isRoot"];
	}-*/;

	/**
	 * Whether or not the parent is the root folder.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Parent isRoot(boolean val) /*-{
		this["isRoot"] = val;
		return this;
	}-*/;
}
