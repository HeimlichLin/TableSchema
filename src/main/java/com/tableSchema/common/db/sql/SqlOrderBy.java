//package com.tableSchema.common.db.sql;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.tableSchema.common.utils.SqlFormatUtil;
//
//public class SqlOrderBy {
//	
//	private List<String> list;
//	private static final String ORDERBY = " order by ";
//	
//	public SqlOrderBy() {
//		this.list = new ArrayList<String>();
//	}
//		
//	public void add(String orderBy) {
//		this.list.add(orderBy);
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
//			return "";
//		}
//		return ORDERBY + SqlFormatUtil.stringMapToString(list);
//	}
//
//}
