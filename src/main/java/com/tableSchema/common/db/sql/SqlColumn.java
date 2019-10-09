//package com.tableSchema.common.db.sql;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.tableSchema.common.utils.SqlFormatUtil;
//
//public class SqlColumn {
//
//	private List<String> list;
//
//	public SqlColumn() {
//		this.list = new ArrayList<String>();
//	}
//
//	public void add(String column) {
//		this.list.add(column);
//	}
//
//	public int length() {
//		return list.size();
//	}
//
//	public String get(int i) {
//		return this.list.get(i);
//	}
//
//	public String get() {
//		if (list.isEmpty()) {
//			return " * ";
//		}
//		return SqlFormatUtil.stringMapToString(list);
//	}
//
//}
