package com.doc.common.po; 
 
public interface IFlighttypeimpPo {
 
	java.sql.Timestamp getFdate();
 
	void setFdate(final java.sql.Timestamp fdate);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getFlighttype();
 
	void setFlighttype(final String flighttype);
 
	BigDecimal getHwb();
 
	void setHwb(final BigDecimal hwb);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	String getDest();
 
	void setDest(final String dest);
 
}
