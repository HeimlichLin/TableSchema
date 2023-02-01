package com.doc.common.po.impl; 
 
public class RptDailysummaryPo implements IRptDailysummaryPo {
 
	public enum COLUMNS {
		UNIQUEID("null"), //
		TRANID("null"), //
		AIRLINECNAME("null"), //
		AIRLINEID("null"), //
		EXPRESSCNAME("null"), //
		CHARGEBOX("null"), //
		IMPORTHWB("null"), //
		IMPORTPIECE("null"), //
		IMPORTWEIGHT("null"), //
		IMPORTFEE("null"), //
		EXPORTHWB("null"), //
		EXPORTPIECE("null"), //
		EXPORTWEIGHT("null"), //
		EXPORTFEE("null"), //
		TOTALHWB("null"), //
		TOTALPIECE("null"), //
		TOTALWEIGHT("null"), //
		TOTALFEE("null"), //
		CREATEDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal uniqueid;
	private BigDecimal tranid;
	private String airlinecname;
	private String airlineid;
	private String expresscname;
	private String chargebox;
	private BigDecimal importhwb;
	private BigDecimal importpiece;
	private BigDecimal importweight;
	private BigDecimal importfee;
	private BigDecimal exporthwb;
	private BigDecimal exportpiece;
	private BigDecimal exportweight;
	private BigDecimal exportfee;
	private BigDecimal totalhwb;
	private BigDecimal totalpiece;
	private BigDecimal totalweight;
	private BigDecimal totalfee;
	private java.sql.Timestamp createdate;

	@Override
	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}
 
	@Override
	public void setUniqueid(final BigDecimal uniqueid) {
		this.uniqueid = uniqueid; 
	}
 
	@Override
	public BigDecimal getTranid() {
		return this.tranid;
	}
 
	@Override
	public void setTranid(final BigDecimal tranid) {
		this.tranid = tranid; 
	}
 
	@Override
	public String getAirlinecname() {
		return this.airlinecname;
	}
 
	@Override
	public void setAirlinecname(final String airlinecname) {
		this.airlinecname = airlinecname; 
	}
 
	@Override
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
	}
 
	@Override
	public String getExpresscname() {
		return this.expresscname;
	}
 
	@Override
	public void setExpresscname(final String expresscname) {
		this.expresscname = expresscname; 
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
	public BigDecimal getTotalhwb() {
		return this.totalhwb;
	}
 
	@Override
	public void setTotalhwb(final BigDecimal totalhwb) {
		this.totalhwb = totalhwb; 
	}
 
	@Override
	public BigDecimal getTotalpiece() {
		return this.totalpiece;
	}
 
	@Override
	public void setTotalpiece(final BigDecimal totalpiece) {
		this.totalpiece = totalpiece; 
	}
 
	@Override
	public BigDecimal getTotalweight() {
		return this.totalweight;
	}
 
	@Override
	public void setTotalweight(final BigDecimal totalweight) {
		this.totalweight = totalweight; 
	}
 
	@Override
	public BigDecimal getTotalfee() {
		return this.totalfee;
	}
 
	@Override
	public void setTotalfee(final BigDecimal totalfee) {
		this.totalfee = totalfee; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
}
