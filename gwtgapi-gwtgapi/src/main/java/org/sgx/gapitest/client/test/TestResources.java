package org.sgx.gapitest.client.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ExternalTextResource;

public interface TestResources extends ClientBundle {
	public static final TestResources INSTANCE = GWT.create(TestResources.class);

	@Source("GAPITest1.java")
	public ExternalTextResource GAPITest1();

	@Source("FusionTablesTest1.java")
	public ExternalTextResource FusionTablesTest1();
	
	@Source("SiteVerificationTest1.java")
	public ExternalTextResource SiteVerificationTest1();
	
	@Source("UrlShortener1.java")
	public ExternalTextResource UrlShortener1();
		
	@Source("DriveTest1.java")
	public ExternalTextResource DriveTest1();
	
	@Source("TranslateTest1.java")
	public ExternalTextResource TranslateTest1();
	
	@Source("WebFontsTest1.java")
	public ExternalTextResource WebFontsTest1();
	
	@Source("WebFontsTest1.java")
	public ExternalTextResource CustomSearchTest1();
	
	@Source("BooksTest1.java")
	public ExternalTextResource BooksTest1();
	
	@Source("CalendarTest1.java")
	public ExternalTextResource CalendarTest1();
	
	@Source("DriveAppsTest1.java")
	public ExternalTextResource DriveAppsTest1();
	
	@Source("FusionTablesTest2.java")
	public ExternalTextResource FusionTablesTest2();
	
	
	
}