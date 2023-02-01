package com.doc.common.po; 
 
public interface IObculdPo {
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
	String getObcmawb();
 
	void setObcmawb(final String obcmawb);
 
	String getContainer();
 
	void setContainer(final String container);
 
	String getUserid();
 
	void setUserid(final String userid);
 
	java.sql.Timestamp getObcdate();
 
	void setObcdate(final java.sql.Timestamp obcdate);
 
	String getWorkarea();
 
	void setWorkarea(final String workarea);
 
	java.sql.Timestamp getUldflag();
 
	void setUldflag(final java.sql.Timestamp uldflag);
 
	String getPiece();
 
	void setPiece(final String piece);
 
}
