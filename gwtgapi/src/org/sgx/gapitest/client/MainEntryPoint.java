package org.sgx.gapitest.client;

import org.sgx.gapitest.client.app.Gallery;
import org.sgx.gapitest.client.app.ui.MainLayout;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class MainEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MainLayout mainLayout = new MainLayout();		 
		RootPanel.get().add(mainLayout); 
		Gallery gallery = Gallery.getInstance().initGallery(mainLayout); //new Gallery(mainLayout);
	}

}
