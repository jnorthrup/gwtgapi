package org.sgx.gapitest.client.app;

import java.util.Map;

import org.sgx.gapitest.client.TestHome;
import org.sgx.gapitest.client.app.ui.Console;
import org.sgx.gapitest.client.app.ui.MainLayout;

import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Gallery {
	private static Gallery instance;

	private Gallery() {
	}

	public static Gallery getInstance() {
		if (instance == null)
			instance = new Gallery();
		return instance;
	}
MainLayout mainLayout;
private Element testTargetEl;

public Gallery initGallery(MainLayout mainLayout) {
//	super();
	this.mainLayout = mainLayout;
	init(); 
	return this; 
}



private void init() {
	Map<String, Test> tests = TestHome.getInstance().getTest();
	testTargetEl = mainLayout.getTestContainer(); 
//	Element testLunchersContainer = mainLayout.getLeftPanel(); 
	VerticalPanel launcherPanel = mainLayout.getExampleLauncherContainer(); 
	for(String testName: tests.keySet()) {
		Anchor a = new Anchor();
		launcherPanel.add(a); 
		final Test test = tests.get(testName); 
		a.setText(testName); 
//		System.out.println(testName);
		a.addClickHandler(new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				test.test(testTargetEl); 
				event.preventDefault(); 
				setCurrentTest(test); 
			}
		}); 
	}	
}
public static native final void prettyPrint()/*-{
$wnd.prettyPrint();
}-*/;
public MainLayout getMainLayout() {
	return mainLayout;
}

public void setMainLayout(MainLayout mainLayout) {
	this.mainLayout = mainLayout;
} 

public Console getConsole() {
	return mainLayout.getConsole(); 
}

public void log(String s) {
	getConsole().append(s); 
}
Test currentTest; 
public Test getCurrentTest() {
	return currentTest;
}
public void setCurrentTest(Test currentTest) {
	this.currentTest = currentTest;
}
}
