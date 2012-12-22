package org.sgx.jsutil.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayMixed;

/**
 * I reprsent a pure JavaScript function object. Use JsUtils.toJsFunction() for transforming a Callback to a JsFunction,. 
 * @author sg
 *
 */
public class JsFunction extends JavaScriptObject {
protected JsFunction(){}

/**
 * apply this function to given arguments. 
 * @return the returned value of this.apply()
 */
public native final JavaScriptObject applyObj(JsArrayMixed args) /*-{
	return this.apply(this, args);
}-*/;

/**
 * apply this function to given arguments. 
 * @return the returned value of this.apply()
 */
public native final int applyInt(JsArrayMixed args) /*-{
	return this.apply(this, args);
}-*/;

/**
 * apply this function to given arguments. 
 * @return the returned value of this.apply()
 */
public native final double applyDouble(JsArrayMixed args) /*-{
	return this.apply(this, args);
}-*/;
/**
 * apply this function to given arguments. 
 * @return the returned value of this.apply()
 */
public native final double applyDouble(JavaScriptObject args) /*-{
	return this.apply(this, args);
}-*/;
/**
 * apply this function to given arguments. 
 */
public native final void apply(JsArrayMixed args) /*-{
	this.apply(this, args);
}-*/;
/**
 * apply this function to given arguments. 
 */
public native final void apply(JavaScriptObject args) /*-{
	this.apply(this, args);
}-*/;
/**
 * apply this function to given arguments. 
 * @return the returned value of this.apply()
 */
public native final boolean applyBoolean(JsArrayMixed args) /*-{
	return this.apply(this, args);
}-*/;
/**
 * apply this function to given arguments. 
 * @return the returned value of this.apply()
 */
public native final String applyString(JsArrayMixed args) /*-{
	return this.apply(this, args);
}-*/;

/**
 * call the function as if were a class constructor, like: 
 * <pre>return new f(args); </pre> 
 */
public native final void construct(JsArrayMixed args) /*-{
	return new this(args);
}-*/;
}
