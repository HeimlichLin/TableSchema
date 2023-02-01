package com.doc.common.po.impl; 
 
public class LogmnrIntegratedSpill$Po implements ILogmnrIntegratedSpill$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		CHUNK("null"), //
		FLAG("null"), //
		CTIME("null"), //
		MTIME("null"), //
		SPILL_DATA("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null"), //
		SPARE4("null"), //
		SPARE5("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal session#;
	private BigDecimal xidusn;
	private BigDecimal xidslt;
	private BigDecimal xidsqn;
	private BigDecimal chunk;
	private BigDecimal flag;
	private java.sql.Timestamp ctime;
	private java.sql.Timestamp mtime;
	private String spillData;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private java.sql.Timestamp spare4;
	private java.sql.Timestamp spare5;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
	}
 
	@Override
	public BigDecimal getXidusn() {
		return this.xidusn;
	}
 
	@Override
	public void setXidusn(final BigDecimal xidusn) {
		this.xidusn = xidusn; 
	}
 
	@Override
	public BigDecimal getXidslt() {
		return this.xidslt;
	}
 
	@Override
	public void setXidslt(final BigDecimal xidslt) {
		this.xidslt = xidslt; 
	}
 
	@Override
	public BigDecimal getXidsqn() {
		return this.xidsqn;
	}
 
	@Override
	public void setXidsqn(final BigDecimal xidsqn) {
		this.xidsqn = xidsqn; 
	}
 
	@Override
	public BigDecimal getChunk() {
		return this.chunk;
	}
 
	@Override
	public void setChunk(final BigDecimal chunk) {
		this.chunk = chunk; 
	}
 
	@Override
	public BigDecimal getFlag() {
		return this.flag;
	}
 
	@Override
	public void setFlag(final BigDecimal flag) {
		this.flag = flag; 
	}
 
	@Override
	public java.sql.Timestamp getCtime() {
		return this.ctime;
	}
 
	@Override
	public void setCtime(final java.sql.Timestamp ctime) {
		this.ctime = ctime; 
	}
 
	@Override
	public java.sql.Timestamp getMtime() {
		return this.mtime;
	}
 
	@Override
	public void setMtime(final java.sql.Timestamp mtime) {
		this.mtime = mtime; 
	}
 
	@Override
	public String getSpillData() {
		return this.spillData;
	}
 
	@Override
	public void setSpillData(final String spillData) {
		this.spillData = spillData; 
	}
 
	@Override
	public BigDecimal getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final BigDecimal spare1) {
		this.spare1 = spare1; 
	}
 
	@Override
	public BigDecimal getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final BigDecimal spare2) {
		this.spare2 = spare2; 
	}
 
	@Override
	public BigDecimal getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final BigDecimal spare3) {
		this.spare3 = spare3; 
	}
 
	@Override
	public java.sql.Timestamp getSpare4() {
		return this.spare4;
	}
 
	@Override
	public void setSpare4(final java.sql.Timestamp spare4) {
		this.spare4 = spare4; 
	}
 
	@Override
	public java.sql.Timestamp getSpare5() {
		return this.spare5;
	}
 
	@Override
	public void setSpare5(final java.sql.Timestamp spare5) {
		this.spare5 = spare5; 
	}
 
}
