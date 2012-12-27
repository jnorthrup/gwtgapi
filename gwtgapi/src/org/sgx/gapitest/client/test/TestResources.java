package org.sgx.gapitest.client.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.TextResource;

public interface TestResources extends ClientBundle {
	public static final TestResources INSTANCE = GWT.create(TestResources.class);

	@Source("GAPITest1.java")
	public TextResource GAPITest1();

	@Source("GAPITest2.java")
	public TextResource GAPITest2();
	
	@Source("SiteVerificationTest1.java")
	public TextResource SiteVerificationTest1();
	
	@Source("UrlShortener1.java")
	public TextResource UrlShortener1();
	
}