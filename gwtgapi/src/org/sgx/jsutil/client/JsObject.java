package org.sgx.jsutil.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayString;

/**
 * a better JavaScriptObject - with added methods for setting, getting properties, creating objects from java code, etc.
 * see also JsArr . all methods prefixed with obj for not interfeiing with client subclasses.
 * 
 * for creation, getters and setters it support a short method "_"
 * @author sg
 *
 */
public class JsObject extends JavaScriptObject {
protected JsObject(){}
public static native final JsObject create(Object propName, Object val)/*-{
	var o = {}; 
	o[propName] = val; 
	return o; 
}-*/;

public static native final JsObject create(Object ... vals)/*-{
//	var arr = @org.sgx.yuigwt.yui.util.JsUtil::toj
var o = {}; 
o[propName] = val; 
return o; 
}-*/;

///**
// * creates a new empty javascript object. 
// * @return a new empty javascript object. 
// */
//public static final native JsObject empty()/*-{
//	return {}; 
//}-*/;
/**
 * creates a new javascript object with the given property setted
 * @param pname property name
 * @param val property value
 * @return a new javascript object with the given property setted
 */
public static final native JsObject one(Object pname, Object val)/*-{
	var o = {}; 
	o[pname]=val; 
	return o; 
}-*/;
/**
 * creates a new javascript object with the given property setted
 * @param pname property name
 * @param val property value
 * @return a new javascript object with the given property setted
 */
public static final native JsObject one(Object pname, String val)/*-{
	var o = {}; 
	o[pname]=val; 
	return o; 
}-*/;
/**
 * creates a new javascript object with the given property setted
 * @param pname property name
 * @param val property value
 * @return a new javascript object with the given property setted
 */
public static final native JsObject one(Object pname, boolean val)/*-{
	var o = {}; 
	o[pname]=val; 
	return o; 
}-*/;
/**
 * creates a new javascript object with the given property setted
 * @param pname property name
 * @param val property value
 * @return a new javascript object with the given property setted
 */
public static final native JsObject one(Object pname, int val)/*-{
	var o = {}; 
	o[pname]=val; 
	return o; 
}-*/;
/**
 * creates a new javascript object with the given property setted
 * @param pname property name
 * @param val property value
 * @return a new javascript object with the given property setted
 */
public static final native JsObject one(Object pname, double val)/*-{
	var o = {}; 
	o[pname]=val; 
	return o; 
}-*/;

//public native final JsObject put(Object propertyName, String )


public native final JsArrayMixed objGetArr(Object p)/*-{
return this[p]||null;
}-*/;
public native final boolean objGetBoolean(Object p)/*-{
return this[p] || false;
}-*/;
public native final JsObject objGetObj(Object p)/*-{
return this[p]||null;
}-*/;

public native final String objGetString(Object p)/*-{
return this[p]||null; 
}-*/;

public native final int objGetInt(Object p)/*-{
return this[p]||0; 
}-*/;
public native final int objGetDouble(Object p)/*-{
return this[p]||0; 
}-*/;
public native final String objTypeof(Object p)/*-{
return typeof(this[p])+""; 
}-*/;


public final native Object _(Object p)/*-{
return this[p]; 
}-*/;
//public native final JsObject objPut(String pname, Object val)/*-{
//	this[pname]=val;
//	return this; 
//}-*/;
public native final JsObject objPut(String pname, String val)/*-{
	this[pname]=val;
	return this; 
}-*/;
public native final JsObject objPut(String pname, boolean val)/*-{
this[pname]=val;
return this; 
}-*/;
public native final JsObject objPut(String pname, int val)/*-{
	this[pname]=val;
	return this; 
}-*/;
public native final JsObject objPut(String pname, double val)/*-{
	this[pname]=val;
	return this; 
}-*/;
public native final JsObject objPut(String pname, JavaScriptObject val)/*-{
this[pname]=val;
return this; 
}-*/;
//public final native JsObject _(Object pname, Object val)/*-{
//	this[pname]=val; 
//	return this; 
//}-*/;
public native final JsObject _(String pname, String val)/*-{
this[pname]=val+"";
return this; 
}-*/;
public native final JsObject _(String pname, Object val)/*-{
this[pname]=val;
return this; 
}-*/;
public native final JsObject _(String pname, int val)/*-{
this[pname]=val;
return this; 
}-*/;
public native final JsObject _(String pname, double val)/*-{
this[pname]=val;
return this; 
}-*/;
public native final JsObject _(String pname, JavaScriptObject val)/*-{
this[pname]=val;
return this; 
}-*/;


public native final JsArrayString objProps()/*-{
	var props = [];
	for(var i in this) {
		props.push(i+"");
	}
	return props;
}-*/;


public native final String objDump(boolean printValues)/*-{
	var s = "{"; 
	for(var i in this) {
		s+=i+(printValues ? ": "+obj[i] : "")+", "; 
	}
	return s+"}"; 
}-*/;

}
