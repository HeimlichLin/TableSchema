package com.doc.common.po.impl; 
 
public class UlddatalistPo implements IUlddatalistPo {
 
	public enum COLUMNS {
		CONTAINER("null"), //
		FLIGHTNO("null"), //
		FLIGHTDEST("null"), //
		FLIGHTDATE("null"), //
		MWB("null"), //
		HWBPIECE("null"), //
		GCIWEIGHT("null"), //
		REMARK("null"), //
		CFFLAG("null") //
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
	private String flightdest;
	private java.sql.Timestamp flightdate;
	private String mwb;
	private BigDecimal hwbpiece;
	private BigDecimal gciweight;
	private String remark;
	private String cfflag;

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
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
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
	public BigDecimal getGciweight() {
		return this.gciweight;
	}
 
	@Override
	public void setGciweight(final BigDecimal gciweight) {
		this.gciweight = gciweight; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
	@Override
	public String getCfflag() {
		return this.cfflag;
	}
 
	@Override
	public void setCfflag(final String cfflag) {
		this.cfflag = cfflag; 
	}
 
}
