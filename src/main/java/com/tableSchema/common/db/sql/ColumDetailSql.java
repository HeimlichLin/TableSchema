package com.tableSchema.common.db.sql;

public class ColumDetailSql {
	
	public static String getSQL(){
		String sql = " SELECT  col.table_name TABLE_NAME, tcom.comments TABLE_COMMENTS, "
				+ " col.column_name COLUMN_NAME, com.comments COLUMN_COMMENTS, "
				+ " col.data_type DATA_TYPE,  "
				+ " decode(col.data_precision,null,col.char_length,col.data_precision||'.'||col.data_scale) DATA_SIZE, " 
				+ " col.nullable NULLABLE, con.position POSITION "
				+ " FROM all_col_comments com "
				+ " JOIN all_tab_cols col "
				+ " ON com.table_name = col.table_name "
				+ " AND com.column_name = col.column_name "
				+ " AND com.owner = col.owner "
				+ " JOIN all_tab_comments tcom "
				+ " ON com.table_name=tcom.table_name "
				+ " AND col.table_name=tcom.table_name "
				+ " AND com.owner = tcom.owner "
				+ " AND col.owner = tcom.owner "
				+ " LEFT JOIN (Select * FRom ALL_CONS_COLUMNS where position is not null) con "
				+ " ON com.table_name=con.table_name "
				+ " AND com.column_name=con.column_name "
				+ " WHERE tcom.table_type='TABLE' and com.OWNER = ( ? ) and col.table_name = ( ? ) "
				+ " Group by col.table_name, col.COLUMN_ID, tcom.comments,  "
				+ " col.column_name,col.data_type , "
				+ " decode(col.data_precision,null,col.char_length,col.data_precision||'.'||col.data_scale), "
				+ " col.nullable , con.position , com.comments "
				+ " ORDER BY col.table_name, col.column_id ";
		return sql;
	}

}
