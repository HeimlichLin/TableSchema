package com.doc.common.po; 
 
public interface IAirlinefaxPo {
 
	BigDecimal getSerial();
 
	void setSerial(final BigDecimal serial);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getName();
 
	void setName(final String name);
 
	String getFax();
 
	void setFax(final String fax);
 
	String getUserid();
 
	void setUserid(final String userid);
 
	java.sql.Timestamp getLastdate();
 
	void setLastdate(final java.sql.Timestamp lastdate);
 
}
