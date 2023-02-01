package com.doc.common.po.impl; 
 
public class MisJoblogPo implements IMisJoblogPo {
 
	public enum COLUMNS {
		STARTTIME("null"), //
		ENDTIME("null"), //
		DATABDATE("null"), //
		DATAEDATE("null"), //
		IMPORTBAGNEW("null"), //
		IMPORTBAGUPD("null"), //
		IMPORTHWBNEW("null"), //
		IMPORTHWBUPD("null"), //
		IMPORTITEMSNEW("null"), //
		IMPORTITEMSUPD("null"), //
		EXPORTBAGNEW("null"), //
		EXPORTBAGUPD("null"), //
		EXPORTHWBNEW("null"), //
		EXPORTHWBUPD("null"), //
		EXPORTITEMSNEW("null"), //
		EXPORTITEMSUPD("null"), //
		DAILYSUMNEW("null"), //
		DAILYSUMUPD("null"), //
		AIRLINENEW("null"), //
		AIRLINEUPD("null"), //
		EXPRESSNEW("null"), //
		EXPRESSUPD("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp starttime;
	private java.sql.Timestamp endtime;
	private java.sql.Timestamp databdate;
	private java.sql.Timestamp dataedate;
	private BigDecimal importbagnew;
	private BigDecimal importbagupd;
	private BigDecimal importhwbnew;
	private BigDecimal importhwbupd;
	private BigDecimal importitemsnew;
	private BigDecimal importitemsupd;
	private BigDecimal exportbagnew;
	private BigDecimal exportbagupd;
	private BigDecimal exporthwbnew;
	private BigDecimal exporthwbupd;
	private BigDecimal exportitemsnew;
	private BigDecimal exportitemsupd;
	private BigDecimal dailysumnew;
	private BigDecimal dailysumupd;
	private BigDecimal airlinenew;
	private BigDecimal airlineupd;
	private BigDecimal expressnew;
	private BigDecimal expressupd;

	@Override
	public java.sql.Timestamp getStarttime() {
		return this.starttime;
	}
 
	@Override
	public void setStarttime(final java.sql.Timestamp starttime) {
		this.starttime = starttime; 
	}
 
	@Override
	public java.sql.Timestamp getEndtime() {
		return this.endtime;
	}
 
	@Override
	public void setEndtime(final java.sql.Timestamp endtime) {
		this.endtime = endtime; 
	}
 
	@Override
	public java.sql.Timestamp getDatabdate() {
		return this.databdate;
	}
 
	@Override
	public void setDatabdate(final java.sql.Timestamp databdate) {
		this.databdate = databdate; 
	}
 
	@Override
	public java.sql.Timestamp getDataedate() {
		return this.dataedate;
	}
 
	@Override
	public void setDataedate(final java.sql.Timestamp dataedate) {
		this.dataedate = dataedate; 
	}
 
	@Override
	public BigDecimal getImportbagnew() {
		return this.importbagnew;
	}
 
	@Override
	public void setImportbagnew(final BigDecimal importbagnew) {
		this.importbagnew = importbagnew; 
	}
 
	@Override
	public BigDecimal getImportbagupd() {
		return this.importbagupd;
	}
 
	@Override
	public void setImportbagupd(final BigDecimal importbagupd) {
		this.importbagupd = importbagupd; 
	}
 
	@Override
	public BigDecimal getImporthwbnew() {
		return this.importhwbnew;
	}
 
	@Override
	public void setImporthwbnew(final BigDecimal importhwbnew) {
		this.importhwbnew = importhwbnew; 
	}
 
	@Override
	public BigDecimal getImporthwbupd() {
		return this.importhwbupd;
	}
 
	@Override
	public void setImporthwbupd(final BigDecimal importhwbupd) {
		this.importhwbupd = importhwbupd; 
	}
 
	@Override
	public BigDecimal getImportitemsnew() {
		return this.importitemsnew;
	}
 
	@Override
	public void setImportitemsnew(final BigDecimal importitemsnew) {
		this.importitemsnew = importitemsnew; 
	}
 
	@Override
	public BigDecimal getImportitemsupd() {
		return this.importitemsupd;
	}
 
	@Override
	public void setImportitemsupd(final BigDecimal importitemsupd) {
		this.importitemsupd = importitemsupd; 
	}
 
	@Override
	public BigDecimal getExportbagnew() {
		return this.exportbagnew;
	}
 
	@Override
	public void setExportbagnew(final BigDecimal exportbagnew) {
		this.exportbagnew = exportbagnew; 
	}
 
	@Override
	public BigDecimal getExportbagupd() {
		return this.exportbagupd;
	}
 
	@Override
	public void setExportbagupd(final BigDecimal exportbagupd) {
		this.exportbagupd = exportbagupd; 
	}
 
	@Override
	public BigDecimal getExporthwbnew() {
		return this.exporthwbnew;
	}
 
	@Override
	public void setExporthwbnew(final BigDecimal exporthwbnew) {
		this.exporthwbnew = exporthwbnew; 
	}
 
	@Override
	public BigDecimal getExporthwbupd() {
		return this.exporthwbupd;
	}
 
	@Override
	public void setExporthwbupd(final BigDecimal exporthwbupd) {
		this.exporthwbupd = exporthwbupd; 
	}
 
	@Override
	public BigDecimal getExportitemsnew() {
		return this.exportitemsnew;
	}
 
	@Override
	public void setExportitemsnew(final BigDecimal exportitemsnew) {
		this.exportitemsnew = exportitemsnew; 
	}
 
	@Override
	public BigDecimal getExportitemsupd() {
		return this.exportitemsupd;
	}
 
	@Override
	public void setExportitemsupd(final BigDecimal exportitemsupd) {
		this.exportitemsupd = exportitemsupd; 
	}
 
	@Override
	public BigDecimal getDailysumnew() {
		return this.dailysumnew;
	}
 
	@Override
	public void setDailysumnew(final BigDecimal dailysumnew) {
		this.dailysumnew = dailysumnew; 
	}
 
	@Override
	public BigDecimal getDailysumupd() {
		return this.dailysumupd;
	}
 
	@Override
	public void setDailysumupd(final BigDecimal dailysumupd) {
		this.dailysumupd = dailysumupd; 
	}
 
	@Override
	public BigDecimal getAirlinenew() {
		return this.airlinenew;
	}
 
	@Override
	public void setAirlinenew(final BigDecimal airlinenew) {
		this.airlinenew = airlinenew; 
	}
 
	@Override
	public BigDecimal getAirlineupd() {
		return this.airlineupd;
	}
 
	@Override
	public void setAirlineupd(final BigDecimal airlineupd) {
		this.airlineupd = airlineupd; 
	}
 
	@Override
	public BigDecimal getExpressnew() {
		return this.expressnew;
	}
 
	@Override
	public void setExpressnew(final BigDecimal expressnew) {
		this.expressnew = expressnew; 
	}
 
	@Override
	public BigDecimal getExpressupd() {
		return this.expressupd;
	}
 
	@Override
	public void setExpressupd(final BigDecimal expressupd) {
		this.expressupd = expressupd; 
	}
 
}
