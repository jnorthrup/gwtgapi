package org.sgx.gapi.client.apis.books;

import org.sgx.gapi.client.apis.GAPIBase;

/**
 * Information about a volume's download license access restrictions.
 * 
 * @author sg
 * 
 */
public class VolumeAccessInfoDownloadAccess extends GAPIBase {
	protected VolumeAccessInfoDownloadAccess() {
	}

	/**
	 * Identifies the volume for which this entry applies.
	 * 
	 * @return
	 */
	public native final String volumeId() /*-{
		return this["volumeId"];
	}-*/;

	/**
	 * Identifies the volume for which this entry applies.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess volumeId(String val) /*-{
		this["volumeId"] = val;
		return this;
	}-*/;

	/**
	 * Whether this volume has any download access restrictions
	 * 
	 * @return
	 */
	public native final boolean restricted() /*-{
		return this["restricted"];
	}-*/;

	/**
	 * Whether this volume has any download access restrictions
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess restricted(boolean val) /*-{
		this["restricted"] = val;
		return this;
	}-*/;

	/**
	 * If restricted, whether access is granted for this (user, device, volume).
	 * 
	 * @return
	 */
	public native final boolean deviceAllowed() /*-{
		return this["deviceAllowed"];
	}-*/;

	/**
	 * If restricted, whether access is granted for this (user, device, volume).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess deviceAllowed(boolean val) /*-{
		this["deviceAllowed"] = val;
		return this;
	}-*/;

	/**
	 * If deviceAllowed, whether access was just acquired with this request.
	 * 
	 * @return
	 */
	public native final boolean justAcquired() /*-{
		return this["justAcquired"];
	}-*/;

	/**
	 * If deviceAllowed, whether access was just acquired with this request.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess justAcquired(boolean val) /*-{
		this["justAcquired"] = val;
		return this;
	}-*/;

	/**
	 * If restricted, the maximum number of content download licenses for this volume.
	 * 
	 * @return
	 */
	public native final int maxDownloadDevices() /*-{
		return this["maxDownloadDevices"];
	}-*/;

	/**
	 * If restricted, the maximum number of content download licenses for this volume.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess maxDownloadDevices(int val) /*-{
		this["maxDownloadDevices"] = val;
		return this;
	}-*/;

	/**
	 * If restricted, the number of content download licenses already acquired (including the requesting client, if licensed).
	 * 
	 * @return
	 */
	public native final int downloadsAcquired() /*-{
		return this["downloadsAcquired"];
	}-*/;

	/**
	 * If restricted, the number of content download licenses already acquired (including the requesting client, if licensed).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess downloadsAcquired(int val) /*-{
		this["downloadsAcquired"] = val;
		return this;
	}-*/;

	/**
	 * Client nonce for verification. Download access and client-validation only.
	 * 
	 * @return
	 */
	public native final String nonce() /*-{
		return this["nonce"];
	}-*/;

	/**
	 * Client nonce for verification. Download access and client-validation only.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess nonce(String val) /*-{
		this["nonce"] = val;
		return this;
	}-*/;

	/**
	 * Client app identifier for verification. Download access and client-validation only.
	 * 
	 * @return
	 */
	public native final String source() /*-{
		return this["source"];
	}-*/;

	/**
	 * Client app identifier for verification. Download access and client-validation only.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess source(String val) /*-{
		this["source"] = val;
		return this;
	}-*/;

	/**
	 * Error/warning reason code. Additional codes may be added in the future. 0 OK 100 ACCESS_DENIED_PUBLISHER_LIMIT 101 ACCESS_DENIED_LIMIT 200 WARNING_USED_LAST_ACCESS
	 * 
	 * @return
	 */
	public native final String reasonCode() /*-{
		return this["reasonCode"];
	}-*/;

	/**
	 * Error/warning reason code. Additional codes may be added in the future. 0 OK 100 ACCESS_DENIED_PUBLISHER_LIMIT 101 ACCESS_DENIED_LIMIT 200 WARNING_USED_LAST_ACCESS
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess reasonCode(String val) /*-{
		this["reasonCode"] = val;
		return this;
	}-*/;

	/**
	 * Error/warning message.
	 * 
	 * @return
	 */
	public native final String message() /*-{
		return this["message"];
	}-*/;

	/**
	 * Error/warning message.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess message(String val) /*-{
		this["message"] = val;
		return this;
	}-*/;

	/**
	 * Response signature.
	 * 
	 * @return
	 */
	public native final String signature() /*-{
		return this["signature"];
	}-*/;

	/**
	 * Response signature.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final VolumeAccessInfoDownloadAccess signature(String val) /*-{
		this["signature"] = val;
		return this;
	}-*/;
}
