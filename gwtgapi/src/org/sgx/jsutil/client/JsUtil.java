package org.sgx.jsutil.client;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.user.client.Window;
/**
 * javascript related utilities
 * @author sg
 *
 */
public class JsUtil {
//	/**
//	 * usefull for setting breakpoints in firebug from java.
//	 */
//	public static native void firebug()/*-{
//		$wnd.r4g._firebug();
//	}-*/;

	public static native <T> T get(JavaScriptObject o, Object p)/*-{
		return o[p];
	}-*/;

	public static native String getString(JavaScriptObject o, String s)/*-{
		return o[s]; 
	}-*/;

	public static native int getInt(JavaScriptObject o, String s)/*-{
		return o[s]; 
	}-*/;

	
//	public static native JavaScriptObject put(JavaScriptObject o, Object pname, Object val)/*-{
//		o[pname]=val;
//		return o; 
//	}-*/;
	public static native JavaScriptObject put(JavaScriptObject o, Object pname, String val)/*-{
		o[pname]=val;
		return o; 
	}-*/;
	public static native JavaScriptObject put(JavaScriptObject o, Object pname, int val)/*-{
		o[pname]=val;
		return o; 
	}-*/;
	public static native JavaScriptObject put(JavaScriptObject o, Object pname, double val)/*-{
		o[pname]=val;
		return o; 
	}-*/;
	public static native JavaScriptObject put(JavaScriptObject o, Object pname, boolean val)/*-{
	o[pname]=val;
	return o; 
}-*/;
	public static native JsArrayString props(JavaScriptObject o)/*-{
		var props = [];
		for(var i in o) {
			props.push(i+"");;
		}
		return props;
	}-*/;
	/**
	 * return all values of an object (values must be javascriptobjects).
	 * @param o
	 * @return
	 */
	public static native JavaScriptObject valuesObj(JavaScriptObject o)/*-{
		var vals = [];
		for(var i in o) {
			vals.push(o[i]);;
		}
		return vals;
	}-*/;
	public static native JavaScriptObject empty()/*-{
		return {};
	}-*/;
	
//	public static  JavaScriptObject obj(Map<String, Object> props) {
//		JavaScriptObject o = empty();
//		for(String k : props.keySet()) {
//			Object val = props.get(k);
//			put(o, k, val);
//		}
//		return o;
//	}
//	public static JavaScriptObject obj(Object...m) {
//		return obj(Util.toMap2(m));
//	}
	public static native JavaScriptObject arrayEmpty()/*-{
		return [];
	}-*/;
	
	public static native JavaScriptObject arrayPush(JavaScriptObject arr, JavaScriptObject o)/*-{
		arr.push(o);
		return arr;
	}-*/;

	public static boolean arrayContains(JsArray<JavaScriptObject> a, 
			JavaScriptObject val) {
		for (int i = 0; i < a.length(); i++) {
			JavaScriptObject o = a.get(i);
			if(o!=null&&o.equals(val))
				return true;
		}
		return false;
	}
	
	public static boolean arrayContains(JsArrayMixed a, String val) {
		for (int i = 0; i < a.length(); i++) {
			String o = a.getString(i);
			if(o!=null&&o.equals(val))
				return true;
		}
		return false;
	}
	
	public static boolean arrayContains(JsArrayString a, 
			String val) {
		for (int i = 0; i < a.length(); i++) {
			String o = a.get(i);
			if(o!=null&&o.equals(val))
				return true;
		}
		return false;
	}
	public static boolean arrayContains(JsArrayNumber a, 
			String val) {
		for (int i = 0; i < a.length(); i++) {
			Number o = a.get(i);
			if(o!=null&&o.equals(val))
				return true;
		}
		return false;
	}
	public static JsArrayNumber toJsArrayInt(int[] a) {
		JsArrayNumber jsa = (JsArrayNumber) JsArrayNumber.createArray();
		for (int i = 0; i < a.length; i++) {
			jsa.push(a[i]);
		}
		return jsa;
	}
//	public static JsArrayMixed toJsArrayJavaObject(Object[] a) {
//		JsArrayMixed jsa = (JsArrayMixed) JsArr.createArray();
//		for (int i = 0; i < a.length; i++) {
//			jsa.push((JavaScriptObject) a[i]);
//		}
//		return jsa;
//	}
	
public static JsArrayNumber toJsArrayDouble(double[]a) {
	if(a==null)
		return null;
	JsArrayNumber jsa = (JsArrayNumber) JsArrayNumber.createArray();
	for (int i = 0; i < a.length; i++) {
		jsa.push(a[i]);
	}
	return jsa;
}
	
