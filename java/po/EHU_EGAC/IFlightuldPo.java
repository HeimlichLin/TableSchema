package com.doc.common.po; 
 
public interface IFlightuldPo {
 
	BigDecimal getFlightuldno();
 
	void setFlightuldno(final BigDecimal flightuldno);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getUldtype();
 
	void setUldtype(final String uldtype);
 
	String getUldno();
 
	void setUldno(final String uldno);
 
	String getUldowner();
 
	void setUldowner(final String uldowner);
 
	BigDecimal getLoadweight();
 
	void setLoadweight(final BigDecimal loadweight);
 
	BigDecimal getTareweight();
 
	void setTareweight(final BigDecimal tareweight);
 
	BigDecimal getRemainweight();
 
	void setRemainweight(final BigDecimal remainweight);
 
	BigDecimal getBlankmwb();
 
	void setBlankmwb(final BigDecimal blankmwb);
 
	java.sql.Timestamp getChargedate();
 
	void setChargedate(final java.sql.Timestamp chargedate);
 
}
