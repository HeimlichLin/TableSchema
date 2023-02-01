package com.doc.common.po.impl; 
 
public class RelabellogPo implements IRelabellogPo {
 
	public enum COLUMNS {
		REPRTDATE("null"), //
		REPRTTIME("null"), //
		IE("null"), //
		OPUSERID("null"), //
		WS("null"), //
		MWB("null"), //
		HWB("null"), //
		EXPBAGNO("null"), //
		EXPRESSID("null"), //
		CSUSERID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String reprtdate;
	private String reprttime;
	private String ie;
	private String opuserid;
	private String ws;
	private String mwb;
	private String hwb;
	private String expbagno;
	private String expressid;
	private String csuserid;

	@Override
	public String getReprtdate() {
		return this.reprtdate;
	}
 
	@Override
	public void setReprtdate(final String reprtdate) {
		this.reprtdate = reprtdate; 
	}
 
	@Override
	public String getReprttime() {
		return this.reprttime;
	}
 
	@Override
	public void setReprttime(final String reprttime) {
		this.reprttime = reprttime; 
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
	public String getOpuserid() {
		return this.opuserid;
	}
 
	@Override
	public void setOpuserid(final String opuserid) {
		this.opuserid = opuserid; 
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
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
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
	public String getCsuserid() {
		return this.csuserid;
	}
 
	@Override
	public void setCsuserid(final String csuserid) {
		this.csuserid = csuserid; 
	}
 
}
