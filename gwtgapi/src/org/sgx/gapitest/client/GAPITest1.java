package org.sgx.gapitest.client;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.auth.AuthCallback;
import org.sgx.gapi.client.auth.AuthRequest;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapi.client.util.GAPIUtil;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Window;
/**
 * an full contained example analog to 
 * http://code.google.com/p/google-api-javascript-client/source/browse/samples/authSample.html
 * 
 * @author sg
 *
 */
public class GAPITest1 implements EntryPoint {

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

		System.out.println("test end"); 
	}

	protected void main() {
		
		//authorization and a call
		

	    final String clientId = "1081991926563-e64k9pb3cnmqqpegegaj85kim22vk0np.apps.googleusercontent.com";

	    final String apiKey = "AIzaSyAeX11OLg0zyBDlpYr2lqs4POPEjyWrooY"; 
	      
	    final String[] scopes =  {"https://www.googleapis.com/auth/plus.me"};	      
	      
		AnchorElement authButton = Document.get().createAnchorElement();
		
		GAPI gapi = GAPI.get();
		String clientId1="";
		
		AuthRequest req1 = AuthRequest.create().client_id(clientId1); 
		gapi.auth().authorize(req1, new AuthCallback() {
			
			@Override
			public void call(AuthResponse r) {
				// TODO Auto-generated method stub
				
			}
		}); 
		
		System.out.println("gapi loaded");
	}

}
