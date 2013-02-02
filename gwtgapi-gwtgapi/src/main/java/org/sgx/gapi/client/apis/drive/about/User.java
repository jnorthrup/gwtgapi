package org.sgx.gapi.client.apis.drive.about;

import org.sgx.gapi.client.apis.GAPIBase;
import org.sgx.jsutil.client.JsObject;

public class User extends GAPIBase {
	protected User() {
	}

	/**
	 * The user's profile picture.
	 * 
	 * @author sg
	 * 
	 */
	public static class Picture extends JsObject {
		protected Picture() {
		}

		/**
		 * The user's profile picture.
		 * 
		 * @return
		 */
		public native final String url() /*-{
			return this["url"];
		}-*/;

		/**
		 * The user's profile picture.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final User.Picture url(String val) /*-{
			this["url"] = val;
			return this;
		}-*/;
	}

	/**
	 * A plain text displayable name for this user.
	 * 
	 * @return
	 */
	public native final String displayName() /*-{
		return this["displayName"];
	}-*/;

	/**
	 * A plain text displayable name for this user.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final User displayName(String val) /*-{
		this["displayName"] = val;
		return this;
	}-*/;

	/**
	 * The user's profile picture.
	 * 
	 * @return
	 */
	public native final Picture picture() /*-{
		return this["picture"];
	}-*/;

	/**
	 * The user's profile picture.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final User picture(Picture val) /*-{
		this["picture"] = val;
		return this;
	}-*/;

	/**
	 * Whether this user is the same as the authenticated user of which the request was made on behalf.
	 * 
	 * @return
	 */
	public native final boolean isAuthenticatedUser() /*-{
		return this["isAuthenticatedUser"];
	}-*/;

	/**
	 * Whether this user is the same as the authenticated user of which the request was made on behalf.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final User isAuthenticatedUser(boolean val) /*-{
		this["isAuthenticatedUser"] = val;
		return this;
	}-*/;

	/**
	 * The number of quota bytes used by all Google apps (Drive, Picasa, etc.).
	 * 
	 * @return
	 */
	public native final int quotaBytesUsedAggregate() /*-{
		return this["quotaBytesUsedAggregate"];
	}-*/;

	/**
	 * The number of quota bytes used by all Google apps (Drive, Picasa, etc.).
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final User quotaBytesUsedAggregate(int val) /*-{
		this["quotaBytesUsedAggregate"] = val;
		return this;
	}-*/;
}
