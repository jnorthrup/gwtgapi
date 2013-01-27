package org.sgx.gapi.client.loader;

public class AuthDefinition {
	String clientId, scope;
	AuthUITrigger authUITrigger;

	@Override
	public String toString() {
		return "Auth("+getClientId()+", "+getScope()+")";
	}
	public AuthDefinition(String clientId, String scope, AuthUITrigger authUITrigger) {
		super();
		this.clientId = clientId;
		this.scope = scope;
		this.authUITrigger = authUITrigger;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public AuthUITrigger getAuthUITrigger() {
		return authUITrigger;
	}

	public void setAuthUITrigger(AuthUITrigger authUITrigger) {
		this.authUITrigger = authUITrigger;
	}

}
