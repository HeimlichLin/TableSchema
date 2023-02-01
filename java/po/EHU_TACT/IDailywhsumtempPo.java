package com.doc.common.po; 
 
public interface IDailywhsumtempPo {
 
	java.sql.Timestamp getChargedate();
 
	void setChargedate(final java.sql.Timestamp chargedate);
 
	String getChargebox();
 
	void setChargebox(final String chargebox);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getWarehouse();
 
	void setWarehouse(final String warehouse);
 
	BigDecimal getExporthwb();
 
	void setExporthwb(final BigDecimal exporthwb);
 
	BigDecimal getExportpiece();
 
	void setExportpiece(final BigDecimal exportpiece);
 
	BigDecimal getExportweight();
 
	void setExportweight(final BigDecimal exportweight);
 
	BigDecimal getExportfee();
 
	void setExportfee(final BigDecimal exportfee);
 
	BigDecimal getImporthwb();
 
	void setImporthwb(final BigDecimal importhwb);
 
	BigDecimal getImportpiece();
 
	void setImportpiece(final BigDecimal importpiece);
 
	BigDecimal getImportweight();
 
	void setImportweight(final BigDecimal importweight);
 
	BigDecimal getImportfee();
 
	void setImportfee(final BigDecimal importfee);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getFrozen();
 
	void setFrozen(final String frozen);
 
	String getWorkarea();
 
	void setWorkarea(final String workarea);
 
}
