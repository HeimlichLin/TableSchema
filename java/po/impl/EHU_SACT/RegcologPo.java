package com.doc.common.po.impl; 
 
public class RegcologPo implements IRegcologPo {
 
	public enum COLUMNS {
		BAGNO("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		EXPBAGNO("null"), //
		REASON("null"), //
		IE("null"), //
		PRIDATE2("null"), //
		PRIUSER("null"), //
		PRIWS("null"), //
		REDATE("null"), //
		REUSER("null"), //
		REWS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bagno;
	private String declno;
	private String mwb;
	private String hwb;
	private String expbagno;
	private String reason;
	private String ie;
	private java.sql.Timestamp pridate2;
	private String priuser;
	private String priws;
	private java.sql.Timestamp redate;
	private String reuser;
	private String rews;

	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
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
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
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
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public java.sql.Timestamp getPridate2() {
		return this.pridate2;
	}
 
	@Override
	public void setPridate2(final java.sql.Timestamp pridate2) {
		this.pridate2 = pridate2; 
	}
 
	@Override
	public String getPriuser() {
		return this.priuser;
	}
 
	@Override
	public void setPriuser(final String priuser) {
		this.priuser = priuser; 
	}
 
	@Override
	public String getPriws() {
		return this.priws;
	}
 
	@Override
	public void setPriws(final String priws) {
		this.priws = priws; 
	}
 
	@Override
	public java.sql.Timestamp getRedate() {
		return this.redate;
	}
 
	@Override
	public void setRedate(final java.sql.Timestamp redate) {
		this.redate = redate; 
	}
 
	@Override
	public String getReuser() {
		return this.reuser;
	}
 
	@Override
	public void setReuser(final String reuser) {
		this.reuser = reuser; 
	}
 
	@Override
	public String getRews() {
		return this.rews;
	}
 
	@Override
	public void setRews(final String rews) {
		this.rews = rews; 
	}
 
}
