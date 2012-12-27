package org.sgx.gapi.client.apis.drive.file;

import org.sgx.gapi.client.apis.GAPIResult;
/**
 * @see https://developers.google.com/drive/v2/reference/files#resource
 * @author sg
 *
 */
public class FileResource extends GAPIResult{
protected FileResource(){}
/**
 * The ID of the file.
 * @return
 */
public native final String id() /*-{
return this["id"]; 
}-*/;

/**
 * The ID of the file.
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource id(String val) /*-{
this["id"] = val; 
return this; 
}-*/;
/**
 *  	ETag of the file.
 * @return
 */
public native final String etag() /*-{
return this["etag"]; 
}-*/;

/**
 *  	ETag of the file.
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource etag(String val) /*-{
this["etag"] = val; 
return this; 
}-*/;

/**
 * A link back to this file.
 * @return
 */
public native final String selfLink() /*-{
return this["selfLink"]; 
}-*/;

/**
 * A link back to this file.
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource selfLink(String val) /*-{
this["selfLink"] = val; 
return this; 
}-*/;

/**
 * The title of the this file. Used to identify file or folder name.
 * @return
 */
public native final String title() /*-{
return this["title"]; 
}-*/;

/**
 * The title of the this file. Used to identify file or folder name.
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource title(String val) /*-{
this["title"] = val; 
return this; 
}-*/;

/**
 * The mimetype of the file
 * @return
 */
public native final String mimeType() /*-{
return this["mimeType"]; 
}-*/;

/**
 * The mimetype of the file
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource mimeType(String val) /*-{
this["mimeType"] = val; 
return this; 
}-*/;

/**
 * A short description of the file
 * @return
 */
public native final String description() /*-{
return this["description"]; 
}-*/;

/**
 * A short description of the file
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource description(String val) /*-{
this["description"] = val; 
return this; 
}-*/;

/**
 * A group of labels for the file.
 * @return
 */
public native final Label labels() /*-{
return this["labels"]; 
}-*/;

/**
 * A group of labels for the file.
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource labels(Label val) /*-{
this["labels"] = val; 
return this; 
}-*/;

/**
 * Create time for this file (formatted ISO8601 timestamp).Example value: 2012-12-27T18:28:48.127Z
 * @return
 */
public native final String createdDate() /*-{
return this["createdDate"]+""; 
}-*/;

/**
 * Create time for this file (formatted ISO8601 timestamp).Example value: 2012-12-27T18:28:48.127Z
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource createdDate(String val) /*-{
this["createdDate"] = val; 
return this; 
}-*/;

/**
 * Last time this file was modified by anyone (formatted RFC 3339 timestamp). This is only mutable on update when the setModifiedDate parameter
 * @return
 */
public native final String modifiedDate() /*-{
return this["modifiedDate"]; 
}-*/;

/**
 * Last time this file was modified by anyone (formatted RFC 3339 timestamp). This is only mutable on update when the setModifiedDate parameter
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource modifiedDate(String val) /*-{
this["modifiedDate"] = val; 
return this; 
}-*/;

/**
 * Last time this file was modified by the user (formatted RFC 3339 timestamp). Note that setting modifiedDate will also update the modifiedByMe date for the user which set the date.
 * @return
 */
public native final String modifiedByMeDate() /*-{
return this["modifiedByMeDate"]; 
}-*/;

/**
 * Last time this file was modified by the user (formatted RFC 3339 timestamp). Note that setting modifiedDate will also update the modifiedByMe date for the user which set the date.
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource modifiedByMeDate(String val) /*-{
this["modifiedByMeDate"] = val; 
return this; 
}-*/;

/**
 * Short lived download URL for the file. This is only populated for files with content stored in Drive.
 * @return
 */
public native final String downloadUrl() /*-{
return this["downloadUrl"]; 
}-*/;

/**
 * Short lived download URL for the file. This is only populated for files with content stored in Drive.
 * @param val
 * @return this - for setter chaining
 */
public native final FileResource downloadUrl(String val) /*-{
this["downloadUrl"] = val; 
return this; 
}-*/;
}
