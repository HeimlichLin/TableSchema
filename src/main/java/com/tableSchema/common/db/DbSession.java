package com.tableSchema.common.db;

import java.sql.Connection;
import java.util.List;

import com.tableSchema.common.db.sql.SqlWhere;

public interface DbSession {
	
	void beginTransaction();
	
	void commit();

	void close();

	Connection getConnection();

	RowMapList query(String sql);
	
	RowMapList query(String sql, SqlWhere sqlWhere);
	
	<Po> List<Po> select(Converter<Po> converter, String sql);
	
	<Po> List<Po> select(Converter<Po> converter, String sql, SqlWhere sqlWhere);

}
