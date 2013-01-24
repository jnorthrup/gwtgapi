package org.sgx.gapigui.client.ui.actions.ft;

import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gapigui.client.Main;
import org.sgx.gapigui.client.ui.editableModels.CellTableExample;
import org.sgx.gapigui.client.ui.editableModels.TableCreateCommand;
import org.sgx.gwteditors.client.editor.Editor;
import org.sgx.gwteditors.client.editor.event.EditorValueChangeEvent;
import org.sgx.gwteditors.client.editor.event.ValueChangeListener;
import org.sgx.gwteditors.client.impl1.EditorFramework1;
import org.sgx.gwteditors.client.impl1.complex.PropertyHaverEditor2;
import org.sgx.gwteditors.client.util.GUIUtil;
import org.sgx.gwteditors.testgallery.gallery.model.ShapeBean;
import org.sgx.jsutil.client.UUID;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Tables extends Composite {

	private static TableListUiBinder uiBinder = GWT.create(TableListUiBinder.class);

	interface TableListUiBinder extends UiBinder<Widget, Tables> {
	}

	@UiField
	Button createButton, listButton;

	@UiField
	VerticalPanel box;

	protected DialogBox currentDialogBox;

	public Tables() {
		initWidget(uiBinder.createAndBindUi(this));

		new EditorFramework1().start();
		
		createButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				TableCreateCommand sb = GWT.create(TableCreateCommand.class);

				//reorder properties
				sb.getProperties().reorder(new String[] { "name", "description", "isExportable" });

				final PropertyHaverEditor2<TableCreateCommand> ed = new PropertyHaverEditor2<TableCreateCommand>();
				ed.load(sb); 
				
				VerticalPanel vp = new VerticalPanel();
				vp.add(ed);
				FlowPanel fp = new FlowPanel();
				fp.add(new Button("Accept", new ClickHandler() {								
					@Override
					public void onClick(ClickEvent event) {
						TableCreateCommand tcc = ed.flush(); 
						if(currentDialogBox!=null)
							currentDialogBox.hide();
						FTTable table = FTTable.create().name(tcc.getName()).description("tcc.getDescription()").isExportable(tcc.getIsExportable());
						Main.controller().doTableCreate(table);						
					}
				}));
				fp.add(new Button("Cancel", new ClickHandler() {								
					@Override
					public void onClick(ClickEvent event) {
						if(currentDialogBox!=null)
							currentDialogBox.hide();
					}
				}));
				vp.add(fp);
				currentDialogBox = GUIUtil.showWidgetDialog("", vp);
				
				
				
				
//				String name = Window.prompt("Table name: ", UUID.uuid());
//				FTTable table = FTTable.create().name(name);

//				new CellTableExample().onModuleLoad();
			}
		});
		listButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				new EditorFramework1().start(); // do not forget of initialize the gwteditors framework !

				TableCreateCommand sb = GWT.create(TableCreateCommand.class);

				sb.getProperties().reorder(new String[] { "name", "description", "isExportable" });

				// VerticalPanel vp = new VerticalPanel();
				// vp.setWidth("100%");
				// parent.add(vp); //make sure the editor parent (vp) is attached to the dom before using the editor

				PropertyHaverEditor2<TableCreateCommand> ed = new PropertyHaverEditor2<TableCreateCommand>();
				box.add(ed.getWidget());

				ed.load(sb);

				ed.addValueChangeListener(new ValueChangeListener<TableCreateCommand>() {
					@Override
					public void notifyValueChange(EditorValueChangeEvent<TableCreateCommand> evt) {
						Window.alert("property value change detected: " + evt.getSrc().flush());
					}
				});

			}
		});
	}

}
