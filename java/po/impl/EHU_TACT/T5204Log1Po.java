package com.doc.common.po.impl; 
 
public class T5204Log1Po implements IT5204Log1Po {
 
	public enum COLUMNS {
		SN("null"), //
		LOG_INFO("null"), //
		CRT_DATE1("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal sn;
	private String logInfo;
	private java.sql.Timestamp crtDate1;

	@Override
	public BigDecimal getSn() {
		return this.sn;
	}
 
	@Override
	public void setSn(final BigDecimal sn) {
		this.sn = sn; 
	}
 
	@Override
	public String getLogInfo() {
		return this.logInfo;
	}
 
	@Override
	public void setLogInfo(final String logInfo) {
		this.logInfo = logInfo; 
	}
 
	@Override
	public java.sql.Timestamp getCrtDate1() {
		return this.crtDate1;
	}
 
	@Override
	public void setCrtDate1(final java.sql.Timestamp crtDate1) {
		this.crtDate1 = crtDate1; 
	}
 
}
