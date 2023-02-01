package com.doc.common.po.impl; 
 
public class AccchkPo implements IAccchkPo {
 
	public enum COLUMNS {
		LOGDATE("null"), //
		EXPTOTAL("null"), //
		OLDTOTLA("null"), //
		ADDTOTAL("null"), //
		DIFFTOTAL("null"), //
		CURTOTAL("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp logdate;
	private BigDecimal exptotal;
	private BigDecimal oldtotla;
	private BigDecimal addtotal;
	private BigDecimal difftotal;
	private BigDecimal curtotal;

	@Override
	public java.sql.Timestamp getLogdate() {
		return this.logdate;
	}
 
	@Override
	public void setLogdate(final java.sql.Timestamp logdate) {
		this.logdate = logdate; 
	}
 
	@Override
	public BigDecimal getExptotal() {
		return this.exptotal;
	}
 
	@Override
	public void setExptotal(final BigDecimal exptotal) {
		this.exptotal = exptotal; 
	}
 
	@Override
	public BigDecimal getOldtotla() {
		return this.oldtotla;
	}
 
	@Override
	public void setOldtotla(final BigDecimal oldtotla) {
		this.oldtotla = oldtotla; 
	}
 
	@Override
	public BigDecimal getAddtotal() {
		return this.addtotal;
	}
 
	@Override
	public void setAddtotal(final BigDecimal addtotal) {
		this.addtotal = addtotal; 
	}
 
	@Override
	public BigDecimal getDifftotal() {
		return this.difftotal;
	}
 
	@Override
	public void setDifftotal(final BigDecimal difftotal) {
		this.difftotal = difftotal; 
	}
 
	@Override
	public BigDecimal getCurtotal() {
		return this.curtotal;
	}
 
	@Override
	public void setCurtotal(final BigDecimal curtotal) {
		this.curtotal = curtotal; 
	}
 
}
