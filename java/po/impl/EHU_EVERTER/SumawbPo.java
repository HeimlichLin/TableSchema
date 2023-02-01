package com.doc.common.po.impl; 
 
public class SumawbPo implements ISumawbPo {
 
	public enum COLUMNS {
		AWB("null"), //
		HAWB("null"), //
		ULDNO("null"), //
		FLIGHTNO("null"), //
		CREATEDATE("null"), //
		DELE("null"), //
		PIECE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String awb;
	private String hawb;
	private String uldno;
	private String flightno;
	private java.sql.Timestamp createdate;
	private String dele;
	private BigDecimal piece;

	@Override
	public String getAwb() {
		return this.awb;
	}
 
	@Override
	public void setAwb(final String awb) {
		this.awb = awb; 
	}
 
	@Override
	public String getHawb() {
		return this.hawb;
	}
 
	@Override
	public void setHawb(final String hawb) {
		this.hawb = hawb; 
	}
 
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
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
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
	public BigDecimal getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final BigDecimal piece) {
		this.piece = piece; 
	}
 
}
