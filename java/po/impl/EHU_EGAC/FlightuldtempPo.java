package com.doc.common.po.impl; 
 
public class FlightuldtempPo implements IFlightuldtempPo {
 
	public enum COLUMNS {
		FLIGHTULDNO("null"), //
		FLIGHTNO("null"), //
		FLIGHTDEST("null"), //
		FLIGHTDATE("null"), //
		ULD("null"), //
		LOADWEIGHT("null"), //
		TAREWEIGHT("null"), //
		NETWEIGHT("null"), //
		MWB("null"), //
		CHARGEBOX("null"), //
		MWBWEIGHT("null"), //
		RPTSEQ("null"), //
		MWBPIECE("null") //
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
	private String flightno;
	private String flightdest;
	private String flightdate;
	private String uld;
	private String loadweight;
	private String tareweight;
	private String netweight;
	private String mwb;
	private String chargebox;
	private BigDecimal mwbweight;
	private BigDecimal rptseq;
	private BigDecimal mwbpiece;

	@Override
	public BigDecimal getFlightuldno() {
		return this.flightuldno;
	}
 
	@Override
	public void setFlightuldno(final BigDecimal flightuldno) {
		this.flightuldno = flightuldno; 
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
	public String getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final String flightdate) {
		this.flightdate = flightdate; 
	}
 
	@Override
	public String getUld() {
		return this.uld;
	}
 
	@Override
	public void setUld(final String uld) {
		this.uld = uld; 
	}
 
	@Override
	public String getLoadweight() {
		return this.loadweight;
	}
 
	@Override
	public void setLoadweight(final String loadweight) {
		this.loadweight = loadweight; 
	}
 
	@Override
	public String getTareweight() {
		return this.tareweight;
	}
 
	@Override
	public void setTareweight(final String tareweight) {
		this.tareweight = tareweight; 
	}
 
	@Override
	public String getNetweight() {
		return this.netweight;
	}
 
	@Override
	public void setNetweight(final String netweight) {
		this.netweight = netweight; 
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
	public String getChargebox() {
		return this.chargebox;
	}
 
	@Override
	public void setChargebox(final String chargebox) {
		this.chargebox = chargebox; 
	}
 
	@Override
	public BigDecimal getMwbweight() {
		return this.mwbweight;
	}
 
	@Override
	public void setMwbweight(final BigDecimal mwbweight) {
		this.mwbweight = mwbweight; 
	}
 
	@Override
	public BigDecimal getRptseq() {
		return this.rptseq;
	}
 
	@Override
	public void setRptseq(final BigDecimal rptseq) {
		this.rptseq = rptseq; 
	}
 
	@Override
	public BigDecimal getMwbpiece() {
		return this.mwbpiece;
	}
 
	@Override
	public void setMwbpiece(final BigDecimal mwbpiece) {
		this.mwbpiece = mwbpiece; 
	}
 
}
