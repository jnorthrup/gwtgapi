package org.sgx.gapigui.client.state;

import org.sgx.gapi.client.loader.ModuleDefinition;

public class GAPIModule {
	String 
//	moduleName, moduleVersion, 
	authScope;
	ModuleDefinition module;
	boolean loaded = false;

//	private GAPIModule(String moduleName, String moduleVersion, String authScope) {
//		super();
//		this.moduleName = moduleName;
//		this.moduleVersion = moduleVersion;
//		this.authScope = authScope;
//	}

	public GAPIModule(ModuleDefinition m, String authScope) {
//		this(m.getModuleName(), m.getModuleVersion(), authScope);
		this.module=m;
		this.authScope = authScope;
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

	
	public String getAuthScope() {
		return authScope;
	}

	public ModuleDefinition getModule() {
		return module;
	}

	public void setModule(ModuleDefinition module) {
		this.module = module;
	}

	public void setAuthScope(String authScope) {
		this.authScope = authScope;
	}

	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}

}
