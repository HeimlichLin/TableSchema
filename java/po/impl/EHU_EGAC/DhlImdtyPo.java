package com.doc.common.po.impl; 
 
public class DhlImdtyPo implements IDhlImdtyPo {
 
	public enum COLUMNS {
		MWB("null"), //
		HWB("null"), //
		DUTYNO("null"), //
		DECLNO("null"), //
		GCODATE("null"), //
		WDATE("null"), //
		FTPDATE("null"), //
		FTPFILE("null") //
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
	private String dutyno;
	private String declno;
	private java.sql.Timestamp gcodate;
	private java.sql.Timestamp wdate;
	private java.sql.Timestamp ftpdate;
	private String ftpfile;

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
	public java.sql.Timestamp getGcodate() {
		return this.gcodate;
	}
 
	@Override
	public void setGcodate(final java.sql.Timestamp gcodate) {
		this.gcodate = gcodate; 
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
	public java.sql.Timestamp getFtpdate() {
		return this.ftpdate;
	}
 
	@Override
	public void setFtpdate(final java.sql.Timestamp ftpdate) {
		this.ftpdate = ftpdate; 
	}
 
	@Override
	public String getFtpfile() {
		return this.ftpfile;
	}
 
	@Override
	public void setFtpfile(final String ftpfile) {
		this.ftpfile = ftpfile; 
	}
 
}
