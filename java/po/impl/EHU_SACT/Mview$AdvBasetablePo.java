package com.doc.common.po.impl; 
 
public class Mview$AdvBasetablePo implements IMview$AdvBasetablePo {
 
	public enum COLUMNS {
		COLLECTIONID#("null"), //
		QUERYID#("null"), //
		OWNER("null"), //
		TABLE_NAME("null"), //
		TABLE_TYPE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal collectionid#;
	private BigDecimal queryid#;
	private String owner;
	private String tableName;
	private BigDecimal tableType;

	@Override
	public BigDecimal getCollectionid#() {
		return this.collectionid#;
	}
 
	@Override
	public void setCollectionid#(final BigDecimal collectionid#) {
		this.collectionid# = collectionid#; 
	}
 
	@Override
	public BigDecimal getQueryid#() {
		return this.queryid#;
	}
 
	@Override
	public void setQueryid#(final BigDecimal queryid#) {
		this.queryid# = queryid#; 
	}
 
	@Override
	public String getOwner() {
		return this.owner;
	}
 
	@Override
	public void setOwner(final String owner) {
		this.owner = owner; 
	}
 
	@Override
	public String getTableName() {
		return this.tableName;
	}
 
	@Override
	public void setTableName(final String tableName) {
		this.tableName = tableName; 
	}
 
	@Override
	public BigDecimal getTableType() {
		return this.tableType;
	}
 
	@Override
	public void setTableType(final BigDecimal tableType) {
		this.tableType = tableType; 
	}
 
}
