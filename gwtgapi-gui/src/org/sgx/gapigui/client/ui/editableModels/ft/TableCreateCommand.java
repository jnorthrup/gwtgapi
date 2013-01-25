package org.sgx.gapigui.client.ui.editableModels.ft;

import java.util.LinkedList;
import java.util.List;

import org.sgx.gapi.client.apis.fusiontables.FTColumn;
import org.sgx.gwteditors.client.impl1.basetypes.SelectionList;
import org.sgx.gwteditors.client.impl1.edbean.EditableBean;
import org.sgx.jsutil.client.UUID;

import com.google.gwt.core.client.GWT;

public abstract class TableCreateCommand implements EditableBean {
	
	
	String name, description;
	Boolean isExportable;
	List<TableCreateCommandColumn> columns; 

	public static TableCreateCommand createOne() {
		TableCreateCommand c = GWT.create(TableCreateCommand.class); 
		c.setName(UUID.uuid());
		c.setDescription("sample description");
		c.setIsExportable(false); 
		
		//initialize the columns with a sample list of two 
		List<TableCreateCommandColumn> _columns = new LinkedList<TableCreateCommandColumn>(); 
		TableCreateCommandColumn col1 = TableCreateCommandColumn.newSampleColumn();//new TableCreateCommandColumn();
		col1.setName("name");
		_columns.add(col1); 
		
		TableCreateCommandColumn col2 = TableCreateCommandColumn.newSampleColumn();//new TableCreateCommandColumn();
		col2.setName("age"); 
		col2.getType().setSelection(FTColumn.TYPE_NUMBER);
		_columns.add(col2);
		
		c.setColumns(_columns); 
		return c;
	}
//	public TableCreateCommand() {
//		name = UUID.uuid();
//		description="";
//		isExportable=false;
//		
//		//initialize the columns with a sample list of two 
//		columns = new LinkedList<TableCreateCommandColumn>(); 
//		TableCreateCommandColumn col1 = newSampleColumn();//new TableCreateCommandColumn();
//		col1.setName("name"); 
//		
//		TableCreateCommandColumn col2 = newSampleColumn();//new TableCreateCommandColumn();
//		col2.setName("age"); 
//		col2.getType().setSelection(FTColumn.TYPE_NUMBER); 
//	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsExportable() {
		return isExportable;
	}

	public void setIsExportable(Boolean isExportable) {
		this.isExportable = isExportable;
	}

	public List<TableCreateCommandColumn> getColumns() {
		return columns;
	}

	public void setColumns(List<TableCreateCommandColumn> columns) {
		this.columns = columns;
	}
	
	

}
