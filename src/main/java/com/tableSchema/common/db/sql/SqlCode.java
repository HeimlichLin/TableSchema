package com.tableSchema.common.db.sql;

public class SqlCode {
	
	public String creatSelectSql(String tableName, SqlObject sqlObject) {
		return " select " + sqlObject.getSqlColumn().get() + " from " + tableName 
				+ sqlObject.getSqlWhere().get()	+ sqlObject.getSqlOrderBy().get();
	}
	
	public String creatInsertSql(String tableName, SqlObject sqlObject) {
		return " insert into " + tableName + sqlObject.getSqlValue().get();
	}
	
	public String creatUpdateSql(String tableName, SqlObject sqlObject) {
		return " update " + tableName + sqlObject.getSqlSet().get() 
				+ sqlObject.getSqlWhere().get();
	}
	
	public String creatDeleteSql(String tableName, SqlObject sqlObject) {
		return " delete from " + tableName
				+ sqlObject.getSqlWhere().get();
	}

}
