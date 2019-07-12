SELECT  col.table_name TABLE_NAME, tcom.comments TABLE_COMMENTS, 
col.column_name COLUMN_NAME, com.comments COLUMN_COMMENTS, 
col.data_type DATA_TYPE,  
decode(col.data_precision,null,col.char_length,col.data_precision||'.'||col.data_scale) DATA_SIZE,  
col.nullable NULLABLE, con.position POSITION 
FROM all_col_comments com 
JOIN all_tab_cols col 
ON com.table_name = col.table_name 
AND com.column_name = col.column_name 
JOIN all_tab_comments tcom 
ON com.table_name=tcom.table_name 
AND col.table_name=tcom.table_name 
LEFT JOIN (Select * FRom ALL_CONS_COLUMNS where OWNER = '%{owner}%' 
and position is not null) con 
ON com.table_name=con.table_name 
AND com.column_name=con.column_name 
WHERE tcom.table_type='TABLE' and col.TABLE_NAME = '%{tablename}%' 
Group by col.table_name, col.COLUMN_ID, tcom.comments,  
col.column_name,col.data_type , 
decode(col.data_precision,null,col.char_length,col.data_precision||'.'||col.data_scale), 
col.nullable , con.position , com.comments 
ORDER BY col.table_name, col.column_id ;
