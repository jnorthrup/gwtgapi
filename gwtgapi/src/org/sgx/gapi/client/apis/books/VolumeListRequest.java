package org.sgx.gapi.client.apis.books;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.gapi.client.util.GAPIUtil;
import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/translate/v2/using_rest
 * @author sg
 * 
 */
public class VolumeListRequest implements GAPIRequest<VolumeList> {

	/**
	 * Full-text search query string.
	 */
	private String q;

	/**
	 * Restrict to volumes by download availability.
	 * 
	 * Acceptable values are:
	 * 
	 * "epub" - All volumes with epub.
	 */
	String download;

	/**
	 * Filter search results.
	 * 
	 * <br>
	 * <br>
	 * Acceptable values are:
	 * <ul>
	 * <li>"<code>ebooks</code>" - All Google eBooks.</li>
	 * <li>"<code>free-ebooks</code>" - Google eBook with full volume text viewability.</li>
	 * <li>"<code>full</code>" - Public can view entire volume text.</li>
	 * <li>"<code>paid-ebooks</code>" - Google eBook with a price.</li>
	 * <li>"<code>partial</code>" - Public able to see parts of text.</li>
	 * </ul>
	 */
	String filter;

	/**
	 * Restrict results to books with this language code.
	 */
	String langRestrict;
	/**
	 * Restrict search to this user's library.
	 * 
	 * Acceptable values are:
	 * 
	 * "my-library" - Restrict to the user's library, any shelf. - "no-restrict" - Do not restrict based on user's library.
	 */
	String libraryRestrict;

	/**
	 * Maximum number of results to return. Acceptable values are 0 to 40, inclusive.
	 */
	int maxResults = -1;

	/**
	 * Sort search results.
	 * 
	 * <br>
	 * <br>
	 * Acceptable values are:
	 * <ul>
	 * <li>"<code>newest</code>" - Most recently published.</li>
	 * <li>"<code>relevance</code>" - Relevance to search terms.</li>
	 * </ul>
	 */
	String orderBy;

	/**
	 * Restrict and brand results for partner ID.
	 */
	String partner;

	/**
	 * Restrict to books or magazines.
	 * 
	 * <br>
	 * <br>
	 * Acceptable values are:
	 * <ul>
	 * <li>"<code>all</code>" - All volume content types.</li>
	 * <li>"<code>books</code>" - Just books.</li>
	 * <li>"<code>magazines</code>" - Just magazines.</li>
	 * </ul>
	 */
	String printType;

	/**
	 * Restrict information returned to a set of selected fields.
	 * 
	 * <br>
	 * <br>
	 * Acceptable values are:
	 * <ul>
	 * <li>"<code>full</code>" - Includes all volume data.</li>
	 * <li>"<code>lite</code>" - Includes a subset of fields in volumeInfo and accessInfo.</li>
	 * </ul>
	 */
	String projection;

	/**
	 * Set to true to show books available for preorder. Defaults to false.
	 */
	boolean showPreorders;

	/**
	 * String to identify the originator of this request.
	 */
	String source;

	/**
	 * Index of the first result to return (starts at 0)
	 */
	int startIndex = -1;

	public VolumeListRequest(String q) {
		super();
		this.q = q;
	}

	@Override
	public void execute(final GAPICallback<VolumeList> c) {
		JsObject params = JsObject.createObject().cast();
		GAPIUtil.paramPut(params, "q", q);
		GAPIUtil.paramPut(params, "download", download);
		GAPIUtil.paramPut(params, "filter", filter);
		GAPIUtil.paramPut(params, "langRestrict", langRestrict);
		GAPIUtil.paramPut(params, "libraryRestrict", libraryRestrict);
		GAPIUtil.paramPut(params, "maxResults", maxResults, -1);
		GAPIUtil.paramPut(params, "orderBy", orderBy);
		GAPIUtil.paramPut(params, "partner", partner);
		GAPIUtil.paramPut(params, "printType", printType);
		GAPIUtil.paramPut(params, "projection", projection);
		GAPIUtil.paramPut(params, "showPreorders", showPreorders);
		GAPIUtil.paramPut(params, "source", source);
		GAPIUtil.paramPut(params, "startIndex", startIndex, -1);

		ClientRequest clientReq = ClientRequest.create().path("/books/v1/volumes").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {
			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((VolumeList) jsonResp);
			}
		});
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getDownload() {
		return download;
	}

	public void setDownload(String download) {
		this.download = download;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getLangRestrict() {
		return langRestrict;
	}

	public void setLangRestrict(String langRestrict) {
		this.langRestrict = langRestrict;
	}

	public String getLibraryRestrict() {
		return libraryRestrict;
	}

	public void setLibraryRestrict(String libraryRestrict) {
		this.libraryRestrict = libraryRestrict;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getPrintType() {
		return printType;
	}

	public void setPrintType(String printType) {
		this.printType = printType;
	}

	public String getProjection() {
		return projection;
	}

	public void setProjection(String projection) {
		this.projection = projection;
	}

	public boolean isShowPreorders() {
		return showPreorders;
	}

	public void setShowPreorders(boolean showPreorders) {
		this.showPreorders = showPreorders;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

}
