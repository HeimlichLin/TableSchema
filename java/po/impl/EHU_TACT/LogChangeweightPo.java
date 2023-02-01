package com.doc.common.po.impl; 
 
public class LogChangeweightPo implements ILogChangeweightPo {
 
	public enum COLUMNS {
		MWB("null"), //
		HWB("null"), //
		EXPBAGNO("null"), //
		WEIGHT1("null"), //
		WEIGHT2("null"), //
		REASON("null"), //
		WS("null"), //
		USERID("null"), //
		TIME("null"), //
		IE("null"), //
		EXPRESSID("null"), //
		DECLNO("null"), //
		BAGNO("null"), //
		WORKAREA("null"), //
		OCUSTOMSID("null") //
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
	private String expbagno;
	private BigDecimal weight1;
	private BigDecimal weight2;
	private String reason;
	private String ws;
	private String userid;
	private java.sql.Timestamp time;
	private String ie;
	private String expressid;
	private String declno;
	private String bagno;
	private String workarea;
	private String ocustomsid;

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
	public BigDecimal getWeight1() {
		return this.weight1;
	}
 
	@Override
	public void setWeight1(final BigDecimal weight1) {
		this.weight1 = weight1; 
	}
 
	@Override
	public BigDecimal getWeight2() {
		return this.weight2;
	}
 
	@Override
	public void setWeight2(final BigDecimal weight2) {
		this.weight2 = weight2; 
	}
 
	@Override
	public String getReason() {
		return this.reason;
	}
 
	@Override
	public void setReason(final String reason) {
		this.reason = reason; 
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
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public java.sql.Timestamp getTime() {
		return this.time;
	}
 
	@Override
	public void setTime(final java.sql.Timestamp time) {
		this.time = time; 
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
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
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
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getWorkarea() {
		return this.workarea;
	}
 
	@Override
	public void setWorkarea(final String workarea) {
		this.workarea = workarea; 
	}
 
	@Override
	public String getOcustomsid() {
		return this.ocustomsid;
	}
 
	@Override
	public void setOcustomsid(final String ocustomsid) {
		this.ocustomsid = ocustomsid; 
	}
 
}
