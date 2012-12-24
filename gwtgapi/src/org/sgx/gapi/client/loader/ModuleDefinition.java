package org.sgx.gapi.client.loader;

public class ModuleDefinition {
String moduleName, moduleVersion;

public ModuleDefinition(String moduleName, String moduleVersion) {
	super();
	this.moduleName = moduleName;
	this.moduleVersion = moduleVersion;
}

public String getModuleName() {
	return moduleName;
}

public void setModuleName(String moduleName) {
	this.moduleName = moduleName;
}

public String getModuleVersion() {
	return moduleVersion;
}

public void setModuleVersion(String moduleVersion) {
	this.moduleVersion = moduleVersion;
} 

}
