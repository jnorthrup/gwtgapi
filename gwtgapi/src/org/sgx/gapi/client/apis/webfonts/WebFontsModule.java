package org.sgx.gapi.client.apis.webfonts;

import org.sgx.gapi.client.loader.ModuleDefinition;

public class WebFontsModule implements ModuleDefinition {

	@Override
	public String getModuleName() {
		return "webfonts"; 
	}

	@Override
	public String getModuleVersion() {
		return "v1"; 
	}

}
