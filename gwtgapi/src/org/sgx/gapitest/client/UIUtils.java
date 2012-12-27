package org.sgx.gapitest.client;

import java.util.LinkedList;
import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
/**
 * 
 * @author sg
 *
 */
public class UIUtils {

	public static String formLabelWidth="120px";
	public static void installWindowHeightUpdater(final Widget w, final int bottomMargin) {
		
		Window.addResizeHandler(new ResizeHandler() {
			
			@Override
			public void onResize(ResizeEvent event) {
				w.setHeight((event.getHeight()-bottomMargin)+"px"); 
			}
		}); 
	}

	public static void setWindowHeight(final Widget w, final int bottomMargin) {
		w.setHeight((Window.getClientHeight()-bottomMargin)+"px"); 
	}
	/**
	 * common method for dispatching rpc / services exceptions
	 * @param t
	 */
	public static void dispatchRPCError(Throwable t) {
		dispatchRPCError("RPC Error - Fail to comunicate with server: ", t);		
	}

	public static void dispatchRPCError(String msg, Throwable t) {
//		showMessageDialog1(msg);
		com.google.gwt.user.client.Window.alert(msg+" "+t.getLocalizedMessage());
//		if(Util.isDebug())
//			t.printStackTrace();
	}

	public static interface TextEntryDialogListener {
		void notifyAccept(String text, DialogBox db);
		void notifyCancel(String text, DialogBox db);		 
	}
	public static abstract class TextEntryDialogAcceptListener
		implements TextEntryDialogListener {
		
		public abstract void notifyAccept(String text, DialogBox db);
		public void notifyCancel(String text, DialogBox db){};		
	}
	public static void openTextEntryDialog(String title, String text, 
			final TextEntryDialogListener l) {
		VerticalPanel p = new VerticalPanel();
		final DialogBox db = new DialogBox();
		db.add(p);
		p.add(new Label("Enter the text. Use \\n for new lines"));
		final TextArea ta = new TextArea();
		ta.setSize("100%", "200px");
		p.add(ta);
		FlowPanel fp = new FlowPanel();
		p.add(fp);
		fp.add(new Button("Accept", new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				l.notifyAccept(ta.getText(), db);
			}
		}));
		fp.add(new Button("Cancel", new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				db.hide();
				l.notifyCancel(ta.getText(), db);
			}
		}));
		showDialogBox(db);
	}
	/**
	 * common method for dispatching rpc / services exceptions
	 * @param msg 
	 * @param t
	 */
	public static void dispatchServiceError(String msg, Exception t) {
		String s = "Service Error: "+msg+" - "+t.getMessage()+" - "+t;
		Window.alert(s);
//		if(Util.isDebug())
//			t.printStackTrace();
	}

	
	
	
	
	//dialogs
	
	public static DialogBox createDialogBox(String title, Widget content) {
		DialogBox box = new DialogBox();
		box.setText(title); 		
		VerticalPanel p = new VerticalPanel();
		p.add(content);
		box.add(p);
		return box;
	}	

	public static void showMessage(String title, String msg) {
		VerticalPanel p = new VerticalPanel();		
		p.add(new Label(msg));
		Button  b = new Button("OK");
		p.add(b);	
		final DialogBox d = createDialogBox(title, p);
		b.addClickHandler(new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				d.hide();
			}
		});
		showDialogBox(d);		
	}
	public static void showText(String title, String txt) {
		VerticalPanel p = new VerticalPanel();
		TextArea ta = new TextArea();
		ta.setText(txt);
		ta.setSize("100%", "100%");
		p.add(ta);
		Button  b = new Button("OK");
		p.add(b);	
		final DialogBox d = createDialogBox(title, p);
		b.addClickHandler(new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				d.hide();
			}
		});
		ta.setSize("600px", (getMaxHeight()-200)+"px");
		showDialogBox(d);		
	}
	public static void showDialogBox(DialogBox d) {
		d.setAnimationEnabled(true);
		d.setGlassEnabled(true);
		d.center();
		d.show();
	}

	public static void showErrorMessage(String title, String s) {
		showMessage(title, s);
	}
	public static void showErrorMessage(String title, Exception e) {
		showErrorMessage(title, e.getMessage());
	}
//	private static GWTCAlert showMessageDialog1Alert=null;
//	public static void showMessageDialog1(String msg) {
//		if(showMessageDialog1Alert==null) {
//			showMessageDialog1Alert=new GWTCAlert();
//		}
//		showMessageDialog1Alert.alert(msg);
//	}
	
	
	//misc gui utils
	
	public static List<String> getSelectedTexts(ListBox l) {
		List<String> labels = new LinkedList<String>();
		for (int i = 0; i < l.getItemCount(); i++) {
			if(l.isItemSelected(i))
				labels.add(l.getItemText(i));
		}
		return labels;
	}

	public static int getMaxHeight() {
		return (Window.getClientHeight()-20);
	}
	public static String getMaxHeightStr() {
		return getMaxHeight()+"px";
	}

	

	

}
