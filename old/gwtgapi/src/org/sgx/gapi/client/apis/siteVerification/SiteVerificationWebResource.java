package org.sgx.gapi.client.apis.siteVerification;

import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsArrayString;

/**
 * <p>A SiteVerificationWebResource is a representation of a verified website or domain.</p>
 * 
 * It contains the canonical ID of a site or domain, the URL or domain name, and a list of owners. Note that the owners list always includes the authenticated user, because the
 * only people who can access a SiteVerificationWebResource are authenticated users who are owners of that site or domain.
 * 
 * @see https://developers.google.com/site-verification/v1/webResource
 * @author sg
 * 
 */
public class SiteVerificationWebResource extends GAPIResult {
	protected SiteVerificationWebResource() {
	}

	/**
	 * The string used to identify this site. This value should be used in the id portion of the REST URL for the get, update, and delete operations.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this["id"];
	}-*/;

	/**
	 * The string used to identify this site. This value should be used in the id portion of the REST URL for the get, update, and delete operations.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SiteVerificationWebResource id(String val) /*-{
		this["id"] = val;
		return this;
	}-*/;

	/**
	 * Container for the address and type of a site that is verified or will be verified.
	 * 
	 * @return
	 */
	public native final Site site() /*-{
		return this["site"];
	}-*/;

	/**
	 * Container for the address and type of a site that is verified or will be verified.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SiteVerificationWebResource site(Site val) /*-{
		this["site"] = val;
		return this;
	}-*/;

	/**
	 * The email addresses of all verified owners.
	 * 
	 * @return
	 */
	public native final JsArrayString owners() /*-{
		return this["owners"];
	}-*/;

	/**
	 * The email addresses of all verified owners.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final SiteVerificationWebResource owners(JsArrayString val) /*-{
		this["owners"] = val;
		return this;
	}-*/;

	/**
	 * Container for the address and type of a site that is verified or will be verified.
	 * 
	 * @author sg
	 * 
	 */
	public static class Site extends JsObject {
		protected Site() {
		}

		/**
		 * The site type. Can be SITE or INET_DOMAIN (domain name).
		 * 
		 * @return
		 */
		public native final String type() /*-{
			return this["type"];
		}-*/;

		/**
		 * The site type. Can be SITE or INET_DOMAIN (domain name).
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final SiteVerificationWebResource.Site type(String val) /*-{
			this["type"] = val;
			return this;
		}-*/;

		/**
		 * The site identifier, which takes different forms depending on the value of the type property. If the type is set to SITE, then the identifier is a URL. If the type is
		 * set to INET_DOMAIN, then the identifier is a domain name.
		 * 
		 * @return
		 */
		public native final String identifier() /*-{
			return this["identifier"];
		}-*/;

		/**
		 * The site identifier, which takes different forms depending on the value of the type property. If the type is set to SITE, then the identifier is a URL. If the type is
		 * set to INET_DOMAIN, then the identifier is a domain name.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final SiteVerificationWebResource.Site identifier(String val) /*-{
			this["identifier"] = val;
			return this;
		}-*/;
	}

}
