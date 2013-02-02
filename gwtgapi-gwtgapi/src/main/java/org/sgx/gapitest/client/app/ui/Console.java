package org.sgx.gapitest.client.app.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.TextAreaElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Console extends Composite {

	private static ConsoleUiBinder uiBinder = GWT.create(ConsoleUiBinder.class);

	interface ConsoleUiBinder extends UiBinder<Widget, Console> {
	}

	@UiField TextAreaElement ta; 
	public Console() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public TextAreaElement getTa() {
		return ta;
	}
	public void append(String line) {
		ta.setValue(ta.getValue()+"\n"+line); 
	}
}
