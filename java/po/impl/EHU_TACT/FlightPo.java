package com.doc.common.po.impl; 
 
public class FlightPo implements IFlightPo {
 
	public enum COLUMNS {
		AIRLINEID("null"), //
		FLIGHTNO("null"), //
		FLIGHTTYPE("null"), //
		FLIGHTAREA("null"), //
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
 
	private String airlineid;
	private String flightno;
	private String flighttype;
	private String flightarea;
	private String flightdest;

	@Override
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
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
	public String getFlightarea() {
		return this.flightarea;
	}
 
	@Override
	public void setFlightarea(final String flightarea) {
		this.flightarea = flightarea; 
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
