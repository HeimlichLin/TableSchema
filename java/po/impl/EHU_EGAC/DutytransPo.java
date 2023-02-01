package com.doc.common.po.impl; 
 
public class DutytransPo implements IDutytransPo {
 
	public enum COLUMNS {
		DUTYNO("null"), //
		MWB("null"), //
		HWB("null"), //
		TRANSTIME("null"), //
		FTPTIME("null") //
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
	private String mwb;
	private String hwb;
	private java.sql.Timestamp transtime;
	private java.sql.Timestamp ftptime;

	@Override
	public String getDutyno() {
		return this.dutyno;
	}
 
	@Override
	public void setDutyno(final String dutyno) {
		this.dutyno = dutyno; 
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
	public java.sql.Timestamp getTranstime() {
		return this.transtime;
	}
 
	@Override
	public void setTranstime(final java.sql.Timestamp transtime) {
		this.transtime = transtime; 
	}
 
	@Override
	public java.sql.Timestamp getFtptime() {
		return this.ftptime;
	}
 
	@Override
	public void setFtptime(final java.sql.Timestamp ftptime) {
		this.ftptime = ftptime; 
	}
 
}
