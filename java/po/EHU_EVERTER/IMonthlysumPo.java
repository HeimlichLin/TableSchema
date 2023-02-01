package com.doc.common.po; 
 
public interface IMonthlysumPo {
 
	String getYymm();
 
	void setYymm(final String yymm);
 
	String getBagtype();
 
	void setBagtype(final String bagtype);
 
	String getCustype();
 
	void setCustype(final String custype);
 
	String getCusid();
 
	void setCusid(final String cusid);
 
	BigDecimal getExpcount();
 
	void setExpcount(final BigDecimal expcount);
 
	BigDecimal getExppiece();
 
	void setExppiece(final BigDecimal exppiece);
 
	BigDecimal getExpweight();
 
	void setExpweight(final BigDecimal expweight);
 
	BigDecimal getImpcount();
 
	void setImpcount(final BigDecimal impcount);
 
	BigDecimal getImppiece();
 
	void setImppiece(final BigDecimal imppiece);
 
	BigDecimal getImpweight();
 
	void setImpweight(final BigDecimal impweight);
 
	BigDecimal getTotcount();
 
	void setTotcount(final BigDecimal totcount);
 
	BigDecimal getTotpiece();
 
	void setTotpiece(final BigDecimal totpiece);
 
	BigDecimal getTotweight();
 
	void setTotweight(final BigDecimal totweight);
 
	String getTransdate();
 
	void setTransdate(final String transdate);
 
	String getTransuser();
 
	void setTransuser(final String transuser);
 
}
