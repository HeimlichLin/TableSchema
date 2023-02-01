package com.doc.common.po.impl; 
 
public class AirlinefaxPo implements IAirlinefaxPo {
 
	public enum COLUMNS {
		SERIAL("null"), //
		AIRLINEID("null"), //
		NAME("null"), //
		FAX("null"), //
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
 
	private BigDecimal serial;
	private String airlineid;
	private String name;
	private String fax;
	private String userid;
	private java.sql.Timestamp lastdate;

	@Override
	public BigDecimal getSerial() {
		return this.serial;
	}
 
	@Override
	public void setSerial(final BigDecimal serial) {
		this.serial = serial; 
	}
 
	@Override
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
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
