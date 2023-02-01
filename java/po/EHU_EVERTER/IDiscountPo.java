package com.doc.common.po; 
 
public interface IDiscountPo {
 
	java.sql.Timestamp getBdate();
 
	void setBdate(final java.sql.Timestamp bdate);
 
	java.sql.Timestamp getEdate();
 
	void setEdate(final java.sql.Timestamp edate);
 
	String getKeyvalue();
 
	void setKeyvalue(final String keyvalue);
 
	String getKeytype();
 
	void setKeytype(final String keytype);
 
	BigDecimal getRate();
 
	void setRate(final BigDecimal rate);
 
	java.sql.Timestamp getCdate();
 
	void setCdate(final java.sql.Timestamp cdate);
 
	BigDecimal getRoundtype();
 
	void setRoundtype(final BigDecimal roundtype);
 
	BigDecimal getMinweight();
 
	void setMinweight(final BigDecimal minweight);
 
	String getAcctype();
 
	void setAcctype(final String acctype);
 
	java.sql.Timestamp getMdate();
 
	void setMdate(final java.sql.Timestamp mdate);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	java.sql.Timestamp getLdate();
 
	void setLdate(final java.sql.Timestamp ldate);
 
	String getDiscountbox();
 
	void setDiscountbox(final String discountbox);
 
}
