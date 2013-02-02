package org.sgx.gapi.client.apis.translate;

import org.sgx.gapi.client.loader.ModuleDefinition;

public class TranslateModule implements ModuleDefinition {

	@Override
	public String getModuleName() {
		return "translate"; 
	}

	@Override
	public String getModuleVersion() {
		return "v2";
	}

}
