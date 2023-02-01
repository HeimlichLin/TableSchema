package com.doc.common.po; 
 
public interface IDef$ErrorPo {
 
	String getEnqTid();
 
	void setEnqTid(final String enqTid);
 
	String getOriginTranDb();
 
	void setOriginTranDb(final String originTranDb);
 
	String getOriginEnqTid();
 
	void setOriginEnqTid(final String originEnqTid);
 
	String getDestination();
 
	void setDestination(final String destination);
 
	BigDecimal getStepNo();
 
	void setStepNo(final BigDecimal stepNo);
 
	BigDecimal getReceiver();
 
	void setReceiver(final BigDecimal receiver);
 
	java.sql.Timestamp getEnqTime();
 
	void setEnqTime(final java.sql.Timestamp enqTime);
 
	BigDecimal getErrorNumber();
 
	void setErrorNumber(final BigDecimal errorNumber);
 
	String getErrorMsg();
 
	void setErrorMsg(final String errorMsg);
 
}
