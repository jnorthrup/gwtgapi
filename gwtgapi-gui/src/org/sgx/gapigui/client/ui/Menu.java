package org.sgx.gapigui.client.ui;

import org.sgx.gapigui.client.Main;
import org.sgx.gapigui.client.state.AppStateManager;
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
	Element tablesListButton, tablesQueryButton, introLink;

	public Menu() {
		initWidget(uiBinder.createAndBindUi(this));
		
		DOMUtil.addClickHandler(introLink, new EventHandler() {
			@Override
			public void onEvent(Event event) {
				Main.state().navigate(AppStateManager.STATE_INTRODUCTION);
			}
		}, true);		
		DOMUtil.addClickHandler(tablesListButton, new EventHandler() {
			@Override
			public void onEvent(Event event) {
				Main.state().navigate(AppStateManager.STATE_FT_TABLES);
			}
		}, true);
		DOMUtil.addClickHandler(tablesQueryButton, new EventHandler() {
			@Override
			public void onEvent(Event event) {
				Main.state().navigate(AppStateManager.STATE_FT_QUERIES);
			}
		}, true);
	}

}
