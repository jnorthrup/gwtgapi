package org.sgx.gapi.client.apis.calendar;

import org.sgx.gapi.client.loader.ModuleDefinition;

public class CalendarModule implements ModuleDefinition{

	@Override
	public String getModuleName() {
		return "calendar";
	}

	@Override
	public String getModuleVersion() {
		return "v3";
	}

}
