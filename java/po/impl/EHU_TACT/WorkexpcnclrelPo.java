package com.doc.common.po.impl; 
 
public class WorkexpcnclrelPo implements IWorkexpcnclrelPo {
 
	public enum COLUMNS {
		HWB("null"), //
		MWB("null"), //
		SERIALNO("null"), //
		LOGDATE("null"), //
		MARK("null"), //
		ORIGCODATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String hwb;
	private String mwb;
	private BigDecimal serialno;
	private java.sql.Timestamp logdate;
	private String mark;
	private java.sql.Timestamp origcodate;

	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public BigDecimal getSerialno() {
		return this.serialno;
	}
 
	@Override
	public void setSerialno(final BigDecimal serialno) {
		this.serialno = serialno; 
	}
 
	@Override
	public java.sql.Timestamp getLogdate() {
		return this.logdate;
	}
 
	@Override
	public void setLogdate(final java.sql.Timestamp logdate) {
		this.logdate = logdate; 
	}
 
	@Override
	public String getMark() {
		return this.mark;
	}
 
	@Override
	public void setMark(final String mark) {
		this.mark = mark; 
	}
 
	@Override
	public java.sql.Timestamp getOrigcodate() {
		return this.origcodate;
	}
 
	@Override
	public void setOrigcodate(final java.sql.Timestamp origcodate) {
		this.origcodate = origcodate; 
	}
 
}
