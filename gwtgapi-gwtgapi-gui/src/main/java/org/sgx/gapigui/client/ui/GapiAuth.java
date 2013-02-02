package org.sgx.gapigui.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class GapiAuth extends Composite implements GapiAuthView {

	private static GapiAuthUiBinder uiBinder = GWT.create(GapiAuthUiBinder.class);

	interface GapiAuthUiBinder extends UiBinder<Widget, GapiAuth> {
	}

	@UiField Button authButton;
	String scope; 
	
	public GapiAuth() {
		initWidget(uiBinder.createAndBindUi(this));
		authButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		}); 
	}

//	public String getScope() {
//		return scope;
//	}
//
//	public void setScope(String scope) {
//		this.scope = scope;
//	}

	/* (non-Javadoc)
	 * @see org.sgx.gapigui.client.ui.GapiAuthView#getAuthButton()
	 */
	@Override
	public Button getAuthButton() {
		return authButton;
	}
}
