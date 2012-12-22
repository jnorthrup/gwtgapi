package org.sgx.gapi.client.auth;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @see http://code.google.com/p/google-api-javascript-client/wiki/ReferenceDocs
 * @author sg
 * 
 */
public class GAPIAuth extends JavaScriptObject {
	protected GAPIAuth() {
	}

	public static final native GAPIAuth get()/*-{

		return $wnd.gapi.auth;
	}-*/;

	/**
	 * gapi.auth.authorize(params, callback)
	 * <p>
	 * Initiates the OAuth 2.0 authorization process. The user will receive a popup window asking them to authenticate and authorize (users need to have popup blockers disabled).
	 * Once they complete the authorization process, the popup will close and the callback function will fire.
	 * </p>
	 * <p>
	 * <i>Arguments</i>:
	 * </p>
	 * <ul>
	 * <li><tt>params</tt> - type: object. A key/value map of parameters for the request. If the key is not one of the expected OAuth 2.0 parameters (see below), it is added to the
	 * URI as a query parameter. Valid keys for OAuth 2.0 parameters include:</li>
	 * <ul>
	 * <li><tt>client_id</tt> - type: string. The application's client ID. Visit the <a href="https://code.google.com/apis/console/" rel="nofollow">Google API Console</a> to get an
	 * OAuth 2.0 client ID.</li>
	 * <li><tt>immediate</tt> - type: boolean. If <tt>true</tt>, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to
	 * the user.</li>
	 * <li><tt>response_type</tt> - type: string. The OAuth 2.0 response type property. Default: token.</li>
	 * <li><tt>scope</tt> - type: array. The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.</li>
	 * </ul>
	 * <li><tt>callback</tt> - type: function. The function to call once the login process is complete. The function takes an <a
	 * href="/p/google-api-javascript-client/wiki/ReferenceDocs#OAuth_2.0_Token_Object">OAuth 2.0 token object</a> as its only parameter.</li>
	 */
	public final native void authorize(AuthRequest req, AuthCallback c)/*-{
		var fn = $entry(function(r) {
			return c.@org.sgx.gapi.client.auth.AuthCallback::call(Lorg/sgx/gapi/client/auth/AuthResponse;)(r);
		});
		this.authorize(req, fn);
	}-*/;

	/**
	 * Initializes the authorization feature. Call this when the client loads to prevent popup blockers from blocking the auth window on gapi.auth.authorize() calls. Note: Calling
	 * gapi.auth.authorize({immediate: true}) when the client loads achieves the same effect. If your application does an immediate-mode check, gapi.auth.init should be omitted
	 * entirely.
	 * 
	 * @param c
	 *            A callback to execute when the auth feature is ready to make authorization calls.
	 */
	public final native void init(AuthCallback c)/*-{
		var fn = $entry(function(r) {
			return c.@org.sgx.gapi.client.auth.AuthCallback::call(Lorg/sgx/gapi/client/auth/AuthResponse;)(r);
		});
		this.init(fn);
	}-*/;

	/**
	 * Retrieves the OAuth 2.0 token for the application.
	 * 
	 * @return The OAuth 2.0 token. See auth token below.
	 */
	public final native String getToken()/*-{
		return this.getToken();
	}-*/;

	/**
	 * Sets the OAuth 2.0 token for the application.
	 * 
	 * @param t
	 *            The token to set. See auth token below.
	 */
	public final native void setToken(String t)/*-{
		this.setToken(t);
	}-*/;
}
