package com.doc.common.po.impl; 
 
public class Tv02imphwbPo implements ITv02imphwbPo {
 
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
		PIECE("null"), //
		UNIT("null"), //
		WEIGHT("null"), //
		INDICATOR("null"), //
		CHTAX("null"), //
		EXAMINATIONNOTE("null"), //
		GCIPIECE("null"), //
		GCIWS("null"), //
		GCIUSER("null"), //
		GCIDATE1("null"), //
		GCIDATE2("null"), //
		GCIWEIGHT("null"), //
		GCOPIECE("null"), //
		GCOWS("null"), //
		GCOUSER("null"), //
		GCODATE1("null"), //
		GCODATE2("null"), //
		CLOSEMARK("null"), //
		CONVEREYID("null"), //
		EXPRESSID("null"), //
		AIRLINEID("null"), //
		FLIGHTNO("null"), //
		FLIGHTDEST("null"), //
		MANUCLEARANCETYPE("null"), //
		CANCELGCOREASON("null"), //
		CANCELGCODATE("null"), //
		GCOBAGSN("null"), //
		IE("null"), //
		LASTUPDATE("null"), //
		CHWS("null"), //
		FLIGHTDATE("null"), //
		EXPBAGNO("null"), //
		PRINTDUTY("null"), //
		GCILOCK("null"), //
		PRINTUSER("null") //
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
	private BigDecimal piece;
	private String unit;
	private BigDecimal weight;
	private String indicator;
	private BigDecimal chtax;
	private String examinationnote;
	private BigDecimal gcipiece;
	private String gciws;
	private String gciuser;
	private java.sql.Timestamp gcidate1;
	private java.sql.Timestamp gcidate2;
	private BigDecimal gciweight;
	private BigDecimal gcopiece;
	private String gcows;
	private String gcouser;
	private java.sql.Timestamp gcodate1;
	private java.sql.Timestamp gcodate2;
	private String closemark;
	private String convereyid;
	private String expressid;
	private String airlineid;
	private String flightno;
	private String flightdest;
	private String manuclearancetype;
	private String cancelgcoreason;
	private java.sql.Timestamp cancelgcodate;
	private BigDecimal gcobagsn;
	private String ie;
	private java.sql.Timestamp lastupdate;
	private String chws;
	private java.sql.Timestamp flightdate;
	private String expbagno;
	private java.sql.Timestamp printduty;
	private java.sql.Timestamp gcilock;
	private String printuser;

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
	public BigDecimal getChtax() {
		return this.chtax;
	}
 
	@Override
	public void setChtax(final BigDecimal chtax) {
		this.chtax = chtax; 
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
	public BigDecimal getGcipiece() {
		return this.gcipiece;
	}
 
	@Override
	public void setGcipiece(final BigDecimal gcipiece) {
		this.gcipiece = gcipiece; 
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
	public BigDecimal getGcopiece() {
		return this.gcopiece;
	}
 
	@Override
	public void setGcopiece(final BigDecimal gcopiece) {
		this.gcopiece = gcopiece; 
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
	public String getClosemark() {
		return this.closemark;
	}
 
	@Override
	public void setClosemark(final String closemark) {
		this.closemark = closemark; 
	}
 
	@Override
	public String getConvereyid() {
		return this.convereyid;
	}
 
	@Override
	public void setConvereyid(final String convereyid) {
		this.convereyid = convereyid; 
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
	public String getManuclearancetype() {
		return this.manuclearancetype;
	}
 
	@Override
	public void setManuclearancetype(final String manuclearancetype) {
		this.manuclearancetype = manuclearancetype; 
	}
 
	@Override
	public String getCancelgcoreason() {
		return this.cancelgcoreason;
	}
 
	@Override
	public void setCancelgcoreason(final String cancelgcoreason) {
		this.cancelgcoreason = cancelgcoreason; 
	}
 
	@Override
	public java.sql.Timestamp getCancelgcodate() {
		return this.cancelgcodate;
	}
 
	@Override
	public void setCancelgcodate(final java.sql.Timestamp cancelgcodate) {
		this.cancelgcodate = cancelgcodate; 
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
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
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
	public String getChws() {
		return this.chws;
	}
 
	@Override
	public void setChws(final String chws) {
		this.chws = chws; 
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
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
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
	public java.sql.Timestamp getGcilock() {
		return this.gcilock;
	}
 
	@Override
	public void setGcilock(final java.sql.Timestamp gcilock) {
		this.gcilock = gcilock; 
	}
 
	@Override
	public String getPrintuser() {
		return this.printuser;
	}
 
	@Override
	public void setPrintuser(final String printuser) {
		this.printuser = printuser; 
	}
 
}
