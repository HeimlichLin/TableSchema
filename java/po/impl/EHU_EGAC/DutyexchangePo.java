package com.doc.common.po.impl; 
 
public class DutyexchangePo implements IDutyexchangePo {
 
	public enum COLUMNS {
		READYTIME("null"), //
		MWB("null"), //
		HWB("null"), //
		GCODATE("null"), //
		EXPRESSID("null"), //
		BOXNO("null"), //
		TRANSIND("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp readytime;
	private String mwb;
	private String hwb;
	private java.sql.Timestamp gcodate;
	private String expressid;
	private String boxno;
	private String transind;

	@Override
	public java.sql.Timestamp getReadytime() {
		return this.readytime;
	}
 
	@Override
	public void setReadytime(final java.sql.Timestamp readytime) {
		this.readytime = readytime; 
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
	public java.sql.Timestamp getGcodate() {
		return this.gcodate;
	}
 
	@Override
	public void setGcodate(final java.sql.Timestamp gcodate) {
		this.gcodate = gcodate; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
	}
 
	@Override
	public String getTransind() {
		return this.transind;
	}
 
	@Override
	public void setTransind(final String transind) {
		this.transind = transind; 
	}
 
}
