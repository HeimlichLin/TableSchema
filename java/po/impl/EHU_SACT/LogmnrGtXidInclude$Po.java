package com.doc.common.po.impl; 
 
public class LogmnrGtXidInclude$Po implements ILogmnrGtXidInclude$Po {
 
	public enum COLUMNS {
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null") //
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
 
}
