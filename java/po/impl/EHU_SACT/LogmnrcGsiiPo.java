package com.doc.common.po.impl; 
 
public class LogmnrcGsiiPo implements ILogmnrcGsiiPo {
 
	public enum COLUMNS {
		LOGMNR_UID("null"), //
		OBJ#("null"), //
		BO#("null"), //
		INDTYPE#("null"), //
		DROP_SCN("null"), //
		LOGMNR_SPARE1("null"), //
		LOGMNR_SPARE2("null"), //
		LOGMNR_SPARE3("null"), //
		LOGMNR_SPARE4("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal logmnrUid;
	private BigDecimal obj#;
	private BigDecimal bo#;
	private BigDecimal indtype#;
	private BigDecimal dropScn;
	private BigDecimal logmnrSpare1;
	private BigDecimal logmnrSpare2;
	private String logmnrSpare3;
	private java.sql.Timestamp logmnrSpare4;

	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
	}
 
	@Override
	public BigDecimal getObj#() {
		return this.obj#;
	}
 
	@Override
	public void setObj#(final BigDecimal obj#) {
		this.obj# = obj#; 
	}
 
	@Override
	public BigDecimal getBo#() {
		return this.bo#;
	}
 
	@Override
	public void setBo#(final BigDecimal bo#) {
		this.bo# = bo#; 
	}
 
	@Override
	public BigDecimal getIndtype#() {
		return this.indtype#;
	}
 
	@Override
	public void setIndtype#(final BigDecimal indtype#) {
		this.indtype# = indtype#; 
	}
 
	@Override
	public BigDecimal getDropScn() {
		return this.dropScn;
	}
 
	@Override
	public void setDropScn(final BigDecimal dropScn) {
		this.dropScn = dropScn; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare1() {
		return this.logmnrSpare1;
	}
 
	@Override
	public void setLogmnrSpare1(final BigDecimal logmnrSpare1) {
		this.logmnrSpare1 = logmnrSpare1; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare2() {
		return this.logmnrSpare2;
	}
 
	@Override
	public void setLogmnrSpare2(final BigDecimal logmnrSpare2) {
		this.logmnrSpare2 = logmnrSpare2; 
	}
 
	@Override
	public String getLogmnrSpare3() {
		return this.logmnrSpare3;
	}
 
	@Override
	public void setLogmnrSpare3(final String logmnrSpare3) {
		this.logmnrSpare3 = logmnrSpare3; 
	}
 
	@Override
	public java.sql.Timestamp getLogmnrSpare4() {
		return this.logmnrSpare4;
	}
 
	@Override
	public void setLogmnrSpare4(final java.sql.Timestamp logmnrSpare4) {
		this.logmnrSpare4 = logmnrSpare4; 
	}
 
}
