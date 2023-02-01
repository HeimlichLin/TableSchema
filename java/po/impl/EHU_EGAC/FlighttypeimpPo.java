package com.doc.common.po.impl; 
 
public class FlighttypeimpPo implements IFlighttypeimpPo {
 
	public enum COLUMNS {
		FDATE("null"), //
		FLIGHTNO("null"), //
		AIRLINEID("null"), //
		FLIGHTTYPE("null"), //
		HWB("null"), //
		PIECE("null"), //
		WEIGHT("null"), //
		DEST("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp fdate;
	private String flightno;
	private String airlineid;
	private String flighttype;
	private BigDecimal hwb;
	private BigDecimal piece;
	private BigDecimal weight;
	private String dest;

	@Override
	public java.sql.Timestamp getFdate() {
		return this.fdate;
	}
 
	@Override
	public void setFdate(final java.sql.Timestamp fdate) {
		this.fdate = fdate; 
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
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
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
	public BigDecimal getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final BigDecimal hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public BigDecimal getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final BigDecimal piece) {
		this.piece = piece; 
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
	public String getDest() {
		return this.dest;
	}
 
	@Override
	public void setDest(final String dest) {
		this.dest = dest; 
	}
 
}
