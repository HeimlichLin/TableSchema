package com.doc.common.po.impl; 
 
public class Logstdby$skipTransactionPo implements ILogstdby$skipTransactionPo {
 
	public enum COLUMNS {
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		ACTIVE("null"), //
		COMMIT_SCN("null"), //
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
	private BigDecimal active;
	private BigDecimal commitScn;
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
	public BigDecimal getActive() {
		return this.active;
	}
 
	@Override
	public void setActive(final BigDecimal active) {
		this.active = active; 
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
