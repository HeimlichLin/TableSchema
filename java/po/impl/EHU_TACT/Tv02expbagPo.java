package com.doc.common.po.impl; 
 
public class Tv02expbagPo implements ITv02expbagPo {
 
	public enum COLUMNS {
		BAGNO("null"), //
		BAGHWB("null"), //
		BAGPIECE("null"), //
		BAGFEE("null"), //
		BAGWEIGHT("null"), //
		CHARGEDATE("null"), //
		CHARGEBOX("null"), //
		AIRLINEID("null"), //
		IE("null"), //
		GCOBAGSN("null"), //
		LASTUPDATE("null"), //
		EXPRESSID("null"), //
		GCIBAGSN("null"), //
		EXPBAGNO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bagno;
	private BigDecimal baghwb;
	private BigDecimal bagpiece;
	private BigDecimal bagfee;
	private BigDecimal bagweight;
	private java.sql.Timestamp chargedate;
	private String chargebox;
	private String airlineid;
	private String ie;
	private BigDecimal gcobagsn;
	private java.sql.Timestamp lastupdate;
	private String expressid;
	private BigDecimal gcibagsn;
	private String expbagno;

	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public BigDecimal getBaghwb() {
		return this.baghwb;
	}
 
	@Override
	public void setBaghwb(final BigDecimal baghwb) {
		this.baghwb = baghwb; 
	}
 
	@Override
	public BigDecimal getBagpiece() {
		return this.bagpiece;
	}
 
	@Override
	public void setBagpiece(final BigDecimal bagpiece) {
		this.bagpiece = bagpiece; 
	}
 
	@Override
	public BigDecimal getBagfee() {
		return this.bagfee;
	}
 
	@Override
	public void setBagfee(final BigDecimal bagfee) {
		this.bagfee = bagfee; 
	}
 
	@Override
	public BigDecimal getBagweight() {
		return this.bagweight;
	}
 
	@Override
	public void setBagweight(final BigDecimal bagweight) {
		this.bagweight = bagweight; 
	}
 
	@Override
	public java.sql.Timestamp getChargedate() {
		return this.chargedate;
	}
 
	@Override
	public void setChargedate(final java.sql.Timestamp chargedate) {
		this.chargedate = chargedate; 
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
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
	}
 
	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public BigDecimal getGcobagsn() {
		return this.gcobagsn;
	}
 
	@Override
	public void setGcobagsn(final BigDecimal gcobagsn) {
		this.gcobagsn = gcobagsn; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public BigDecimal getGcibagsn() {
		return this.gcibagsn;
	}
 
	@Override
	public void setGcibagsn(final BigDecimal gcibagsn) {
		this.gcibagsn = gcibagsn; 
	}
 
	@Override
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
	}
 
}
