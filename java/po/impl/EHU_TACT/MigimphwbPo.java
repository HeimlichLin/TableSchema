package com.doc.common.po.impl; 
 
public class MigimphwbPo implements IMigimphwbPo {
 
	public enum COLUMNS {
		BAGNO("null"), //
		DECLNO("null"), //
		DECLTYPE("null"), //
		MWB("null"), //
		HWB("null"), //
		BOXNO("null"), //
		CLEARANCETYPE("null"), //
		RELEASETIME("null"), //
		CANCELRELEASE("null"), //
		MANUCLEARANCETYPE("null"), //
		PIECE("null"), //
		UNIT("null"), //
		WEIGHT("null"), //
		INDICATOR("null"), //
		DUTYPAYMENT("null"), //
		EXAMINATIONNOTE("null"), //
		IE("null"), //
		GCIPIECE("null"), //
		GCIDATE1("null"), //
		GCIDATE2("null"), //
		GCIWEIGHT("null"), //
		CHWS("null"), //
		GCOPIECE("null"), //
		GCODATE1("null"), //
		GCODATE2("null"), //
		GCOBAGSN("null"), //
		CLOSEMARK("null"), //
		EXPRESSID("null"), //
		AIRLINEID("null"), //
		FLIGHTNO("null"), //
		FLIGHTDEST("null"), //
		FLIGHTDATE("null"), //
		CANCELGCO("null"), //
		LASTUPDATE("null"), //
		HOLDAREA("null"), //
		HOLDREASON("null"), //
		EXPBAGNO("null"), //
		GCIWS("null"), //
		GCIUSER("null"), //
		GCOWS("null"), //
		GCOUSER("null"), //
		CHARGEBOX("null"), //
		CHARGEDATE("null"), //
		FROZEN("null"), //
		PRINTDUTY("null"), //
		PRINTUSER("null"), //
		PRINTSN("null"), //
		GCILOCK("null"), //
		LOCKUSER("null") //
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
	private String declno;
	private String decltype;
	private String mwb;
	private String hwb;
	private String boxno;
	private String clearancetype;
	private java.sql.Timestamp releasetime;
	private java.sql.Timestamp cancelrelease;
	private String manuclearancetype;
	private BigDecimal piece;
	private String unit;
	private BigDecimal weight;
	private String indicator;
	private BigDecimal dutypayment;
	private String examinationnote;
	private String ie;
	private BigDecimal gcipiece;
	private java.sql.Timestamp gcidate1;
	private java.sql.Timestamp gcidate2;
	private BigDecimal gciweight;
	private String chws;
	private BigDecimal gcopiece;
	private java.sql.Timestamp gcodate1;
	private java.sql.Timestamp gcodate2;
	private BigDecimal gcobagsn;
	private String closemark;
	private String expressid;
	private String airlineid;
	private String flightno;
	private String flightdest;
	private java.sql.Timestamp flightdate;
	private BigDecimal cancelgco;
	private java.sql.Timestamp lastupdate;
	private String holdarea;
	private String holdreason;
	private String expbagno;
	private String gciws;
	private String gciuser;
	private String gcows;
	private String gcouser;
	private String chargebox;
	private java.sql.Timestamp chargedate;
	private String frozen;
	private java.sql.Timestamp printduty;
	private String printuser;
	private BigDecimal printsn;
	private java.sql.Timestamp gcilock;
	private String lockuser;

	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
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
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
	}
 
	@Override
	public String getClearancetype() {
		return this.clearancetype;
	}
 
	@Override
	public void setClearancetype(final String clearancetype) {
		this.clearancetype = clearancetype; 
	}
 
	@Override
	public java.sql.Timestamp getReleasetime() {
		return this.releasetime;
	}
 
	@Override
	public void setReleasetime(final java.sql.Timestamp releasetime) {
		this.releasetime = releasetime; 
	}
 
	@Override
	public java.sql.Timestamp getCancelrelease() {
		return this.cancelrelease;
	}
 
	@Override
	public void setCancelrelease(final java.sql.Timestamp cancelrelease) {
		this.cancelrelease = cancelrelease; 
	}
 
	@Override
	public String getManuclearancetype() {
		return this.manuclearancetype;
	}
 
