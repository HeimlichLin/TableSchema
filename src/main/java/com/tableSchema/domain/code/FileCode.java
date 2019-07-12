package com.tableSchema.domain.code;

public enum FileCode {
	
	EXCEL_PATH("表格欄位內容", "excel/"), //	
	JAVA_DO_PATH("表格欄位內容", "java/do/"), //	
	JAVA_DAOIMPL_PATH("表格欄位內容", "java/daoImpl/") //	
	;
	
	final String description;
	final String path;

	private FileCode(final String description, final String path) {
		this.description = description;
		this.path = path;
	}

	public String getDescription() {
		return description;
	}

	public String getPath() {
		return path;
	}

}