	public static <T extends JavaScriptObject> JsArray<T> toJsArray(Collection<T> c) {
		if(c==null)
			return null;
		JsArray<T> jsa = (JsArray<T>) JsArrayNumber.createArray();
		for (Iterator i = c.iterator(); i.hasNext();) {
			T t = (T) i.next();
			jsa.push(t); 
		}
		return jsa;
	}
	
	public static  JsArrayString toJsArrayString(Collection<String> c) {
		if(c==null)
			return null;
		JsArrayString jsa = JsArrayString.createArray().cast();
		for (Iterator i = c.iterator(); i.hasNext();) {
			String t = (String) i.next();
			jsa.push(t); 
		}
		return jsa;
	}
	public static JsArrayString toJsArrayString(String[] a) {
		if(a==null)
			return null;
		JsArrayString jsa = JsArrayNumber.createArray().cast();
		for (int i = 0; i < a.length; i++) {
			jsa.push(a[i]);
		}
		return jsa;
	}
//	public static JsArrayString toJsArrayString(String[] a) {
//		if(a==null)
//			return null;
//		JsArrayString jsa = JsArrayNumber.createArray().<JsArrayString>cast();
//		for (int i = 0; i < a.length; i++) {
//			jsa.push(a[i]);
//		}
//		return jsa;
//	}
	public static JsArrayString toJsArrayString(Object[] a) {
		if(a==null)
			return null;
		JsArrayString jsa = JsArrayNumber.createArray().cast();
		for (int i = 0; i < a.length; i++) {
			jsa.push(a[i]+"");
		}
		return jsa;
	}
	
	public static JsArrayMixed toJsArrayMixed(Object[] a) {
		if(a==null)
			return null;
		JsArrayMixed jsa = JsArrayMixed.createArray().cast();
		for (int i = 0; i < a.length; i++) {
			Object val = a[i];
			if(val instanceof String) {
				jsa.push(((String)val));
			}
			else if(val instanceof Boolean) {
				jsa.push((((Boolean)val)));
			}
			else if(val instanceof Integer) {
				jsa.push((((Integer)val)));
			}
			else if(val instanceof Double) {
				jsa.push((((Double)val)));
			}
			else if(val instanceof Float) {
				jsa.push((((Float)val)));
			}
			else if(val instanceof JavaScriptObject) {
				jsa.push((((JavaScriptObject)val)));
			}
		}
		return jsa;
	}
	
	
	public static JsArray toJsArray(JavaScriptObject[] ja) {
		if(ja==null)
			return null;
		JsArray jsa = (JsArray) JsArray.createArray();
		for(JavaScriptObject t : ja) {
			jsa.push(t);
		}
		return jsa;
	}
//	public static JavaScriptObject toJsObj(Object ... params) {
//		return obj(params); 
//	}
//	
	/**
	 * builds a javascript native object using indexes  0, 2, 4, 6 as keys and 1, 3, 5, 7 as values. 
	 * Only values of native types are allowed - string, int, double, boolean. 
	 * @param ja
	 * @return
	 */
	public static JavaScriptObject obj(Object ... ja) {
		if(ja==null)
			return null;
		JavaScriptObject jso = JsArray.createObject();
		for (int i = 0; i < ja.length; i+=2) {
			Object val = ja[i+1]; 
			if(val instanceof Integer)
				put(jso, ja[i], ((Integer)val).intValue());
			else if(val instanceof String)
				put(jso, ja[i], ((String)val));
			else if(val instanceof Double)
				put(jso, ja[i], ((Double)val).doubleValue());
			else if(val instanceof Boolean)
				put(jso, ja[i], ((Boolean)val).booleanValue());
		}
		return jso;
	}
//	public static Object nativeValueOf(Object o) {
//		if(o instanceof Integer)
//			return ((Integer)o).intValue(); 
//		else 
//			return o; 
//	}

