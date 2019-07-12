package com.tableSchema.domain.code;

public enum SqlCode {
	
	COLUMDETAIL("表格欄位內容", "sql/ColumDetail.sql") //	
	;
	
	final String description;
	final String path;

	private SqlCode(final String description, final String path) {
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
