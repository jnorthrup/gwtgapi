package org.sgx.gapi.client.apis.calendar;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.gapi.client.util.GAPIUtil;
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;

/**
 * @see https://developers.google.com/google-apps/calendar/v3/reference/calendars/insert
 * @author sg
 * 
 */
public class CalendarClearRequest implements GAPIRequest<Calendar> {

	String summary;
	String timeZone;
	String location;

	public CalendarClearRequest(String summary) {
		super();
		this.summary = summary;
	}

	@Override
	public void execute(final GAPICallback<Calendar> c) {
		JsObject params = JsObject.createObject().cast();
		GAPIUtil.paramPut(params, "summary", summary);
		GAPIUtil.paramPut(params, "timeZone", timeZone);
		GAPIUtil.paramPut(params, "location", location);

		ClientRequest clientReq = ClientRequest.create().path("/calendar/v3/calendars")
				.params(params);
		
//		String s = GAPIUtil.toJSON(params); 
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((Calendar) jsonResp);
			}
		});
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
