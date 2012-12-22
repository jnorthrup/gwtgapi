package org.sgx.jsutil.client;

import java.util.Iterator;


import com.google.gwt.core.client.JavaScriptObject;

public class JsArrayCollectionTest {
public static void main(String[] args) {
	JsArrayCollection<String> c1 = JsArrayCollection.create(data1());  
	
	Iterator<String> i = c1.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
	
	System.out.println("end");
}

private static final native JavaScriptObject data1()/*-{
	return ["domingo", "lunes", "martes", "miercoles", "jueves"]; 
}-*/;

}
