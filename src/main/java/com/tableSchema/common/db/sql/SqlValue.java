//package com.tableSchema.common.db.sql;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.tableSchema.common.utils.SqlFormatUtil;
//
//public class SqlValue {
//	
//	private Map<String, String> values;
//	
//	public SqlValue() {
//		this.values = new HashMap<String, String>();
//	}
//	
//	public SqlValue(Map<String, String> value) {
//		if (values == null) {
//			throw new RuntimeException(
//					"The parameter of DataObject constructor cannot be null!");
//		} else {
//			this.values = value;
//		}
//	}
//	
//	public Map<String, String> toMap() {
//		return this.values;
//	}
//		
//	public String toString() {
//		return this.values.toString();
//	}
//	
//	public void add(String key, String value) {
//		if (key != null) {
//			this.values.put(key.toUpperCase(), value);
//		}
//	}
//	
//	public Object getObjectValue(String key) {
//		Object value =null;
//		if (key != null) {
//			value = (this.values.get(key) != null ? this.values.get(key) : null);
//		}		
//		return value;
//	}
//	
//	public String getString(String key) {
//		String value =null;
//		if (key != null) {
//			value = (this.values.get(key) != null ? this.values.get(key).toString() : null);
//		}		
//		return value;
//	}
//	
//	public Object[] getKeys() {
//		return this.values.keySet().toArray();
//	}
//	
//	public Object[] getValues() {
//		return this.values.values().toArray();
//	}
//	
//	public void clear() {
//		this.values.clear();
//	}
//
//	public Object remove(Object key) {
//		return this.values.remove(key);
//	}
//	
//	public int size() {
//		return this.values.size();
//	}
//	
//	public String get() {
//		return SqlFormatUtil.valueMapToString(values);
//	}
//
//}
