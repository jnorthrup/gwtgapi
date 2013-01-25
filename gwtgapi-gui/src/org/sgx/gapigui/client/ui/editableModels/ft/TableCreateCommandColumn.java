package org.sgx.gapigui.client.ui.editableModels.ft;

import org.sgx.gapi.client.apis.fusiontables.FTColumn;
import org.sgx.gwteditors.client.impl1.basetypes.SelectionList;
import org.sgx.gwteditors.client.impl1.edbean.EditableBean;

import com.google.gwt.core.client.GWT;

public abstract class TableCreateCommandColumn implements EditableBean {
	String name;
	SelectionList<String> type;

	public static TableCreateCommandColumn newSampleColumn() {
		TableCreateCommandColumn c = GWT.create(TableCreateCommandColumn.class); 
		c.setName("unammedColumn"); 
		SelectionList<String> type = new SelectionList<String>(FTColumn.TYPES, new String[] { FTColumn.TYPE_STRING });
		type.setMultiple(false);
		c.setType(type); 
		return c;
	}

	
//	public TableCreateCommandColumn() {
//		name = "unammedColumn";
//		type = new SelectionList<String>(FTColumn.TYPES, new String[] { FTColumn.TYPE_STRING });
//		type.setMultiple(false);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SelectionList<String> getType() {
		return type;
	}

	public void setType(SelectionList<String> type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return getName();
	}
}
