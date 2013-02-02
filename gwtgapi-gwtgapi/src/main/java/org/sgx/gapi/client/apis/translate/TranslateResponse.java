package org.sgx.gapi.client.apis.translate;

import java.util.Collection;

import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.jsutil.client.JsObject;

import com.google.gwt.core.client.JsArray;

/**
 * 
 * @author sg
 * 
 */
public class TranslateResponse extends GAPIResult {
	protected TranslateResponse() {
	}

	public static class Data extends JsObject {
		protected Data() {
		}

		/**
		 * 
		 * @return
		 */
		public native final JsArray<Translation> translations() /*-{
			return this["translations"];
		}-*/;

		/**
		 * 
		 * @return
		 */
		public native final Collection<Translation> translationsCol() /*-{
			return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["translations"]);
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final TranslateResponse.Data translations(JsArray<Translation> val) /*-{
			this["translations"] = val;
			return this;
		}-*/;
	}

	public static class Translation extends JsObject {
		protected Translation() {
		}

		/**
		 * 
		 * @return
		 */
		public native final String translatedText() /*-{
			return this["translatedText"];
		}-*/;

		/**
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final TranslateResponse.Translation translatedText(String val) /*-{
			this["translatedText"] = val;
			return this;
		}-*/;
	}

	/**
	 * 
	 * @return
	 */
	public native final Data data() /*-{
		return this["data"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TranslateResponse data(Data val) /*-{
		this["data"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final String detectedSourceLanguage() /*-{
		return this["detectedSourceLanguage"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final TranslateResponse detectedSourceLanguage(String val) /*-{
		this["detectedSourceLanguage"] = val;
		return this;
	}-*/;
}
