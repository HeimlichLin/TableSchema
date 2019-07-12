package com.tableSchema.domain.dto;

public class SchemaDTO {
	
	private String tableName;
	private String tableComments;
	private String columnName;
	private String columnComments;
	private String dataType;
	private String dataSize;
	private String nullAble;
	private String position;
	
	public String getTableName() {
		return tableName;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
	public String getTableComments() {
		return tableComments;
	}
	
	public void setTableComments(String tableComments) {
		this.tableComments = tableComments;
	}
	
	public String getColumnName() {
		return columnName;
	}
	
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public String getColumnComments() {
		return columnComments;
	}
	
	public void setColumnComments(String columnComments) {
		this.columnComments = columnComments;
	}
	
	public String getDataType() {
		return dataType;
	}
	
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	public String getDataSize() {
		return dataSize;
	}
	
	public void setDataSize(String dataSize) {
		this.dataSize = dataSize;
	}
	
	public String getNullAble() {
		return nullAble;
	}
	
	public void setNullAble(String nullAble) {
		this.nullAble = nullAble;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

}
