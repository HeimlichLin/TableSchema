package com.doc.common.po.impl; 
 
public class EdiquerylogPo implements IEdiquerylogPo {
 
	public enum COLUMNS {
		USERID("null"), //
		QUERYTABLE("null"), //
		QUERYDATE("null"), //
		CONTROLNO("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		WS("null") //
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
	private String querytable;
	private java.sql.Timestamp querydate;
	private String controlno;
	private String declno;
	private String mwb;
	private String hwb;
	private String ws;

	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getQuerytable() {
		return this.querytable;
	}
 
	@Override
	public void setQuerytable(final String querytable) {
		this.querytable = querytable; 
	}
 
	@Override
	public java.sql.Timestamp getQuerydate() {
		return this.querydate;
	}
 
	@Override
	public void setQuerydate(final java.sql.Timestamp querydate) {
		this.querydate = querydate; 
	}
 
	@Override
	public String getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final String controlno) {
		this.controlno = controlno; 
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
	public String getWs() {
		return this.ws;
	}
 
	@Override
	public void setWs(final String ws) {
		this.ws = ws; 
	}
 
}
