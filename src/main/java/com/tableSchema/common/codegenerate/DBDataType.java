package com.tableSchema.common.codegenerate;

public enum DBDataType {

	CHAR("字串", "String", "%s"), //
	VARCHAR2("字串", "String", "%s"), //
	NUMBER("數字", "BigDecimal", "BigDecimalUtils.formObj(%s)"), //
	DATE("時間", "java.sql.Timestamp", "TimestampUtils.of(%s)"), //
	;

	final String dbType;
	final String description;
	final String javaType;
	final String method;

	private DBDataType(String description, String javaType, String method) {
		this.dbType = this.name();
		this.description = description;
		this.javaType = javaType;
		this.method = method;
	}

	public String getDBType() {
		return this.dbType;
	}

	public String toText() {
		return this.description;
	}

	public String getDescription() {
		return this.description;
	}

	public String getJavaType() {
		return this.javaType;
	}

	public String getMethod() {
		return this.method;
	}

}
