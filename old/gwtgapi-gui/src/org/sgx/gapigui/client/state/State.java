package org.sgx.gapigui.client.state;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.*;

public class State {
	String name;
	Widget stateView;
//	Panel mainPanel;

//	public void show() {
//		mainPanel.clear();
//		mainPanel.add(stateView);
//		History.newItem(HISTORY_PREFIX + name);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Widget getStateView() {
		return stateView;
	}

	public void setStateView(Widget stateView) {
		this.stateView = stateView;
	}

//	public Panel getMainPanel() {
//		return mainPanel;
//	}
//
//	public void setMainPanel(Panel mainPanel) {
//		this.mainPanel = mainPanel;
//	}
	
	
}