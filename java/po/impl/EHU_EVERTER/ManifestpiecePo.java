package com.doc.common.po.impl; 
 
public class ManifestpiecePo implements IManifestpiecePo {
 
	public enum COLUMNS {
		AWB("null"), //
		PIECE("null"), //
		CREATEDATE("null"), //
		CREATEUSER("null"), //
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
 
	private String awb;
	private BigDecimal piece;
	private java.sql.Timestamp createdate;
	private String createuser;
	private String flightno;

	@Override
	public String getAwb() {
		return this.awb;
	}
 
	@Override
	public void setAwb(final String awb) {
		this.awb = awb; 
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
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
	@Override
	public String getCreateuser() {
		return this.createuser;
	}
 
	@Override
	public void setCreateuser(final String createuser) {
		this.createuser = createuser; 
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
