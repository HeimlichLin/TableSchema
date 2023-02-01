package com.doc.common.po; 
 
public interface IUlddatalistPo {
 
	String getContainer();
 
	void setContainer(final String container);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	BigDecimal getHwbpiece();
 
	void setHwbpiece(final BigDecimal hwbpiece);
 
	BigDecimal getGciweight();
 
	void setGciweight(final BigDecimal gciweight);
 
	String getRemark();
 
	void setRemark(final String remark);
 
	String getCfflag();
 
	void setCfflag(final String cfflag);
 
}
