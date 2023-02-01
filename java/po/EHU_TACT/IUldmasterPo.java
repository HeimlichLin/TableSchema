package com.doc.common.po; 
 
public interface IUldmasterPo {
 
	String getContainer();
 
	void setContainer(final String container);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
	BigDecimal getConheight();
 
	void setConheight(final BigDecimal conheight);
 
	String getAirworthiness();
 
	void setAirworthiness(final String airworthiness);
 
	String getContype();
 
	void setContype(final String contype);
 
	String getPessize();
 
	void setPessize(final String pessize);
 
	BigDecimal getPest();
 
	void setPest(final BigDecimal pest);
 
	BigDecimal getPesb();
 
	void setPesb(final BigDecimal pesb);
 
	BigDecimal getBweight();
 
	void setBweight(final BigDecimal bweight);
 
	java.sql.Timestamp getBweighttime();
 
	void setBweighttime(final java.sql.Timestamp bweighttime);
 
	BigDecimal getEpcweight();
 
	void setEpcweight(final BigDecimal epcweight);
 
	java.sql.Timestamp getEpcweighttime();
 
	void setEpcweighttime(final java.sql.Timestamp epcweighttime);
 
	String getEpcwuserid();
 
	void setEpcwuserid(final String epcwuserid);
 
	BigDecimal getTtlweight();
 
	void setTtlweight(final BigDecimal ttlweight);
 
	java.sql.Timestamp getTtlweighttime();
 
	void setTtlweighttime(final java.sql.Timestamp ttlweighttime);
 
	String getTtlwuserid();
 
	void setTtlwuserid(final String ttlwuserid);
 
	BigDecimal getCargoweight();
 
	void setCargoweight(final BigDecimal cargoweight);
 
	java.sql.Timestamp getCargoweighttime();
 
	void setCargoweighttime(final java.sql.Timestamp cargoweighttime);
 
	BigDecimal getPesweight();
 
	void setPesweight(final BigDecimal pesweight);
 
	String getUldflag();
 
	void setUldflag(final String uldflag);
 
	String getAirlineid();
 
	void setAirlineid(final String airlineid);
 
	java.sql.Timestamp getSendmailtime();
 
	void setSendmailtime(final java.sql.Timestamp sendmailtime);
 
	java.sql.Timestamp getGcorangestartdate();
 
	void setGcorangestartdate(final java.sql.Timestamp gcorangestartdate);
 
	java.sql.Timestamp getGcorangeenddate();
 
	void setGcorangeenddate(final java.sql.Timestamp gcorangeenddate);
 
}
