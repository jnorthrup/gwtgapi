package org.sgx.gapi.client.client;

import org.sgx.gapi.client.apis.GAPIResult;

public interface ClientRequestCallback {
void call(GAPIResult jsonResp, String rawResp);//HTTPRawResponse rawResp);
}
