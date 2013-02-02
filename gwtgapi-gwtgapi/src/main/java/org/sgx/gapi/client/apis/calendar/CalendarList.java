package org.sgx.gapi.client.apis.calendar;

import org.sgx.gapi.client.apis.GAPIResult;

import com.google.gwt.core.client.JsArray;

/**
 * entries on the user's calendar list
 * 
 * @see https://developers.google.com/google-apps/calendar/v3/reference/calendarList/list
 * @author sg
 * 
 */
public class CalendarList extends GAPIResult {
	protected CalendarList() {
	}

	/**
	 * Token used to access the next page of this result.
	 * 
	 * @return
	 */
	public native final String nextPageToken() /*-{
		return this["nextPageToken"];
	}-*/;

	/**
	 * Token used to access the next page of this result.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CalendarList nextPageToken(String val) /*-{
		this["nextPageToken"] = val;
		return this;
	}-*/;

	/**
	 * Calendars that are present on the user's calendar list.
	 * 
	 * @return
	 */
	public native final JsArray<Calendar> items() /*-{
		return this["items"];
	}-*/;

	/**
	 * Calendars that are present on the user's calendar list.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final CalendarList items(JsArray<Calendar> val) /*-{
		this["items"] = val;
		return this;
	}-*/;
}
