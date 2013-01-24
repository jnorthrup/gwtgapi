package org.sgx.gapigui.client.control;

import org.sgx.gapi.client.apis.fusiontables.FTTable;

public interface MainController {

	public abstract void addWorkListener(WorkListener l);

//	public abstract void showTablesView();

	public abstract void doTableList();

	public abstract void doTableCreate(FTTable table);

}