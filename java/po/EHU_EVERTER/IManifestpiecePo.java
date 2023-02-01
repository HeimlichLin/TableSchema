package com.doc.common.po; 
 
public interface IManifestpiecePo {
 
	String getAwb();
 
	void setAwb(final String awb);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
	java.sql.Timestamp getCreatedate();
 
	void setCreatedate(final java.sql.Timestamp createdate);
 
	String getCreateuser();
 
	void setCreateuser(final String createuser);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
}
