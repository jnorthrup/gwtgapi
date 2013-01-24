package org.sgx.gapigui.client.control;

import java.util.LinkedList;
import java.util.List;

import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gapi.client.apis.fusiontables.table.TableListRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.jsutil.client.DOMUtil;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.user.client.Event;

public class MainController1 implements MainController {
	private static MainController instance;

	private List<WorkListener> workListeners;
	private boolean working;

	private MainController1() {
		workListeners = new LinkedList<WorkListener>();
	}

	public static MainController getInstance() {
		if (instance == null)
			instance = new MainController1();
		return instance;
	}

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
	

//	/* (non-Javadoc)
//	 * @see org.sgx.gapigui.client.control.MainController#showTablesView()
//	 */
//	@Override
//	public void showTablesView() {
//		// TODO Auto-generated method stub
//		
//	}
	

	@Override
	public void doTableCreate(FTTable table) {
				
	}

	/* (non-Javadoc)
	 * @see org.sgx.gapigui.client.control.MainController#doListTables()
	 */
	@Override
	public void doTableList() {
		new TableListRequest().execute(new GAPICallback<TableListResult>() {
			@Override
			public void call(TableListResult result) {

//				if (result.error() != null) {
//					log("error : " + result.error().message());
//				} else {
//					DOMUtil.clear(tableListEl);
//					System.out.println(result.itemsCol().size());
//					for (final FTTable table : result.itemsCol()) {
//						LIElement li = doc.createLIElement();
//						tableListEl.appendChild(li);
//						li.setInnerHTML(table.name());
//
//						ButtonElement editButton = doc.createPushButtonElement();
//						li.appendChild(editButton);
//						editButton.setInnerHTML("edit");
//						DOMUtil.addClickHandler(editButton, new DOMUtil.ClickHandler() {
//							@Override
//							public void onClick(Event event) {
//								doEditTable(table);
//							}
//						});
//
//						ButtonElement removeButton = doc.createPushButtonElement();
//						li.appendChild(removeButton);
//						removeButton.setInnerHTML("remove");
//						DOMUtil.addClickHandler(removeButton, new DOMUtil.ClickHandler() {
//							@Override
//							public void onClick(Event event) {
//								doRemoveTable(table);
//							}
//
//						});
//					}
//				}
			}
		});
	}


}
