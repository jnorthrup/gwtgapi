package org.sgx.gapigui.client.ui;

import org.sgx.gapigui.client.ui.res.MNResources;
import org.sgx.gwteditors.client.util.GUIUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainLayout extends Composite implements MainLayoutView {
	private static MainLayout instance;

	public static MainLayout getInstance() {
		if (instance == null)
			instance = new MainLayout();
		return instance;
	}

	private static MainLayoutUiBinder uiBinder = GWT.create(MainLayoutUiBinder.class);

	interface MainLayoutUiBinder extends UiBinder<Widget, MainLayout> {
	}

	@UiField
	Menu menu;
	@UiField
	Body body;
	private DialogBox currentDialogBox;

	// @UiField GapiAuth authPanel;

	@Override
	public BodyView body() {
		return body;
	}

	// public MainLayout() {
	// initWidget(uiBinder.createAndBindUi(this));
	// DOMUtil.addClickHandler(tablesListButton, new ClickHandler() {
	//
	// @Override
	// public void onClick(Event event) {
	// // TODO Auto-generated method stub
	//
	// }
	// }, true);
	// }

	private MainLayout() {
		initWidget(uiBinder.createAndBindUi(this));

		MNResources res = GWT.create(MNResources.class);
		res.style().ensureInjected();

		// initAuthDialogBox();
	}

	public GapiAuthView createNewAuthPanel() {
		 if(currentDialogBox!=null) {
//		 currentDialogBox.removeFromParent();
			 hideAuthPanel(); 
		 }
		GapiAuthView p = new GapiAuth();

		VerticalPanel vp = new VerticalPanel();
		vp.add(p);
		// subed.load(submodel);
		//
		FlowPanel fp = new FlowPanel();
		fp.add(new Button("Accept", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				hideAuthPanel(); 
//				if (currentDialogBox != null) {
//					currentDialogBox.hide();
//					currentDialogBox.removeFromParent();
//				}
			}
		}));
		fp.add(new Button("Cancel", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				hideAuthPanel(); 
//				if (currentDialogBox != null) {
//					currentDialogBox.hide();
//					currentDialogBox.removeFromParent();
//				}
			}
		}));
		// vp.add(fp);
		currentDialogBox = GUIUtil.showWidgetDialog("Please Authenticate with Google", vp);

		return p;

	}

	@Override
	public void hideAuthPanel() {
		if (currentDialogBox != null) {
			currentDialogBox.hide();
			currentDialogBox.removeFromParent();
		}
	}

	// private void initAuthDialogBox() {
	// VerticalPanel vp = new VerticalPanel();
	// vp.add(subed.getWidget());
	// subed.load(submodel);
	//
	// FlowPanel fp = new FlowPanel();
	// fp.add(new Button("Accept", new ClickHandler() {
	// @Override
	// public void onClick(ClickEvent event) {
	// if (currentDialogBox != null)
	// currentDialogBox.hide();
	// }
	// }));
	// fp.add(new Button("Cancel", new ClickHandler() {
	// @Override
	// public void onClick(ClickEvent event) {
	// if (currentDialogBox != null)
	// currentDialogBox.hide();
	// }
	// }));
	// vp.add(fp);
	// currentDialogBox = GUIUtil.showWidgetDialog(name2, vp);
	// }

}
