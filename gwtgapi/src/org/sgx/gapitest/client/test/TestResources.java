package org.sgx.gapitest.client.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.TextResource;

public interface TestResources extends ClientBundle {
	public static final TestResources INSTANCE = GWT.create(TestResources.class);

	@Source("GAPITest1.java")
	public TextResource GAPITest1();

	@Source("FusionTablesTest1.java")
	public TextResource FusionTablesTest1();
	
	@Source("SiteVerificationTest1.java")
	public TextResource SiteVerificationTest1();
	
	@Source("UrlShortener1.java")
	public TextResource UrlShortener1();
	
	@Source("DriveTest1.java")
	public TextResource DriveTest1();
	
	@Source("TranslateTest1.java")
	public TextResource TranslateTest1();
	
	@Source("WebFontsTest1.java")
	public TextResource WebFontsTest1();
	
}