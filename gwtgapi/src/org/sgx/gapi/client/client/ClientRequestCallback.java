package org.sgx.gapi.client.client;

import org.sgx.jsutil.client.JsObject;

public interface ClientRequestCallback {
void call(JsObject jsonResp, String rawResp);//HTTPRawResponse rawResp);
}
