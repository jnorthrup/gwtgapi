package org.sgx.gapi.client.apis.drive.file;

import java.util.Collection;

import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.apis.drive.parents.Parent;
import org.sgx.gapi.client.apis.drive.permission.Permission;
import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * @see https://developers.google.com/drive/v2/reference/files#resource
 * @author sg
 * 
 */
public class File extends GAPIResult {
	protected File() {
	}

	/**
	 * The ID of the file.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this["id"];
	}-*/;

	/**
	 * The ID of the file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File id(String val) /*-{
		this["id"] = val;
		return this;
	}-*/;

	/**
	 * A link back to this file.
	 * 
	 * @return
	 */
	public native final String selfLink() /*-{
		return this["selfLink"];
	}-*/;

	/**
	 * A link back to this file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File selfLink(String val) /*-{
		this["selfLink"] = val;
		return this;
	}-*/;

	/**
	 * The title of the this file. Used to identify file or folder name.
	 * 
	 * @return
	 */
	public native final String title() /*-{
		return this["title"];
	}-*/;

	/**
	 * The title of the this file. Used to identify file or folder name.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File title(String val) /*-{
		this["title"] = val;
		return this;
	}-*/;

	/**
	 * The mimetype of the file
	 * 
	 * @return
	 */
	public native final String mimeType() /*-{
		return this["mimeType"];
	}-*/;

	/**
	 * The mimetype of the file
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File mimeType(String val) /*-{
		this["mimeType"] = val;
		return this;
	}-*/;

	/**
	 * A short description of the file
	 * 
	 * @return
	 */
	public native final String description() /*-{
		return this["description"];
	}-*/;

	/**
	 * A short description of the file
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File description(String val) /*-{
		this["description"] = val;
		return this;
	}-*/;

	/**
	 * A group of labels for the file.
	 * 
	 * @return
	 */
	public native final FileLabel labels() /*-{
		return this["labels"];
	}-*/;

	/**
	 * A group of labels for the file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File labels(FileLabel val) /*-{
		this["labels"] = val;
		return this;
	}-*/;

	/**
	 * Create time for this file (formatted ISO8601 timestamp).Example value: 2012-12-27T18:28:48.127Z
	 * 
	 * @return
	 */
	public native final String createdDate() /*-{
		return this["createdDate"] + "";
	}-*/;

	/**
	 * Create time for this file (formatted ISO8601 timestamp).Example value: 2012-12-27T18:28:48.127Z
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File createdDate(String val) /*-{
		this["createdDate"] = val;
		return this;
	}-*/;

	/**
	 * Last time this file was modified by anyone (formatted RFC 3339 timestamp). This is only mutable on update when the setModifiedDate parameter
	 * 
	 * @return
	 */
	public native final String modifiedDate() /*-{
		return this["modifiedDate"];
	}-*/;

	/**
	 * Last time this file was modified by anyone (formatted RFC 3339 timestamp). This is only mutable on update when the setModifiedDate parameter
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File modifiedDate(String val) /*-{
		this["modifiedDate"] = val;
		return this;
	}-*/;

	/**
	 * Last time this file was modified by the user (formatted RFC 3339 timestamp). Note that setting modifiedDate will also update the modifiedByMe date for the user which set the
	 * date.
	 * 
	 * @return
	 */
	public native final String modifiedByMeDate() /*-{
		return this["modifiedByMeDate"];
	}-*/;

	/**
	 * Last time this file was modified by the user (formatted RFC 3339 timestamp). Note that setting modifiedDate will also update the modifiedByMe date for the user which set the
	 * date.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File modifiedByMeDate(String val) /*-{
		this["modifiedByMeDate"] = val;
		return this;
	}-*/;

	/**
	 * Short lived download URL for the file. This is only populated for files with content stored in Drive.
	 * 
	 * @return
	 */
	public native final String downloadUrl() /*-{
		return this["downloadUrl"];
	}-*/;

	/**
	 * Short lived download URL for the file. This is only populated for files with content stored in Drive.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File downloadUrl(String val) /*-{
		this["downloadUrl"] = val;
		return this;
	}-*/;

	/**
	 * Indexable text attributes for the file. &nbsp;This property can only be written, and is not returned by files.get. For more information, see <a
	 * href="https://developers.google.com/drive/practices#saving_indexable_text">Saving indexable text.</a>
	 * 
	 * @return
	 */
	public native final JsObject indexableText() /*-{
		return this["indexableText"];
	}-*/;

	/**
	 * Indexable text attributes for the file. &nbsp;This property can only be written, and is not returned by files.get. For more information, see <a
	 * href="https://developers.google.com/drive/practices#saving_indexable_text">Saving indexable text.</a>
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File indexableText(JsObject val) /*-{
		this["indexableText"] = val;
		return this;
	}-*/;

	/**
	 * The permissions for the authenticated user on this file.
	 * 
	 * @return
	 */
	public native final Permission userPermission() /*-{
		return this["userPermission"];
	}-*/;

