package org.sgx.gapigui.client;

import org.sgx.gapigui.client.state.AppStateManager;
import org.sgx.gapigui.client.ui.MainLayoutView;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class GAPIGUIEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Main.layout(); 
		
		MainLayoutView mainLayout = Main.layout();; // MainLayout.getInstance(); //new MainLayout(); 
		RootPanel.get().add(mainLayout.asWidget()); 
		
		//check for state in initial url 
		String url = JsUtil.getCurrentAddressUrl();
		String stateName = Main.state().urlContainsState(url);
		if(stateName==null)
			stateName = AppStateManager.STATE_DEFAULT; 
		Main.state().navigate(stateName); 
	}

}
