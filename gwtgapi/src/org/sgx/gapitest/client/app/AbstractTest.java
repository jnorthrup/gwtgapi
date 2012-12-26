package org.sgx.gapitest.client.app;


public abstract class AbstractTest implements Test {
public void log(String line) {
	Gallery.getInstance().getConsole().append(line); 
}
}
