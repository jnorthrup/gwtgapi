package org.sgx.gapi.client.apis.customsearch;

import org.sgx.gapi.client.GAPI;
import org.sgx.gapi.client.apis.GAPICallback;
import org.sgx.gapi.client.apis.GAPIRequest;
import org.sgx.gapi.client.apis.GAPIResult;
import org.sgx.gapi.client.client.ClientRequest;
import org.sgx.gapi.client.client.ClientRequestCallback;
import org.sgx.gapi.client.client.HttpRequest;
import org.sgx.jsutil.client.JsObject;

public class CustomSearchRequest implements GAPIRequest<CustomSearchResult> {
	
	// TOOD: dateRestrict
	
	int c2coff, filter, start, num;
	
	String q, cx, alt, cref, cr, exactTerms, excludeTerms, linkSite, fileType, gl, googlehost, highRange, hl, hq,
			imgColorType, imgDominantColor, imgSize, imgType, lowRange, lr, orTerms, relatedSite, rights, safe,
			searchType, siteSearch, siteSearchFilter;
	
	boolean prettyPrint;

	public CustomSearchRequest(String cx, String q) {
		super();
		this.q = q;
		this.cx = cx;
	}

	@Override
	public void execute(final GAPICallback<CustomSearchResult> c) {
		JsObject params = JsObject.one("q", q).objPut("cx", cx).objPut("alt", "json");
		ClientRequest clientReq = ClientRequest.create().path("/customsearch/v1").params(params);
		HttpRequest req = GAPI.get().client().request(clientReq);
		req.execute(new ClientRequestCallback() {

			@Override
			public void call(GAPIResult jsonResp, String rawResp) {
				c.call((CustomSearchResult) jsonResp);
			}
		});
	}

	/**
	 * Query
	 * 
	 * The search expression.
	 * 
	 * @return
	 */
	public String getQ() {
		return q;
	}

	/**
	 * Query
	 * 
	 * The search expression.
	 * 
	 * @param q
	 */
	public void setQ(String q) {
		this.q = q;
	}

	/**
	 * The custom search engine ID to scope this search query
	 * 
	 * The unique ID for the custom search engine to use for this request (e.g., cx=000455696194071821846:reviews). If both cx and cref are supplied, the cx value is used.
	 * 
	 * @return
	 */
	public String getCx() {
		return cx;
	}

