package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.fusiontables.FTColumn;
import org.sgx.gapi.client.apis.fusiontables.FTModule;
import org.sgx.gapi.client.apis.fusiontables.FTTable;
import org.sgx.gapi.client.apis.fusiontables.table.TableDeleteRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableDeleteResult;
import org.sgx.gapi.client.apis.fusiontables.table.TableInsertRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableListRequest;
import org.sgx.gapi.client.apis.fusiontables.table.TableListResult;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.loader.AuthDefinition;
import org.sgx.gapi.client.loader.AuthUITrigger;
import org.sgx.gapi.client.loader.GAPILoader;
import org.sgx.gapi.client.loader.GAPILoaderCallback;
import org.sgx.gapi.client.loader.ModuleDefinition;
import org.sgx.gapi.client.util.GAPILoadCallback;
import org.sgx.gapi.client.util.GAPIUtil;
import org.sgx.gapitest.client.AbstractTest;
import org.sgx.gapitest.client.GAPITestConstants;
import org.sgx.gapitest.client.GAPITestTextResource;
import org.sgx.gapitest.client.app.Gallery;
import org.sgx.jsutil.client.DOMUtil;
import org.sgx.jsutil.client.JsUtil;
import org.sgx.jsutil.client.UUID;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.dom.client.ParagraphElement;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * 
 * Simple GUI For fusion tables
 * 
 * @author sg
 * 
 */
public class FusionTablesTest2 extends AbstractTest implements EntryPoint {

	private String clientId;
	private String apiKey;
	private String scope;
	private Button authButton;
	private UListElement tableListEl;
	private Document doc;

	@Override
	public void test(Element parent) {
		GAPI.load(new GAPILoadCallback() {
			@Override
			public void loaded() {
				main();
			}
		});
	}

	protected void main() {
		doc = Document.get();

		clientId = GAPITestConstants.CLIENT_ID;

		apiKey = GAPITestConstants.API_KEY;

		scope = "https://www.googleapis.com/auth/fusiontables";

		authButton = new Button("authenticate");
		RootPanel.get().add(authButton);
		AuthUITrigger authUITrigger = GAPIUtil.buildAuthUITriggerFrom(authButton);

		GAPI.get().client().setApiKey(apiKey);

		ModuleDefinition moduleDef = new FTModule(); // ("siteverification", "v1");
		AuthDefinition authDefinition = new AuthDefinition(clientId, scope, authUITrigger);
		GAPILoader loader = new GAPILoader(authDefinition, moduleDef);
		loader.load(new GAPILoaderCallback() {
			@Override
			public void loaded(AuthResponse authResp) {
				renderUI();
			}
		});

	}

	protected void renderUI() {
		Element parent = Gallery.getInstance().getTestContainer();
		
		ParagraphElement p = doc.createPElement();
		p.setInnerText("Tables list: "); 
		parent.appendChild(p); 
		
		tableListEl = doc.createULElement();
		parent.appendChild(tableListEl);
		
		Element tableListButton = doc.createPushButtonElement();
		parent.appendChild(tableListButton);
		tableListButton.setInnerHTML("list tables");
		DOMUtil.addClickHandler(tableListButton, new DOMUtil.EventHandler() {
			@Override
			public void onEvent(Event event) {
				doListTables();
			}
		});
		
		Element tableCreateButton = doc.createPushButtonElement();
		parent.appendChild(tableCreateButton);
		tableCreateButton.setInnerHTML("create table");
		DOMUtil.addClickHandler(tableCreateButton, new DOMUtil.EventHandler() {
			@Override
			public void onEvent(Event event) {
				doCreateTable();
			}
		});
		
		//rendering finished - list all tables: 
		doListTables(); 
	}

	
	private void doListTables() {
		new TableListRequest().execute(new GAPICallback<TableListResult>() {
			@Override
			public void call(TableListResult result) {

				if (result.error() != null) {
					log("error : " + result.error().message());
				} else {
					DOMUtil.clear(tableListEl);
					System.out.println(result.itemsCol().size());
					for (final FTTable table : result.itemsCol()) {
						LIElement li = doc.createLIElement();
						tableListEl.appendChild(li);
						li.setInnerHTML(table.name());

						ButtonElement editButton = doc.createPushButtonElement();
						li.appendChild(editButton);
						editButton.setInnerHTML("edit");
						DOMUtil.addClickHandler(editButton, new DOMUtil.EventHandler() {
							@Override
							public void onEvent(Event event) {
								doEditTable(table);
							}
						});

						ButtonElement removeButton = doc.createPushButtonElement();
						li.appendChild(removeButton);
						removeButton.setInnerHTML("remove");
						DOMUtil.addClickHandler(removeButton, new DOMUtil.EventHandler() {
							@Override
							public void onEvent(Event event) {
								doRemoveTable(table);
							}

						});
					}
				}
			}
		});
	}

	protected void doEditTable(FTTable table) {
		Window.alert("table " + table.name() + " - description: " + table.description());
	}

	protected void doRemoveTable(final FTTable table) {
		if (!Window.confirm("Are you sure you want to remove table named " + table.name() + " - id : "+table.tableId()+" ?"))
			return;
		new TableDeleteRequest(table.tableId()).execute(new GAPICallback<TableDeleteResult>() {			
			@Override
			public void call(TableDeleteResult result) {
				System.out.println(JsUtil.dumpObj(result));
				if (result.error() != null) {
					log("error : " + result.error().message());
				} else {
					doListTables(); 
					Window.alert("table deleted " + table.tableId() + " - " + table.description());					
				}
			}
		}); 

	}
	
	protected void doCreateTable() {
		String name = Window.prompt("new table name: ", UUID.uuid()); 
		List<FTColumn> columns  = new LinkedList<FTColumn>();
		FTColumn stringColumn1 = FTColumn.create().name("stringColumn1").columnId(0).type(FTColumn.TYPE_STRING);
		columns.add(stringColumn1); 
		new TableInsertRequest(columns, false, name).execute(new GAPICallback<FTTable>() {
			@Override
			public void call(FTTable result) {
				System.out.println(JsUtil.dumpObj(result));
				if (result.error() != null) {
					log("create table error : " + result.error().message());
				} else {
					doListTables(); 
					Window.alert("table created " + result.name());
				}
			}
		}); 
	}

	

	// test stuff
	@Override
	public String getId() {
		return "FusionTables2";
	}

	@Override
	public String getDescription() {
		return "Simple GUI For fusion tables";
	}

	@Override
	public Map<String, GAPITestTextResource> getResources() {
		HashMap<String, GAPITestTextResource> m = new HashMap<String, GAPITestTextResource>();
		m.put("FusionTablesTest2.java", new GAPITestTextResource(TestResources.INSTANCE.FusionTablesTest2()));
		return m;
	}

	@Override
	public String[] getTags() {
		return null;
	}

	@Override
	public void onModuleLoad() {
		test(RootPanel.getBodyElement());
	}

}
