package org.sgx.gapi.client.apis.drive.apps;

import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArrayString;

public class App extends GAPIResult {
	protected App() {
	}

	/**
	 * The ID of the app.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this["id"];
	}-*/;

	/**
	 * The ID of the app.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App id(String val) /*-{
		this["id"] = val;
		return this;
	}-*/;

	/**
	 * The name of the app.
	 * 
	 * @return
	 */
	public native final String name() /*-{
		return this["name"];
	}-*/;

	/**
	 * The name of the app.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App name(String val) /*-{
		this["name"] = val;
		return this;
	}-*/;

	/**
	 * The type of object this app creates (e.g. Chart). If empty, the app name should be used instead.
	 * 
	 * @return
	 */
	public native final String objectType() /*-{
		return this["objectType"];
	}-*/;

	/**
	 * The type of object this app creates (e.g. Chart). If empty, the app name should be used instead.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App objectType(String val) /*-{
		this["objectType"] = val;
		return this;
	}-*/;

	/**
	 * Whether this app supports creating new objects.
	 * 
	 * @return
	 */
	public native final boolean supportsCreate() /*-{
		return this["supportsCreate"];
	}-*/;

	/**
	 * Whether this app supports creating new objects.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App supportsCreate(boolean val) /*-{
		this["supportsCreate"] = val;
		return this;
	}-*/;

	/**
	 * Whether this app supports importing Google Docs.
	 * 
	 * @return
	 */
	public native final boolean supportsImport() /*-{
		return this["supportsImport"];
	}-*/;

	/**
	 * Whether this app supports importing Google Docs.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App supportsImport(boolean val) /*-{
		this["supportsImport"] = val;
		return this;
	}-*/;

	/**
	 * Whether the app is installed.
	 * 
	 * @return
	 */
	public native final boolean installed() /*-{
		return this["installed"];
	}-*/;

	/**
	 * Whether the app is installed.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App installed(boolean val) /*-{
		this["installed"] = val;
		return this;
	}-*/;

	/**
	 * Whether the app is authorized to access data on the user's Drive.
	 * 
	 * @return
	 */
	public native final boolean authorized() /*-{
		return this["authorized"];
	}-*/;

	/**
	 * Whether the app is authorized to access data on the user's Drive.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App authorized(boolean val) /*-{
		this["authorized"] = val;
		return this;
	}-*/;

	/**
	 * Whether the app is selected as the default handler for the types it supports.
	 * 
	 * @return
	 */
	public native final boolean useByDefault() /*-{
		return this["useByDefault"];
	}-*/;

	/**
	 * Whether the app is selected as the default handler for the types it supports.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App useByDefault(boolean val) /*-{
		this["useByDefault"] = val;
		return this;
	}-*/;

	/**
	 * The product URL.
	 * 
	 * @return
	 */
	public native final String productUrl() /*-{
		return this["productUrl"];
	}-*/;

	/**
	 * The product URL.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App productUrl(String val) /*-{
		this["productUrl"] = val;
		return this;
	}-*/;

	/**
	 * The list of primary mime types.
	 * 
	 * @return
	 */
	public native final JsArrayString primaryMimeTypes() /*-{
		return this["primaryMimeTypes"];
	}-*/;

	/**
	 * The list of primary mime types.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App primaryMimeTypes(JsArrayString val) /*-{
		this["primaryMimeTypes"] = val;
		return this;
	}-*/;

	/**
	 * The list of secondary mime types.
	 * 
	 * @return
	 */
	public native final JsArrayString secondaryMimeTypes() /*-{
		return this["secondaryMimeTypes"];
	}-*/;

	/**
	 * The list of secondary mime types.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App secondaryMimeTypes(JsArrayString val) /*-{
		this["secondaryMimeTypes"] = val;
		return this;
	}-*/;

	/**
	 * The list of primary file extensions.
	 * 
	 * @return
	 */
	public native final JsArrayString primaryFileExtensions() /*-{
		return this["primaryFileExtensions"];
	}-*/;

	/**
	 * The list of primary file extensions.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App primaryFileExtensions(JsArrayString val) /*-{
		this["primaryFileExtensions"] = val;
		return this;
	}-*/;

	/**
	 * The list of secondary file extensions.
	 * 
	 * @return
	 */
	public native final JsArrayString secondaryFileExtensions() /*-{
		return this["secondaryFileExtensions"];
	}-*/;

	/**
	 * The list of secondary file extensions.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App secondaryFileExtensions(JsArrayString val) /*-{
		this["secondaryFileExtensions"] = val;
		return this;
	}-*/;

	/**
	 * The various icons for the app.
	 * 
	 * @return
	 */
	public native final AppIcon icons() /*-{
		return this["icons"];
	}-*/;

	/**
	 * The various icons for the app.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final App icons(AppIcon val) /*-{
		this["icons"] = val;
		return this;
	}-*/;
}
