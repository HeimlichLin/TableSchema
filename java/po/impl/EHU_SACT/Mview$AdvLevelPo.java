package com.doc.common.po.impl; 
 
public class Mview$AdvLevelPo implements IMview$AdvLevelPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		LEVELID#("null"), //
		DIMOBJ#("null"), //
		FLAGS("null"), //
		TBLOBJ#("null"), //
		COLUMNLIST("null"), //
		LEVELNAME("null") //
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
	private BigDecimal levelid#;
	private BigDecimal dimobj#;
	private BigDecimal flags;
	private BigDecimal tblobj#;
	private String columnlist;
	private String levelname;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public BigDecimal getLevelid#() {
		return this.levelid#;
	}
 
	@Override
	public void setLevelid#(final BigDecimal levelid#) {
		this.levelid# = levelid#; 
	}
 
	@Override
	public BigDecimal getDimobj#() {
		return this.dimobj#;
	}
 
	@Override
	public void setDimobj#(final BigDecimal dimobj#) {
		this.dimobj# = dimobj#; 
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
	public BigDecimal getTblobj#() {
		return this.tblobj#;
	}
 
	@Override
	public void setTblobj#(final BigDecimal tblobj#) {
		this.tblobj# = tblobj#; 
	}
 
	@Override
	public String getColumnlist() {
		return this.columnlist;
	}
 
	@Override
	public void setColumnlist(final String columnlist) {
		this.columnlist = columnlist; 
	}
 
	@Override
	public String getLevelname() {
		return this.levelname;
	}
 
	@Override
	public void setLevelname(final String levelname) {
		this.levelname = levelname; 
	}
 
}
