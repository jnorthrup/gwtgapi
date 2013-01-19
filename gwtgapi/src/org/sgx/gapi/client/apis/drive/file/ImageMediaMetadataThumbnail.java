package org.sgx.gapi.client.apis.drive.file;

import org.sgx.jsutil.client.JsObject;
/**
 * 
 * @author sg
 *
 */
public class ImageMediaMetadataThumbnail extends JsObject {
protected ImageMediaMetadataThumbnail(){}
/**
 *  	The URL-safe Base64 encoded bytes of the thumbnail image.
 * @return
 */
public native final String image() /*-{
return this["image"]; 
}-*/;

/**
 *  	The URL-safe Base64 encoded bytes of the thumbnail image.
 * @param val
 * @return this - for setter chaining
 */
public native final ImageMediaMetadataThumbnail image(String val) /*-{
this["image"] = val; 
return this; 
}-*/;
/**
 *  	The MIME type of the thumbnail.
 * @return
 */
public native final String mimeType() /*-{
return this["mimeType"]; 
}-*/;

/**
 *  	The MIME type of the thumbnail.
 * @param val
 * @return this - for setter chaining
 */
public native final ImageMediaMetadataThumbnail mimeType(String val) /*-{
this["mimeType"] = val; 
return this; 
}-*/;


}
