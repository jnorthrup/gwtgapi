package org.sgx.gapi.client.apis.drive;

import org.sgx.gapi.client.loader.ModuleDefinition;

public class DriveModuleDefinition implements ModuleDefinition {

	@Override
	public String getModuleName() {
		return "drive";
	}

	@Override
	public String getModuleVersion() {
		return "v2";
	}

}
