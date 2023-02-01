package com.doc.common.po.impl; 
 
public class ReleaselogPo implements IReleaselogPo {
 
	public enum COLUMNS {
		USERID("null"), //
		LOGDATE("null"), //
		WS("null"), //
		ACTION("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		IE("null"), //
		CLEARANCETYPE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String userid;
	private java.sql.Timestamp logdate;
	private String ws;
	private String action;
	private String declno;
	private String mwb;
	private String hwb;
	private String ie;
	private String clearancetype;

	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
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
	public String getWs() {
		return this.ws;
	}
 
	@Override
	public void setWs(final String ws) {
		this.ws = ws; 
	}
 
	@Override
	public String getAction() {
		return this.action;
	}
 
	@Override
	public void setAction(final String action) {
		this.action = action; 
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
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public String getClearancetype() {
		return this.clearancetype;
	}
 
	@Override
	public void setClearancetype(final String clearancetype) {
		this.clearancetype = clearancetype; 
	}
 
}
