package org.sgx.gapi.client.apis.books;

import java.util.Collection;

import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArray;

/**
 * a list of modules. @see https://developers.google.com/books/docs/v1/reference/volumes/list#resource_volumes
 * 
 * @author sg
 * 
 */
public class VolumeList extends GAPIResult {
	protected VolumeList() {
	}

	/**
	 * 
	 * @return
	 */
	public native final int totalItems() /*-{
		return this["totalItems"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeList totalItems(int val) /*-{
		this["totalItems"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final JsArray<Volume> items() /*-{
		return this["items"];
	}-*/;
	
	/**
	 * 
	 * @return
	 */
	public native final Collection<Volume> itemsCols() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["items"]);
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeList items(JsArray<Volume> val) /*-{
		this["items"] = val;
		return this;
	}-*/;
}
