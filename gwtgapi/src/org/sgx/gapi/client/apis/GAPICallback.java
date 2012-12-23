package org.sgx.gapi.client.apis;

public interface GAPICallback<T> {
void call(T result); 
}
