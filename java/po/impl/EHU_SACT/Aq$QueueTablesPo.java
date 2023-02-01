package com.doc.common.po.impl; 
 
public class Aq$QueueTablesPo implements IAq$QueueTablesPo {
 
	public enum COLUMNS {
		SCHEMA("null"), //
		NAME("null"), //
		UDATA_TYPE("null"), //
		OBJNO("null"), //
		FLAGS("null"), //
		SORT_COLS("null"), //
		TIMEZONE("null"), //
		TABLE_COMMENT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String schema;
	private String name;
	private BigDecimal udataType;
	private BigDecimal objno;
	private BigDecimal flags;
	private BigDecimal sortCols;
	private String timezone;
	private String tableComment;

	@Override
	public String getSchema() {
		return this.schema;
	}
 
	@Override
	public void setSchema(final String schema) {
		this.schema = schema; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public BigDecimal getUdataType() {
		return this.udataType;
	}
 
	@Override
	public void setUdataType(final BigDecimal udataType) {
		this.udataType = udataType; 
	}
 
	@Override
	public BigDecimal getObjno() {
		return this.objno;
	}
 
	@Override
	public void setObjno(final BigDecimal objno) {
		this.objno = objno; 
	}
 
	@Override
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
	@Override
	public BigDecimal getSortCols() {
		return this.sortCols;
	}
 
	@Override
	public void setSortCols(final BigDecimal sortCols) {
		this.sortCols = sortCols; 
	}
 
	@Override
	public String getTimezone() {
		return this.timezone;
	}
 
	@Override
	public void setTimezone(final String timezone) {
		this.timezone = timezone; 
	}
 
	@Override
	public String getTableComment() {
		return this.tableComment;
	}
 
	@Override
	public void setTableComment(final String tableComment) {
		this.tableComment = tableComment; 
	}
 
}
