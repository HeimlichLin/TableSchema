package com.tableSchema.common.codegenerate;

public enum DBDataType {
	
	VARCHAR2("字串", "String", "%s"), //
	NUMBER("數字", "BigDecimal", "BigDecimalUtils.formObj(%s)"), //
	DATE("時間", "java.sql.Timestamp", "CommUtils.objConver2Time(%s)") //
	;
	
	final String dbType;
	final String description;
	final String javaType;
	final String method;

	private DBDataType(String description, String javaType, String method) {
		this.dbType = name();
		this.description = description;
		this.javaType = javaType;
		this.method = method;
	}

	public String getDBType() {
		return dbType;
	}

	public String toText() {
		return description;
	}

	public String getDescription() {
		return description;
	}

	public String getJavaType() {
		return javaType;
	}

	public String getMethod() {
		return method;
	}

}
