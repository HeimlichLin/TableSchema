package com.tableSchema.domain.bean;

public class AllColCommentsDo {
	
	public enum COLUMNS {
		OWNER("擁有者"), //
		TABLE_NAME("表格英文名稱"), //
		COLUMN_NAME("欄位英文名稱"), //
		COMMENTS("資料註解")
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
	private String tableName;
	private String columnName;
	private String comments;
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
