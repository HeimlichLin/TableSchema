package com.doc.common.po.impl; 
 
public class DailydiscountPo implements IDailydiscountPo {
 
	public enum COLUMNS {
		CHARGEDATE("null"), //
		EXPRESSID("null"), //
		CHARGEBOX("null"), //
		EXPORTHWB("null"), //
		EXPORTPIECE("null"), //
		EXPORTWEIGHT("null"), //
		EXPORTFEE("null"), //
		IMPORTHWB("null"), //
		IMPORTPIECE("null"), //
		IMPORTWEIGHT("null"), //
		IMPORTFEE("null"), //
		LASTUPDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp chargedate;
	private String expressid;
	private String chargebox;
	private BigDecimal exporthwb;
	private BigDecimal exportpiece;
	private BigDecimal exportweight;
	private BigDecimal exportfee;
	private BigDecimal importhwb;
	private BigDecimal importpiece;
	private BigDecimal importweight;
	private BigDecimal importfee;
	private java.sql.Timestamp lastupdate;

	@Override
	public java.sql.Timestamp getChargedate() {
		return this.chargedate;
	}
 
	@Override
	public void setChargedate(final java.sql.Timestamp chargedate) {
		this.chargedate = chargedate; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getChargebox() {
		return this.chargebox;
	}
 
	@Override
	public void setChargebox(final String chargebox) {
		this.chargebox = chargebox; 
	}
 
	@Override
	public BigDecimal getExporthwb() {
		return this.exporthwb;
	}
 
	@Override
	public void setExporthwb(final BigDecimal exporthwb) {
		this.exporthwb = exporthwb; 
	}
 
	@Override
	public BigDecimal getExportpiece() {
		return this.exportpiece;
	}
 
	@Override
	public void setExportpiece(final BigDecimal exportpiece) {
		this.exportpiece = exportpiece; 
	}
 
	@Override
	public BigDecimal getExportweight() {
		return this.exportweight;
	}
 
	@Override
	public void setExportweight(final BigDecimal exportweight) {
		this.exportweight = exportweight; 
	}
 
	@Override
	public BigDecimal getExportfee() {
		return this.exportfee;
	}
 
	@Override
	public void setExportfee(final BigDecimal exportfee) {
		this.exportfee = exportfee; 
	}
 
	@Override
	public BigDecimal getImporthwb() {
		return this.importhwb;
	}
 
	@Override
	public void setImporthwb(final BigDecimal importhwb) {
		this.importhwb = importhwb; 
	}
 
	@Override
	public BigDecimal getImportpiece() {
		return this.importpiece;
	}
 
	@Override
	public void setImportpiece(final BigDecimal importpiece) {
		this.importpiece = importpiece; 
	}
 
	@Override
	public BigDecimal getImportweight() {
		return this.importweight;
	}
 
	@Override
	public void setImportweight(final BigDecimal importweight) {
		this.importweight = importweight; 
	}
 
	@Override
	public BigDecimal getImportfee() {
		return this.importfee;
	}
 
	@Override
	public void setImportfee(final BigDecimal importfee) {
		this.importfee = importfee; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
}
