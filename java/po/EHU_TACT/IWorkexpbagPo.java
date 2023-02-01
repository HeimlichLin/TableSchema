package com.doc.common.po; 
 
public interface IWorkexpbagPo {
 
	String getBagno();
 
	void setBagno(final String bagno);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	BigDecimal getBaghwb();
 
	void setBaghwb(final BigDecimal baghwb);
 
	BigDecimal getBagpiece();
 
	void setBagpiece(final BigDecimal bagpiece);
 
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
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getChargeuser();
 
	void setChargeuser(final String chargeuser);
 
	BigDecimal getExpressfee();
 
	void setExpressfee(final BigDecimal expressfee);
 
	BigDecimal getAirlinefee();
 
	void setAirlinefee(final BigDecimal airlinefee);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getLastchargedate();
 
	void setLastchargedate(final java.sql.Timestamp lastchargedate);
 
	String getWorkarea();
 
	void setWorkarea(final String workarea);
 
}
