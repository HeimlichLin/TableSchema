package com.tableSchema.domain.bean;

public class AllConsColumnsDo {
	
	public enum COLUMNS {
		OWNER("擁有者"), //
		CONSTERAINT_NAME("鍵英文名稱"), //
		TABLE_NAME("表格英文名稱"), //
		COLUMN_NAME("欄位英文名稱"), //
		POSITION("PK")
		;
		final String name;
		
		private COLUMNS(final String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
	}
	
	private String owner;
	private String consteraintName;
	private String tableName;
	private String columnName;
	private String position;
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getConsteraintName() {
		return consteraintName;
	}

	public void setConsteraintName(String consteraintName) {
		this.consteraintName = consteraintName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}
	
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
