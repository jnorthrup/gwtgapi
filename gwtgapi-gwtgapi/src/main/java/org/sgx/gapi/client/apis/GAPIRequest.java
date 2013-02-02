package org.sgx.gapi.client.apis;

import org.sgx.jsutil.client.JsObject;

public interface GAPIRequest<T extends JsObject> {
//ClientRequest getClientRequest(); 
void execute(GAPICallback<T> c);
}
