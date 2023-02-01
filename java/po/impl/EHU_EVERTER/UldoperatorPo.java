package com.doc.common.po.impl; 
 
public class UldoperatorPo implements IUldoperatorPo {
 
	public enum COLUMNS {
		ULDNO("null"), //
		OPID("null"), //
		FLIGHTDATE("null"), //
		OPNUMBER("null"), //
		FLIGHTNO("null") //
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
	private String opid;
	private java.sql.Timestamp flightdate;
	private BigDecimal opnumber;
	private String flightno;

	@Override
	public String getUldno() {
		return this.uldno;
	}
 
	@Override
	public void setUldno(final String uldno) {
		this.uldno = uldno; 
	}
 
	@Override
	public String getOpid() {
		return this.opid;
	}
 
	@Override
	public void setOpid(final String opid) {
		this.opid = opid; 
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
	public BigDecimal getOpnumber() {
		return this.opnumber;
	}
 
	@Override
	public void setOpnumber(final BigDecimal opnumber) {
		this.opnumber = opnumber; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
}
