package org.sgx.gapitest.client;

import java.util.*;
import org.sgx.gapitest.client.test.*;

public class TestHome {
	private static TestHome instance;

	private TestHome() {
		test = new HashMap<String, Test>();
		initTest();
	}

	private void initTest() {
		addTest(new GAPITest1());
		addTest(new FusionTablesTest1());
		addTest(new UrlShortener1());
		addTest(new CustomSearchTest1());
		addTest(new SiteVerificationTest1());
		addTest(new DriveTest1());
		addTest(new TranslateTest1());
		addTest(new WebFontsTest1());
		addTest(new BooksTest1());
		addTest(new CalendarTest1());
		addTest(new DriveAppsTest1());
		addTest(new FusionTablesTest2());

	}

	private void addTest(Test t) {
		test.put(t.getId(), t);
	}

	public static TestHome getInstance() {
		if (instance == null)
			instance = new TestHome();
		return instance;
	}

	Map<String, Test> test;

	public Map<String, Test> getTest() {
		return test;
	}
}
