package org.sgx.gapigui.client.ui.actions.ft;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Queries extends Composite {

	private static QueriesUiBinder uiBinder = GWT.create(QueriesUiBinder.class);

	interface QueriesUiBinder extends UiBinder<Widget, Queries> {
	}

	public Queries() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
