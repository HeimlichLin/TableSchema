package com.doc.common.po.impl; 
 
public class RptImportexportsummaryPo implements IRptImportexportsummaryPo {
 
	public enum COLUMNS {
		UNIQUEID("null"), //
		TRANID("null"), //
		HWBFEE("null"), //
		MWB("null"), //
		HWB("null"), //
		DECLTYPE("null"), //
		DECLNO("null"), //
		PIECE("null"), //
		GCIPIECE("null"), //
		GCIWEIGHT("null"), //
		GCIDATE1("null"), //
		WEIGHT("null"), //
		GCOPIECE("null"), //
		GCODATE1("null"), //
		RELEASETIME("null"), //
		CLEARANCETYPE("null"), //
		CLOSEMARK("null"), //
		EXPRESSID("null"), //
		AIRLINEID("null"), //
		FLIGHTNO("null"), //
		BAGHWB("null"), //
		CREATEDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal uniqueid;
	private BigDecimal tranid;
	private BigDecimal hwbfee;
	private String mwb;
	private String hwb;
	private String decltype;
	private String declno;
	private BigDecimal piece;
	private BigDecimal gcipiece;
	private BigDecimal gciweight;
	private java.sql.Timestamp gcidate1;
	private BigDecimal weight;
	private BigDecimal gcopiece;
	private java.sql.Timestamp gcodate1;
	private java.sql.Timestamp releasetime;
	private String clearancetype;
	private String closemark;
	private String expressid;
	private String airlineid;
	private String flightno;
	private BigDecimal baghwb;
	private java.sql.Timestamp createdate;

	@Override
	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}
 
	@Override
	public void setUniqueid(final BigDecimal uniqueid) {
		this.uniqueid = uniqueid; 
	}
 
	@Override
	public BigDecimal getTranid() {
		return this.tranid;
	}
 
	@Override
	public void setTranid(final BigDecimal tranid) {
		this.tranid = tranid; 
	}
 
	@Override
	public BigDecimal getHwbfee() {
		return this.hwbfee;
	}
 
	@Override
	public void setHwbfee(final BigDecimal hwbfee) {
		this.hwbfee = hwbfee; 
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
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
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
	public BigDecimal getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final BigDecimal piece) {
		this.piece = piece; 
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
	public BigDecimal getGciweight() {
		return this.gciweight;
	}
 
	@Override
	public void setGciweight(final BigDecimal gciweight) {
		this.gciweight = gciweight; 
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
	public BigDecimal getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final BigDecimal weight) {
		this.weight = weight; 
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
	public java.sql.Timestamp getReleasetime() {
		return this.releasetime;
	}
 
	@Override
	public void setReleasetime(final java.sql.Timestamp releasetime) {
		this.releasetime = releasetime; 
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
	public BigDecimal getBaghwb() {
		return this.baghwb;
	}
 
	@Override
	public void setBaghwb(final BigDecimal baghwb) {
		this.baghwb = baghwb; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
}
