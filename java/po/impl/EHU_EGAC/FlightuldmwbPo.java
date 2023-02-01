package com.doc.common.po.impl; 
 
public class FlightuldmwbPo implements IFlightuldmwbPo {
 
	public enum COLUMNS {
		FLIGHTULDNO("null"), //
		CHARGEBOX("null"), //
		MWB("null"), //
		MWBWEIGHT("null"), //
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
	private String chargebox;
	private String mwb;
	private BigDecimal mwbweight;
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
	public String getChargebox() {
		return this.chargebox;
	}
 
	@Override
	public void setChargebox(final String chargebox) {
		this.chargebox = chargebox; 
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
	public BigDecimal getMwbweight() {
		return this.mwbweight;
	}
 
	@Override
	public void setMwbweight(final BigDecimal mwbweight) {
		this.mwbweight = mwbweight; 
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
