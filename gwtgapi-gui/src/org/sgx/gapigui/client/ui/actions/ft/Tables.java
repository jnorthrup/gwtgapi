package org.sgx.gapigui.client.ui.actions.ft;

import java.util.LinkedList;
import java.util.List;

import org.sgx.gapi.client.apis.fusiontables.FTColumn;
import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gapigui.client.Main;
import org.sgx.gapigui.client.control.ControllerCallback;
import org.sgx.gapigui.client.ui.editableModels.ft.Table;
import org.sgx.gapigui.client.ui.editableModels.ft.TableCreateCommand;
import org.sgx.gapigui.client.ui.editableModels.ft.TableCreateCommandColumn;
import org.sgx.gapigui.client.ui.test.CellTableExample;
import org.sgx.gwteditors.client.editor.Editor;
import org.sgx.gwteditors.client.editor.event.EditorValueChangeEvent;
import org.sgx.gwteditors.client.editor.event.ValueChangeListener;
import org.sgx.gwteditors.client.impl1.EditorFramework1;
import org.sgx.gwteditors.client.impl1.complex.Array1DEditor3;
import org.sgx.gwteditors.client.impl1.complex.Array1DEditor3.ItemCreator;
import org.sgx.gwteditors.client.impl1.complex.Array1DEditor3.Namer;
import org.sgx.gwteditors.client.impl1.complex.PropertyHaverEditor2;
import org.sgx.gwteditors.client.impl1.complex.PropertyHaverTableEditor1;
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
	VerticalPanel box, listAllTablesPanel;

	protected DialogBox currentDialogBox;

	public Tables() {
		initWidget(uiBinder.createAndBindUi(this));

		new EditorFramework1().start();

		createButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				doCreate();
			}
		});
		listButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				doList();
			}
		});
	}

	protected void doList() {
		Main.controller().doTableList(new ControllerCallback<List<Table>>() {
			
			@Override
			public void call(List<Table> result) {
				
				PropertyHaverTableEditor1.Namer namer = new PropertyHaverTableEditor1.Namer<Table>() {
					@Override
					public String toString(Table t) {
						return t.getName(); 
					}
				};
				Main.controller().doTableList(new ControllerCallback<List<Table>>() {					
					@Override
					public void call(List<Table> result) {
						Window.alert(result.size()+""); 
					}
				}); 
//				ItemCreator<Table> itemCreator = new ItemCreator<Table>() {
//
//					@Override
//					public Table createNewItem() {
//						return Table.newTable();
//					}
//				};
				
//				PropertyHaverTableEditor1<Table> ed = new PropertyHaverTableEditor1<Table>(EditorFramework1.TYPE_PROPERTYHAVER, namer, null);
//				ed.load(result); 
//				listAllTablesPanel.add(ed);
			}
		}); 
		
//		Main.controller().doTableList()

//		new EditorFramework1().start(); // do not forget of initialize the gwteditors framework !

		TableCreateCommand sb = GWT.create(TableCreateCommand.class);

		sb.getProperties().reorder(new String[] { "name", "description", "isExportable", "columns" });

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

	protected void doCreate() {
		TableCreateCommand tcc = newSampleTableCreateCommand();// TableCreateCommand.createOne();//GWT.create(TableCreateCommand.class);

		// System.out.println("Tables: " + tcc.getProperties() + " - " + tcc.getProperty("columns"));
		// System.out.println();

		// reorder properties
		tcc.getProperties().reorder(new String[] { "name", "description", "isExportable", "columns" });

		final PropertyHaverEditor2<TableCreateCommand> ed = new PropertyHaverEditor2<TableCreateCommand>();

		// System.out.println("sssseba: "+columnsEditor);

		ed.load(tcc);

		Editor columnsEditor = ed.getEditorForProperty("columns");
		if (columnsEditor instanceof Array1DEditor3) {

			 ((Array1DEditor3<TableCreateCommandColumn>)columnsEditor).setItemCreator(new Array1DEditor3.ItemCreator<TableCreateCommandColumn>(){

				@Override
				public TableCreateCommandColumn createNewItem() {
					return TableCreateCommandColumn.newSampleColumn(); 
				}}); 
		}

		VerticalPanel vp = new VerticalPanel();
		vp.add(ed);
		FlowPanel fp = new FlowPanel();
		fp.add(new Button("Accept", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				TableCreateCommand tcc = ed.flush();
				if (currentDialogBox != null)
					currentDialogBox.hide();
				Main.controller().doTableCreate(tcc);
			}
		}));
		fp.add(new Button("Cancel", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				if (currentDialogBox != null)
					currentDialogBox.hide();
			}
		}));
		vp.add(fp);
		currentDialogBox = GUIUtil.showWidgetDialog("", vp);

		// String name = Window.prompt("Table name: ", UUID.uuid());
		// FTTable table = FTTable.create().name(name);

		// new CellTableExample().onModuleLoad();
	}

	protected TableCreateCommand newSampleTableCreateCommand() {
		TableCreateCommand c = GWT.create(TableCreateCommand.class);
		c.setName(UUID.uuid());
		c.setDescription("sample description");
		c.setIsExportable(false);

		// initialize the columns with a sample list of two
		List<TableCreateCommandColumn> _columns = new LinkedList<TableCreateCommandColumn>();
		TableCreateCommandColumn col1 = TableCreateCommandColumn.newSampleColumn();// new TableCreateCommandColumn();
		col1.setName("name");
		_columns.add(col1);

		TableCreateCommandColumn col2 = TableCreateCommandColumn.newSampleColumn();// new TableCreateCommandColumn();
		col2.setName("age");
		col2.getType().setSelection(FTColumn.TYPE_NUMBER);
		_columns.add(col2);

		c.setColumns(_columns);
		return c;

	}

}
