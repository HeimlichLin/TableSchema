package com.tableSchema.common.utils;

public class StringFormatUtil {
	
	public static String formatFirstWorldToUpper(String str) {
		String[] array = str.split("_");
		String formatString="";
		for (int i = 0; i < array.length; i++) {
			formatString += array[i].toUpperCase().charAt(0)
					+ array[i].substring(1).toLowerCase();			
		}
		return formatString;
	}
	
	public static String formatFirstWorldToLower(String str) {
		String[] array = str.split("_");
		String formatString=array[0].toLowerCase();
		for (int i = 1; i < array.length; i++) {
			formatString += array[i].toUpperCase().charAt(0)
					+ array[i].substring(1).toLowerCase();			
		}
		return formatString;
	}	

}
