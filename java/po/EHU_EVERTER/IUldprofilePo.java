package com.doc.common.po; 
 
public interface IUldprofilePo {
 
	String getUldno();
 
	void setUldno(final String uldno);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getIe();
 
	void setIe(final String ie);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	BigDecimal getBagunit();
 
	void setBagunit(final BigDecimal bagunit);
 
	BigDecimal getHwbunit();
 
	void setHwbunit(final BigDecimal hwbunit);
 
	BigDecimal getBagpiece();
 
	void setBagpiece(final BigDecimal bagpiece);
 
	BigDecimal getHwbpiece();
 
	void setHwbpiece(final BigDecimal hwbpiece);
 
	java.sql.Timestamp getStarttime();
 
	void setStarttime(final java.sql.Timestamp starttime);
 
	java.sql.Timestamp getEndtime();
 
	void setEndtime(final java.sql.Timestamp endtime);
 
}
