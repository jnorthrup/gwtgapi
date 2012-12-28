package org.sgx.gapi.client.apis.translate;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/translate/v2/using_rest
 * @author sg
 * 
 */
public class TranslateRequest implements GAPIRequest<TranslateResponse> {
	/**
	 * source language. Example "en"
	 */
	String source;
	/**
	 * target language. Example "de"
	 */
	String target;

	/**
	 * the string to translate
	 */
	String q;

	/**
	 * 
	 This optional parameter allows you to indicate that the text to be translated is either plain-text or HTML. A value of html indicates HTML and a value of text indicates
	 * plain-text. Default: format=html.
	 */
	String format = "html";

	boolean prettyprint = true;

	public TranslateRequest(String source, String target, String q) {
		super();
		this.source = source;
		this.target = target;
		this.q = q;
	}

	@Override
	public void execute(final GAPICallback<TranslateResponse> c) {
		JsObject params = JsObject.createObject().cast();
		params.objPut("q", q);
		params.objPut("source", source);
		params.objPut("target", target);
		ClientRequest clientReq = ClientRequest.create().path("/translate/v2").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((TranslateResponse) jsonResp);
			}
		});
	}

	/**
	 * the source lang
	 * 
	 * @return
	 */
	public String getSource() {
		return source;
	}

	/**
	 * the source lang
	 * 
	 * @param source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * the target language
	 * 
	 * @return
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * the target language
	 * 
	 * @param target
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	/**
	 * the string to translate
	 * 
	 * @return
	 */
	public String getQ() {
		return q;
	}

	/**
	 * the string to translate
	 * 
	 * @param q
	 */
	public void setQ(String q) {
		this.q = q;
	}

	/**
	 * 
	 This optional parameter allows you to indicate that the text to be translated is either plain-text or HTML. A value of html indicates HTML and a value of text indicates
	 * plain-text. Default: format=html.
	 * 
	 * @return
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * 
	 This optional parameter allows you to indicate that the text to be translated is either plain-text or HTML. A value of html indicates HTML and a value of text indicates
	 * plain-text. Default: format=html.
	 * 
	 * @param format
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * Returns a response with indentations and line breaks.
	 * 
	 * If prettyprint=true, the results returned by the server will be human readable (pretty printed). Default: prettyprint=true.
	 * 
	 * @return
	 */
	public boolean isPrettyprint() {
		return prettyprint;
	}

	/**
	 * Returns a response with indentations and line breaks.
	 * 
	 * If prettyprint=true, the results returned by the server will be human readable (pretty printed). Default: prettyprint=true.
	 * 
	 * @param prettyprint
	 */
	public void setPrettyprint(boolean prettyprint) {
		this.prettyprint = prettyprint;
	}

}
