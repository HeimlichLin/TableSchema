package com.doc.common.po.impl; 
 
public class WorkexpcloudreportPo implements IWorkexpcloudreportPo {
 
	public enum COLUMNS {
		TID("null"), //
		MWB("null"), //
		HWB("null"), //
		DECLNO("null"), //
		SHOWHWB("null"), //
		LASTUPDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String tid;
	private String mwb;
	private String hwb;
	private String declno;
	private String showhwb;
	private java.sql.Timestamp lastupdate;

	@Override
	public String getTid() {
		return this.tid;
	}
 
	@Override
	public void setTid(final String tid) {
		this.tid = tid; 
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
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public String getShowhwb() {
		return this.showhwb;
	}
 
	@Override
	public void setShowhwb(final String showhwb) {
		this.showhwb = showhwb; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
}