	/**
	 * The permissions for the authenticated user on this file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File userPermission(Permission val) /*-{
		this["userPermission"] = val;
		return this;
	}-*/;

	/**
	 * The file extension used when downloading this file. This field is read only. To set the extension, include it on title when creating the file. This will only be populated on
	 * files with content stored in Drive.
	 * 
	 * @return
	 */
	public native final String fileExtension() /*-{
		return this["fileExtension"];
	}-*/;

	/**
	 * The file extension used when downloading this file. This field is read only. To set the extension, include it on title when creating the file. This will only be populated on
	 * files with content stored in Drive.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File fileExtension(String val) /*-{
		this["fileExtension"] = val;
		return this;
	}-*/;

	/**
	 * An MD5 checksum for the content of this file. This is populated only for files with content stored in Drive.
	 * 
	 * @return
	 */
	public native final String md5Checksum() /*-{
		return this["md5Checksum"];
	}-*/;

	/**
	 * An MD5 checksum for the content of this file. This is populated only for files with content stored in Drive.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File md5Checksum(String val) /*-{
		this["md5Checksum"] = val;
		return this;
	}-*/;

	/**
	 * The size of the file in bytes. This is populated only for files with content stored in Drive.
	 * 
	 * @return
	 */
	public native final int fileSize() /*-{
		return this["fileSize"];
	}-*/;

	/**
	 * The size of the file in bytes. This is populated only for files with content stored in Drive.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File fileSize(int val) /*-{
		this["fileSize"] = val;
		return this;
	}-*/;

	/**
	 * A link for opening the file in using a relevant Google editor or viewer.
	 * 
	 * @return
	 */
	public native final String alternateLink() /*-{
		return this["alternateLink"];
	}-*/;

	/**
	 * A link for opening the file in using a relevant Google editor or viewer.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File alternateLink(String val) /*-{
		this["alternateLink"] = val;
		return this;
	}-*/;

	/**
	 * A link for embedding the file.
	 * 
	 * @return
	 */
	public native final String embedLink() /*-{
		return this["embedLink"];
	}-*/;

	/**
	 * A link for embedding the file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File embedLink(String val) /*-{
		this["embedLink"] = val;
		return this;
	}-*/;

	/**
	 * Time at which this file was shared with the user (formatted RFC 3339 timestamp).
	 * 
	 * @return
	 */
	public native final String sharedWithMeDate() /*-{
		return this["sharedWithMeDate"];
	}-*/;

	/**
	 * Time at which this file was shared with the user (formatted RFC 3339 timestamp).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File sharedWithMeDate(String val) /*-{
		this["sharedWithMeDate"] = val;
		return this;
	}-*/;

	/**
	 * Collection of parent folders which contain this file.
	 * 
	 * Setting this field will put the file in all of the provided folders. On insert, if no folders are provided, the file will be placed in the default root folder.
	 * 
	 * @return
	 */
	public native final JsArray<Parent> parents() /*-{
		return this["parents"];
	}-*/;

