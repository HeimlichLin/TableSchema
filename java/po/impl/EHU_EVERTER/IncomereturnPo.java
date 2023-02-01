package com.doc.common.po.impl; 
 
public class IncomereturnPo implements IIncomereturnPo {
 
	public enum COLUMNS {
		HWB("null"), //
		ULDNO("null"), //
		PIECE("null"), //
		RETURNDATE("null"), //
		NOTE("null"), //
		DELE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String hwb;
	private String uldno;
	private BigDecimal piece;
	private String returndate;
	private String note;
	private String dele;

	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
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
	public BigDecimal getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final BigDecimal piece) {
		this.piece = piece; 
	}
 
	@Override
	public String getReturndate() {
		return this.returndate;
	}
 
	@Override
	public void setReturndate(final String returndate) {
		this.returndate = returndate; 
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
	public String getDele() {
		return this.dele;
	}
 
	@Override
	public void setDele(final String dele) {
		this.dele = dele; 
	}
 
}
