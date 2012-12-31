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
public class CalendarListRequest implements GAPIRequest<CalendarList> {
	/**
	 * Maximum number of entries returned on one result page. Optional.
	 */
	int maxResults = -1;
	/**
	 * The minimum access role for the user in the returned entires. Optional. The default is no restriction.
	 * 
	 * <br>
	 * <br>
	 * Acceptable values are:
	 * <ul>
	 * <li>"<code>freeBusyReader</code>" - The user can read free/busy information.</li>
	 * <li>"<code>owner</code>" - The user can read and modify events and access control lists.</li>
	 * <li>"<code>reader</code>" - The user can read events that are not private.</li>
	 * <li>"<code>writer</code>" - The user can read and modify events.</li>
	 * </ul>
	 */
	String minAccessRole;
	/**
	 * Token specifying which result page to return. Optional.
	 */
	String pageToken;
	/**
	 * Whether to show hidden entries. Optional. The default is False.
	 */
	boolean showHidden;

	public CalendarListRequest() {
		super();
	}

	@Override
	public void execute(final GAPICallback<CalendarList> c) {
		JsObject params = JsObject.createObject().cast();
		GAPIUtil.paramPut(params, "maxResults", maxResults, -1);
		GAPIUtil.paramPut(params, "minAccessRole", minAccessRole);
		GAPIUtil.paramPut(params, "pageToken", pageToken);
		GAPIUtil.paramPut(params, "showHidden", showHidden);

		ClientRequest clientReq = ClientRequest.create().path("/calendar/v3/calendarList").params(params);

		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
//				System.out.println(JsUtil.dumpObj(jsonResp)+" - \n"+rawResp);
				c.call((CalendarList) jsonResp);
			}
		});
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

	public String getMinAccessRole() {
		return minAccessRole;
	}

	public void setMinAccessRole(String minAccessRole) {
		this.minAccessRole = minAccessRole;
	}

	public String getPageToken() {
		return pageToken;
	}

	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}

	public boolean isShowHidden() {
		return showHidden;
	}

	public void setShowHidden(boolean showHidden) {
		this.showHidden = showHidden;
	}
	
	
}
