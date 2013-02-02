package org.sgx.gapi.client.apis.fusiontables;

import org.sgx.gapi.client.loader.ModuleDefinition;

public class FTModule implements ModuleDefinition {

	@Override
	public String getModuleName() {
		return "fusiontables"; 
	}

	@Override
	public String getModuleVersion() {
		return "v1"; 
	}
	@Override
	public String toString() {
		return "MOdule("+getModuleName()+", "+getModuleVersion()+")";
	}

}
