package org.sgx.gapigui.client.ui;

import org.sgx.gapigui.client.ui.actions.ft.Tables;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Body extends Composite implements BodyView {

	private static BodyUiBinder uiBinder = GWT.create(BodyUiBinder.class);

	interface BodyUiBinder extends UiBinder<Widget, Body> {
	}
	private Tables tables=null;

	public Body() {
		initWidget(uiBinder.createAndBindUi(this));
	}

//	@UiField DivElement box; 
	@UiField VerticalPanel box; 
	
	@Override
	public void showTablesView() {
		VerticalPanel vp ; 
		if(tables==null) {
			tables = new Tables();
			box.add(tables); 
		}
		tables.setVisible(true); 
//		Window.alert("showtablesview"); 
	}
	@Override
	public void showTableQueriesView() {
		
//		Window.alert("showTableQueriesView");
	}
}
