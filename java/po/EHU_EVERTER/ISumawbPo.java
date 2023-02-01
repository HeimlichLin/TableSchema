package com.doc.common.po; 
 
public interface ISumawbPo {
 
	String getAwb();
 
	void setAwb(final String awb);
 
	String getHawb();
 
	void setHawb(final String hawb);
 
	String getUldno();
 
	void setUldno(final String uldno);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getCreatedate();
 
	void setCreatedate(final java.sql.Timestamp createdate);
 
	String getDele();
 
	void setDele(final String dele);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
}
