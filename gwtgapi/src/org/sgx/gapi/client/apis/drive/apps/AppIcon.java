package org.sgx.gapi.client.apis.drive.apps;

import org.sgx.jsutil.client.JsObject;

public class AppIcon extends JsObject {
	protected AppIcon() {
	}

	/**
	 * Category of the icon. Allowed values are:
	 * <ul>
	 * <li><code>application</code> - icon for the application</li>
	 * <li><code>document</code> - icon for a file associated with the app</li>
	 * <li><code>documentShared - icon for a shared file associated with the app</code>
	 * 
	 * @return
	 */
	public native final String category() /*-{
		return this["category"];
	}-*/;

	/**
	 * Category of the icon. Allowed values are:
	 * <ul>
	 * <li><code>application</code> - icon for the application</li>
	 * <li><code>document</code> - icon for a file associated with the app</li>
	 * <li><code>documentShared - icon for a shared file associated with the app</code>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AppIcon category(String val) /*-{
		this["category"] = val;
		return this;
	}-*/;

	/**
	 * Size of the icon. Represented as the maximum of the width and height.
	 * 
	 * @return
	 */
	public native final int size() /*-{
		return this["size"];
	}-*/;

	/**
	 * Size of the icon. Represented as the maximum of the width and height.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AppIcon size(int val) /*-{
		this["size"] = val;
		return this;
	}-*/;

	/**
	 * URL for the icon.
	 * 
	 * @return
	 */
	public native final String iconUrl() /*-{
		return this["iconUrl"];
	}-*/;

	/**
	 * URL for the icon.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AppIcon iconUrl(String val) /*-{
		this["iconUrl"] = val;
		return this;
	}-*/;
}
