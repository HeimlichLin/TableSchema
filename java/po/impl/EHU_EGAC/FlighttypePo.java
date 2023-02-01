package com.doc.common.po.impl; 
 
public class FlighttypePo implements IFlighttypePo {
 
	public enum COLUMNS {
		FLIGHTDATE("null"), //
		FLIGHTNO("null"), //
		FLIGHTTYPE("null"), //
		FLIGHTDEST("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp flightdate;
	private String flightno;
	private String flighttype;
	private String flightdest;

	@Override
	public java.sql.Timestamp getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final java.sql.Timestamp flightdate) {
		this.flightdate = flightdate; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getFlighttype() {
		return this.flighttype;
	}
 
	@Override
	public void setFlighttype(final String flighttype) {
		this.flighttype = flighttype; 
	}
 
	@Override
	public String getFlightdest() {
		return this.flightdest;
	}
 
	@Override
	public void setFlightdest(final String flightdest) {
		this.flightdest = flightdest; 
	}
 
}
