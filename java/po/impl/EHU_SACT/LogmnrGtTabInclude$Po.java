package com.doc.common.po.impl; 
 
public class LogmnrGtTabInclude$Po implements ILogmnrGtTabInclude$Po {
 
	public enum COLUMNS {
		SCHEMA_NAME("null"), //
		TABLE_NAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String schemaName;
	private String tableName;

	@Override
	public String getSchemaName() {
		return this.schemaName;
	}
 
	@Override
	public void setSchemaName(final String schemaName) {
		this.schemaName = schemaName; 
	}
 
	@Override
	public String getTableName() {
		return this.tableName;
	}
 
	@Override
	public void setTableName(final String tableName) {
		this.tableName = tableName; 
	}
 
}
