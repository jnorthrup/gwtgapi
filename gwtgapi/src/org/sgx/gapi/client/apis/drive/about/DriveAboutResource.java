package org.sgx.gapi.client.apis.drive.about;

import java.util.Collection;

import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArray;

/**
 * @see https://developers.google.com/drive/v2/reference/about
 * @author sg
 * 
 */
public class DriveAboutResource extends GAPIResult {
	protected DriveAboutResource() {
	}

	// /**
	// * The ETag of the item.
	// *
	// * @return
	// */
	// public native final String etag() /*-{
	// return this["etag"];
	// }-*/;
	//
	// /**
	// * The ETag of the item.
	// *
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final DriveAboutResource etag(String val) /*-{
	// this["etag"] = val;
	// return this;
	// }-*/;

	/**
	 * A link back to this item.
	 * 
	 * @return
	 */
	public native final String selfLink() /*-{
		return this["selfLink"];
	}-*/;

	/**
	 * A link back to this item.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource selfLink(String val) /*-{
		this["selfLink"] = val;
		return this;
	}-*/;

	/**
	 * The name of the current user.
	 * 
	 * @return
	 */
	public native final String name() /*-{
		return this["name"];
	}-*/;

	/**
	 * The name of the current user.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource name(String val) /*-{
		this["name"] = val;
		return this;
	}-*/;

	/**
	 * The total number of quota bytes.
	 * 
	 * @return
	 */
	public native final int quotaBytesTotal() /*-{
		return this["quotaBytesTotal"];
	}-*/;

	/**
	 * The total number of quota bytes.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource quotaBytesTotal(int val) /*-{
		this["quotaBytesTotal"] = val;
		return this;
	}-*/;

	/**
	 * The number of quota bytes used.
	 * 
	 * @return
	 */
	public native final int quotaBytesUsed() /*-{
		return this["quotaBytesUsed"];
	}-*/;

	/**
	 * The number of quota bytes used.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource quotaBytesUsed(int val) /*-{
		this["quotaBytesUsed"] = val;
		return this;
	}-*/;

	/**
	 * The number of quota bytes used by trashed items.
	 * 
	 * @return
	 */
	public native final int quotaBytesUsedInTrash() /*-{
		return this["quotaBytesUsedInTrash"];
	}-*/;

	/**
	 * The number of quota bytes used by trashed items.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource quotaBytesUsedInTrash(int val) /*-{
		this["quotaBytesUsedInTrash"] = val;
		return this;
	}-*/;

	/**
	 * The largest change id.
	 * 
	 * @return
	 */
	public native final int largestChangeId() /*-{
		return this["largestChangeId"];
	}-*/;

	/**
	 * The largest change id.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource largestChangeId(int val) /*-{
		this["largestChangeId"] = val;
		return this;
	}-*/;

	/**
	 * The number of remaining change ids.
	 * 
	 * @return
	 */
	public native final int remainingChangeIds() /*-{
		return this["remainingChangeIds"];
	}-*/;

	/**
	 * The number of remaining change ids.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource remainingChangeIds(int val) /*-{
		this["remainingChangeIds"] = val;
		return this;
	}-*/;

	/**
	 * The id of the root folder.
	 * 
	 * @return
	 */
	public native final String rootFolderId() /*-{
		return this["rootFolderId"];
	}-*/;

	/**
	 * The id of the root folder.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource rootFolderId(String val) /*-{
		this["rootFolderId"] = val;
		return this;
	}-*/;

	/**
	 * The domain sharing policy for the current user.
	 * 
	 * @return
	 */
	public native final String domainSharingPolicy() /*-{
		return this["domainSharingPolicy"];
	}-*/;

	/**
	 * The domain sharing policy for the current user.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource domainSharingPolicy(String val) /*-{
		this["domainSharingPolicy"] = val;
		return this;
	}-*/;

	/**
	 * The allowable import formats.
	 * 
	 * @return
	 */
	public native final JsArray<Format> importFormats() /*-{
		return this["importFormats"];
	}-*/;

	/**
	 * The allowable import formats.
	 * 
	 * @return
	 */
	public native final Collection<Format> importFormatsCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["importFormats"]);
	}-*/;

	/**
	 * The allowable import formats.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource importFormats(JsArray<Format> val) /*-{
		this["importFormats"] = val;
		return this;
	}-*/;

	/**
	 * The allowable export formats.
	 * 
	 * @return
	 */
	public native final JsArray<Format> exportFormats() /*-{
		return this["exportFormats"];
	}-*/;

	/**
	 * The allowable export formats.
	 * 
	 * @return
	 */
	public native final Collection<Format> exportFormatsCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["exportFormats"]);
	}-*/;

	/**
	 * The allowable export formats.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource exportFormats(JsArray<Format> val) /*-{
		this["exportFormats"] = val;
		return this;
	}-*/;

	/**
	 * The content type that this additional role info applies to.
	 * 
	 * @return
	 */
	public native final JsArray<RoleInfo> additionalRoleInfo() /*-{
		return this["additionalRoleInfo"];
	}-*/;

	/**
	 * The content type that this additional role info applies to.
	 * 
	 * @return
	 */
	public native final Collection<RoleInfo> additionalRoleInfoCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["additionalRoleInfo"]);
	}-*/;

	/**
	 * The content type that this additional role info applies to.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource additionalRoleInfo(JsArray<RoleInfo> val) /*-{
		this["additionalRoleInfo"] = val;
		return this;
	}-*/;

	/**
	 * List of additional features enabled on this account.
	 * 
	 * @return
	 */
	public native final JsArray<Feature> features() /*-{
		return this["features"];

	}-*/;

	/**
	 * List of additional features enabled on this account.
	 * 
	 * @return
	 */
	public native final Collection<Feature> featuresCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["features"]);
	}-*/;

	/**
	 * List of additional features enabled on this account.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource features(JsArray<Feature> val) /*-{
		this["features"] = val;
		return this;
	}-*/;

	/**
	 * List of max upload sizes for each file type. The most specific type takes precedence.
	 * 
	 * @return
	 */
	public native final JsArray<UploadSize> maxUploadSizes() /*-{
		return this["maxUploadSizes"];
	}-*/;

	/**
	 * List of max upload sizes for each file type. The most specific type takes precedence.
	 * 
	 * @return
	 */
	public native final Collection<UploadSize> maxUploadSizesCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["maxUploadSizes"]);
	}-*/;

	/**
	 * List of max upload sizes for each file type. The most specific type takes precedence.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource maxUploadSizes(JsArray<UploadSize> val) /*-{
		this["maxUploadSizes"] = val;
		return this;
	}-*/;

	/**
	 * The current user's ID as visible in the permissions collection.
	 * 
	 * @return
	 */
	public native final String permissionId() /*-{
		return this["permissionId"];
	}-*/;

	/**
	 * The current user's ID as visible in the permissions collection.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource permissionId(String val) /*-{
		this["permissionId"] = val;
		return this;
	}-*/;

	/**
	 * A boolean indicating whether the authenticated app is installed by the authenticated user.
	 * 
	 * @return
	 */
	public native final boolean isCurrentAppInstalled() /*-{
		return this["isCurrentAppInstalled"];
	}-*/;

	/**
	 * A boolean indicating whether the authenticated app is installed by the authenticated user.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DriveAboutResource isCurrentAppInstalled(boolean val) /*-{
		this["isCurrentAppInstalled"] = val;
		return this;
	}-*/;
}
