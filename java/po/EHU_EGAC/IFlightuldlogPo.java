package com.doc.common.po; 
 
public interface IFlightuldlogPo {
 
	String getLoguserid();
 
	void setLoguserid(final String loguserid);
 
	java.sql.Timestamp getLogdate();
 
	void setLogdate(final java.sql.Timestamp logdate);
 
	String getAction();
 
	void setAction(final String action);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getUld();
 
	void setUld(final String uld);
 
	BigDecimal getLoadweight();
 
	void setLoadweight(final BigDecimal loadweight);
 
	BigDecimal getTareweight();
 
	void setTareweight(final BigDecimal tareweight);
 
	java.sql.Timestamp getChargedate();
 
	void setChargedate(final java.sql.Timestamp chargedate);
 
	String getChargebox();
 
	void setChargebox(final String chargebox);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	BigDecimal getMwbweight();
 
	void setMwbweight(final BigDecimal mwbweight);
 
	BigDecimal getMwbpiece();
 
	void setMwbpiece(final BigDecimal mwbpiece);
 
	String getPFlightno();
 
	void setPFlightno(final String pFlightno);
 
	String getPFlightdest();
 
	void setPFlightdest(final String pFlightdest);
 
	java.sql.Timestamp getPFlightdate();
 
	void setPFlightdate(final java.sql.Timestamp pFlightdate);
 
	String getPUld();
 
	void setPUld(final String pUld);
 
	BigDecimal getPLoadweight();
 
	void setPLoadweight(final BigDecimal pLoadweight);
 
	BigDecimal getPTareweight();
 
	void setPTareweight(final BigDecimal pTareweight);
 
	java.sql.Timestamp getPChargedate();
 
	void setPChargedate(final java.sql.Timestamp pChargedate);
 
	String getPChargebox();
 
	void setPChargebox(final String pChargebox);
 
	String getPMwb();
 
	void setPMwb(final String pMwb);
 
	BigDecimal getPMwbweight();
 
	void setPMwbweight(final BigDecimal pMwbweight);
 
	BigDecimal getPMwbpiece();
 
	void setPMwbpiece(final BigDecimal pMwbpiece);
 
}
