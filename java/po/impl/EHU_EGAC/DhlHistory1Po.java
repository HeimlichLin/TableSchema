package com.doc.common.po.impl; 
 
public class DhlHistory1Po implements IDhlHistory1Po {
 
	public enum COLUMNS {
		MWB("null"), //
		HWB("null"), //
		FTPDATE("null"), //
		FTPTYPE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String mwb;
	private String hwb;
	private java.sql.Timestamp ftpdate;
	private String ftptype;

	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public java.sql.Timestamp getFtpdate() {
		return this.ftpdate;
	}
 
	@Override
	public void setFtpdate(final java.sql.Timestamp ftpdate) {
		this.ftpdate = ftpdate; 
	}
 
	@Override
	public String getFtptype() {
		return this.ftptype;
	}
 
	@Override
	public void setFtptype(final String ftptype) {
		this.ftptype = ftptype; 
	}
 
}
