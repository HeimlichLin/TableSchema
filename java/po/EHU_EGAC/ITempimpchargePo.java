package com.doc.common.po; 
 
public interface ITempimpchargePo {
 
	String getBagno();
 
	void setBagno(final String bagno);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	BigDecimal getBagweight();
 
	void setBagweight(final BigDecimal bagweight);
 
	BigDecimal getBagfee();
 
	void setBagfee(final BigDecimal bagfee);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getChargebox();
 
	void setChargebox(final String chargebox);
 
	java.sql.Timestamp getChargedate();
 
	void setChargedate(final java.sql.Timestamp chargedate);
 
	String getIe();
 
	void setIe(final String ie);
 
	BigDecimal getGcibagsn();
 
	void setGcibagsn(final BigDecimal gcibagsn);
 
	BigDecimal getGcobagsn();
 
	void setGcobagsn(final BigDecimal gcobagsn);
 
	java.sql.Timestamp getGcidate1();
 
	void setGcidate1(final java.sql.Timestamp gcidate1);
 
	BigDecimal getGciweight();
 
	void setGciweight(final BigDecimal gciweight);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	BigDecimal getBagWeight();
 
	void setBagWeight(final BigDecimal bagWeight);
 
	BigDecimal getBagFee();
 
	void setBagFee(final BigDecimal bagFee);
 
	BigDecimal getBaghwb();
 
	void setBaghwb(final BigDecimal baghwb);
 
	BigDecimal getTotalFee();
 
	void setTotalFee(final BigDecimal totalFee);
 
}
