package com.tableSchema.domain.code;

public enum SchemaCode {

	TABLE_NAME("表格英文名稱"), //
	TABLE_COMMENTS("表格說明"), //
	COLUMN_NAME("欄位英文名稱"), //
	COLUMN_COMMENTS("欄位中文名稱"), //
	DATA_TYPE("資料型態"), //
	DATA_SIZE("資料長度"), //
	NULLABLE("是否能空值"), //
	POSITION("PK") //
	;
	
	final String name;
	final String text;

	private SchemaCode(final String text) {
		this.name = name();
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public String getText() {
		return text;
	}

}
