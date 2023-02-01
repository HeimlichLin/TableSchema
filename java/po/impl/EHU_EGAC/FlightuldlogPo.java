package com.doc.common.po.impl; 
 
public class FlightuldlogPo implements IFlightuldlogPo {
 
	public enum COLUMNS {
		LOGUSERID("null"), //
		LOGDATE("null"), //
		ACTION("null"), //
		FLIGHTNO("null"), //
		FLIGHTDEST("null"), //
		FLIGHTDATE("null"), //
		ULD("null"), //
		LOADWEIGHT("null"), //
		TAREWEIGHT("null"), //
		CHARGEDATE("null"), //
		CHARGEBOX("null"), //
		MWB("null"), //
		MWBWEIGHT("null"), //
		MWBPIECE("null"), //
		P_FLIGHTNO("null"), //
		P_FLIGHTDEST("null"), //
		P_FLIGHTDATE("null"), //
		P_ULD("null"), //
		P_LOADWEIGHT("null"), //
		P_TAREWEIGHT("null"), //
		P_CHARGEDATE("null"), //
		P_CHARGEBOX("null"), //
		P_MWB("null"), //
		P_MWBWEIGHT("null"), //
		P_MWBPIECE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String loguserid;
	private java.sql.Timestamp logdate;
	private String action;
	private String flightno;
	private String flightdest;
	private java.sql.Timestamp flightdate;
	private String uld;
	private BigDecimal loadweight;
	private BigDecimal tareweight;
	private java.sql.Timestamp chargedate;
	private String chargebox;
	private String mwb;
	private BigDecimal mwbweight;
	private BigDecimal mwbpiece;
	private String pFlightno;
	private String pFlightdest;
	private java.sql.Timestamp pFlightdate;
	private String pUld;
	private BigDecimal pLoadweight;
	private BigDecimal pTareweight;
	private java.sql.Timestamp pChargedate;
	private String pChargebox;
	private String pMwb;
	private BigDecimal pMwbweight;
	private BigDecimal pMwbpiece;

	@Override
	public String getLoguserid() {
		return this.loguserid;
	}
 
	@Override
	public void setLoguserid(final String loguserid) {
		this.loguserid = loguserid; 
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
	public String getAction() {
		return this.action;
	}
 
	@Override
	public void setAction(final String action) {
		this.action = action; 
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
	public String getUld() {
		return this.uld;
	}
 
	@Override
	public void setUld(final String uld) {
		this.uld = uld; 
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
 
	@Override
	public String getPFlightno() {
		return this.pFlightno;
	}
 
	@Override
	public void setPFlightno(final String pFlightno) {
		this.pFlightno = pFlightno; 
	}
 
	@Override
	public String getPFlightdest() {
		return this.pFlightdest;
	}
 
	@Override
	public void setPFlightdest(final String pFlightdest) {
		this.pFlightdest = pFlightdest; 
	}
 
	@Override
	public java.sql.Timestamp getPFlightdate() {
		return this.pFlightdate;
	}
 
	@Override
	public void setPFlightdate(final java.sql.Timestamp pFlightdate) {
		this.pFlightdate = pFlightdate; 
	}
 
	@Override
	public String getPUld() {
		return this.pUld;
	}
 
	@Override
	public void setPUld(final String pUld) {
		this.pUld = pUld; 
	}
 
	@Override
	public BigDecimal getPLoadweight() {
		return this.pLoadweight;
	}
 
	@Override
	public void setPLoadweight(final BigDecimal pLoadweight) {
		this.pLoadweight = pLoadweight; 
	}
 
	@Override
	public BigDecimal getPTareweight() {
		return this.pTareweight;
	}
 
	@Override
	public void setPTareweight(final BigDecimal pTareweight) {
		this.pTareweight = pTareweight; 
	}
 
	@Override
	public java.sql.Timestamp getPChargedate() {
		return this.pChargedate;
	}
 
	@Override
	public void setPChargedate(final java.sql.Timestamp pChargedate) {
		this.pChargedate = pChargedate; 
	}
 
	@Override
	public String getPChargebox() {
		return this.pChargebox;
	}
 
	@Override
	public void setPChargebox(final String pChargebox) {
		this.pChargebox = pChargebox; 
	}
 
	@Override
	public String getPMwb() {
		return this.pMwb;
	}
 
	@Override
	public void setPMwb(final String pMwb) {
		this.pMwb = pMwb; 
	}
 
	@Override
	public BigDecimal getPMwbweight() {
		return this.pMwbweight;
	}
 
	@Override
	public void setPMwbweight(final BigDecimal pMwbweight) {
		this.pMwbweight = pMwbweight; 
	}
 
	@Override
	public BigDecimal getPMwbpiece() {
		return this.pMwbpiece;
	}
 
	@Override
	public void setPMwbpiece(final BigDecimal pMwbpiece) {
		this.pMwbpiece = pMwbpiece; 
	}
 
}
