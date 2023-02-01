package com.doc.common.po.impl; 
 
public class AirlinePo implements IAirlinePo {
 
	public enum COLUMNS {
		AIRLINEID("null"), //
		AIRLINECNAME("null"), //
		AIRLINEENAME("null"), //
		AIRLINESNAME("null"), //
		AID("null"), //
		FAX("null"), //
		MAILNAME1("null"), //
		MAILADD1("null"), //
		MAILNAME2("null"), //
		MAILADD2("null"), //
		USERID("null"), //
		LASTDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String airlineid;
	private String airlinecname;
	private String airlineename;
	private String airlinesname;
	private String aid;
	private String fax;
	private String mailname1;
	private String mailadd1;
	private String mailname2;
	private String mailadd2;
	private String userid;
	private java.sql.Timestamp lastdate;

	@Override
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
	}
 
	@Override
	public String getAirlinecname() {
		return this.airlinecname;
	}
 
	@Override
	public void setAirlinecname(final String airlinecname) {
		this.airlinecname = airlinecname; 
	}
 
	@Override
	public String getAirlineename() {
		return this.airlineename;
	}
 
	@Override
	public void setAirlineename(final String airlineename) {
		this.airlineename = airlineename; 
	}
 
	@Override
	public String getAirlinesname() {
		return this.airlinesname;
	}
 
	@Override
	public void setAirlinesname(final String airlinesname) {
		this.airlinesname = airlinesname; 
	}
 
	@Override
	public String getAid() {
		return this.aid;
	}
 
	@Override
	public void setAid(final String aid) {
		this.aid = aid; 
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
	public String getMailname1() {
		return this.mailname1;
	}
 
	@Override
	public void setMailname1(final String mailname1) {
		this.mailname1 = mailname1; 
	}
 
	@Override
	public String getMailadd1() {
		return this.mailadd1;
	}
 
	@Override
	public void setMailadd1(final String mailadd1) {
		this.mailadd1 = mailadd1; 
	}
 
	@Override
	public String getMailname2() {
		return this.mailname2;
	}
 
	@Override
	public void setMailname2(final String mailname2) {
		this.mailname2 = mailname2; 
	}
 
	@Override
	public String getMailadd2() {
		return this.mailadd2;
	}
 
	@Override
	public void setMailadd2(final String mailadd2) {
		this.mailadd2 = mailadd2; 
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
	public java.sql.Timestamp getLastdate() {
		return this.lastdate;
	}
 
	@Override
	public void setLastdate(final java.sql.Timestamp lastdate) {
		this.lastdate = lastdate; 
	}
 
}
