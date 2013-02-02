package org.sgx.gapitest.client;

import org.sgx.gapitest.client.app.Gallery;

import com.google.gwt.dom.client.Element;

public abstract class AbstractTest implements Test {
	public void log(String line) {
		Gallery.getInstance().getConsole().append(line);
	}

	public Element getTestContainer() {
		return Gallery.getInstance().getTestContainer();
	}
}
