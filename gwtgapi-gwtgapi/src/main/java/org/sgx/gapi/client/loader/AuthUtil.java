package org.sgx.gapi.client.loader;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.auth.AuthCallback;
import org.sgx.gapi.client.auth.AuthRequest;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.jsutil.client.JsUtil;
import org.sgx.jsutil.client.SimpleCallback;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
/**
 * utility for easing oauth authentication. authorize() authenticate() requires a 
 * AuthUITrigger Element actionable by the user. In particular we support GWT Buttons. 
 * @author sg
 *
 */
public class AuthUtil {

	private AuthCallback handleAuthResult;

	public void authenticate(final String clientId, final Button authButton, final String scope, final AuthCallback callback) {
		// an observable object we need to pass to Auth
		AuthUITrigger trigger = new AuthUITrigger() {
			@Override
			public void setEnabled(boolean enabled) {
				authButton.setEnabled(enabled);
			}

			@Override
			public void addTriggerHandler(final Runnable r) {
				authButton.addClickHandler(new ClickHandler() {
					@Override
					public void onClick(ClickEvent event) {
						r.run();
					}
				});
			}
		};
		authenticate(clientId, trigger, scope, callback);
	}

	public void authenticate(AuthDefinition a, final AuthCallback ready) {
		authenticate(a.getClientId(), a.getAuthUITrigger(), a.getScope(), ready); 
	}
	
	public void authenticate(final String clientId, final AuthUITrigger trigger, final String scope,
			final AuthCallback ready) {

		handleAuthResult = new AuthCallback() {
			@Override
			public void authenticated(AuthResponse r) {
//				System.out.println("seba333");
				// System.out.println("HHH: " + JsUtil.dumpObj(r ) + " - " + JsUtil.dumpObj(r.error()));
				if (r != null && r.error() == null) {
//					System.out.println(" auth making api call");
					trigger.setEnabled(false); // .removeFromParent(); // .setEnabled(false);//.getStyle().setProperty("visibility", "hidden");
					ready.authenticated(r); 
//					ready.run();
				} else {
//					System.out.println(" auth not making api call");
					trigger.setEnabled(true);
					trigger.addTriggerHandler(new Runnable() {
						@Override
						public void run() {
							// handleAuthClick();
							GAPI.get()
									.auth()
									.authorize(AuthRequest.create().client_id(clientId).scope(scope).immediate(false),
											handleAuthResult);

						}
					});
				}
			}
		};

		trigger.setEnabled(false);

		JsUtil.setTimeout(new SimpleCallback() {
			@Override
			public void call() {
//				System.out.println("seba222");
				GAPI.get()
						.auth()
						.authorize(AuthRequest.create().client_id(clientId).scope(scope).immediate(true),
								handleAuthResult);
			}
		}, 1);

	}
}
