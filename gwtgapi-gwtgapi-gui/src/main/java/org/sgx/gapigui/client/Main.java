package org.sgx.gapigui.client;

import org.sgx.gapigui.client.control.MainController;
import org.sgx.gapigui.client.control.MainController1;
import org.sgx.gapigui.client.state.AppStateManager;
import org.sgx.gapigui.client.state.AppStateManagerImpl1;
import org.sgx.gapigui.client.ui.MainLayout;
import org.sgx.gapigui.client.ui.MainLayoutView;

/**
 * main entry point of this app
 * 
 * @author sg
 * 
 */
public class Main {
	private static MainLayoutView layout = null;
	private static MainController controller = null;
	private static AppStateManager state;

	public static MainLayoutView layout() {
		if (layout == null)
			layout = MainLayout.getInstance();
		return layout;
	}

	public static MainController controller() {
		if (controller == null)
			controller = MainController1.getInstance();
		return controller;
	}
	
	public static AppStateManager state() {
		if (state == null) {
			state = new AppStateManagerImpl1();
		}
		return state;
	}
	
	
}
