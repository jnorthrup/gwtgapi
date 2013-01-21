package org.sgx.jsutil.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;

public class DOMUtil {

	public static interface ClickHandler {
		void onClick(Event event);
	}
	public static void addClickHandler(Element e, final ClickHandler handler) {
		addClickHandler(e, handler, false); 
	}
	public static void addClickHandler(Element e, final ClickHandler handler, final boolean preventDefault) {
		DOM.sinkEvents((com.google.gwt.user.client.Element) e, Event.ONCLICK);
		DOM.setEventListener((com.google.gwt.user.client.Element) e, new EventListener() {
			@Override
			public void onBrowserEvent(Event event) {
				if(preventDefault)
					event.preventDefault(); 
				handler.onClick(event);
			}
		});
	}

	public static void clear(Element e) {
			while(e.getLastChild()!=null)
				e.removeChild(e.getLastChild());
	//		NodeList<Node> childs = e.getChildNodes();
	//		for (int i = 0; i < childs.getLength(); i++) {
	//			e.removeChild(childs.getItem(i));
	//		}
		}

}
