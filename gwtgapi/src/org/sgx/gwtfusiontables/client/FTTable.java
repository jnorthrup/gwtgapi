package org.sgx.gwtfusiontables.client;

import java.util.Collection;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * @see https://developers.google.com/fusiontables/docs/v1/reference/table
 * @author sg
 * 
 */
public class FTTable extends FTBase {
	protected FTTable() {
	}

	/**
	 * Encrypted unique alphanumeric identifier for the table.
	 * 
	 * @return
	 */
	public native final String tableId() /*-{
		return this["tableId"];
	}-*/;

	/**
	 * Encrypted unique alphanumeric identifier for the table.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable tableId(String val) /*-{
		this["tableId"] = val;
		return this;
	}-*/;

	/**
	 * Name assigned to a table.
	 * 
	 * @return
	 */
	public native final String name() /*-{
		return this["name"];
	}-*/;

	/**
	 * Name assigned to a table.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable name(String val) /*-{
		this["name"] = val;
		return this;
	}-*/;

	/**
	 * Columns in the table.
	 * 
	 * @return
	 */
	public native final JsArray<FTColumn> columns() /*-{
		return this["columns"];
	}-*/;

	/**
	 * Columns in the table.
	 * 
	 * @return
	 */
	public native final Collection<FTColumn> getColumns() /*-{
		return @org.sgx.jsutil.client.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this["columns"]);
	}-*/;

	/**
	 * Columns in the table.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable columns(JsArray<FTColumn> val) /*-{
		this["columns"] = val;
		return this;
	}-*/;

	/**
	 * Optional description assigned to the table.
	 * 
	 * @return
	 */
	public native final String description() /*-{
		return this["description"];
	}-*/;

	/**
	 * Optional description assigned to the table.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable description(String val) /*-{
		this["description"] = val;
		return this;
	}-*/;

	/**
	 * Variable for whether table is exportable.
	 * 
	 * @return
	 */
	public native final boolean isExportable() /*-{
		return this["isExportable"];
	}-*/;

	/**
	 * Variable for whether table is exportable.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable isExportable(boolean val) /*-{
		this["isExportable"] = val;
		return this;
	}-*/;

	/**
	 * Optional attribution assigned to the table.
	 * 
	 * @return
	 */
	public native final String attribution() /*-{
		return this["attribution"];
	}-*/;

	/**
	 * Optional attribution assigned to the table.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable attribution(String val) /*-{
		this["attribution"] = val;
		return this;
	}-*/;

	/**
	 * Optional link for attribution.
	 * 
	 * @return
	 */
	public native final String attributionLink() /*-{
		return this["attributionLink"];
	}-*/;

	/**
	 * Optional link for attribution.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable attributionLink(String val) /*-{
		this["attributionLink"] = val;
		return this;
	}-*/;

	/**
	 * Optional base table identifiers if this table is a view or merged table.
	 * 
	 * @return
	 */
	public native final JsArrayString baseTableIds() /*-{
		return this["baseTableIds"];
	}-*/;

	/**
	 * Optional base table identifiers if this table is a view or merged table.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable baseTableIds(JsArrayString val) /*-{
		this["baseTableIds"] = val;
		return this;
	}-*/;

	/**
	 * Optional sql that encodes the table definition for derived tables.
	 * 
	 * @return
	 */
	public native final String sql() /*-{
		return this["sql"];
	}-*/;

	/**
	 * Optional sql that encodes the table definition for derived tables.
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final FTTable sql(String val) /*-{
		this["sql"] = val;
		return this;
	}-*/;
}
