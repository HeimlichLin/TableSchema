package com.doc.common.po.impl; 
 
public class Logstdby$applyProgressPo implements ILogstdby$applyProgressPo {
 
	public enum COLUMNS {
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		COMMIT_SCN("null"), //
		COMMIT_TIME("null"), //
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
 
	private BigDecimal xidusn;
	private BigDecimal xidslt;
	private BigDecimal xidsqn;
	private BigDecimal commitScn;
	private java.sql.Timestamp commitTime;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

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
	public BigDecimal getCommitScn() {
		return this.commitScn;
	}
 
	@Override
	public void setCommitScn(final BigDecimal commitScn) {
		this.commitScn = commitScn; 
	}
 
	@Override
	public java.sql.Timestamp getCommitTime() {
		return this.commitTime;
	}
 
	@Override
	public void setCommitTime(final java.sql.Timestamp commitTime) {
		this.commitTime = commitTime; 
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
	public String getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final String spare3) {
		this.spare3 = spare3; 
	}
 
}
