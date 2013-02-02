package org.sgx.gapi.client.apis.drive.apps;

import java.util.Collection;

import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArray;
/**
 * @see https://developers.google.com/drive/v2/reference/apps/list
 * @author sg
 *
 */
public class AppsList extends GAPIResult {
	protected AppsList() {
	}

	/**
	 * A link back to this list.
	 * 
	 * @return
	 */
	public native final String selfLink() /*-{
		return this["selfLink"];
	}-*/;

	/**
	 * A link back to this list.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AppsList selfLink(String val) /*-{
		this["selfLink"] = val;
		return this;
	}-*/;

	/**
	 * The actual list of apps.
	 * 
	 * @return
	 */
	public native final JsArray<App> items() /*-{
		return this["items"];
	}-*/;

	/**
	 * The actual list of apps.
	 * 
	 * @return
	 */
	public native final Collection<App> itemsCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["items"]);
	}-*/;

	/**
	 * The actual list of apps.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final AppsList items(JsArray<App> val) /*-{
		this["items"] = val;
		return this;
	}-*/;
}