	/**
	 * Collection of parent folders which contain this file.
	 * 
	 * Setting this field will put the file in all of the provided folders. On insert, if no folders are provided, the file will be placed in the default root folder.
	 * 
	 * @return
	 */
	public native final Collection<Parent> parentsCol() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["parents"]);
	}-*/;

	/**
	 * Collection of parent folders which contain this file.
	 * 
	 * Setting this field will put the file in all of the provided folders. On insert, if no folders are provided, the file will be placed in the default root folder.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File parents(JsArray<Parent> val) /*-{
		this["parents"] = val;
		return this;
	}-*/;

	/**
	 * Links for exporting Google Docs to specific formats. A mapping from export format to URL
	 * 
	 * @return
	 */
	public native final JsObject exportLinks() /*-{
		return this["exportLinks"];
	}-*/;

	/**
	 * Links for exporting Google Docs to specific formats. A mapping from export format to URL
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File exportLinks(JsObject val) /*-{
		this["exportLinks"] = val;
		return this;
	}-*/;

	/**
	 * The original filename if the file was uploaded manually, or the original title if the file was inserted through the API. Note that renames of the title will not change the
	 * original filename. This will only be populated on files with content stored in Drive.
	 * 
	 * @return
	 */
	public native final String originalFilename() /*-{
		return this["originalFilename"];
	}-*/;

	/**
	 * The original filename if the file was uploaded manually, or the original title if the file was inserted through the API. Note that renames of the title will not change the
	 * original filename. This will only be populated on files with content stored in Drive.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File originalFilename(String val) /*-{
		this["originalFilename"] = val;
		return this;
	}-*/;

	/**
	 * The number of quota bytes used by this file.
	 * 
	 * @return
	 */
	public native final int quotaBytesUsed() /*-{
		return this["quotaBytesUsed"];
	}-*/;

	/**
	 * The number of quota bytes used by this file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File quotaBytesUsed(int val) /*-{
		this["quotaBytesUsed"] = val;
		return this;
	}-*/;

	/**
	 * Name(s) of the owner(s) of this file.
	 * 
	 * @return
	 */
	public native final JsArrayString ownerNames() /*-{
		return this["ownerNames"];
	}-*/;

	/**
	 * Name(s) of the owner(s) of this file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File ownerNames(JsArrayString val) /*-{
		this["ownerNames"] = val;
		return this;
	}-*/;

	/**
	 * Name of the last user to modify this file. This will only be populated if a user has edited this file.
	 * 
	 * @return
	 */
	public native final String lastModifyingUserName() /*-{
		return this["lastModifyingUserName"];
	}-*/;

	/**
	 * Name of the last user to modify this file. This will only be populated if a user has edited this file.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File lastModifyingUserName(String val) /*-{
		this["lastModifyingUserName"] = val;
		return this;
	}-*/;

	/**
	 * Whether the file can be edited by the current user.
	 * 
	 * @return
	 */
	public native final boolean editable() /*-{
		return this["editable"];
	}-*/;

	/**
	 * Whether the file can be edited by the current user.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File editable(boolean val) /*-{
		this["editable"] = val;
		return this;
	}-*/;

	/**
	 * Whether writers can share the document with other users.
	 * 
	 * @return
	 */
	public native final boolean writersCanShare() /*-{
		return this["writersCanShare"];
	}-*/;

	/**
	 * Whether writers can share the document with other users.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File writersCanShare(boolean val) /*-{
		this["writersCanShare"] = val;
		return this;
	}-*/;

	/**
	 * A link to the file's thumbnail.
	 * 
	 * @return
	 */
	public native final String thumbnailLink() /*-{
		return this["thumbnailLink"];
	}-*/;

	/**
	 * A link to the file's thumbnail.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File thumbnailLink(String val) /*-{
		this["thumbnailLink"] = val;
		return this;
	}-*/;

	/**
	 * Last time this file was viewed by the user (formatted RFC 3339 timestamp). writable
	 * 
	 * @return
	 */
	public native final String lastViewedByMeDate() /*-{
		return this["lastViewedByMeDate"];
	}-*/;

	/**
	 * Last time this file was viewed by the user (formatted RFC 3339 timestamp). writable
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File lastViewedByMeDate(String val) /*-{
		this["lastViewedByMeDate"] = val;
		return this;
	}-*/;

	/**
	 * A link for downloading the content of the file in a browser using cookie based authentication. In cases where the content is shared publicly, the content can be downloaded
	 * without any credentials.
	 * 
	 * @return
	 */
	public native final String webContentLink() /*-{
		return this["webContentLink"];
	}-*/;

	/**
	 * A link for downloading the content of the file in a browser using cookie based authentication. In cases where the content is shared publicly, the content can be downloaded
	 * without any credentials.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File webContentLink(String val) /*-{
		this["webContentLink"] = val;
		return this;
	}-*/;

	/**
	 * Whether this file has been explicitly trashed, as opposed to recursively trashed. This will only be populated if the file is trashed.
	 * 
	 * @return
	 */
	public native final boolean explicitlyTrashed() /*-{
		return this["explicitlyTrashed"];
	}-*/;

	/**
	 * Whether this file has been explicitly trashed, as opposed to recursively trashed. This will only be populated if the file is trashed.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File explicitlyTrashed(boolean val) /*-{
		this["explicitlyTrashed"] = val;
		return this;
	}-*/;

	/**
	 * A link providing access to static web assets (HTML, CSS, JS, etc) in a public folder hierarchy using filenames in a relative path.
	 * 
	 * @return
	 */
	public native final String webViewLink() /*-{
		return this["webViewLink"];
	}-*/;

	/**
	 * A link providing access to static web assets (HTML, CSS, JS, etc) in a public folder hierarchy using filenames in a relative path.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File webViewLink(String val) /*-{
		this["webViewLink"] = val;
		return this;
	}-*/;

	/**
	 * A link to the file's icon.
	 * 
	 * @return
	 */
	public native final String iconLink() /*-{
		return this["iconLink"];
	}-*/;

	/**
	 * A link to the file's icon.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File iconLink(String val) /*-{
		this["iconLink"] = val;
		return this;
	}-*/;

	/**
	 * Metadata about image media. This will only be present for image types, and its contents will depend on what can be parsed from the image content.
	 * 
	 * @return
	 */
	public native final ImageMediaMetadata imageMediaMetadata() /*-{
		return this["imageMediaMetadata"];
	}-*/;

	/**
	 * Metadata about image media. This will only be present for image types, and its contents will depend on what can be parsed from the image content.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final File imageMediaMetadata(ImageMediaMetadata val) /*-{
		this["imageMediaMetadata"] = val;
		return this;
	}-*/;
}
