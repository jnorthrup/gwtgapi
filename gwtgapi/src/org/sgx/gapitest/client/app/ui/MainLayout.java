package org.sgx.gapitest.client.app.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainLayout extends Composite {

	private static MainLayoutUiBinder uiBinder = GWT.create(MainLayoutUiBinder.class);

	interface MainLayoutUiBinder extends UiBinder<Widget, MainLayout> {
	}

	public MainLayout() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	@UiField VerticalPanel exampleLauncherContainer; 
	@UiField Console console; 
	@UiField
	Element header, testContainer, leftPanel;

	
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
