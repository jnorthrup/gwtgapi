package org.sgx.gapi.client.apis.drive.file;

import java.util.Collection;

import org.sgx.gapi.client.apis.GAPIBase;
import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArray;

/**
 * response type of FileListRequest. @see https://developers.google.com/drive/v2/reference/files/list
 * 
 * @author sg
 * 
 */
public class FileList extends GAPIResult {
	protected FileList() {
	}

	// /**
	// * The ETag of the list.
	// * @return
	// */
	// public native final String etag() /*-{
	// return this["etag"];
	// }-*/;
	//
	// /**
	// * The ETag of the list.
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final FileListResource etag(String val) /*-{
	// this["etag"] = val;
	// return this;
	// }-*/;

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
	public native final FileList selfLink(String val) /*-{
		this["selfLink"] = val;
		return this;
	}-*/;

	/**
	 * The page token for the next page of files.
	 * 
	 * @return
	 */
	public native final String nextPageToken() /*-{
		return this["nextPageToken"];
	}-*/;

	/**
	 * The page token for the next page of files.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FileList nextPageToken(String val) /*-{
		this["nextPageToken"] = val;
		return this;
	}-*/;

	/**
	 * A link to the next page of files.
	 * 
	 * @return
	 */
	public native final String nextLink() /*-{
		return this["nextLink"];
	}-*/;

	/**
	 * A link to the next page of files.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FileList nextLink(String val) /*-{
		this["nextLink"] = val;
		return this;
	}-*/;

	/**
	 * The actual list of files.
	 * 
	 * @return
	 */
	public native final JsArray<File> items() /*-{
		return this["items"];
	}-*/;

	/**
	 * The actual list of files.
	 * 
	 * @return
	 */
	public native final Collection<File> itemsCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["items"]);
	}-*/;

	/**
	 * The actual list of files.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FileList items(JsArray<File> val) /*-{
		this["items"] = val;
		return this;
	}-*/;
}