	/**
	 * The custom search engine ID to scope this search query
	 * 
	 * The unique ID for the custom search engine to use for this request (e.g., cx=000455696194071821846:reviews). If both cx and cref are supplied, the cx value is used.
	 * 
	 * @param cx
	 */
	public void setCx(String cx) {
		this.cx = cx;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	/**
	 * 
	 Returns the response in a human-readable format if true. Default value: true. When this is false, it can reduce the response payload size, which might lead to better
	 * performance in some environments.
	 * 
	 * @return
	 */
	public boolean isPrettyPrint() {
		return prettyPrint;
	}

	/**
	 * 
	 Returns the response in a human-readable format if true. Default value: true. When this is false, it can reduce the response payload size, which might lead to better
	 * performance in some environments.
	 * 
	 * @param prettyPrint
	 */
	public void setPrettyPrint(boolean prettyPrint) {
		this.prettyPrint = prettyPrint;
	}

	/**
	 * Enables or disables <a href="/custom-search/docs/xml_results#chineseSearch"> Simplified and Traditional Chinese Search</a>.
	 * <p>
	 * The default value for this parameter is 0 (zero), meaning that the feature is enabled. Supported values are:
	 * </p>
	 * 
	 * 1: Disabled<br/>
	 * 0: Enabled (default)
	 * 
	 * @return
	 */
	public int getC2coff() {
		return c2coff;
	}

	/**
	 * Enables or disables <a href="/custom-search/docs/xml_results#chineseSearch"> Simplified and Traditional Chinese Search</a>.
	 * <p>
	 * The default value for this parameter is 0 (zero), meaning that the feature is enabled. Supported values are:
	 * </p>
	 * 
	 * 1: Disabled<br/>
	 * 0: Enabled (default)
	 * 
	 * @param c2coff
	 */
	public void setC2coff(int c2coff) {
		this.c2coff = c2coff;
	}

	/**
	 * <p>
	 * Controls turning on or off the duplicate content filter.
	 * </p>
	 * The <code>filter</code> parameter activates or deactivates the automatic filtering of Google search results. See <a
	 * href="/custom-search/docs/xml_results#automaticFiltering"> Automatic Filtering</a> for more information about Google's search results filters. Note that host crowding
	 * filtering applies only to multi-site searches.</li> <li>Valid values for the parameter are:
	 * <ul>
	 * <li><code>filter=0</code> - Turns off the duplicate content filter</li>
	 * <li><code>filter=1</code> - Turns on the duplicate content filter (default)</li>
	 * </ul>
	 * </li> <li>By default, Google applies filtering to all search results to improve the quality of those results.</li>
	 * 
	 * @return
	 */
	public int getFilter() {
		return filter;
	}

	/**
	 * <p>
	 * Controls turning on or off the duplicate content filter.
	 * </p>
	 * The <code>filter</code> parameter activates or deactivates the automatic filtering of Google search results. See <a
	 * href="/custom-search/docs/xml_results#automaticFiltering"> Automatic Filtering</a> for more information about Google's search results filters. Note that host crowding
	 * filtering applies only to multi-site searches.</li> <li>Valid values for the parameter are:
	 * <ul>
	 * <li><code>filter=0</code> - Turns off the duplicate content filter</li>
	 * <li><code>filter=1</code> - Turns on the duplicate content filter (default)</li>
	 * </ul>
	 * </li> <li>By default, Google applies filtering to all search results to improve the quality of those results.</li>
	 * 
	 * @param filter
	 */
	public void setFilter(int filter) {
		this.filter = filter;
	}

	/**
	 * The index of the first result to return.
	 * 
	 * You can set the start index of the first search result returned. Valid values are integers between 1 and (101 - num). If start is not used, a value of 1 is assumed.
	 * 
	 * @return
	 */
	public int getStart() {
		return start;
	}

	/**
	 * The index of the first result to return.
	 * 
	 * You can set the start index of the first search result returned. Valid values are integers between 1 and (101 - num). If start is not used, a value of 1 is assumed.
	 * 
	 * @param start
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * Number of search results to return
	 * 
	 * You can specify the how many results to return for the current search. Valid values are integers between 1 and 10, inclusive. If num is not used, a value of 10 is assumed.
	 * 
	 * @return
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Number of search results to return
	 * 
	 * You can specify the how many results to return for the current search. Valid values are integers between 1 and 10, inclusive. If num is not used, a value of 10 is assumed.
	 * 
	 * @param num
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * The URL of a linked custom search engine
	 * 
	 * The URL of a linked custom search engine specification to use for this request (e.g., cref=http://www.google.com/cse/samples/vegetarian.xml). If both cx and cref are
	 * specified, the cx value is used.
	 * 
	 * @return
	 */
	public String getCref() {
		return cref;
	}

	/**
	 * The URL of a linked custom search engine
	 * 
	 * The URL of a linked custom search engine specification to use for this request (e.g., cref=http://www.google.com/cse/samples/vegetarian.xml). If both cx and cref are
	 * specified, the cx value is used.
	 * 
	 * @param cref
	 */
	public void setCref(String cref) {
		this.cref = cref;
	}

	/**
	 * Country restrict(s)
	 * 
	 * The cr parameter restricts search results to documents originating in a particular country. You may use Boolean operators in the cr parameter's value. Google WebSearch
	 * determines the country of a document by analyzing:<br/>
	 * the top-level domain (TLD) of the document's URL<br/>
	 * the geographic location of the Web server's IP address<br/>
	 * See the Country Parameter Values page for a list of valid values for this parameter.
	 * 
	 * @return
	 */
	public String getCr() {
		return cr;
	}

	/**
	 * Country restrict(s)
	 * 
	 * The cr parameter restricts search results to documents originating in a particular country. You may use Boolean operators in the cr parameter's value. Google WebSearch
	 * determines the country of a document by analyzing:<br/>
	 * the top-level domain (TLD) of the document's URL<br/>
	 * the geographic location of the Web server's IP address<br/>
	 * See the Country Parameter Values page for a list of valid values for this parameter.
	 * 
	 * @param cr
	 */
	public void setCr(String cr) {
		this.cr = cr;
	}

	/**
	 * Terms to include
	 * 
	 * Identifies a phrase that all documents in the search results must contain.
	 * 
	 * @return
	 */
	public String getExactTerms() {
		return exactTerms;
	}

	/**
	 * Terms to include
	 * 
	 * Identifies a phrase that all documents in the search results must contain.
	 * 
	 * @param exactTerms
	 */
	public void setExactTerms(String exactTerms) {
		this.exactTerms = exactTerms;
	}

	/**
	 * Terms to exclude
	 * 
	 * Identifies a word or phrase that should not appear in any documents in the search results.
	 * 
	 * @return
	 */
	public String getExcludeTerms() {
		return excludeTerms;
	}

	/**
	 * Terms to exclude
	 * 
	 * Identifies a word or phrase that should not appear in any documents in the search results.
	 * 
	 * @param excludeTerms
	 */
	public void setExcludeTerms(String excludeTerms) {
		this.excludeTerms = excludeTerms;
	}

	/**
	 * A specfic site.
	 * 
	 * Specifies that all search results should contain a link to a particular URL.
	 * 
	 * @return
	 */
	public String getLinkSite() {
		return linkSite;
	}

	/**
	 * A specfic site.
	 * 
	 * Specifies that all search results should contain a link to a particular URL.
	 * 
	 * @param linkSite
	 */
	public void setLinkSite(String linkSite) {
		this.linkSite = linkSite;
	}

	/**
	 * File type <td>
	 * <ul>
	 * <li>Restricts results to files of a specified extension. Filetypes supported by Google include:
	 * <ul>
	 * <li>Adobe Portable Document Format (pdf)</li>
	 * <li>Adobe PostScript (ps)</li>
	 * <li>Lotus 1-2-3 (wk1, wk2, wk3, wk4, wk5, wki, wks, wku)</li>
	 * <li>Lotus WordPro (lwp)</li>
	 * <li>Macwrite (mw)</li>
	 * <li>Microsoft Excel (xls)</li>
	 * <li>Microsoft PowerPoint (ppt)</li>
	 * <li>Microsoft Word (doc)</li>
	 * <li>Microsoft Works (wks, wps, wdb)</li>
	 * <li>Microsoft Write (wri)</li>
	 * <li>Rich Text Format (rtf)</li>
	 * <li>Shockwave Flash (swf)</li>
	 * <li>Text (ans, txt).</li>
	 * </ul>
	 * </li>
	 * <li>Additional filetypes may be added in the future. An up-to-date list can always be found in Google's <a href="http://www.google.com/help/faq_filetypes.html#what"> file
	 * type FAQ</a>.</li>
	 * 
	 * @return
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * File type <td>
	 * <ul>
	 * <li>Restricts results to files of a specified extension. Filetypes supported by Google include:
	 * <ul>
	 * <li>Adobe Portable Document Format (pdf)</li>
	 * <li>Adobe PostScript (ps)</li>
	 * <li>Lotus 1-2-3 (wk1, wk2, wk3, wk4, wk5, wki, wks, wku)</li>
	 * <li>Lotus WordPro (lwp)</li>
	 * <li>Macwrite (mw)</li>
	 * <li>Microsoft Excel (xls)</li>
	 * <li>Microsoft PowerPoint (ppt)</li>
	 * <li>Microsoft Word (doc)</li>
	 * <li>Microsoft Works (wks, wps, wdb)</li>
	 * <li>Microsoft Write (wri)</li>
	 * <li>Rich Text Format (rtf)</li>
	 * <li>Shockwave Flash (swf)</li>
	 * <li>Text (ans, txt).</li>
	 * </ul>
	 * </li>
	 * <li>Additional filetypes may be added in the future. An up-to-date list can always be found in Google's <a href="http://www.google.com/help/faq_filetypes.html#what"> file
	 * type FAQ</a>.</li>
	 * 
	 * @param fileType
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	/**
	 * Geolocation of end user
	 * 
	 * <p>
	 * The gl parameter value is a two-letter country code. The gl parameter boosts search results whose country of origin matches the parameter value. See the Country Codes page
	 * for a list of valid values.
	 * </p>
	 * Specifying a gl parameter value should lead to more relevant results. This is particularly true for international customers and, even more specifically, for customers in
	 * English- speaking countries other than the United States.
	 * 
	 * @return
	 */
	public String getGl() {
		return gl;
	}

	/**
	 * * Geolocation of end user
	 * 
	 * <p>
	 * The gl parameter value is a two-letter country code. The gl parameter boosts search results whose country of origin matches the parameter value. See the Country Codes page
	 * for a list of valid values.
	 * </p>
	 * Specifying a gl parameter value should lead to more relevant results. This is particularly true for international customers and, even more specifically, for customers in
	 * English- speaking countries other than the United States.
	 * 
	 * @param gl
	 */
	public void setGl(String gl) {
		this.gl = gl;
	}

	/**
	 * The Google domain of the search.
	 * 
	 * Specifies the Google domain (for example, google.com, google.de, or google.fr) to which the search should be limited.
	 * 
	 * @return
	 */
	public String getGooglehost() {
		return googlehost;
	}

	/**
	 * The Google domain of the search.
	 * 
	 * Specifies the Google domain (for example, google.com, google.de, or google.fr) to which the search should be limited.
	 * 
	 * @param googlehost
	 */
	public void setGooglehost(String googlehost) {
		this.googlehost = googlehost;
	}

	/**
	 * The starting value for a range
	 * 
	 * Specifies the ending value for a search range. Use lowRange and highRange to append an inclusive search range of lowRange...highRange to the query.
	 * 
	 * @return
	 */
	public String getHighRange() {
		return highRange;
	}

	/**
	 * The starting value for a range
	 * 
	 * Specifies the ending value for a search range. Use lowRange and highRange to append an inclusive search range of lowRange...highRange to the query.
	 * 
	 * @param highRange
	 */
	public void setHighRange(String highRange) {
		this.highRange = highRange;
	}

	/**
	 * <p>
	 * The interface language.
	 * </p>
	 * 
	 * 
	 * <li>Explicitly setting this parameter improves the performance and the quality of your search results.</li> <li>See the <a
	 * href="/custom-search/docs/xml_results#wsInterfaceLanguages"> Interface Languages</a> section of <a href="/custom-search/docs/xml_results#wsInternationalizing">
	 * Internationalizing Queries and Results Presentation</a> for more information, and <a href="/custom-search/docs/xml_results#interfaceLanguages"> Supported Interface
	 * Languages</a> for a list of supported languages.</li>
	 * 
	 * @return
	 */
	public String getHl() {
		return hl;
	}

	/**
	 * <p>
	 * The interface language.
	 * </p>
	 * 
	 * 
	 * <li>Explicitly setting this parameter improves the performance and the quality of your search results.</li> <li>See the <a
	 * href="/custom-search/docs/xml_results#wsInterfaceLanguages"> Interface Languages</a> section of <a href="/custom-search/docs/xml_results#wsInternationalizing">
	 * Internationalizing Queries and Results Presentation</a> for more information, and <a href="/custom-search/docs/xml_results#interfaceLanguages"> Supported Interface
	 * Languages</a> for a list of supported languages.</li>
	 * 
	 * @param hl
	 */
	public void setHl(String hl) {
		this.hl = hl;
	}

	/**
	 * Appends terms to query
	 * 
	 * Appends the specified query terms to the query, as if they were combined with a logical AND operator.
	 * 
	 * @return
	 */
	public String getHq() {
		return hq;
	}

	/**
	 * Appends terms to query
	 * 
	 * Appends the specified query terms to the query, as if they were combined with a logical AND operator.
	 * 
	 * @param hq
	 */
	public void setHq(String hq) {
		this.hq = hq;
	}

	/**
	 * Image color type Restricts results to images of a specified color type. Supported values are:
	 * 
	 * mono (black and white) - gray (grayscale) - color (color) -
	 * 
	 * @return
	 */
	public String getImgColorType() {
		return imgColorType;
	}

	/**
	 * Image color type Restricts results to images of a specified color type. Supported values are:
	 * 
	 * mono (black and white) - gray (grayscale) - color (color) -
	 * 
	 * @param imgColorType
	 */
	public void setImgColorType(String imgColorType) {
		this.imgColorType = imgColorType;
	}

	/**
	 * Restricts results to images with a specific dominant color. Supported values are:
	 * <ul>
	 * <li><code>yellow</code></li>
	 * <li><code>green</code></li>
	 * <li><code>teal</code></li>
	 * <li><code>blue</code></li>
	 * <li><code>purple</code></li>
	 * <li><code>pink</code></li>
	 * <li><code>white</code></li>
	 * <li><code>gray</code></li>
	 * <li><code>black</code></li>
	 * <li><code>brown</code>
	 * 
	 * @return
	 */
	public String getImgDominantColor() {
		return imgDominantColor;
	}

	/**
	 * Restricts results to images with a specific dominant color. Supported values are:
	 * <ul>
	 * <li><code>yellow</code></li>
	 * <li><code>green</code></li>
	 * <li><code>teal</code></li>
	 * <li><code>blue</code></li>
	 * <li><code>purple</code></li>
	 * <li><code>pink</code></li>
	 * <li><code>white</code></li>
	 * <li><code>gray</code></li>
	 * <li><code>black</code></li>
	 * <li><code>brown</code>
	 * 
	 * @param imgDominantColor
	 */
	public void setImgDominantColor(String imgDominantColor) {
		this.imgDominantColor = imgDominantColor;
	}

	/**
	 * Image size Restricts results to images of a specified size. Supported values are:
	 * 
	 * icon (small) small|medium|large|xlarge (medium) xxlarge (large) huge (extra-large)
	 * 
	 * @return
	 */
	public String getImgSize() {
		return imgSize;
	}

	/**
	 * Image size Restricts results to images of a specified size. Supported values are:
	 * 
	 * icon (small) small|medium|large|xlarge (medium) xxlarge (large) huge (extra-large)
	 * 
	 * @param imgSize
	 */
	public void setImgSize(String imgSize) {
		this.imgSize = imgSize;
	}

	/**
	 * Image type Restricts results to images of a specified type. Supported values are:
	 * 
	 * clipart (clipart) face (face) lineart (lineart) news (news) photo (photo)
	 * 
	 * @return
	 */
	public String getImgType() {
		return imgType;
	}

	/**
	 * Image type Restricts results to images of a specified type. Supported values are:
	 * 
	 * clipart (clipart) face (face) lineart (lineart) news (news) photo (photo)
	 * 
	 * @param imgType
	 */
	public void setImgType(String imgType) {
		this.imgType = imgType;
	}

	/**
	 * The starting value for a range
	 * 
	 * Specifies the starting value for a search range. Use lowRange and highRange to append an inclusive search range of lowRange...highRange to the query.
	 * 
	 * @return
	 */
	public String getLowRange() {
		return lowRange;
	}

	/**
	 * The starting value for a range
	 * 
	 * Specifies the starting value for a search range. Use lowRange and highRange to append an inclusive search range of lowRange...highRange to the query.
	 * 
	 * @param lowRange
	 */
	public void setLowRange(String lowRange) {
		this.lowRange = lowRange;
	}

	/**
	 * Language restrict
	 * 
	 * You can restrict the search to documents written in a particular language (e.g., lr=lang_ja). This list contains the permissible set of values.
	 * 
	 * @return
	 */
	public String getLr() {
		return lr;
	}

	/**
	 * Language restrict
	 * 
	 * You can restrict the search to documents written in a particular language (e.g., lr=lang_ja). This list contains the permissible set of values.
	 * 
	 * @param lr
	 */
	public void setLr(String lr) {
		this.lr = lr;
	}

	/**
	 * Additional search terms
	 * 
	 * Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms. You can also
	 * use the Boolean OR query term for this type of query.
	 * 
	 * @return
	 */
	public String getOrTerms() {
		return orTerms;
	}

	/**
	 * Additional search terms
	 * 
	 * Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional search terms. You can also
	 * use the Boolean OR query term for this type of query.
	 * 
	 * @param orTerms
	 */
	public void setOrTerms(String orTerms) {
		this.orTerms = orTerms;
	}

	/**
	 * The site to search
	 * 
	 * A URL to a page to which all search results should be related.
	 * 
	 * @return
	 */
	public String getRelatedSite() {
		return relatedSite;
	}

	/**
	 * The site to search
	 * 
	 * A URL to a page to which all search results should be related.
	 * 
	 * @param relatedSite
	 */
	public void setRelatedSite(String relatedSite) {
		this.relatedSite = relatedSite;
	}

	/**
	 * Required licensing
	 * 
	 * Filters search results based on licensing. Supported values include: cc_publicdomain cc_attribute cc_sharealike cc_noncommercial cc_nonderived
	 * 
	 * @return
	 */
	public String getRights() {
		return rights;
	}

	/**
	 * Required licensing
	 * 
	 * Filters search results based on licensing. Supported values include: cc_publicdomain cc_attribute cc_sharealike cc_noncommercial cc_nonderived
	 * 
	 * @param rights
	 */
	public void setRights(String rights) {
		this.rights = rights;
	}

	/**
	 * <p>
	 * Search safety level
	 * </p>
	 * You can specify the <a href="/custom-search/docs/xml_results#safeSearchLevels"> search safety level</a>. Possible values are:
	 * <ul>
	 * <li><code>high</code> - enables highest level of safe search filtering.</li>
	 * <li><code>medium</code> - enables moderate safe search filtering.</li>
	 * <li><code>off</code> - disables safe search filtering.</li>
	 * </ul>
	 * </li> <li>If <code>safe</code> is not specified, a value of <code>off</code> is assumed.</li>
	 * 
	 * @return
	 */
	public String getSafe() {
		return safe;
	}

	/**
	 * <p>
	 * Search safety level
	 * </p>
	 * You can specify the <a href="/custom-search/docs/xml_results#safeSearchLevels"> search safety level</a>. Possible values are:
	 * <ul>
	 * <li><code>high</code> - enables highest level of safe search filtering.</li>
	 * <li><code>medium</code> - enables moderate safe search filtering.</li>
	 * <li><code>off</code> - disables safe search filtering.</li>
	 * </ul>
	 * </li> <li>If <code>safe</code> is not specified, a value of <code>off</code> is assumed.</li>
	 * 
	 * @param safe
	 */
	public void setSafe(String safe) {
		this.safe = safe;
	}

	/**
	 * Specifies image search.
	 * 
	 * Allowed value is image. If unspecified, results are limited to webpages.
	 * 
	 * @return
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * Specifies image search.
	 * 
	 * Allowed value is image. If unspecified, results are limited to webpages.
	 * 
	 * @param searchType
	 */
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	/**
	 * The site to search
	 * 
	 * Restricts results to URLs from a specified site.
	 * 
	 * @return
	 */
	public String getSiteSearch() {
		return siteSearch;
	}

	/**
	 * The site to search
	 * 
	 * Restricts results to URLs from a specified site.
	 * 
	 * @param siteSearch
	 */
	public void setSiteSearch(String siteSearch) {
		this.siteSearch = siteSearch;
	}

	/**
	 * The site to search Specifies whether to include or exclude results from the site named in the sitesearch parameter. Supported values are:
	 * 
	 * i: include content from site - e: exclude content from site
	 * 
	 * @return
	 */
	public String getSiteSearchFilter() {
		return siteSearchFilter;
	}

	/**
	 * The site to search Specifies whether to include or exclude results from the site named in the sitesearch parameter. Supported values are:
	 * 
	 * i: include content from site - e: exclude content from site
	 * 
	 * @param siteSearchFilter
	 */
	public void setSiteSearchFilter(String siteSearchFilter) {
		this.siteSearchFilter = siteSearchFilter;
	}

}
