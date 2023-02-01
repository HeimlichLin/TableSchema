package com.doc.common.po; 
 
public interface IRptAdjtaxsummaryPo {
 
	BigDecimal getUniqueid();
 
	void setUniqueid(final BigDecimal uniqueid);
 
	BigDecimal getTranid();
 
	void setTranid(final BigDecimal tranid);
 
	String getReportdate();
 
	void setReportdate(final String reportdate);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getExpresscname();
 
	void setExpresscname(final String expresscname);
 
	String getBoxno();
 
	void setBoxno(final String boxno);
 
	BigDecimal getAdjhwbamtx3();
 
	void setAdjhwbamtx3(final BigDecimal adjhwbamtx3);
 
	BigDecimal getTtlhwbamtx3();
 
	void setTtlhwbamtx3(final BigDecimal ttlhwbamtx3);
 
	BigDecimal getAdjtaxamtx3();
 
	void setAdjtaxamtx3(final BigDecimal adjtaxamtx3);
 
	BigDecimal getTtltax();
 
	void setTtltax(final BigDecimal ttltax);
 
	BigDecimal getTtlwgt();
 
	void setTtlwgt(final BigDecimal ttlwgt);
 
	BigDecimal getTaxqtyPct();
 
	void setTaxqtyPct(final BigDecimal taxqtyPct);
 
	BigDecimal getAdjtaxbefamt();
 
	void setAdjtaxbefamt(final BigDecimal adjtaxbefamt);
 
	BigDecimal getAvgwgttax();
 
	void setAvgwgttax(final BigDecimal avgwgttax);
 
	java.sql.Timestamp getCreatedate();
 
	void setCreatedate(final java.sql.Timestamp createdate);
 
}
