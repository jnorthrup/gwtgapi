package org.sgx.gapigui.client.control;

import java.util.List;

import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gapi.client.apis.fusiontables.table.TableListRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.gapigui.client.ui.editableModels.ft.Table;
import org.sgx.gapigui.client.ui.editableModels.ft.TableCreateCommand;

public interface MainController {

	public abstract void addWorkListener(WorkListener l);

//	public abstract void showTablesView();

	public abstract void doTableList(final ControllerCallback<List<Table>> callback);

	public abstract void doTableCreate(TableCreateCommand table);

}