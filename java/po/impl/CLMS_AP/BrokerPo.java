package com.doc.common.po.impl; 
 
public class BrokerPo implements IBrokerPo {
 
	public enum COLUMNS {
		BOXNO("null"), //
		USERID("null"), //
		BROKERBAN("null"), //
		BROKERNAME("null"), //
		BROKERADD("null"), //
		MD("null"), //
		TEL("null"), //
		FAX("null"), //
		STATUS("null"), //
		ACTIVEDATE("null"), //
		CHARGEDATE("null"), //
		ENDDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String boxno;
	private String userid;
	private String brokerban;
	private String brokername;
	private String brokeradd;
	private String md;
	private String tel;
	private String fax;
	private String status;
	private String activedate;
	private String chargedate;
	private String enddate;

	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
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
	public String getBrokerban() {
		return this.brokerban;
	}
 
	@Override
	public void setBrokerban(final String brokerban) {
		this.brokerban = brokerban; 
	}
 
	@Override
	public String getBrokername() {
		return this.brokername;
	}
 
	@Override
	public void setBrokername(final String brokername) {
		this.brokername = brokername; 
	}
 
	@Override
	public String getBrokeradd() {
		return this.brokeradd;
	}
 
	@Override
	public void setBrokeradd(final String brokeradd) {
		this.brokeradd = brokeradd; 
	}
 
	@Override
	public String getMd() {
		return this.md;
	}
 
	@Override
	public void setMd(final String md) {
		this.md = md; 
	}
 
	@Override
	public String getTel() {
		return this.tel;
	}
 
	@Override
	public void setTel(final String tel) {
		this.tel = tel; 
	}
 
	@Override
	public String getFax() {
		return this.fax;
	}
 
	@Override
	public void setFax(final String fax) {
		this.fax = fax; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getActivedate() {
		return this.activedate;
	}
 
	@Override
	public void setActivedate(final String activedate) {
		this.activedate = activedate; 
	}
 
	@Override
	public String getChargedate() {
		return this.chargedate;
	}
 
	@Override
	public void setChargedate(final String chargedate) {
		this.chargedate = chargedate; 
	}
 
	@Override
	public String getEnddate() {
		return this.enddate;
	}
 
	@Override
	public void setEnddate(final String enddate) {
		this.enddate = enddate; 
	}
 
}
