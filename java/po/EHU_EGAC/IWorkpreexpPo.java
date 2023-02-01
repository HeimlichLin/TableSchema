package com.doc.common.po; 
 
public interface IWorkpreexpPo {
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getBoxno();
 
	void setBoxno(final String boxno);
 
	String getClearancetype();
 
	void setClearancetype(final String clearancetype);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
	String getUnit();
 
	void setUnit(final String unit);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getDatauser();
 
	void setDatauser(final String datauser);
 
	java.sql.Timestamp getDatadate();
 
	void setDatadate(final java.sql.Timestamp datadate);
 
	String getClearanceuser();
 
	void setClearanceuser(final String clearanceuser);
 
	java.sql.Timestamp getClearancedate();
 
	void setClearancedate(final java.sql.Timestamp clearancedate);
 
	String getPortuser();
 
	void setPortuser(final String portuser);
 
	java.sql.Timestamp getPortdate();
 
	void setPortdate(final java.sql.Timestamp portdate);
 
	String getClosemark();
 
	void setClosemark(final String closemark);
 
}
