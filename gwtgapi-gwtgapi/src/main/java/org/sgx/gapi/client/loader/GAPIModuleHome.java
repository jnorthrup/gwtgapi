package org.sgx.gapi.client.loader;

import java.util.Map;

public class GAPIModuleHome {
private static GAPIModuleHome instance = null; 

private GAPIModuleHome() {
	super();
}

public static GAPIModuleHome getInstance() {
	if(instance == null )
		instance = new GAPIModuleHome();
	return instance;
}

//Map<String, V>
}
