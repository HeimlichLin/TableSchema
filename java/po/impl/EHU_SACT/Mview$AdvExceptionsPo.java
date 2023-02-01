package com.doc.common.po.impl; 
 
public class Mview$AdvExceptionsPo implements IMview$AdvExceptionsPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		OWNER("null"), //
		TABLE_NAME("null"), //
		DIMENSION_NAME("null"), //
		RELATIONSHIP("null"), //
		BAD_ROWID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal runid#;
	private String owner;
	private String tableName;
	private String dimensionName;
	private String relationship;
	private String badRowid;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
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
	public String getDimensionName() {
		return this.dimensionName;
	}
 
	@Override
	public void setDimensionName(final String dimensionName) {
		this.dimensionName = dimensionName; 
	}
 
	@Override
	public String getRelationship() {
		return this.relationship;
	}
 
	@Override
	public void setRelationship(final String relationship) {
		this.relationship = relationship; 
	}
 
	@Override
	public String getBadRowid() {
		return this.badRowid;
	}
 
	@Override
	public void setBadRowid(final String badRowid) {
		this.badRowid = badRowid; 
	}
 
}
