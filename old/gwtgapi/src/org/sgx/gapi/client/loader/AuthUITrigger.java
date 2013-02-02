package org.sgx.gapi.client.loader;
/**
 * in oauth, if immediate authentication cannot be done, the user must login 
 * in a dialog and the user probably wants to activate this clicking a button 
 * or something like that. This class represents this ui object
 * @author sg
 *
 */
public interface AuthUITrigger {
	void addTriggerHandler(Runnable r);
	void setEnabled(boolean enabled);
}