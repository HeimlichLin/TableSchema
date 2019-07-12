package com.tableSchema.common.db.sql;

import java.util.HashMap;
import java.util.Map;

public class SqlBuider implements ToNativeSql {
	
	private StringBuffer sqlBuffer;
	private Map<String, String> map;

	public SqlBuider(String sql, Map<String, String> map) {
		this.sqlBuffer = new StringBuffer();
		this.map = new HashMap<String, String>();
		this.sqlBuffer.append(sql);
		this.map = map;
	}

	public SqlBuider(Class<?> pClass, String fileName, Map<String, String> map) {
		this.sqlBuffer = new StringBuffer();
		this.map = new HashMap<String, String>();
		this.sqlBuffer.append(ResourceSql.toSql(pClass, fileName));
		this.map = map;
	}

	public SqlBuider(Class<?> pClass, String fileName) {
		this(pClass, fileName, new HashMap<String, String>());
	}

	public SqlBuider(String sql) {
		this((String) sql, new HashMap<String, String>());
	}

	public void addSql(boolean isTrue, String sql) {
		if (isTrue) {
			this.sqlBuffer.append(sql);
		}

	}

	public void addSql(SqlWhere sqlWhere) {
		this.sqlBuffer.append(sqlWhere.toString());
	}

	public String toNativeSql() {
		return ResourceSql.buiderSql(this.sqlBuffer.toString(), this.map);
	}

}
