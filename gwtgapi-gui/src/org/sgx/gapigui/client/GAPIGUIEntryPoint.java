package org.sgx.gapigui.client;

import org.sgx.gapigui.client.ui.MainLayoutView;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class GAPIGUIEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Main.layout(); 
		
		MainLayoutView mainLayout = Main.layout();; // MainLayout.getInstance(); //new MainLayout(); 
		RootPanel.get().add(mainLayout.asWidget()); 
//		Window.alert("hello123"); 
	}

}