	public static JsArray to2DJsArray(double[][] ja) {
		JsArray jsa = (JsArray) JsArray.createArray();
		if(ja==null)
			return jsa;
		for (int i = 0; i < ja.length; i++) {
			jsa.push(toJsArrayDouble(ja[i]));
		}
		return jsa;
	}
	public static JsArray to2DJsArray(String[][] ja) {
		JsArray jsa = (JsArray) JsArray.createArray();
		if(ja==null)
			return jsa;
		for (int i = 0; i < ja.length; i++) {
			jsa.push(toJsArrayString(ja[i]));
		}
		return jsa;
	}
	public final native static void putBoolean(JavaScriptObject o, String prop,
			boolean b)/*-{
		if(b) {
//			$wnd.alert("putBoolean: "+prop+" - true");
			o[prop]=true;
		}
		else {
//			$wnd.alert("putBoolean: "+prop+" - false");
			o[prop]=false;
		}
		
	}-*/;
	public final native static void putNumber(JavaScriptObject o, String prop, 
			double v) /*-{
		o[prop]=v;
	}-*/;


	public static double[] toJavaDoubleArray(JsArrayNumber a) {
		if(a==null)return null;
		double[] dd = new double[a.length()];
		for (int i = 0; i < dd.length; i++) {
			dd[i]=a.get(i);
		}
		return dd;
	}
	public static String[] toJavaStringArray(JsArrayString a) {
		if(a==null)return null;
		String[] dd = new String[a.length()];
		for (int i = 0; i < dd.length; i++) {
			dd[i]=a.get(i);
		}
		return dd;
	}
	
	public static final native <T> Collection<T> toJavaCollection(JavaScriptObject array)/*-{
		return @org.sgx.jsutil.client.JsArrayCollection::create(Lcom/google/gwt/core/client/JavaScriptObject;)(array); 
	}-*/;
 
//	public static String dump(JavaScriptObject o) {
//		String s = "(";
////		o.
//		return s+")";
//	}

	public static native JavaScriptObject evalObject(String s)/*-{
		return $wnd.eval("("+s+")");
	}-*/;

	public static String print(JsArrayMixed a) {
		String s = "JSArray[";
		for(int i = 0; i<a.length(); i++) {
			s+=a.getString(i)+", ";
		}
		return s+"]";
	}

	public static String print(NativeEvent e) {
		return "Event "+e.getType()+"("+e.getScreenX()+", "+e.getScreenY()+")"; 
	}

	public static native final void arrayRemoveItem(JsArray<?> a, int i)/*-{
		a.splice(i, 1)
	}-*/;

	public static native double getDouble(JavaScriptObject o, String p)/*-{
		return o[p]; 
	}-*/;

	public static native final String dumpObj(JavaScriptObject obj, boolean printValues)/*-{
		var s = "{"; 
		for(var i in obj) {
			s+=i+(printValues ? ": "+obj[i] : "")+", "; 
		}
		return s+"}"; 
	}-*/;
	public static native final String dumpObjPrintTypes(JavaScriptObject obj)/*-{
		var s = "{"; 
		for(var i in obj) {
			s+=i+" "+typeof(obj[i])+", "; 
		}
		return s+"}"; 
	}-*/;
	public static final String dumpObj(JavaScriptObject obj) {
		return dumpObj(obj, false); 
	}
//	public static void dumpArr(StringBuffer sb, JsArray a, boolean printValues) {
//		for (int i = 0; i < a.length(); i++) {
//			sb.append(dumpObj(a.get(i), printValues)); 
//		}
//	}
	
//	public static final native String dumpAny(JavaScriptObject arr, boolean printValues)/*-{
//		function dump(arr,level) {
//		var dumped_text = "";
//		if(!level) level = 0;
//
//		//The padding given at the beginning of the line.
//		var level_padding = "";
//		for(var j=0;j<level+1;j++) level_padding += "    ";
//
//		if(typeof(arr) == 'object') { //Array/Hashes/Objects
//		 for(var item in arr) {
//		  var value = arr[item];
//		 
//		  if(typeof(value) == 'object') { //If it is an array,
//		   dumped_text += level_padding + "'" + item + "' ...\n";
//		   dumped_text += dump(value,level+1);
//		  } else {
//		   dumped_text += level_padding + "'" + item + "' => \"" + value + "\"\n";
//		  }
//		 }
//		} else { //Stings/Chars/Numbers etc.
//		 dumped_text = "===>"+arr+"<===("+typeof(arr)+")";
//		}
//		return dumped_text;
//		} 
//	}-*/;

	
	
	
//	public static String dumpArr(JavaScriptObject arr, boolean printValues) {
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < a.length(); i++) {
//			if(isObj(a.getObject(i)))
//				sb.append(dumpObj(a.getObject(i), printValues));
//			else
//				sb.append(a.getString(i));
//			sb.append(", "); 
//		}
//		return "["+sb.toString()+"]"; 
//	}
//	public static final native boolean isObj(JavaScriptObject o)/*-{
////		$wnd.alert(typeof(o)); 
//		return typeof(o)=="object"; 
//	}-*/;


	public static String dumpArr(JsArray a) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length(); i++) {
			sb.append(dumpObj(a.get(i)));
			sb.append(", "); 
		}
		return "["+sb.toString()+"]"; 
	}
	public static String dumpArr(JsArrayString a) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length(); i++) {
			sb.append(a.get(i));
			sb.append(", "); 
		}
		return "["+sb.toString()+"]"; 
	}
	public static native final JavaScriptObject cloneObject(JavaScriptObject o)/*-{
		var o2 = {}; 
		for(var i in o) {
			o2[i]=o[i]; 
		}
		return o2; 
	}-*/;
	
	public static native final JavaScriptObject eval(String s)/*-{
		try {
		return $wnd.eval(s);
		}catch(ex) {
			return null; 
		} 
	}-*/;


