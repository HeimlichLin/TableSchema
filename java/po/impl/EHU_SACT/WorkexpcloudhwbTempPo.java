package com.doc.common.po.impl; 
 
public class WorkexpcloudhwbTempPo implements IWorkexpcloudhwbTempPo {
 
	public enum COLUMNS {
		IE("null"), //
		MWB("null"), //
		HWB("null"), //
		EXPBAGNO("null"), //
		DECLNO("null"), //
		DECLTYPE("null"), //
		EXPRESSID("null"), //
		BOXNO("null"), //
		RESULT_CODE("null"), //
		CLEARANCETYPE("null"), //
		CHWS("null"), //
		PIECE("null"), //
		BAGHWB("?????"), //
		GCIWEIGHT("null"), //
		GCIPIECE("null"), //
		GCIDATE1("null"), //
		GCIDATE2("null"), //
		GCIWS("null"), //
		GCIUSER("null"), //
		GCOPIECE("null"), //
		GCODATE1("null"), //
		GCODATE2("null"), //
		GCOBAGSN("????????"), //
		GCOWS("null"), //
		GCOUSER("null"), //
		AIRLINEID("null"), //
		FLIGHTNO("null"), //
		FLIGHTDEST("null"), //
		CHARGEBOX("null"), //
		CHARGEDATE("null"), //
		PRINTDUTY("null"), //
		PRINTUSER("null"), //
		PRINTSN("null"), //
		ISOPEN("????, null:?????, 1:?????????, 9:???????????"), //
		ISCHG("??????, null:?????????, 1:?????EDI???, A:???????"), //
		LASTUPDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String ie;
	private String mwb;
	private String hwb;
	private String expbagno;
	private String declno;
	private String decltype;
	private String expressid;
	private String boxno;
	private String resultCode;
	private String clearancetype;
	private String chws;
	private BigDecimal piece;
	private BigDecimal baghwb;
	private BigDecimal gciweight;
	private BigDecimal gcipiece;
	private java.sql.Timestamp gcidate1;
	private java.sql.Timestamp gcidate2;
	private String gciws;
	private String gciuser;
	private BigDecimal gcopiece;
	private java.sql.Timestamp gcodate1;
	private java.sql.Timestamp gcodate2;
	private BigDecimal gcobagsn;
	private String gcows;
	private String gcouser;
	private String airlineid;
	private String flightno;
	private String flightdest;
	private String chargebox;
	private java.sql.Timestamp chargedate;
	private java.sql.Timestamp printduty;
	private String printuser;
	private BigDecimal printsn;
	private String isopen;
	private String ischg;
	private java.sql.Timestamp lastupdate;

	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
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
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
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
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
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
	public String getResultCode() {
		return this.resultCode;
	}
 
	@Override
	public void setResultCode(final String resultCode) {
		this.resultCode = resultCode; 
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
	public String getChws() {
		return this.chws;
	}
 
	@Override
	public void setChws(final String chws) {
		this.chws = chws; 
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
	public BigDecimal getBaghwb() {
		return this.baghwb;
	}
 
	@Override
	public void setBaghwb(final BigDecimal baghwb) {
		this.baghwb = baghwb; 
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
	public String getIsopen() {
		return this.isopen;
	}
 
	@Override
	public void setIsopen(final String isopen) {
		this.isopen = isopen; 
	}
 
	@Override
	public String getIschg() {
		return this.ischg;
	}
 
	@Override
	public void setIschg(final String ischg) {
		this.ischg = ischg; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
}
