package org.sgx.gapi.client.apis;

import org.sgx.jsutil.client.JsObject;

public abstract class GAPIRequestAbstract<T extends JsObject> implements GAPIRequest<T> {
String fields;

public String getFields() {
	return fields;
}

public void setFields(String fields) {
	this.fields = fields;
} 
public JsObject getParams() {
	JsObject p = JsObject.createObject().cast();
	if(getFields()!=null && !getFields().equals(""))
		p.objPut("fields", getFields()); 
	return p; 
}
}
