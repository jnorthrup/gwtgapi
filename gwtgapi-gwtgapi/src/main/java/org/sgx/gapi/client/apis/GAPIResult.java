package org.sgx.gapi.client.apis;

public class GAPIResult extends GAPIBase {
	protected GAPIResult() {
	}

	/**
	 * 
	 * @return
	 */
	public native final GAPIError error() /*-{
		return this["error"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final GAPIResult error(GAPIError val) /*-{
		this["error"] = val;
		return this;
	}-*/;

}
