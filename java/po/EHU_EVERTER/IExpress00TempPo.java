package com.doc.common.po; 
 
public interface IExpress00TempPo {
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	BigDecimal getGcipiece();
 
	void setGcipiece(final BigDecimal gcipiece);
 
	BigDecimal getGciweight();
 
	void setGciweight(final BigDecimal gciweight);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	BigDecimal getBagfee();
 
	void setBagfee(final BigDecimal bagfee);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getDecltype();
 
	void setDecltype(final String decltype);
 
	String getClearancetype();
 
	void setClearancetype(final String clearancetype);
 
}
