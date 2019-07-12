package com.tableSchema.domain.bean;

public class AllTabCommentsDo {
	
	public enum COLUMNS {
		OWNER("擁有者"), //
		TABLE_NAME("表格英文名稱"), //
		TABLE_TYPE("資料型態"), //
		COMMENTS("表格說明"), //
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
	private String tableType;
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
	
	public String getTableType() {
		return tableType;
	}
	
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	
	public String getComments() {
		return comments;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
	}

}
