package org.sgx.gapigui.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Introduction extends Composite {

	private static IntroductionUiBinder uiBinder = GWT.create(IntroductionUiBinder.class);

	interface IntroductionUiBinder extends UiBinder<Widget, Introduction> {
	}

	public Introduction() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
