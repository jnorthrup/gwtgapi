package org.sgx.gapigui.client.ui.editableModels.ft;

import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gwteditors.client.impl1.edbean.EditableBean;

import com.google.gwt.core.client.GWT;

public abstract class Table implements EditableBean {

	String name,
//	, tableId, 
	description;
	Boolean isExportable; 
//	String sql; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getTableId() {
//		return tableId;
//	}
//	public void setTableId(String tableId) {
//		this.tableId = tableId;
//	}
//	public String getDescription() {
//		return description;
//	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsExportable() {
		return isExportable;
	}
	public void setIsExportable(Boolean isExportable) {
		this.isExportable = isExportable;
	}
//	public String getSql() {
//		return sql;
//	}
//	public void setSql(String sql) {
//		this.sql = sql;
//	}
	
	public static Table from(FTTable table) {
		Table t = GWT.create(Table.class);
		t.setName(table.name()); 
		t.setDescription(table.description()); 
		t.setIsExportable(table.isExportable());
//		t.setTableId(table.tableId());
//		t.setSql(table.sql()); 
		return t;
	}
	public static Table newTable() {
		Table t = GWT.create(Table.class);
		t.setName("unnamedTable"); 
		t.setDescription("sample description"); 
		t.setIsExportable(false);
//		t.setTableId("");
//		t.setSql(table.sql()); 
		return t;
	}
	
	

}
