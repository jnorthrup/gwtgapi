package org.sgx.jsutil.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Overlay Type for native JavaScript Regular expression objects (RegExp).
 * 
 * <p>
 * A regular expression is an object that describes a pattern of characters.
 * </p>
 * 
 * <p>
 * Regular expressions are used to perform pattern-matching and "search-and-replace" functions on text.
 * </p>
 * 
 * @see http://www.w3schools.com/jsref/jsref_obj_regexp.asp
 * @see https://developer.mozilla.org/en-US/docs/JavaScript/Reference/Global_Objects/RegExp
 * @author sg
 * 
 */
public class JsRegExp extends JavaScriptObject {
	protected JsRegExp() {
	}

	/**
	 * it will return a new RegExp object pattern/modifiers.
	 * 
	 * Example:
	 * 
	 * <pre>
	 * JsRegExp r1 = JsRegExp.create(&quot;europe&quot;, &quot;i&quot;); // r1 = /europe/i
	 * </pre>
	 * 
	 * @return a new RegExp object
	 * 
	 * @param pattern
	 * @param modifiers
	 * @return
	 */
	public static final native JsRegExp create(String pattern, String modifiers)/*-{
		return new $wnd.RegExp(pattern, modifiers);
	}-*/;

	/**
	 * Example:
	 * 
	 * <pre>
	 * JsRegExp r1 = JsRegExp.create(&quot;/europe/i&quot;); // r1 = /europe/i
	 * </pre>
	 * 
	 * @return a new RegExp object
	 */
	public static final native JsRegExp create(String regExpStr)/*-{
		return $wnd.eval(regExpStr);
	}-*/;

	/**
	 * Whether to test the regular expression against all possible matches in a string, or only against the first.
	 * 
	 * <p>
	 * global is a property of an individual regular expression object.
	 * </p>
	 * 
	 * <p>
	 * The value of global is true if the "g" flag was used; otherwise, false. The "g" flag indicates that the regular expression should be tested against all possible matches in a
	 * string.
	 * </p>
	 * 
	 * <p>
	 * You cannot change this property directly.
	 * </p>
	 * 
	 * @return
	 */
	public native final boolean global() /*-{
		return this.global;
	}-*/;

	// /**
	// * Whether to test the regular expression against all possible matches in a string, or only against the first.
	// *
	// * <p>global is a property of an individual regular expression object.</p>
	//
	// <p>The value of global is true if the "g" flag was used; otherwise, false. The "g" flag indicates that the regular expression should be tested against all possible matches
	// in a string.</p>
	//
	// <p>You cannot change this property directly. </p>
	//
	//
	// * @param val
	// * @return this - for setter chaining
	// */
	// public native final JsRegExp global(boolean val) /*-{
	// this.global = val;
	// return this;
	// }-*/;

	/**
	 * Whether to ignore case while attempting a match in a string.
	 * 
	 * <p>
	 * ignoreCase is a property of an individual regular expression object.
	 * </p>
	 * 
	 * <p>
	 * The value of ignoreCase is true if the "i" flag was used; otherwise, false. The "i" flag indicates that case should be ignored while attempting a match in a string.
	 * </p>
	 * 
	 * <p>
	 * You cannot change this property directly.
	 * </p>
	 * 
	 * @return
	 */
	public native final boolean ignoreCase() /*-{
		return this.ignoreCase;
	}-*/;

	/**
	 * The index at which to start the next match.
	 * 
	 * <p>
	 * <code>lastIndex</code> is a property of an individual regular expression object.
	 * </p>
	 * <p>
	 * This property is set only if the regular expression used the "<code>g</code>" flag to indicate a global search. The following rules apply:
	 * </p>
	 * <ul>
	 * <li>If <code>lastIndex</code> is greater than the length of the string, <code>regexp.test</code> and <code>regexp.exec</code> fail, and <code>lastIndex</code> is set to 0.</li>
	 * </ul>
	 * <ul>
	 * <li>If <code>lastIndex</code> is equal to the length of the string and if the regular expression matches the empty string, then the regular expression matches input starting
	 * at <code>lastIndex</code>.</li>
	 * </ul>
	 * <ul>
	 * <li>If <code>lastIndex</code> is equal to the length of the string and if the regular expression does not match the empty string, then the regular expression mismatches
	 * input, and <code>lastIndex</code> is reset to 0.</li>
	 * </ul>
	 * <ul>
	 * <li>Otherwise, <code>lastIndex</code> is set to the next position following the most recent match.</li>
	 * </ul>
	 * <p>
	 * For example, consider the following sequence of statements:
	 * </p>
	 * <dl>
	 * <dt> <code>re = /(hi)?/g</code>&nbsp;</dt>
	 * <dd>Matches the empty string.</dd>
	 * </dl>
	 * <dl>
	 * <dt> <code>re("hi")</code>&nbsp;</dt>
	 * <dd>Returns <code>["hi", "hi"]</code> with <code>lastIndex</code> equal to 2.</dd>
	 * </dl>
	 * <dl>
	 * <dt> <code>re("hi")</code>&nbsp;</dt>
	 * <dd>Returns <code>[""]</code>, an empty array whose zeroth element is the match string. In this case, the empty string because <code>lastIndex</code> was 2 (and still is 2)
	 * and "<code>hi</code>" has length 2.</dd>
	 * </dl>
	 * 
	 * @return
	 */
	public native final int lastIndex() /*-{
		return this.lastIndex;
	}-*/;

	/**
	 * Whether or not to search in strings across multiple lines.
	 * 
	 * <p>
	 * multiline is a property of an individual regular expression object.
	 * </p>
	 * 
	 * <p>
	 * The value of multiline is true if the "m" flag was used; otherwise, false. The "m" flag indicates that a multiline input string should be treated as multiple lines. For
	 * example, if "m" is used, "^" and "$" change from matching at only the start or end of the entire string to the start or end of any line within the string.
	 * </p>
	 * 
	 * <p>
	 * You cannot change this property directly.
	 * </p>
	 * 
	 * @return
	 */
	public native final boolean multiline() /*-{
		return this.multiline;
	}-*/;

	/**
	 * A read-only property that contains the text of the pattern, excluding the forward slashes.
	 * <p>
	 * source is a property of an individual regular expression object.
	 * </p>
	 * 
	 * You cannot change this property directly.
	 * 
	 * @return
	 */
	public native final String source() /*-{
		return this.source;
	}-*/;

	// methods

	/**
	 * The compile() method is used to compile a regular expression during execution of a script.
	 * 
	 * <p>
	 * The compile() method can also be used to change and recompile a regular expression.
	 * </p>
	 * 
	 * @param regexp
	 *            A regular expression
	 * @param modifier
	 *            Specifies the type of matching. "g" for a global match, "i" for a case-insensitive match and "gi" for a global, case-insensitive match
	 */
	public native final void compile(JsRegExp regexp, String modifier) /*-{
		this.compile(regexp, modifier);
	}-*/;

	/**
	 * The exec() method tests for a match in a string.
	 * 
	 * <p>
	 * This method returns the matched text if it finds a match, otherwise it returns null.
	 * </p>
	 * 
	 * @param s
	 *            The string to be searched
	 * @return the matched text if it finds a match, otherwise it returns null.
	 */
	public native final JsArrayString exec(String s) /*-{
		return this.exec(s);
	}-*/;

	/**
	 * tests for a match in a string.
	 * 
	 * @param s
	 *            The string to be searched
	 * @return true if it finds a match, otherwise it returns false.
	 */
	public native final boolean test(String s) /*-{
		return this.test(s);
	}-*/;
}
