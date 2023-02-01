package com.doc.common.po; 
 
public interface IRptDailysummaryPo {
 
	BigDecimal getUniqueid();
 
	void setUniqueid(final BigDecimal uniqueid);
 
	BigDecimal getTranid();
 
	void setTranid(final BigDecimal tranid);
 
	String getAirlinecname();
 
	void setAirlinecname(final String airlinecname);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getExpresscname();
 
	void setExpresscname(final String expresscname);
 
	String getChargebox();
 
	void setChargebox(final String chargebox);
 
	BigDecimal getImporthwb();
 
	void setImporthwb(final BigDecimal importhwb);
 
	BigDecimal getImportpiece();
 
	void setImportpiece(final BigDecimal importpiece);
 
	BigDecimal getImportweight();
 
	void setImportweight(final BigDecimal importweight);
 
	BigDecimal getImportfee();
 
	void setImportfee(final BigDecimal importfee);
 
	BigDecimal getExporthwb();
 
	void setExporthwb(final BigDecimal exporthwb);
 
	BigDecimal getExportpiece();
 
	void setExportpiece(final BigDecimal exportpiece);
 
	BigDecimal getExportweight();
 
	void setExportweight(final BigDecimal exportweight);
 
	BigDecimal getExportfee();
 
	void setExportfee(final BigDecimal exportfee);
 
	BigDecimal getTotalhwb();
 
	void setTotalhwb(final BigDecimal totalhwb);
 
	BigDecimal getTotalpiece();
 
	void setTotalpiece(final BigDecimal totalpiece);
 
	BigDecimal getTotalweight();
 
	void setTotalweight(final BigDecimal totalweight);
 
	BigDecimal getTotalfee();
 
	void setTotalfee(final BigDecimal totalfee);
 
	java.sql.Timestamp getCreatedate();
 
	void setCreatedate(final java.sql.Timestamp createdate);
 
}
