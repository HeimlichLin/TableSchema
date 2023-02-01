package com.tableSchema.domain.code;

public enum FileCode {

	EXCEL_PATH("表格欄位內容", "excel/"), //	
	JAVA_PO_PATH("表格欄位內容", "java/po/impl/"), //	
	JAVA_POIMPL_PATH("表格欄位內容", "java/po/"), //	
	JAVA_DAO_PATH("表格欄位內容", "java/dao/"), //	
	JAVA_DAOIMPL_PATH("表格欄位內容", "java/dao/impl/") //	
	;

	final String description;
	final String path;

	private FileCode(final String description, final String path) {
		this.description = description;
		this.path = path;
	}

	public String getDescription() {
		return this.description;
	}

	public String getPath() {
		return this.path;
	}

}
