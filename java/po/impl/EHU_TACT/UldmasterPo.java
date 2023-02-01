package com.doc.common.po.impl; 
 
public class UldmasterPo implements IUldmasterPo {
 
	public enum COLUMNS {
		CONTAINER("null"), //
		FLIGHTNO("null"), //
		FLIGHTDATE("null"), //
		FLIGHTDEST("null"), //
		CONHEIGHT("null"), //
		AIRWORTHINESS("null"), //
		CONTYPE("null"), //
		PESSIZE("null"), //
		PEST("null"), //
		PESB("null"), //
		BWEIGHT("null"), //
		BWEIGHTTIME("null"), //
		EPCWEIGHT("null"), //
		EPCWEIGHTTIME("null"), //
		EPCWUSERID("null"), //
		TTLWEIGHT("null"), //
		TTLWEIGHTTIME("null"), //
		TTLWUSERID("null"), //
		CARGOWEIGHT("null"), //
		CARGOWEIGHTTIME("null"), //
		PESWEIGHT("null"), //
		ULDFLAG("null"), //
		AIRLINEID("null"), //
		SENDMAILTIME("傳送郵件時間"), //
		GCORANGESTARTDATE("null"), //
		GCORANGEENDDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String container;
	private String flightno;
	private java.sql.Timestamp flightdate;
	private String flightdest;
	private BigDecimal conheight;
	private String airworthiness;
	private String contype;
	private String pessize;
	private BigDecimal pest;
	private BigDecimal pesb;
	private BigDecimal bweight;
	private java.sql.Timestamp bweighttime;
	private BigDecimal epcweight;
	private java.sql.Timestamp epcweighttime;
	private String epcwuserid;
	private BigDecimal ttlweight;
	private java.sql.Timestamp ttlweighttime;
	private String ttlwuserid;
	private BigDecimal cargoweight;
	private java.sql.Timestamp cargoweighttime;
	private BigDecimal pesweight;
	private String uldflag;
	private String airlineid;
	private java.sql.Timestamp sendmailtime;
	private java.sql.Timestamp gcorangestartdate;
	private java.sql.Timestamp gcorangeenddate;

	@Override
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
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
	public java.sql.Timestamp getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final java.sql.Timestamp flightdate) {
		this.flightdate = flightdate; 
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
	public BigDecimal getConheight() {
		return this.conheight;
	}
 
	@Override
	public void setConheight(final BigDecimal conheight) {
		this.conheight = conheight; 
	}
 
	@Override
	public String getAirworthiness() {
		return this.airworthiness;
	}
 
	@Override
	public void setAirworthiness(final String airworthiness) {
		this.airworthiness = airworthiness; 
	}
 
	@Override
	public String getContype() {
		return this.contype;
	}
 
	@Override
	public void setContype(final String contype) {
		this.contype = contype; 
	}
 
	@Override
	public String getPessize() {
		return this.pessize;
	}
 
	@Override
	public void setPessize(final String pessize) {
		this.pessize = pessize; 
	}
 
	@Override
	public BigDecimal getPest() {
		return this.pest;
	}
 
	@Override
	public void setPest(final BigDecimal pest) {
		this.pest = pest; 
	}
 
	@Override
	public BigDecimal getPesb() {
		return this.pesb;
	}
 
	@Override
	public void setPesb(final BigDecimal pesb) {
		this.pesb = pesb; 
	}
 
	@Override
	public BigDecimal getBweight() {
		return this.bweight;
	}
 
	@Override
	public void setBweight(final BigDecimal bweight) {
		this.bweight = bweight; 
	}
 
	@Override
	public java.sql.Timestamp getBweighttime() {
		return this.bweighttime;
	}
 
	@Override
	public void setBweighttime(final java.sql.Timestamp bweighttime) {
		this.bweighttime = bweighttime; 
	}
 
	@Override
	public BigDecimal getEpcweight() {
		return this.epcweight;
	}
 
	@Override
	public void setEpcweight(final BigDecimal epcweight) {
		this.epcweight = epcweight; 
	}
 
	@Override
	public java.sql.Timestamp getEpcweighttime() {
		return this.epcweighttime;
	}
 
	@Override
	public void setEpcweighttime(final java.sql.Timestamp epcweighttime) {
		this.epcweighttime = epcweighttime; 
	}
 
	@Override
	public String getEpcwuserid() {
		return this.epcwuserid;
	}
 
	@Override
	public void setEpcwuserid(final String epcwuserid) {
		this.epcwuserid = epcwuserid; 
	}
 
	@Override
	public BigDecimal getTtlweight() {
		return this.ttlweight;
	}
 
	@Override
	public void setTtlweight(final BigDecimal ttlweight) {
		this.ttlweight = ttlweight; 
	}
 
	@Override
	public java.sql.Timestamp getTtlweighttime() {
		return this.ttlweighttime;
	}
 
	@Override
	public void setTtlweighttime(final java.sql.Timestamp ttlweighttime) {
		this.ttlweighttime = ttlweighttime; 
	}
 
	@Override
	public String getTtlwuserid() {
		return this.ttlwuserid;
	}
 
	@Override
	public void setTtlwuserid(final String ttlwuserid) {
		this.ttlwuserid = ttlwuserid; 
	}
 
	@Override
	public BigDecimal getCargoweight() {
		return this.cargoweight;
	}
 
	@Override
	public void setCargoweight(final BigDecimal cargoweight) {
		this.cargoweight = cargoweight; 
	}
 
	@Override
	public java.sql.Timestamp getCargoweighttime() {
		return this.cargoweighttime;
	}
 
	@Override
	public void setCargoweighttime(final java.sql.Timestamp cargoweighttime) {
		this.cargoweighttime = cargoweighttime; 
	}
 
	@Override
	public BigDecimal getPesweight() {
		return this.pesweight;
	}
 
	@Override
	public void setPesweight(final BigDecimal pesweight) {
		this.pesweight = pesweight; 
	}
 
	@Override
	public String getUldflag() {
		return this.uldflag;
	}
 
	@Override
	public void setUldflag(final String uldflag) {
		this.uldflag = uldflag; 
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
	public java.sql.Timestamp getSendmailtime() {
		return this.sendmailtime;
	}
 
	@Override
	public void setSendmailtime(final java.sql.Timestamp sendmailtime) {
		this.sendmailtime = sendmailtime; 
	}
 
	@Override
	public java.sql.Timestamp getGcorangestartdate() {
		return this.gcorangestartdate;
	}
 
	@Override
	public void setGcorangestartdate(final java.sql.Timestamp gcorangestartdate) {
		this.gcorangestartdate = gcorangestartdate; 
	}
 
	@Override
	public java.sql.Timestamp getGcorangeenddate() {
		return this.gcorangeenddate;
	}
 
	@Override
	public void setGcorangeenddate(final java.sql.Timestamp gcorangeenddate) {
		this.gcorangeenddate = gcorangeenddate; 
	}
 
}
