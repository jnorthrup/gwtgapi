package org.sgx.gapi.client.apis.drive.file;

import java.util.Map;

import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;
/**
 * Note: other labels than listed here can appear too. You can use the 
 * {@link JsObject} and {@link JsUtil} API to extract them: 
 * 
 * 
 * @author sg
 *
 */
public class Label extends JsObject {
	protected Label() {
	}
	
	public native final Map<String, Boolean> toMap()/*-{
		return @org.sgx.jsutil.client.JsUtil::toMapBoolean(Lorg/sgx/jsutil/client/JsObject;)(this); 
	}-*/;


	/**
	 * 
	 * @return
	 */
	public native final boolean starred() /*-{
		return this["starred"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Label starred(boolean val) /*-{
		this["starred"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final boolean trashed() /*-{
		return this["trashed"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Label trashed(boolean val) /*-{
		this["trashed"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final boolean hidden() /*-{
		return this["hidden"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Label hidden(boolean val) /*-{
		this["hidden"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final boolean restricted() /*-{
		return this["restricted"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Label restricted(boolean val) /*-{
		this["restricted"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final boolean viewed() /*-{
		return this["viewed"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Label viewed(boolean val) /*-{
		this["viewed"] = val;
		return this;
	}-*/;
}
