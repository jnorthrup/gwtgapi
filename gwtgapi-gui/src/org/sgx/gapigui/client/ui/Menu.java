package org.sgx.gapigui.client.ui;

import org.sgx.gapigui.client.Main;
import org.sgx.jsutil.client.DOMUtil;
import org.sgx.jsutil.client.DOMUtil.EventHandler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Menu extends Composite {

	private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);

	interface MenuUiBinder extends UiBinder<Widget, Menu> {
	}

	@UiField
	Element tablesListButton, tablesQueryButton;

	public Menu() {
		initWidget(uiBinder.createAndBindUi(this));
		DOMUtil.addClickHandler(tablesListButton, new EventHandler() {

			@Override
			public void onEvent(Event event) {
				Main.layout().body().showTablesView(); 
//				Main.controller().showTablesView(); 
			}
		}, true);
		DOMUtil.addClickHandler(tablesQueryButton, new EventHandler() {

			@Override
			public void onEvent(Event event) {
				Main.layout().body().showTableQueriesView(); 
//				Main.controller().showTablesView(); 
			}
		}, true);
	}

}
