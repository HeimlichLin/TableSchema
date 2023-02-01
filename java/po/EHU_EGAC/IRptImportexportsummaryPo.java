package com.doc.common.po; 
 
public interface IRptImportexportsummaryPo {
 
	BigDecimal getUniqueid();
 
	void setUniqueid(final BigDecimal uniqueid);
 
	BigDecimal getTranid();
 
	void setTranid(final BigDecimal tranid);
 
	BigDecimal getHwbfee();
 
	void setHwbfee(final BigDecimal hwbfee);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getDecltype();
 
	void setDecltype(final String decltype);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
	BigDecimal getGcipiece();
 
	void setGcipiece(final BigDecimal gcipiece);
 
	BigDecimal getGciweight();
 
	void setGciweight(final BigDecimal gciweight);
 
	java.sql.Timestamp getGcidate1();
 
	void setGcidate1(final java.sql.Timestamp gcidate1);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	BigDecimal getGcopiece();
 
	void setGcopiece(final BigDecimal gcopiece);
 
	java.sql.Timestamp getGcodate1();
 
	void setGcodate1(final java.sql.Timestamp gcodate1);
 
	java.sql.Timestamp getReleasetime();
 
	void setReleasetime(final java.sql.Timestamp releasetime);
 
	String getClearancetype();
 
	void setClearancetype(final String clearancetype);
 
	String getClosemark();
 
	void setClosemark(final String closemark);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	BigDecimal getBaghwb();
 
	void setBaghwb(final BigDecimal baghwb);
 
	java.sql.Timestamp getCreatedate();
 
	void setCreatedate(final java.sql.Timestamp createdate);
 
}
