package org.sgx.gapigui.client.ui;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public interface BodyView extends IsWidget {
//void showTablesView();
//void showTableQueriesView(); 
	void showView(Widget v); 
	Panel getMainPanel();
}
