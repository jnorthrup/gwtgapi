package org.sgx.gapitest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.drive.DriveModuleDefinition;
import org.sgx.gapi.client.apis.drive.about.DriveAboutGetRequest;
import org.sgx.gapi.client.apis.drive.about.DriveAboutResource;
import org.sgx.gapi.client.apis.drive.apps.AppsList;
import org.sgx.gapi.client.apis.drive.apps.DriveAppListRequest;
import org.sgx.gapi.client.apis.drive.file.DriveFileListRequest;
import org.sgx.gapi.client.apis.drive.file.FileList;
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

import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * in this example we test drive.about API 
 * 
 * @author sg
 * 
 */
public class DriveTest1 extends AbstractTest {

	private String apiKey;
	private String scope;
	private String clientId;
	private Button authButton;

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

		authButton = new Button("authenticate");
		RootPanel.get().add(authButton);
		AuthUITrigger authUITrigger = GAPIUtil.buildAuthUITriggerFrom(authButton); 		
		
		clientId = GAPITestConstants.CLIENT_ID;

		scope = "https://www.googleapis.com/auth/drive";

		apiKey = GAPITestConstants.API_KEY;

		GAPI.get().client().setApiKey(apiKey);		

		ModuleDefinition moduleDef = new DriveModuleDefinition(); 		
		AuthDefinition authDefinition = new AuthDefinition(clientId, scope, authUITrigger); 
		GAPILoader loader = new GAPILoader(authDefinition, moduleDef); 
		loader.load(new GAPILoaderCallback() {
			
			@Override
			public void loaded(AuthResponse authResp) {
				callApi(); 
			}
		}); 

	}

	protected void callApi() {
		
		new DriveAboutGetRequest().execute(new GAPICallback<DriveAboutResource>() {			
			@Override
			public void call(DriveAboutResource result) {
				if(result.error()!=null)
					log("drive about get error: "+result.error().message());
				else
					log("drive about get name: "+result.name()); 
			}
		}); 
		
		new DriveFileListRequest().execute(new GAPICallback<FileList>() {			
			@Override
			public void call(FileList result) {	
				if(result.error()!=null) {
					log("list size error: "+result.error().message());
					return; 
				}
				
				log("file list size: "+result.items().length()+" - "+
				"first file labels: "+result.items().get(0).labels().toMap().keySet().size()); 
				
			}
		}); 
		
		new DriveAppListRequest().execute(new GAPICallback<AppsList>() {			
			@Override
			public void call(AppsList result) {	
				if(result.error()!=null) {
					log("app list error: "+result.error().message());
					return; 
				}
				
				log("app list size: "+result.items().length()+" - "
//				"first file labels: "+result.items().get(0).labels().toMap().keySet().size()
				); 
				
			}
		});
	}

	@Override
	public String getId() {
		return "DriveTest1";
	}

	@Override
	public String getDescription() {
		return "in this example we test drive.about API";
	}

	@Override
	public Map<String, GAPITestTextResource> getResources() {
		HashMap<String, GAPITestTextResource> m = new HashMap<String, GAPITestTextResource>();
		m.put("DriveTest1.java", new GAPITestTextResource(TestResources.INSTANCE.DriveTest1()));
		return m;
	}

	@Override
	public String[] getTags() {
		return null;
	}

}
