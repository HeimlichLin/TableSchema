package com.doc.common.po; 
 
public interface ITv02expbagPo {
 
	String getBagno();
 
	void setBagno(final String bagno);
 
	BigDecimal getBaghwb();
 
	void setBaghwb(final BigDecimal baghwb);
 
	BigDecimal getBagpiece();
 
	void setBagpiece(final BigDecimal bagpiece);
 
	BigDecimal getBagfee();
 
	void setBagfee(final BigDecimal bagfee);
 
	BigDecimal getBagweight();
 
	void setBagweight(final BigDecimal bagweight);
 
	java.sql.Timestamp getChargedate();
 
	void setChargedate(final java.sql.Timestamp chargedate);
 
	String getChargebox();
 
	void setChargebox(final String chargebox);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getIe();
 
	void setIe(final String ie);
 
	BigDecimal getGcobagsn();
 
	void setGcobagsn(final BigDecimal gcobagsn);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	BigDecimal getGcibagsn();
 
	void setGcibagsn(final BigDecimal gcibagsn);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
}
