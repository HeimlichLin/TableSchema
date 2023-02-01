package com.doc.common.po.impl; 
 
public class Repcat$KeyColumnsPo implements IRepcat$KeyColumnsPo {
 
	public enum COLUMNS {
		SNAME("Schema containing table"), //
		ONAME("Name of the table"), //
		TYPE("Type identifier"), //
		COL("Column in the table") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sname;
	private String oname;
	private BigDecimal type;
	private String col;

	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
	}
 
	@Override
	public BigDecimal getType() {
		return this.type;
	}
 
	@Override
	public void setType(final BigDecimal type) {
		this.type = type; 
	}
 
	@Override
	public String getCol() {
		return this.col;
	}
 
	@Override
	public void setCol(final String col) {
		this.col = col; 
	}
 
}
