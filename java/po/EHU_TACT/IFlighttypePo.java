package com.doc.common.po; 
 
public interface IFlighttypePo {
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getFlighttype();
 
	void setFlighttype(final String flighttype);
 
}
