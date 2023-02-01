package com.doc.common.po.impl; 
 
public class TempexpbagPo implements ITempexpbagPo {
 
	public enum COLUMNS {
		BAGNO("null"), //
		EXPBAGNO("null"), //
		BAGHWB("null"), //
		BAGPIECE("null"), //
		BAGWEIGHT("null"), //
		BAGFEE("null"), //
		EXPRESSID("null"), //
		AIRLINEID("null"), //
		CHARGEBOX("null"), //
		CHARGEDATE("null"), //
		IE("null"), //
		GCIBAGSN("null"), //
		GCOBAGSN("null"), //
		LASTUPDATE("null"), //
		CHARGEUSER("null"), //
		EXPRESSFEE("null"), //
		AIRLINEFEE("null"), //
		FLIGHTNO("null"), //
		LASTCHARGEDATE("null"), //
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
 
	private String bagno;
	private String expbagno;
	private BigDecimal baghwb;
	private BigDecimal bagpiece;
	private BigDecimal bagweight;
	private BigDecimal bagfee;
	private String expressid;
	private String airlineid;
	private String chargebox;
	private java.sql.Timestamp chargedate;
	private String ie;
	private BigDecimal gcibagsn;
	private BigDecimal gcobagsn;
	private java.sql.Timestamp lastupdate;
	private String chargeuser;
	private BigDecimal expressfee;
	private BigDecimal airlinefee;
	private String flightno;
	private java.sql.Timestamp lastchargedate;
	private String workarea;

	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
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
	public BigDecimal getBagweight() {
		return this.bagweight;
	}
 
	@Override
	public void setBagweight(final BigDecimal bagweight) {
		this.bagweight = bagweight; 
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
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
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
	public String getChargebox() {
		return this.chargebox;
	}
 
	@Override
	public void setChargebox(final String chargebox) {
		this.chargebox = chargebox; 
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
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
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
	public String getChargeuser() {
		return this.chargeuser;
	}
 
	@Override
	public void setChargeuser(final String chargeuser) {
		this.chargeuser = chargeuser; 
	}
 
	@Override
	public BigDecimal getExpressfee() {
		return this.expressfee;
	}
 
	@Override
	public void setExpressfee(final BigDecimal expressfee) {
		this.expressfee = expressfee; 
	}
 
	@Override
	public BigDecimal getAirlinefee() {
		return this.airlinefee;
	}
 
	@Override
	public void setAirlinefee(final BigDecimal airlinefee) {
		this.airlinefee = airlinefee; 
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
	public java.sql.Timestamp getLastchargedate() {
		return this.lastchargedate;
	}
 
	@Override
	public void setLastchargedate(final java.sql.Timestamp lastchargedate) {
		this.lastchargedate = lastchargedate; 
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
