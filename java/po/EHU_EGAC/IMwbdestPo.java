package com.doc.common.po; 
 
public interface IMwbdestPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
}