	@Override
	public void setManuclearancetype(final String manuclearancetype) {
		this.manuclearancetype = manuclearancetype; 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
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
	public String getIndicator() {
		return this.indicator;
	}
 
	@Override
	public void setIndicator(final String indicator) {
		this.indicator = indicator; 
	}
 
	@Override
	public BigDecimal getDutypayment() {
		return this.dutypayment;
	}
 
	@Override
	public void setDutypayment(final BigDecimal dutypayment) {
		this.dutypayment = dutypayment; 
	}
 
	@Override
	public String getExaminationnote() {
		return this.examinationnote;
	}
 
	@Override
	public void setExaminationnote(final String examinationnote) {
		this.examinationnote = examinationnote; 
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
	public BigDecimal getGcipiece() {
		return this.gcipiece;
	}
 
	@Override
	public void setGcipiece(final BigDecimal gcipiece) {
		this.gcipiece = gcipiece; 
	}
 
	@Override
	public java.sql.Timestamp getGcidate1() {
		return this.gcidate1;
	}
 
	@Override
	public void setGcidate1(final java.sql.Timestamp gcidate1) {
		this.gcidate1 = gcidate1; 
	}
 
	@Override
	public java.sql.Timestamp getGcidate2() {
		return this.gcidate2;
	}
 
	@Override
	public void setGcidate2(final java.sql.Timestamp gcidate2) {
		this.gcidate2 = gcidate2; 
	}
 
	@Override
	public BigDecimal getGciweight() {
		return this.gciweight;
	}
 
	@Override
	public void setGciweight(final BigDecimal gciweight) {
		this.gciweight = gciweight; 
	}
 
	@Override
	public String getChws() {
		return this.chws;
	}
 
	@Override
	public void setChws(final String chws) {
		this.chws = chws; 
	}
 
	@Override
	public BigDecimal getGcopiece() {
		return this.gcopiece;
	}
 
	@Override
	public void setGcopiece(final BigDecimal gcopiece) {
		this.gcopiece = gcopiece; 
	}
 
	@Override
	public java.sql.Timestamp getGcodate1() {
		return this.gcodate1;
	}
 
	@Override
	public void setGcodate1(final java.sql.Timestamp gcodate1) {
		this.gcodate1 = gcodate1; 
	}
 
	@Override
	public java.sql.Timestamp getGcodate2() {
		return this.gcodate2;
	}
 
	@Override
	public void setGcodate2(final java.sql.Timestamp gcodate2) {
		this.gcodate2 = gcodate2; 
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
	public String getClosemark() {
		return this.closemark;
	}
 
	@Override
	public void setClosemark(final String closemark) {
		this.closemark = closemark; 
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
	public BigDecimal getCancelgco() {
		return this.cancelgco;
	}
 
	@Override
	public void setCancelgco(final BigDecimal cancelgco) {
		this.cancelgco = cancelgco; 
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
	public String getHoldarea() {
		return this.holdarea;
	}
 
	@Override
	public void setHoldarea(final String holdarea) {
		this.holdarea = holdarea; 
	}
 
	@Override
	public String getHoldreason() {
		return this.holdreason;
	}
 
	@Override
	public void setHoldreason(final String holdreason) {
		this.holdreason = holdreason; 
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
	public String getGciws() {
		return this.gciws;
	}
 
	@Override
	public void setGciws(final String gciws) {
		this.gciws = gciws; 
	}
 
	@Override
	public String getGciuser() {
		return this.gciuser;
	}
 
	@Override
	public void setGciuser(final String gciuser) {
		this.gciuser = gciuser; 
	}
 
	@Override
	public String getGcows() {
		return this.gcows;
	}
 
	@Override
	public void setGcows(final String gcows) {
		this.gcows = gcows; 
	}
 
	@Override
	public String getGcouser() {
		return this.gcouser;
	}
 
	@Override
	public void setGcouser(final String gcouser) {
		this.gcouser = gcouser; 
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
	public String getFrozen() {
		return this.frozen;
	}
 
	@Override
	public void setFrozen(final String frozen) {
		this.frozen = frozen; 
	}
 
	@Override
	public java.sql.Timestamp getPrintduty() {
		return this.printduty;
	}
 
	@Override
	public void setPrintduty(final java.sql.Timestamp printduty) {
		this.printduty = printduty; 
	}
 
	@Override
	public String getPrintuser() {
		return this.printuser;
	}
 
	@Override
	public void setPrintuser(final String printuser) {
		this.printuser = printuser; 
	}
 
	@Override
	public BigDecimal getPrintsn() {
		return this.printsn;
	}
 
	@Override
	public void setPrintsn(final BigDecimal printsn) {
		this.printsn = printsn; 
	}
 
	@Override
	public java.sql.Timestamp getGcilock() {
		return this.gcilock;
	}
 
	@Override
	public void setGcilock(final java.sql.Timestamp gcilock) {
		this.gcilock = gcilock; 
	}
 
	@Override
	public String getLockuser() {
		return this.lockuser;
	}
 
	@Override
	public void setLockuser(final String lockuser) {
		this.lockuser = lockuser; 
	}
 
}
