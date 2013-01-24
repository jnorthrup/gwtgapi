package org.sgx.gapigui.client.ui.editableModels;

import org.sgx.gwteditors.client.impl1.edbean.EditableBean;
import org.sgx.jsutil.client.UUID;

public abstract class TableCreateCommand implements EditableBean {
	String name, description;
	Boolean isExportable;

	public TableCreateCommand() {
		name = UUID.uuid();
		description="";
		isExportable=false;
	}

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

}
