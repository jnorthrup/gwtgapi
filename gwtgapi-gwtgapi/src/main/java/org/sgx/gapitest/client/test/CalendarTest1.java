package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.calendar.CalendarInsertRequest;
import org.sgx.gapi.client.apis.calendar.CalendarList;
import org.sgx.gapi.client.apis.calendar.CalendarListRequest;
import org.sgx.gapi.client.apis.calendar.CalendarModule;
import org.sgx.gapi.client.apis.calendar.Calendar;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.loader.AuthDefinition;
import org.sgx.gapi.client.loader.AuthUITrigger;
import org.sgx.gapi.client.loader.GAPILoader;
import org.sgx.gapi.client.loader.GAPILoaderCallback;
import org.sgx.gapi.client.loader.ModuleDefinition;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapi.client.util.GAPIUtil;
import org.sgx.gapitest.client.AbstractTest;
import org.sgx.gapitest.client.GAPITestConstants;
import org.sgx.gapitest.client.GAPITestTextResource;
import org.sgx.gapitest.client.app.Gallery;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * this tests calendar API, in particular calendar insert. It required authentication. 
 * 
 * @author sg
 * 
 */
public class CalendarTest1 extends AbstractTest implements EntryPoint {

	private String clientId;
	private String apiKey;
	private String scope;
	private Button authButton;

	@Override
	public void test(Element parent) {
		GAPI.load(new GAPILoadCallback() {
			@Override
			public void loaded() {
				main();
			}
		});
	}

	protected void main() {

		clientId = GAPITestConstants.CLIENT_ID;

		apiKey = GAPITestConstants.API_KEY;

		scope = "https://www.googleapis.com/auth/calendar";

		authButton = new Button("authenticate");
		RootPanel.get().add(authButton);
		AuthUITrigger authUITrigger = GAPIUtil.buildAuthUITriggerFrom(authButton);

		GAPI.get().client().setApiKey(apiKey);

		ModuleDefinition moduleDef = new CalendarModule();
		AuthDefinition authDefinition = new AuthDefinition(clientId, scope, authUITrigger);
		GAPILoader loader = new GAPILoader(authDefinition, moduleDef);
		loader.load(new GAPILoaderCallback() {
			@Override
			public void loaded(AuthResponse authResp) {
				insertCalendarTest1();
			}
		});

	}

	protected void insertCalendarTest1() {
		new CalendarInsertRequest("calendar2").execute(new GAPICallback<Calendar>() {
			
			@Override
			public void call(Calendar resp) {
				if(resp.error()!=null) 
					Gallery.getInstance().log("ERROR: "+JsUtil.dumpObj(resp.error(), true));
				else 
					Gallery.getInstance().log("new calendar created : "+resp.summary()+" - id: "+resp.id());
				
				//now after inserting some calendar, call Calendarlist. 
				listCalendarTest1(); 
			}
		}); 
	}

	protected void listCalendarTest1() {
		new CalendarListRequest().execute(new GAPICallback<CalendarList>() {
			
			@Override
			public void call(CalendarList resp) {
				if(resp.error()!=null) 
					Gallery.getInstance().log("ERROR: "+JsUtil.dumpObj(resp.error(), true));
				else 
					Gallery.getInstance().log("calendar list size : "+resp.items().length());
				
			}
		}); 
	}

	// test stuff
	@Override
	public String getId() {
		return "calendar1";
	}

	@Override
	public String getDescription() {
		return "this tests calendar API, in particular calendar insert. It required authentication. ";
	}

	@Override
	public Map<String, GAPITestTextResource> getResources() {
		HashMap<String, GAPITestTextResource> m = new HashMap<String, GAPITestTextResource>();
		m.put("CalendarTest1.java", new GAPITestTextResource(TestResources.INSTANCE.CalendarTest1()));
		return m;
	}

	@Override
	public String[] getTags() {
		return null;
	}

	@Override
	public void onModuleLoad() {
		test(RootPanel.getBodyElement());
	}

}
