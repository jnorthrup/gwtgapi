package org.sgx.gapitest.client;

public class GAPITestConstants {

	public static boolean isDevel = true;

	public static String DEVEL_CLIENT_ID = "1081991926563-e64k9pb3cnmqqpegegaj85kim22vk0np.apps.googleusercontent.com";
	public static String DEVEL_API_KEY = "AIzaSyAeX11OLg0zyBDlpYr2lqs4POPEjyWrooY";

	public static String PROD_CLIENT_ID =			
			"1081991926563-q303ol8t441h5ptap8peu9kdt294a2tq.apps.googleusercontent.com"; // cancerbero.freevar.com
//			"1081991926563-klu3mb1snupl8ei4ja4tiii21jgdeok7.apps.googleusercontent.com"; //http://cancerbero.vacau.com
//			"1081991926563-mmn6g2huhbplqtvi24m32gm1uun727d3.apps.googleusercontent.com"; //cancerbero.mbarreneche.com
	
	public static String PROD_API_KEY = "AIzaSyAeX11OLg0zyBDlpYr2lqs4POPEjyWrooY";

	public static String CLIENT_ID = DEVEL_CLIENT_ID;
	public static String API_KEY = DEVEL_API_KEY;

	static {
		if (!isDevel) {
			CLIENT_ID = PROD_CLIENT_ID;
			API_KEY = PROD_API_KEY;
		}
	}

}
