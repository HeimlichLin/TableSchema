package com.doc.common.po.impl; 
 
public class FlightuldPo implements IFlightuldPo {
 
	public enum COLUMNS {
		FLIGHTULDNO("null"), //
		AIRLINEID("null"), //
		FLIGHTNO("null"), //
		FLIGHTDEST("null"), //
		FLIGHTDATE("null"), //
		ULDTYPE("null"), //
		ULDNO("null"), //
		ULDOWNER("null"), //
		LOADWEIGHT("null"), //
		TAREWEIGHT("null"), //
		REMAINWEIGHT("null"), //
		BLANKMWB("null"), //
		CHARGEDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal flightuldno;
	private String airlineid;
	private String flightno;
	private String flightdest;
	private java.sql.Timestamp flightdate;
	private String uldtype;
	private String uldno;
	private String uldowner;
	private BigDecimal loadweight;
	private BigDecimal tareweight;
	private BigDecimal remainweight;
	private BigDecimal blankmwb;
	private java.sql.Timestamp chargedate;

	@Override
	public BigDecimal getFlightuldno() {
		return this.flightuldno;
	}
 
	@Override
	public void setFlightuldno(final BigDecimal flightuldno) {
		this.flightuldno = flightuldno; 
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
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getFlightdest() {
		return this.flightdest;
	}
 
	@Override
	public void setFlightdest(final String flightdest) {
		this.flightdest = flightdest; 
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
	public String getUldtype() {
		return this.uldtype;
	}
 
	@Override
	public void setUldtype(final String uldtype) {
		this.uldtype = uldtype; 
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
	public String getUldowner() {
		return this.uldowner;
	}
 
	@Override
	public void setUldowner(final String uldowner) {
		this.uldowner = uldowner; 
	}
 
	@Override
	public BigDecimal getLoadweight() {
		return this.loadweight;
	}
 
	@Override
	public void setLoadweight(final BigDecimal loadweight) {
		this.loadweight = loadweight; 
	}
 
	@Override
	public BigDecimal getTareweight() {
		return this.tareweight;
	}
 
	@Override
	public void setTareweight(final BigDecimal tareweight) {
		this.tareweight = tareweight; 
	}
 
	@Override
	public BigDecimal getRemainweight() {
		return this.remainweight;
	}
 
	@Override
	public void setRemainweight(final BigDecimal remainweight) {
		this.remainweight = remainweight; 
	}
 
	@Override
	public BigDecimal getBlankmwb() {
		return this.blankmwb;
	}
 
	@Override
	public void setBlankmwb(final BigDecimal blankmwb) {
		this.blankmwb = blankmwb; 
	}
 
	@Override
	public java.sql.Timestamp getChargedate() {
		return this.chargedate;
	}
 
	@Override
	public void setChargedate(final java.sql.Timestamp chargedate) {
		this.chargedate = chargedate; 
	}
 
}
