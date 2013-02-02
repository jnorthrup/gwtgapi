package org.sgx.gapitest.client;

import java.util.Map;

import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.TextResource;

public interface Test {
void test(Element parent);
String getDescription();
String getId(); 
String [] getTags();
Map<String, GAPITestTextResource> getResources(); 
}
