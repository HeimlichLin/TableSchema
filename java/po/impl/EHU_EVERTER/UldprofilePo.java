package com.doc.common.po.impl; 
 
public class UldprofilePo implements IUldprofilePo {
 
	public enum COLUMNS {
		ULDNO("null"), //
		FLIGHTNO("null"), //
		FLIGHTDATE("null"), //
		IE("null"), //
		WEIGHT("null"), //
		BAGUNIT("null"), //
		HWBUNIT("null"), //
		BAGPIECE("null"), //
		HWBPIECE("null"), //
		STARTTIME("null"), //
		ENDTIME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String uldno;
	private String flightno;
	private java.sql.Timestamp flightdate;
	private String ie;
	private BigDecimal weight;
	private BigDecimal bagunit;
	private BigDecimal hwbunit;
	private BigDecimal bagpiece;
	private BigDecimal hwbpiece;
	private java.sql.Timestamp starttime;
	private java.sql.Timestamp endtime;

	@Override
	public String getUldno() {
		return this.uldno;
	}
 
	@Override
	public void setUldno(final String uldno) {
		this.uldno = uldno; 
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
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
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
	public BigDecimal getBagunit() {
		return this.bagunit;
	}
 
	@Override
	public void setBagunit(final BigDecimal bagunit) {
		this.bagunit = bagunit; 
	}
 
	@Override
	public BigDecimal getHwbunit() {
		return this.hwbunit;
	}
 
	@Override
	public void setHwbunit(final BigDecimal hwbunit) {
		this.hwbunit = hwbunit; 
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
	public BigDecimal getHwbpiece() {
		return this.hwbpiece;
	}
 
	@Override
	public void setHwbpiece(final BigDecimal hwbpiece) {
		this.hwbpiece = hwbpiece; 
	}
 
	@Override
	public java.sql.Timestamp getStarttime() {
		return this.starttime;
	}
 
	@Override
	public void setStarttime(final java.sql.Timestamp starttime) {
		this.starttime = starttime; 
	}
 
	@Override
	public java.sql.Timestamp getEndtime() {
		return this.endtime;
	}
 
	@Override
	public void setEndtime(final java.sql.Timestamp endtime) {
		this.endtime = endtime; 
	}
 
}