//	public static native final JsDate toJsDate(DataTypeDate val) /*-{
//    	return new $wnd.Date();//val.@java.util.Date::getTime()());
//    }-*/;
//	
//	public static native final JsDate toJsDate(DataTypeDate val) /*-{
//		return new $wnd.Date();//val.@java.util.Date::getTime()());
//	}-*/;
	
	
//	public static Object[] arrayRemoveLast(Object[]o) {
//		Object [] ret = new Object[o.length-1]; 
//		for (int i = 0; i < o.length-1; i++) {
//			ret[i]=o[i];
//		}
//		return ret; 
////		return Arrays.copyOf(o, o.length-1); 
//	}
//	public static JsArrayString arrayRemoveLast(String[]o) {
////		return Arrays.copyOf(o, o.length-1);  don't work in gwt... 
//		Object [] ret = new Object[o.length-1]; 
//		for (int i = 0; i < o.length-1; i++) {
//			ret[i]=o[i];
//		}
//		return toJsArray()ret; 
//	}

	public static native final String typeof(Object o)/*-{
		return (typeof(o)); 
	}-*/;

	public static native final Window window()/*-{
		return $wnd; 
	}-*/;

	/**
	 * calls a function or evaluates an expression after a specified number of milliseconds.
	 * @param ms
	 * @param callback
	 * @return a handle object that can be used later in clearTimeout()
	 */
	public static native final int setTimeout(SimpleCallback callback, int ms)/*-{
		var f = $entry(function(){
			return callback.@org.sgx.jsutil.client.SimpleCallback::call()(); 
		}); 
		return $wnd.setTimeout(f, ms); 
	}-*/;
	/**
	 * clears a timeout function caller. 
	 * @param handle must be an obejct previously returned by setTimeout()
	 */
	public static native final void clearTimeout(int handle)/*-{		
		return $wnd.clearTimeout(handle); 
	}-*/;
	/**
	 * 
	 * @param ms interval duration in ms
	 * @param callback 
	 * @return
	 */
	public static native final int setInterval(SimpleCallback callback, int ms)/*-{
		var f = $entry(function(){
			return callback.@org.sgx.jsutil.client.SimpleCallback::call()(); 
		}); 
		return $wnd.setInterval(f, ms); 
	}-*/;
	/**
	 * clears a interval function caller. 
	 * @param handle must be an obejct previously returned by setInterval()
	 */
	public static native final void clearInterval(int handle)/*-{		
		return $wnd.clearInterval(handle); 
	}-*/;
	
//	public static final native JsArray
	
	public static final native <T extends JavaScriptObject> JsArray<T> jsArray(T... t)/*-{
		return @org.sgx.jsutil.client.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(t); 
	}-*/;
	
	public static final native JavaScriptObject toJsFunction(SimpleCallback c)/*-{
		return $entry(function(){
			return c.@org.sgx.jsutil.client.SimpleCallback::call()(); 
		}); 
//		return @org.sgx.gapi.client.apis.fusiontables.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(t); 
	}-*/;
	
	public static final native JsFunction toJsFunction(Callback c)/*-{
		return $entry(function(){
			return c.@org.sgx.jsutil.client.Callback::call(Lcom/google/gwt/core/client/JsArrayMixed;)(arguments); 
		}); 
	//	return @org.sgx.gapi.client.apis.fusiontables.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(t); 
	}-*/;
	
