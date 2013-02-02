package org.sgx.gapi.client.apis.books;

import org.sgx.gapi.client.loader.ModuleDefinition;

public class BooksModule implements ModuleDefinition{

	@Override
	public String getModuleName() {
		return "books"; 
	}

	@Override
	public String getModuleVersion() {
		return "v1"; 
	}

}
