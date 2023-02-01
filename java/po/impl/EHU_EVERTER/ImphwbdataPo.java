package com.doc.common.po.impl; 
 
public class ImphwbdataPo implements IImphwbdataPo {
 
	public enum COLUMNS {
		FORID("null"), //
		FLIGHT("null"), //
		AWB("null"), //
		HWB("null"), //
		PC("null"), //
		CREATEDATE("null"), //
		INCOME("null"), //
		DELE("null"), //
		FLIGHTDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String forid;
	private String flight;
	private String awb;
	private String hwb;
	private BigDecimal pc;
	private java.sql.Timestamp createdate;
	private String income;
	private String dele;
	private String flightdate;

	@Override
	public String getForid() {
		return this.forid;
	}
 
	@Override
	public void setForid(final String forid) {
		this.forid = forid; 
	}
 
	@Override
	public String getFlight() {
		return this.flight;
	}
 
	@Override
	public void setFlight(final String flight) {
		this.flight = flight; 
	}
 
	@Override
	public String getAwb() {
		return this.awb;
	}
 
	@Override
	public void setAwb(final String awb) {
		this.awb = awb; 
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
	public BigDecimal getPc() {
		return this.pc;
	}
 
	@Override
	public void setPc(final BigDecimal pc) {
		this.pc = pc; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
	@Override
	public String getIncome() {
		return this.income;
	}
 
	@Override
	public void setIncome(final String income) {
		this.income = income; 
	}
 
	@Override
	public String getDele() {
		return this.dele;
	}
 
	@Override
	public void setDele(final String dele) {
		this.dele = dele; 
	}
 
	@Override
	public String getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final String flightdate) {
		this.flightdate = flightdate; 
	}
 
}
