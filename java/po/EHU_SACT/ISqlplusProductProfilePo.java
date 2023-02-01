package com.doc.common.po; 
 
public interface ISqlplusProductProfilePo {
 
	String getProduct();
 
	void setProduct(final String product);
 
	String getUserid();
 
	void setUserid(final String userid);
 
	String getAttribute();
 
	void setAttribute(final String attribute);
 
	String getScope();
 
	void setScope(final String scope);
 
	BigDecimal getNumericValue();
 
	void setNumericValue(final BigDecimal numericValue);
 
	String getCharValue();
 
	void setCharValue(final String charValue);
 
	java.sql.Timestamp getDateValue();
 
	void setDateValue(final java.sql.Timestamp dateValue);
 
	String getLongValue();
 
	void setLongValue(final String longValue);
 
}
