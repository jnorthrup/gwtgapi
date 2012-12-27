package org.sgx.gapitest.client.app.ui;

import org.sgx.gapitest.client.UIUtils;
import org.sgx.gapitest.client.app.Gallery;
import org.sgx.gapitest.client.app.Test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainLayout extends Composite {

	private static MainLayoutUiBinder uiBinder = GWT.create(MainLayoutUiBinder.class);

	interface MainLayoutUiBinder extends UiBinder<Widget, MainLayout> {
	}

	public MainLayout() {
		initWidget(uiBinder.createAndBindUi(this));
		seeSourcesButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Test test = Gallery.getInstance().getCurrentTest(); 
				
				String resStr = "",resName=""; 				
				for(String n : test.getResources().keySet()) {
					TextResource r = test.getResources().get(n); 
					resStr=r.getText(); 
					resName=n;
					break;
				}
				UIUtils.showText(resName, resStr);	
			}
		}); 
	}


	@UiField VerticalPanel exampleLauncherContainer; 
	@UiField Console console; 
	@UiField
	Element header, testContainer, leftPanel;
	
	@UiField Button seeSourcesButton; 

	
	public Element getHeader() {
		return header;
	}

	public Element getTestContainer() {
		return testContainer;
	}

	public Element getLeftPanel() {
		return leftPanel;
	}

	public VerticalPanel getExampleLauncherContainer() {
		return exampleLauncherContainer;
	}
	public Console getConsole() {
		return console;
	}
	
}
