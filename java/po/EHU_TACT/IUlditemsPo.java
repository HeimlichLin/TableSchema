package com.doc.common.po; 
 
public interface IUlditemsPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	BigDecimal getGcipiece();
 
	void setGcipiece(final BigDecimal gcipiece);
 
	BigDecimal getGcopiece();
 
	void setGcopiece(final BigDecimal gcopiece);
 
	BigDecimal getGciweight();
 
	void setGciweight(final BigDecimal gciweight);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getContainer();
 
	void setContainer(final String container);
 
	String getRemark();
 
	void setRemark(final String remark);
 
}
