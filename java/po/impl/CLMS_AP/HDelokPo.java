package com.doc.common.po.impl; 
 
public class HDelokPo implements IHDelokPo {
 
	public enum COLUMNS {
		LOGTABLE("null"), //
		DELCNT("null"), //
		OKFLG("null"), //
		LOGTIME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String logtable;
	private BigDecimal delcnt;
	private String okflg;
	private String logtime;

	@Override
	public String getLogtable() {
		return this.logtable;
	}
 
	@Override
	public void setLogtable(final String logtable) {
		this.logtable = logtable; 
	}
 
	@Override
	public BigDecimal getDelcnt() {
		return this.delcnt;
	}
 
	@Override
	public void setDelcnt(final BigDecimal delcnt) {
		this.delcnt = delcnt; 
	}
 
	@Override
	public String getOkflg() {
		return this.okflg;
	}
 
	@Override
	public void setOkflg(final String okflg) {
		this.okflg = okflg; 
	}
 
	@Override
	public String getLogtime() {
		return this.logtime;
	}
 
	@Override
	public void setLogtime(final String logtime) {
		this.logtime = logtime; 
	}
 
}
