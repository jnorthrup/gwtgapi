package org.sgx.gapi.client.loader;

import org.sgx.gapi.client.auth.AuthResponse;

public interface GAPILoaderCallback {
void loaded(AuthResponse authResp); 
}
