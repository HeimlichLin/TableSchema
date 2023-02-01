package com.doc.common.po; 
 
public interface IImpDeclareInfoPo {
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getFlightdate();
 
	void setFlightdate(final String flightdate);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	BigDecimal getDeclareqty();
 
	void setDeclareqty(final BigDecimal declareqty);
 
	String getSendrcf();
 
	void setSendrcf(final String sendrcf);
 
	String getSenddlv();
 
	void setSenddlv(final String senddlv);
 
	BigDecimal getChkgciqty();
 
	void setChkgciqty(final BigDecimal chkgciqty);
 
	java.sql.Timestamp getCrtDate();
 
	void setCrtDate(final java.sql.Timestamp crtDate);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
}
