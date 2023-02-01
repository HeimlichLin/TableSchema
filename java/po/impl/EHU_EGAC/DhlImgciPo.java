package com.doc.common.po.impl; 
 
public class DhlImgciPo implements IDhlImgciPo {
 
	public enum COLUMNS {
		MWB("null"), //
		HWB("null"), //
		PIECE("null"), //
		NOP("null"), //
		CLEARANCETYPE("null"), //
		GCIDATE("null"), //
		WDATE("null"), //
		FTPDATE("null"), //
		FTPFILE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String mwb;
	private String hwb;
	private BigDecimal piece;
	private BigDecimal nop;
	private String clearancetype;
	private java.sql.Timestamp gcidate;
	private java.sql.Timestamp wdate;
	private java.sql.Timestamp ftpdate;
	private String ftpfile;

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
	public BigDecimal getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final BigDecimal piece) {
		this.piece = piece; 
	}
 
	@Override
	public BigDecimal getNop() {
		return this.nop;
	}
 
	@Override
	public void setNop(final BigDecimal nop) {
		this.nop = nop; 
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
	public java.sql.Timestamp getGcidate() {
		return this.gcidate;
	}
 
	@Override
	public void setGcidate(final java.sql.Timestamp gcidate) {
		this.gcidate = gcidate; 
	}
 
	@Override
	public java.sql.Timestamp getWdate() {
		return this.wdate;
	}
 
	@Override
	public void setWdate(final java.sql.Timestamp wdate) {
		this.wdate = wdate; 
	}
 
	@Override
	public java.sql.Timestamp getFtpdate() {
		return this.ftpdate;
	}
 
	@Override
	public void setFtpdate(final java.sql.Timestamp ftpdate) {
		this.ftpdate = ftpdate; 
	}
 
	@Override
	public String getFtpfile() {
		return this.ftpfile;
	}
 
	@Override
	public void setFtpfile(final String ftpfile) {
		this.ftpfile = ftpfile; 
	}
 
}
