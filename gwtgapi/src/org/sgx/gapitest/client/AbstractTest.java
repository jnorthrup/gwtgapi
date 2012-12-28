package org.sgx.gapitest.client;

import org.sgx.gapitest.client.app.Gallery;


public abstract class AbstractTest implements Test {
public void log(String line) {
	Gallery.getInstance().getConsole().append(line); 
}
}
