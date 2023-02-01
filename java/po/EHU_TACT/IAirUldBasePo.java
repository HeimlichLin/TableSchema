package com.doc.common.po; 
 
public interface IAirUldBasePo {
 
	String getUldCodeBase();
 
	void setUldCodeBase(final String uldCodeBase);
 
	String getUldSizeDscr();
 
	void setUldSizeDscr(final String uldSizeDscr);
 
	BigDecimal getConvertVol();
 
	void setConvertVol(final BigDecimal convertVol);
 
	String getUpdUser();
 
	void setUpdUser(final String updUser);
 
	java.sql.Timestamp getUpdDate();
 
	void setUpdDate(final java.sql.Timestamp updDate);
 
	String getUldType();
 
	void setUldType(final String uldType);
 
	BigDecimal getMaxLoad();
 
	void setMaxLoad(final BigDecimal maxLoad);
 
	String getDscr();
 
	void setDscr(final String dscr);
 
	String getPeSize();
 
	void setPeSize(final String peSize);
 
}
