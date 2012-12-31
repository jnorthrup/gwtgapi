package org.sgx.gapi.client.apis.calendar;

import org.sgx.gapi.client.apis.GAPIResult;

/**
 * @see https://developers.google.com/google-apps/calendar/v3/reference/calendars/insert
 * @see https://developers.google.com/google-apps/calendar/v3/reference/calendars#resource
 * @author sg
 * 
 */
public class Calendar extends GAPIResult {
	protected Calendar() {
	}

	/**
	 * Identifier of the calendar.
	 * 
	 * @return
	 */
	public native final String id() /*-{
		return this["id"];
	}-*/;

	/**
	 * Identifier of the calendar.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Calendar id(String val) /*-{
		this["id"] = val;
		return this;
	}-*/;

	/**
	 * Title of the calendar.
	 * 
	 * @return
	 */
	public native final String summary() /*-{
		return this["summary"];
	}-*/;

	/**
	 * Title of the calendar.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Calendar summary(String val) /*-{
		this["summary"] = val;
		return this;
	}-*/;

	/**
	 * Description of the calendar. Optional.
	 * 
	 * @return
	 */
	public native final String description() /*-{
		return this["description"];
	}-*/;

	/**
	 * Description of the calendar. Optional.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Calendar description(String val) /*-{
		this["description"] = val;
		return this;
	}-*/;

	/**
	 * Geographic location of the calendar as free-form text. Optional.
	 * 
	 * @return
	 */
	public native final String location() /*-{
		return this["location"];
	}-*/;

	/**
	 * Geographic location of the calendar as free-form text. Optional.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Calendar location(String val) /*-{
		this["location"] = val;
		return this;
	}-*/;

	/**
	 * The time zone of the calendar. Optional.
	 * 
	 * @return
	 */
	public native final String timeZone() /*-{
		return this["timeZone"];
	}-*/;

	/**
	 * The time zone of the calendar. Optional.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final Calendar timeZone(String val) /*-{
		this["timeZone"] = val;
		return this;
	}-*/;
}
