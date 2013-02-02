package org.sgx.gapi.client.apis.drive.file;

import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/drive/v2/reference/files#resource
 * 
 * @author sg
 * 
 */
public class ImageMediaMetadata extends JsObject {
	protected ImageMediaMetadata() {
	}

	/**
	 * The width of the image in pixels.
	 * 
	 * @return
	 */
	public native final int width() /*-{
		return this["width"];
	}-*/;

	/**
	 * The width of the image in pixels.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata width(int val) /*-{
		this["width"] = val;
		return this;
	}-*/;

	/**
	 * The height of the image in pixels
	 * 
	 * @return
	 */
	public native final int height() /*-{
		return this["height"];
	}-*/;

	/**
	 * The height of the image in pixels
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata height(int val) /*-{
		this["height"] = val;
		return this;
	}-*/;

	/**
	 * The rotation in clockwise degrees from the image's original orientation.
	 * 
	 * @return
	 */
	public native final int rotation() /*-{
		return this["rotation"];
	}-*/;

	/**
	 * The rotation in clockwise degrees from the image's original orientation.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata rotation(int val) /*-{
		this["rotation"] = val;
		return this;
	}-*/;

	/**
	 * Geographic location information stored in the image.
	 * 
	 * @return
	 */
	public native final ImageMediaMetadataLocation location() /*-{
		return this["location"];
	}-*/;

	/**
	 * Geographic location information stored in the image.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata location(ImageMediaMetadataLocation val) /*-{
		this["location"] = val;
		return this;
	}-*/;

	/**
	 * The date and time the photo was taken (EXIF format timestamp).
	 * 
	 * @return
	 */
	public native final String date() /*-{
		return this["date"];
	}-*/;

	/**
	 * The date and time the photo was taken (EXIF format timestamp).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataThumbnail date(String val) /*-{
		this["date"] = val;
		return this;
	}-*/;

	/**
	 * The make of the camera used to create the photo.
	 * 
	 * @return
	 */
	public native final String cameraMake() /*-{
		return this["cameraMake"];
	}-*/;

	/**
	 * The make of the camera used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataThumbnail cameraMake(String val) /*-{
		this["cameraMake"] = val;
		return this;
	}-*/;

	/**
	 * The model of the camera used to create the photo.
	 * 
	 * @return
	 */
	public native final String cameraModel() /*-{
		return this["cameraModel"];
	}-*/;

	/**
	 * The model of the camera used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataThumbnail cameraModel(String val) /*-{
		this["cameraModel"] = val;
		return this;
	}-*/;

	/**
	 * The length of the exposure, in seconds.
	 * 
	 * @return
	 */
	public native final double exposureTime() /*-{
		return this["exposureTime"];
	}-*/;

	/**
	 * The length of the exposure, in seconds.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataThumbnail exposureTime(double val) /*-{
		this["exposureTime"] = val;
		return this;
	}-*/;

	/**
	 * The aperture used to create the photo (f-number).
	 * 
	 * @return
	 */
	public native final double aperture() /*-{
		return this["aperture"];
	}-*/;

	/**
	 * The aperture used to create the photo (f-number).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataThumbnail aperture(double val) /*-{
		this["aperture"] = val;
		return this;
	}-*/;

	/**
	 * Whether a flash was used to create the photo.
	 * 
	 * @return
	 */
	public native final boolean flashUsed() /*-{
		return this["flashUsed"];
	}-*/;

	/**
	 * Whether a flash was used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataThumbnail flashUsed(boolean val) /*-{
		this["flashUsed"] = val;
		return this;
	}-*/;

	/**
	 * The focal length used to create the photo, in millimeters.
	 * 
	 * @return
	 */
	public native final double focalLength() /*-{
		return this["focalLength"];
	}-*/;

	/**
	 * The focal length used to create the photo, in millimeters.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataThumbnail focalLength(double val) /*-{
		this["focalLength"] = val;
		return this;
	}-*/;

	/**
	 * The ISO speed used to create the photo.
	 * 
	 * @return
	 */
	public native final int isoSpeed() /*-{
		return this["isoSpeed"];
	}-*/;

	/**
	 * The ISO speed used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadataThumbnail isoSpeed(int val) /*-{
		this["isoSpeed"] = val;
		return this;
	}-*/;

	/**
	 * The metering mode used to create the photo.
	 * 
	 * @return
	 */
	public native final String meteringMode() /*-{
		return this["meteringMode"];
	}-*/;

	/**
	 * The metering mode used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata meteringMode(String val) /*-{
		this["meteringMode"] = val;
		return this;
	}-*/;

	/**
	 * The type of sensor used to create the photo.
	 * 
	 * @return
	 */
	public native final String sensor() /*-{
		return this["sensor"];
	}-*/;

	/**
	 * The type of sensor used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata sensor(String val) /*-{
		this["sensor"] = val;
		return this;
	}-*/;

	/**
	 * The exposure mode used to create the photo.
	 * 
	 * @return
	 */
	public native final String exposureMode() /*-{
		return this["exposureMode"];
	}-*/;

	/**
	 * The exposure mode used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata exposureMode(String val) /*-{
		this["exposureMode"] = val;
		return this;
	}-*/;

	/**
	 * The color space of the photo.
	 * 
	 * @return
	 */
	public native final String colorSpace() /*-{
		return this["colorSpace"];
	}-*/;

	/**
	 * The color space of the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata colorSpace(String val) /*-{
		this["colorSpace"] = val;
		return this;
	}-*/;

	/**
	 * The white balance mode used to create the photo.
	 * 
	 * @return
	 */
	public native final String whiteBalance() /*-{
		return this["whiteBalance"];
	}-*/;

	/**
	 * The white balance mode used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata whiteBalance(String val) /*-{
		this["whiteBalance"] = val;
		return this;
	}-*/;

	/**
	 * The exposure bias of the photo (APEX value).
	 * 
	 * @return
	 */
	public native final double exposureBias() /*-{
		return this["exposureBias"];
	}-*/;

	/**
	 * The exposure bias of the photo (APEX value).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata exposureBias(double val) /*-{
		this["exposureBias"] = val;
		return this;
	}-*/;

	/**
	 * The smallest f-number of the lens at the focal length used to create the photo (APEX value).
	 * 
	 * @return
	 */
	public native final double maxApertureValue() /*-{
		return this["maxApertureValue"];
	}-*/;

	/**
	 * The smallest f-number of the lens at the focal length used to create the photo (APEX value).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata maxApertureValue(double val) /*-{
		this["maxApertureValue"] = val;
		return this;
	}-*/;

	/**
	 * The distance to the subject of the photo, in meters.
	 * 
	 * @return
	 */
	public native final int subjectDistance() /*-{
		return this["subjectDistance"];
	}-*/;

	/**
	 * The distance to the subject of the photo, in meters.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata subjectDistance(int val) /*-{
		this["subjectDistance"] = val;
		return this;
	}-*/;

	/**
	 * The lens used to create the photo.
	 * 
	 * @return
	 */
	public native final String lens() /*-{
		return this["lens"];
	}-*/;

	/**
	 * The lens used to create the photo.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ImageMediaMetadata lens(String val) /*-{
		this["lens"] = val;
		return this;
	}-*/;
}
