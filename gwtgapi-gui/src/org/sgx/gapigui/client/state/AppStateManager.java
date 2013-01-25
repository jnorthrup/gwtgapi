package org.sgx.gapigui.client.state;
/**
 * using gwt History this class let navigate to gwtgapi-gui app main states/places
 * @author sg
 *
 */
public interface AppStateManager {
	

	public static final String HISTORY_PREFIX = "page";
	
	public static final String STATE_FT_TABLES="fttables";
	public static final String STATE_FT_QUERIES = "ftqueries";  
	public static final String STATE_INTRODUCTION = "introduction";  
	
	public static final String STATE_DEFAULT=STATE_INTRODUCTION;
	
	
	
	void navigate(String name); 
	
	/**
	 * gwts the state name from url. if not state is found returns null. 
	 * @param url
	 * @return
	 */
	String urlContainsState(String url); 
}

