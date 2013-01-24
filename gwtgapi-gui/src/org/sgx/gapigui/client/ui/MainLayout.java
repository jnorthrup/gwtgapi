package org.sgx.gapigui.client.ui;

import org.sgx.gapigui.client.ui.res.MNResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MainLayout extends Composite implements MainLayoutView {
	private static MainLayout instance;

	private MainLayout() {
		initWidget(uiBinder.createAndBindUi(this));
		
		MNResources res = GWT.create(MNResources.class);  
		res.style().ensureInjected(); 
	}

	public static MainLayout getInstance() {
		if (instance == null)
			instance = new MainLayout();
		return instance;
	}

	private static MainLayoutUiBinder uiBinder = GWT.create(MainLayoutUiBinder.class);

	
	interface MainLayoutUiBinder extends UiBinder<Widget, MainLayout> {
	}

	
	@UiField Menu menu; 
	@UiField Body body;

	@Override
	public BodyView body() {
		return body;
	} 
	
//	public MainLayout() {
//		initWidget(uiBinder.createAndBindUi(this));
//		DOMUtil.addClickHandler(tablesListButton, new ClickHandler() {
//			
//			@Override
//			public void onClick(Event event) {
//				// TODO Auto-generated method stub
//				
//			}
//		}, true); 
//	}

}
