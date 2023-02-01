package com.doc.common.po.impl; 
 
public class Logstdby$flashbackScnPo implements ILogstdby$flashbackScnPo {
 
	public enum COLUMNS {
		PRIMARY_SCN("null"), //
		PRIMARY_TIME("null"), //
		STANDBY_SCN("null"), //
		STANDBY_TIME("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal primaryScn;
	private java.sql.Timestamp primaryTime;
	private BigDecimal standbyScn;
	private java.sql.Timestamp standbyTime;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private java.sql.Timestamp spare3;

	@Override
	public BigDecimal getPrimaryScn() {
		return this.primaryScn;
	}
 
	@Override
	public void setPrimaryScn(final BigDecimal primaryScn) {
		this.primaryScn = primaryScn; 
	}
 
	@Override
	public java.sql.Timestamp getPrimaryTime() {
		return this.primaryTime;
	}
 
	@Override
	public void setPrimaryTime(final java.sql.Timestamp primaryTime) {
		this.primaryTime = primaryTime; 
	}
 
	@Override
	public BigDecimal getStandbyScn() {
		return this.standbyScn;
	}
 
	@Override
	public void setStandbyScn(final BigDecimal standbyScn) {
		this.standbyScn = standbyScn; 
	}
 
	@Override
	public java.sql.Timestamp getStandbyTime() {
		return this.standbyTime;
	}
 
	@Override
	public void setStandbyTime(final java.sql.Timestamp standbyTime) {
		this.standbyTime = standbyTime; 
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
	public java.sql.Timestamp getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final java.sql.Timestamp spare3) {
		this.spare3 = spare3; 
	}
 
}