//	public static final native JsFunction toJsFunction(CallbackString c)/*-{
//		return $entry(function(){
//			return c.@org.sgx.jsutil.client.CallbackString::call(Lcom/google/gwt/core/client/JsArrayMixed;)(arguments);  
//		}); 
//	//	return @org.sgx.gapi.client.apis.fusiontables.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(t); 
//	}-*/;
//	
//	public static final native JsFunction toJsFunction(CallbackObject c)/*-{
//		return $entry(function(){
//			return c.@org.sgx.jsutil.client.CallbackObject::call(Lcom/google/gwt/core/client/JsArrayMixed;)(arguments);   
//		}); 
//	//	return @org.sgx.gapi.client.apis.fusiontables.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(t); 
//	}-*/;
	
	public static final native JsFunction toJsFunction(AbstractCallback c)/*-{
		return $entry(function(){
			return c.@org.sgx.jsutil.client.AbstractCallback::call(*)(arguments);    
		}); 
	//	return @org.sgx.gapi.client.apis.fusiontables.JsUtil::toJsArray([Lcom/google/gwt/core/client/JavaScriptObject;)(t); 
	}-*/;
	
	/**
	 * convert a java Callback[] to a javscript array of functions - each corresponding to given callback.
	 * @param c
	 * @return
	 */
	public static final JsArray<JsFunction> toJsFunction(Callback[] c) {
		JsArray<JsFunction> arr = JsArray.createArray().cast();
		for (int i = 0; i < c.length; i++) {
			arr.push(toJsFunction(c[i])); 
		}
		return arr; 
	}

	public static Object print(Object[] tags) {
		String s = ""; 
		for (int i = 0; i < tags.length; i++) {
			s+=tags[i];
			if(i<tags.length-1)
				s+=","; 
		}
		return s; 
	}
	/**
	<pre>function MyClass(config) {
        // Invoke Base constructor, passing through arguments
        MyClass.superclass.constructor.apply(this, arguments);
    }</pre>
	 * @return
	 */
	public static final native JsFunction buildJsFunctionConstructor(String className)/*-{
		var fstr =  className+".superclass.constructor.apply(this, arguments);"; 
		var f =  new Function("a",fstr);
		return f;
	}-*/;
	
	/**
	 * call a function like if it were a class constructor, like
	<pre>return new f(args);</pre>
	 * @return
	 */
	public static final native JsFunction jsFunctionConstruct(JsFunction f, JsArrayMixed args)/*-{
		return new f(args); 
	}-*/;

	public static final native String encodeURI(String s)/*-{
		return $wnd.encodeURI(s); 
	}-*/;
	public static final native String encodeURIComponent(String s)/*-{
		return $wnd.encodeURIComponent(s); 
	}-*/;
	public static final native String escape(String s)/*-{
		return $wnd.escape(s); 
	}-*/;
	

public static final native JsArrayString stringSplit(String result, String sep)/*-{
	return result.split(sep); 
}-*/;
public static native final void arrayRemoveItem(JsArrayString a, int i)/*-{
	a.splice(i, 1); 
}-*/;
public static native final void arrayRemoveItem(JsArrayString a, String s)/*-{
	for(var i = 0; i<a.length; i++) {
		if(a[i]==s)
			a.splice(i, 1); 
	}
}-*/;
public static <T extends JavaScriptObject> void arrayRemoveItem(JsArray<T> a, T as, Comparator<T> comp) {
	for (int i = 0; i < a.length(); i++) {
		if(comp.compare(a.get(i), as)==0) {
			arrayRemoveItem(a, i); 
		}
	}
}

public static String dump(Object[] els) {
	String s = "[";
	for (int i = 0; i < els.length; i++) {
		s+=els[i]+",";
	}
	return s + "]"; 
}
public static native final boolean isArray(JavaScriptObject o)/*-{ 
	return $wnd.Object.prototype.toString.call( o ) === '[object Array]' ; 
}-*/;
}
