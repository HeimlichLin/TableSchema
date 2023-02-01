package com.doc.common.po; 
 
public interface IMisJoblogPo {
 
	java.sql.Timestamp getStarttime();
 
	void setStarttime(final java.sql.Timestamp starttime);
 
	java.sql.Timestamp getEndtime();
 
	void setEndtime(final java.sql.Timestamp endtime);
 
	java.sql.Timestamp getDatabdate();
 
	void setDatabdate(final java.sql.Timestamp databdate);
 
	java.sql.Timestamp getDataedate();
 
	void setDataedate(final java.sql.Timestamp dataedate);
 
	BigDecimal getImportbagnew();
 
	void setImportbagnew(final BigDecimal importbagnew);
 
	BigDecimal getImportbagupd();
 
	void setImportbagupd(final BigDecimal importbagupd);
 
	BigDecimal getImporthwbnew();
 
	void setImporthwbnew(final BigDecimal importhwbnew);
 
	BigDecimal getImporthwbupd();
 
	void setImporthwbupd(final BigDecimal importhwbupd);
 
	BigDecimal getImportitemsnew();
 
	void setImportitemsnew(final BigDecimal importitemsnew);
 
	BigDecimal getImportitemsupd();
 
	void setImportitemsupd(final BigDecimal importitemsupd);
 
	BigDecimal getExportbagnew();
 
	void setExportbagnew(final BigDecimal exportbagnew);
 
	BigDecimal getExportbagupd();
 
	void setExportbagupd(final BigDecimal exportbagupd);
 
	BigDecimal getExporthwbnew();
 
	void setExporthwbnew(final BigDecimal exporthwbnew);
 
	BigDecimal getExporthwbupd();
 
	void setExporthwbupd(final BigDecimal exporthwbupd);
 
	BigDecimal getExportitemsnew();
 
	void setExportitemsnew(final BigDecimal exportitemsnew);
 
	BigDecimal getExportitemsupd();
 
	void setExportitemsupd(final BigDecimal exportitemsupd);
 
	BigDecimal getDailysumnew();
 
	void setDailysumnew(final BigDecimal dailysumnew);
 
	BigDecimal getDailysumupd();
 
	void setDailysumupd(final BigDecimal dailysumupd);
 
	BigDecimal getAirlinenew();
 
	void setAirlinenew(final BigDecimal airlinenew);
 
	BigDecimal getAirlineupd();
 
	void setAirlineupd(final BigDecimal airlineupd);
 
	BigDecimal getExpressnew();
 
	void setExpressnew(final BigDecimal expressnew);
 
	BigDecimal getExpressupd();
 
	void setExpressupd(final BigDecimal expressupd);
 
}
