package org.sgx.gwtfusiontables.client;

import org.sgx.jsutil.client.JsObject;

/**
 * @see https://developers.google.com/fusiontables/docs/v1/reference/column
 * @author sg
 *
 */
public class FTColumn extends FTBase {

protected FTColumn(){}
/**
 * Identifier for the column.
 * @return
 */
public native final int columnId() /*-{
return this["columnId"]; 
}-*/;

/**
 * Identifier for the column.
 * @param val
 * @return this - for setter chaining
 */
public native final FTColumn columnId(int val) /*-{
this["columnId"] = val; 
return this; 
}-*/;

/**
 * Required name of the column.
 * @return
 */
public native final String name() /*-{
return this["name"]; 
}-*/;

/**
 * Required name of the column.
 * @param val
 * @return this - for setter chaining
 */
public native final FTColumn name(String val) /*-{
this["name"] = val; 
return this; 
}-*/;
/**
 * Required type of the column. Type can be "NUMBER", "STRING", "LOCATION", or "DATETIME".
 * @return
 */
public native final String type() /*-{
return this["type"]; 
}-*/;

/**
 * 
 * @param val
 * @return this - for setter chaining
 */
public native final FTColumn type(String val) /*-{
this["type"] = val; 
return this; 
}-*/;


public static class BaseColumn extends JsObject {
	protected BaseColumn(){}
/**
 * Offset to the entry in the list of base tables in the table definition. 	
 * @return
 */
public native final int tableIndex() /*-{
return this["tableIndex"]; 
}-*/;

/**
 * Offset to the entry in the list of base tables in the table definition. 	
 * @param val
 * @return this - for setter chaining
 */
public native final FTColumn.BaseColumn tableIndex(int val) /*-{
this["tableIndex"] = val; 
return this; 
}-*/;

/**
 * The ID of the column in the base table from which this column is derived. 	
 * @return
 */
public native final int columnId() /*-{
return this["columnId"]; 
}-*/;

/**
 * The ID of the column in the base table from which this column is derived. 	
 * @param val
 * @return this - for setter chaining
 */
public native final FTColumn.BaseColumn columnId(int val) /*-{
this["columnId"] = val; 
return this; 
}-*/;
}
/**
 * Optional identifier of the base column. If present, this column is derived from the specified base column.
 * @return
 */
public native final BaseColumn baseColumn() /*-{
return this["baseColumn"]; 
}-*/;

/**
 * Optional identifier of the base column. If present, this column is derived from the specified base column.
 * @param val
 * @return this - for setter chaining
 */
public native final BaseColumn baseColumn(FTColumn val) /*-{
this["baseColumn"] = val; 
return this; 
}-*/;
}
