package org.sgx.gapitest.client;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.auth.AuthCallback;
import org.sgx.gapi.client.auth.AuthRequest;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.client.ClientLoadCallback;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;
import org.sgx.jsutil.client.SimpleCallback;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
/**
 * an full contained example analog to 
 * http://code.google.com/p/google-api-javascript-client/source/browse/samples/authSample.html
 * 
 * @author sg
 *
 */
public class GAPITest1 implements EntryPoint {

	private String clientId;
	private String apiKey;
	private String scope;
	private GAPI gapi;
	private Button authButton;
	private AuthCallback handleAuthResult;

	@Override
	public void onModuleLoad() {
		
		//load the google api client js first of all		
		GAPI.load(new GAPILoadCallback() {
			
			@Override
			public void loaded() {
				
				//when it is loaded run some test.				
				main(); 
				
			}
		}); 

//		System.out.println("test end"); 
	}

	protected void main() {
		
		//authorization and a call
		
handleAuthResult = new AuthCallback() {
	@Override
	public void call(AuthResponse r) {
		System.out.println(JsUtil.dumpObj( r));
		if(r!=null ||
				r.error()!=null) {
			System.out.println("making api call");
			authButton.removeFromParent(); //.setEnabled(false);//.getStyle().setProperty("visibility", "hidden");
			makeApiCall();
		}
		else {
			System.out.println("not making api call");
			authButton.setEnabled(true); 
			authButton.addClickHandler(new ClickHandler() {						
				@Override
				public void onClick(ClickEvent e) {
					e.preventDefault(); 
					handleAuthClick(); 
				}						
			}); 
		} 
	}
}; 
	    clientId = "1081991926563-e64k9pb3cnmqqpegegaj85kim22vk0np.apps.googleusercontent.com";

	    apiKey = "AIzaSyAeX11OLg0zyBDlpYr2lqs4POPEjyWrooY"; 
	      
	    scope =  "https://www.googleapis.com/auth/plus.me";	      
	     
		authButton = new Button("authenticate"); //.get().createAnchorElement();
		RootPanel.get().add(authButton); 
		authButton.setEnabled(false); 
		
		gapi = GAPI.get();
		
		gapi.client().setApiKey(apiKey); 
		
		JsUtil.setTimeout(new SimpleCallback() {			
			@Override
			public void call() {
				checkAuth(); 
			}
		}, 1); 
		
	
		
//		System.out.println("gapi loaded");
	}
	
	void checkAuth() {
		gapi.auth().authorize(AuthRequest.create()
				.client_id(clientId)
				.scope(scope)
				.immediate(true), handleAuthResult); 
	}

	protected void handleAuthClick() {
		gapi.auth().authorize(AuthRequest.create()
				.client_id(clientId)
				.scope(scope)
				.immediate(false), handleAuthResult); 
	}
	
	protected void makeApiCall() {
		System.out.println("makeApiCall");
		gapi.client().load("plus", "v1", new ClientLoadCallback() {
			
			@Override
			public void loaded() {
				System.out.println("loaded");
				HttpRequest req = gapi.client().request(ClientRequest.create()
//					.path("/plus/v1/activities")
					.path("/plus/v1/people/get")
					.params(JsObject.one("userId", "me"))
				); 
				System.out.println("reqcreated");
				req.execute(new ClientRequestCallback() {
					
					@Override
					public void call(JsObject jsonResp, String rawResp) {
						System.out.println("executed");
						System.out.println(JsUtil.dumpObj(jsonResp));
						System.out.println(rawResp);
					}
				}); 
			}
		}); 
	}

}
