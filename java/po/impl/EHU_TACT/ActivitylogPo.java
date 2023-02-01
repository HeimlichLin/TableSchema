package com.doc.common.po.impl; 
 
public class ActivitylogPo implements IActivitylogPo {
 
	public enum COLUMNS {
		WS("null"), //
		USERID("null"), //
		APUPTIME("null"), //
		APDOWNTIME("null"), //
		USERLOGINTIME("null"), //
		USERLOGOUTTIME("null"), //
		FORMUPTIME("null"), //
		FORMDOWNTIME("null"), //
		FORM("null"), //
		EXPBAGNO("null"), //
		MWB("null"), //
		HWB("null"), //
		ACTION("null"), //
		WEIGHT("null"), //
		ORIWEIGHT("null"), //
		LASTUPDATE("null"), //
		DOWNUSERID("null"), //
		DOWNFORMTIME("null"), //
		DOWNFORM("null"), //
		TRYINGUSERID("null"), //
		TRYINGTIME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String ws;
	private String userid;
	private java.sql.Timestamp apuptime;
	private java.sql.Timestamp apdowntime;
	private java.sql.Timestamp userlogintime;
	private java.sql.Timestamp userlogouttime;
	private java.sql.Timestamp formuptime;
	private java.sql.Timestamp formdowntime;
	private String form;
	private String expbagno;
	private String mwb;
	private String hwb;
	private String action;
	private BigDecimal weight;
	private BigDecimal oriweight;
	private java.sql.Timestamp lastupdate;
	private String downuserid;
	private java.sql.Timestamp downformtime;
	private String downform;
	private String tryinguserid;
	private java.sql.Timestamp tryingtime;

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
	public java.sql.Timestamp getApuptime() {
		return this.apuptime;
	}
 
	@Override
	public void setApuptime(final java.sql.Timestamp apuptime) {
		this.apuptime = apuptime; 
	}
 
	@Override
	public java.sql.Timestamp getApdowntime() {
		return this.apdowntime;
	}
 
	@Override
	public void setApdowntime(final java.sql.Timestamp apdowntime) {
		this.apdowntime = apdowntime; 
	}
 
	@Override
	public java.sql.Timestamp getUserlogintime() {
		return this.userlogintime;
	}
 
	@Override
	public void setUserlogintime(final java.sql.Timestamp userlogintime) {
		this.userlogintime = userlogintime; 
	}
 
	@Override
	public java.sql.Timestamp getUserlogouttime() {
		return this.userlogouttime;
	}
 
	@Override
	public void setUserlogouttime(final java.sql.Timestamp userlogouttime) {
		this.userlogouttime = userlogouttime; 
	}
 
	@Override
	public java.sql.Timestamp getFormuptime() {
		return this.formuptime;
	}
 
	@Override
	public void setFormuptime(final java.sql.Timestamp formuptime) {
		this.formuptime = formuptime; 
	}
 
	@Override
	public java.sql.Timestamp getFormdowntime() {
		return this.formdowntime;
	}
 
	@Override
	public void setFormdowntime(final java.sql.Timestamp formdowntime) {
		this.formdowntime = formdowntime; 
	}
 
	@Override
	public String getForm() {
		return this.form;
	}
 
	@Override
	public void setForm(final String form) {
		this.form = form; 
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
	public String getAction() {
		return this.action;
	}
 
	@Override
	public void setAction(final String action) {
		this.action = action; 
	}
 
	@Override
	public BigDecimal getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final BigDecimal weight) {
		this.weight = weight; 
	}
 
	@Override
	public BigDecimal getOriweight() {
		return this.oriweight;
	}
 
	@Override
	public void setOriweight(final BigDecimal oriweight) {
		this.oriweight = oriweight; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public String getDownuserid() {
		return this.downuserid;
	}
 
	@Override
	public void setDownuserid(final String downuserid) {
		this.downuserid = downuserid; 
	}
 
	@Override
	public java.sql.Timestamp getDownformtime() {
		return this.downformtime;
	}
 
	@Override
	public void setDownformtime(final java.sql.Timestamp downformtime) {
		this.downformtime = downformtime; 
	}
 
	@Override
	public String getDownform() {
		return this.downform;
	}
 
	@Override
	public void setDownform(final String downform) {
		this.downform = downform; 
	}
 
	@Override
	public String getTryinguserid() {
		return this.tryinguserid;
	}
 
	@Override
	public void setTryinguserid(final String tryinguserid) {
		this.tryinguserid = tryinguserid; 
	}
 
	@Override
	public java.sql.Timestamp getTryingtime() {
		return this.tryingtime;
	}
 
	@Override
	public void setTryingtime(final java.sql.Timestamp tryingtime) {
		this.tryingtime = tryingtime; 
	}
 
}
