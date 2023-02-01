package com.doc.common.po; 
 
public interface ICpgTranDetailPo {
 
	String getFilename();
 
	void setFilename(final String filename);
 
	String getPostno();
 
	void setPostno(final String postno);
 
	String getPostspecialaccount();
 
	void setPostspecialaccount(final String postspecialaccount);
 
	String getPosttype();
 
	void setPosttype(final String posttype);
 
	String getType();
 
	void setType(final String type);
 
	String getYear();
 
	void setYear(final String year);
 
	String getCountrycode();
 
	void setCountrycode(final String countrycode);
 
	String getExchangeagency();
 
	void setExchangeagency(final String exchangeagency);
 
	BigDecimal getTotalpackageno();
 
	void setTotalpackageno(final BigDecimal totalpackageno);
 
	String getGoodtotalpackageyear();
 
	void setGoodtotalpackageyear(final String goodtotalpackageyear);
 
	String getGoodtotalpackageno();
 
	void setGoodtotalpackageno(final String goodtotalpackageno);
 
}
