//package com.tableSchema.common.db.sql;
//
//import java.io.File;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//
//import org.apache.commons.lang.xwork.StringUtils;
//
//import com.tableSchema.common.utils.FileLoaderUtil;
//import com.tableSchema.common.utils.FileReaderUtil;
//
//public class ResourceSql {
//
//	public static String toSql(Class<?> pcClass, String fileName,
//			Map<String, String> map) {
//		ResourceSql resourceSql = new ResourceSql();
//		return resourceSql.getSql(pcClass, fileName, map);
//	}
//
//	public static String toSql(Class<?> pcClass, String fileName) {
//		ResourceSql resourceSql = new ResourceSql();
//		return resourceSql.getSql(pcClass, fileName);
//	}
//
//	public String getSql(Class<?> pcClass, String fileName,
//			Map<String, String> map) {
//		String text = this.read(pcClass, fileName);
//		return buiderSql(text, map);
//	}
//
//	public String getSql(Class<?> pcClass, String fileName) {
//		return this.read(pcClass, fileName);
//	}
//
//	public String read(Class<?> pcClass, String fileName) {
//		File file = FileLoaderUtil.getResourcesFile(ResourceSql.class, fileName);
//		return FileReaderUtil.readLine(file);
//	}
//
//	public static String buiderSql(String text, Map<String, String> map) {
//		String reutrnString = text;
//		Entry<?, ?> entry;
//		String oldTextString;
//		for (Iterator<?> arg = map.entrySet().iterator(); arg.hasNext(); reutrnString = StringUtils
//				.replace(reutrnString, oldTextString, (String) entry.getValue())) {
//			entry = (Entry<?, ?>) arg.next();
//			oldTextString = getReplaceString((String) entry.getKey());
//
//		}
//
//		return reutrnString;
//	}
//
//	private static String getReplaceString(String replace) {
//		return "%{" + replace + "}%";
//	}
//
//}
