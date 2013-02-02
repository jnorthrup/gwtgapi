package org.sgx.gapi.client.loader;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.auth.AuthCallback;
import org.sgx.gapi.client.auth.AuthResponse;
import org.sgx.gapi.client.client.ClientLoadCallback;

/**
 * an utility able to (optionally) authenticate and load a "GAPI module" like plus, fusiontables, etc. At this point only one module can be loaded with a GAPILoader instance.
 * 
 * @author sg
 * 
 */
public class GAPILoader implements AuthCallback {
	
	
	
	AuthDefinition authDefinition;
//	String moduleName, moduleVersion;
	private AuthUtil authUtil;
	private GAPILoaderCallback gapiLoadedCallback;
	private ModuleDefinition module;

	public GAPILoader(ModuleDefinition moduleDef) {
		this(null, moduleDef); 
	}
	
	public GAPILoader(AuthDefinition authDefinition,ModuleDefinition moduleDef) {
		super();
		this.authDefinition = authDefinition;
//		this.moduleName = moduleName;
//		this.moduleVersion = moduleVersion;
		this.module = moduleDef; 
	}

	public void load(GAPILoaderCallback callback) {
//		System.out.println("sebas123");
		this.gapiLoadedCallback = callback;
		if (authDefinition != null) {
			authUtil = new AuthUtil();
			authUtil.authenticate(authDefinition, this);
		} else {
			authenticated(null);
		}
	}

	public AuthDefinition getAuthDefinition() {
		return authDefinition;
	}

	public void setAuthDefinition(AuthDefinition authDefinition) {
		this.authDefinition = authDefinition;
	}

//	public String getModuleName() {
//		return moduleName;
//	}
//
//	public void setModuleName(String moduleName) {
//		this.moduleName = moduleName;
//	}
//
//	public String getModuleVersion() {
//		return moduleVersion;
//	}
//
//	public void setModuleVersion(String moduleVersion) {
//		this.moduleVersion = moduleVersion;
//	}

	@Override
	public void authenticated(final AuthResponse r) {
		GAPI.get().client().load(module.getModuleName(), module.getModuleVersion(), new ClientLoadCallback() {
			@Override
			public void loaded() {

				gapiLoadedCallback.loaded(r);
				// new TableListRequest().execute(new GAPICallback<TableListResult>() {
				// @Override
				// public void call(TableListResult result) {
				// if(result.error()!=null) {
				// // System.out.println("error : "+result.error());
				// return;
				// }
				// // for(result.items()
				// // System.out.println("RESULT2: " + JsUtil.dumpObj(result) + " - " + result.error().message());// result.items().length());
				// }
				// });

			}
		});
	}

}
