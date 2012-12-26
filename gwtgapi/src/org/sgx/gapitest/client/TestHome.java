package org.sgx.gapitest.client;

import java.util.HashMap;
import java.util.Map;

import org.sgx.gapitest.client.app.Test;
import org.sgx.gapitest.client.test.CustomSearchTest1;
import org.sgx.gapitest.client.test.GAPITest1;
import org.sgx.gapitest.client.test.GAPITest2;
import org.sgx.gapitest.client.test.SiteVerificationTest1;
import org.sgx.gapitest.client.test.UrlShortener1;

public class TestHome {
private static TestHome instance;

private TestHome() {
	test=new HashMap<String, Test>(); 
	initTest(); 
}

private void initTest() {
	addTest(new GAPITest1());
	addTest(new GAPITest2()); 
	addTest(new UrlShortener1());
	addTest(new CustomSearchTest1());
	addTest(new SiteVerificationTest1());
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
