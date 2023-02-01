package com.doc.common.po.impl; 
 
public class DutydownloadlogPo implements IDutydownloadlogPo {
 
	public enum COLUMNS {
		DUTYNO("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		DOWNLOADDATE("null"), //
		WDATE("null"), //
		DLIP("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String dutyno;
	private String declno;
	private String mwb;
	private String hwb;
	private java.sql.Timestamp downloaddate;
	private java.sql.Timestamp wdate;
	private String dlip;

	@Override
	public String getDutyno() {
		return this.dutyno;
	}
 
	@Override
	public void setDutyno(final String dutyno) {
		this.dutyno = dutyno; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
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
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public java.sql.Timestamp getDownloaddate() {
		return this.downloaddate;
	}
 
	@Override
	public void setDownloaddate(final java.sql.Timestamp downloaddate) {
		this.downloaddate = downloaddate; 
	}
 
	@Override
	public java.sql.Timestamp getWdate() {
		return this.wdate;
	}
 
	@Override
	public void setWdate(final java.sql.Timestamp wdate) {
		this.wdate = wdate; 
	}
 
	@Override
	public String getDlip() {
		return this.dlip;
	}
 
	@Override
	public void setDlip(final String dlip) {
		this.dlip = dlip; 
	}
 
}
