package com.doc.common.po.impl; 
 
public class LogairlinefaxPo implements ILogairlinefaxPo {
 
	public enum COLUMNS {
		FLIGHTNO("null"), //
		FLIGHTDATE("null"), //
		ULDNO("null"), //
		FAXPHONE("null"), //
		USERID("null"), //
		LOGDATE("null"), //
		FAXSTATIC("null"), //
		WORKAREA("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String flightno;
	private java.sql.Timestamp flightdate;
	private String uldno;
	private String faxphone;
	private String userid;
	private java.sql.Timestamp logdate;
	private String faxstatic;
	private String workarea;

	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public java.sql.Timestamp getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final java.sql.Timestamp flightdate) {
		this.flightdate = flightdate; 
	}
 
	@Override
	public String getUldno() {
		return this.uldno;
	}
 
	@Override
	public void setUldno(final String uldno) {
		this.uldno = uldno; 
	}
 
	@Override
	public String getFaxphone() {
		return this.faxphone;
	}
 
	@Override
	public void setFaxphone(final String faxphone) {
		this.faxphone = faxphone; 
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
	public java.sql.Timestamp getLogdate() {
		return this.logdate;
	}
 
	@Override
	public void setLogdate(final java.sql.Timestamp logdate) {
		this.logdate = logdate; 
	}
 
	@Override
	public String getFaxstatic() {
		return this.faxstatic;
	}
 
	@Override
	public void setFaxstatic(final String faxstatic) {
		this.faxstatic = faxstatic; 
	}
 
	@Override
	public String getWorkarea() {
		return this.workarea;
	}
 
	@Override
	public void setWorkarea(final String workarea) {
		this.workarea = workarea; 
	}
 
}
