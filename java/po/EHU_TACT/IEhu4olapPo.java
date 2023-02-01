package com.doc.common.po; 
 
public interface IEhu4olapPo {
 
	String getCargoLocation();
 
	void setCargoLocation(final String cargoLocation);
 
	String getLocalType();
 
	void setLocalType(final String localType);
 
	String getDataType();
 
	void setDataType(final String dataType);
 
	String getDataDate();
 
	void setDataDate(final String dataDate);
 
	String getCusType();
 
	void setCusType(final String cusType);
 
	String getCusNo();
 
	void setCusNo(final String cusNo);
 
	BigDecimal getAmount();
 
	void setAmount(final BigDecimal amount);
 
	BigDecimal getWet();
 
	void setWet(final BigDecimal wet);
 
	BigDecimal getPcs();
 
	void setPcs(final BigDecimal pcs);
 
	BigDecimal getCount();
 
	void setCount(final BigDecimal count);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
}
