package org.sgx.gapi.client.loader;

public class ModuleDefinitionImpl implements ModuleDefinition {
String moduleName, moduleVersion;

public ModuleDefinitionImpl(String moduleName, String moduleVersion) {
	super();
	this.moduleName = moduleName;
	this.moduleVersion = moduleVersion;
}
@Override
public String toString() {
	return "MOdule("+getModuleName()+", "+getModuleVersion()+")";
}
/* (non-Javadoc)
 * @see org.sgx.gapi.client.loader.ModuleDefinition#getModuleName()
 */
@Override
public String getModuleName() {
	return moduleName;
}

public void setModuleName(String moduleName) {
	this.moduleName = moduleName;
}

/* (non-Javadoc)
 * @see org.sgx.gapi.client.loader.ModuleDefinition#getModuleVersion()
 */
@Override
public String getModuleVersion() {
	return moduleVersion;
}

public void setModuleVersion(String moduleVersion) {
	this.moduleVersion = moduleVersion;
} 

}
