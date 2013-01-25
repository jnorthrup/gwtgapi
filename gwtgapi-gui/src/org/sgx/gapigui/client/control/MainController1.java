package org.sgx.gapigui.client.control;

import java.util.LinkedList;
import java.util.List;

import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gapi.client.apis.fusiontables.table.TableListRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.gapigui.client.ui.editableModels.ft.Table;
import org.sgx.gapigui.client.ui.editableModels.ft.TableCreateCommand;
import org.sgx.jsutil.client.DOMUtil;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.user.client.Event;

public class MainController1 implements MainController {
	private static MainController instance;

	private List<WorkListener> workListeners;

	private MainController1() {
		workListeners = new LinkedList<WorkListener>();
	}

	public static MainController getInstance() {
		if (instance == null)
			instance = new MainController1();
		return instance;
	}
	
	
	
	
	//working flag

	private boolean working;
	String workingMsg;

	/* (non-Javadoc)
	 * @see org.sgx.gapigui.client.control.MainController#addWorkListener(org.sgx.gapigui.client.control.WorkListener)
	 */
	@Override
	public void addWorkListener(WorkListener l) {
		workListeners.add(l);
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean w) {
		if (working != w) {
			this.working = w;
			notifyAllWorkListeners();
		}
	}

	public void notifyAllWorkListeners() {
		for (WorkListener l : workListeners) {
			l.notifyWorkChange(isWorking());
		}
	}
	
	
	
	//system calls
	

//	/* (non-Javadoc)
//	 * @see org.sgx.gapigui.client.control.MainController#showTablesView()
//	 */
//	@Override
//	public void showTablesView() {
//		// TODO Auto-generated method stub
//		
//	}
	

	@Override
	public void doTableCreate(TableCreateCommand tcc) {

		FTTable table = FTTable.create().name(tcc.getName()).description("tcc.getDescription()")
				.isExportable(tcc.getIsExportable());
		
		//TODO
	}

	/* (non-Javadoc)
	 * @see org.sgx.gapigui.client.control.MainController#doListTables()
	 */
	@Override
	public void doTableList(final ControllerCallback<List<Table>> callback) {
		new TableListRequest().execute(
		new GAPICallback<TableListResult>() {			
			@Override
			public void call(TableListResult result) {				

				if (result.error() != null) {
//					log("error : " + result.error().message());
				} else {
					List<Table> l = new LinkedList<Table>();
					for(FTTable table : result.itemsCol()) 
						l.add(Table.from(table)); 					
					callback.call(l); 
				}
			}
		});
	}


}
