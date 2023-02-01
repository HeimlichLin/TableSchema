package com.doc.common.po.impl; 
 
public class ImpincomePo implements IImpincomePo {
 
	public enum COLUMNS {
		AWB("null"), //
		HWB("null"), //
		PIECE("null"), //
		INCOMEDATE("null"), //
		INCOMEPIECE("null"), //
		ULDNO("null"), //
		DELE("null"), //
		NOTE("null"), //
		INCOMEDATE1("null") //
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
	private String hwb;
	private BigDecimal piece;
	private java.sql.Timestamp incomedate;
	private BigDecimal incomepiece;
	private String uldno;
	private String dele;
	private String note;
	private java.sql.Timestamp incomedate1;

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
	public BigDecimal getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final BigDecimal piece) {
		this.piece = piece; 
	}
 
	@Override
	public java.sql.Timestamp getIncomedate() {
		return this.incomedate;
	}
 
	@Override
	public void setIncomedate(final java.sql.Timestamp incomedate) {
		this.incomedate = incomedate; 
	}
 
	@Override
	public BigDecimal getIncomepiece() {
		return this.incomepiece;
	}
 
	@Override
	public void setIncomepiece(final BigDecimal incomepiece) {
		this.incomepiece = incomepiece; 
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
	public String getDele() {
		return this.dele;
	}
 
	@Override
	public void setDele(final String dele) {
		this.dele = dele; 
	}
 
	@Override
	public String getNote() {
		return this.note;
	}
 
	@Override
	public void setNote(final String note) {
		this.note = note; 
	}
 
	@Override
	public java.sql.Timestamp getIncomedate1() {
		return this.incomedate1;
	}
 
	@Override
	public void setIncomedate1(final java.sql.Timestamp incomedate1) {
		this.incomedate1 = incomedate1; 
	}
 
}
