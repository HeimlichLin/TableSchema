package com.tableSchema.common.utils;

import java.util.List;
import java.util.Map;

public class SqlFormatUtil {
	
	public static String stringMapToString(List<String> list) {
		if (list.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String string : list) {
			if (first) {
				first = false;
			} else {
				sb.append(",");
			}
			sb.append(string);
		}
		return sb.toString();
	}
	
	public static String whereMapToString(Map<String, String> values) {
		if (values.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String key : values.keySet()) {
			if (first) {
				first = false;
				sb.append(" where ");
			} else {
				sb.append(" and ");
			}
			sb.append(key + " = '" + values.get(key) + "'");
		}
		return sb.toString();
	}
	
	public static String setMapToString(Map<String, String> values) {
		if (values.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String key : values.keySet()) {
			if (first) {
				first = false;
				sb.append(" set ");
			} else {
				sb.append(", ");
			}
			sb.append(key + " = '" + values.get(key) + "'");
		}
		return sb.toString();
	}
	
	public static String valueMapToString(Map<String, String> values) {
		if (values.isEmpty()) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		StringBuilder insertKey = new StringBuilder();
		StringBuilder insertValue = new StringBuilder();
		boolean first = true;
		for (String key : values.keySet()) {
			if (first) {
				first = false;
			} else {
				insertKey.append(", ");
				insertValue.append(", ");
			}
			insertKey.append(key);
			insertValue.append("'" + values.get(key) + "'");			
		}
		return result.append(" (" + insertKey + ") ").append(" values (" + insertValue + ") ").toString();
	}

}
