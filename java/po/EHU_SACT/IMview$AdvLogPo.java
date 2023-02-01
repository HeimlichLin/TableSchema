package com.doc.common.po; 
 
public interface IMview$AdvLogPo {
 
	BigDecimal getRunid#();
 
	void setRunid#(final BigDecimal runid#);
 
	BigDecimal getFilterid#();
 
	void setFilterid#(final BigDecimal filterid#);
 
	java.sql.Timestamp getRunBegin();
 
	void setRunBegin(final java.sql.Timestamp runBegin);
 
	java.sql.Timestamp getRunEnd();
 
	void setRunEnd(final java.sql.Timestamp runEnd);
 
	BigDecimal getRunType();
 
	void setRunType(final BigDecimal runType);
 
	String getUname();
 
	void setUname(final String uname);
 
	BigDecimal getStatus();
 
	void setStatus(final BigDecimal status);
 
	String getMessage();
 
	void setMessage(final String message);
 
	BigDecimal getCompleted();
 
	void setCompleted(final BigDecimal completed);
 
	BigDecimal getTotal();
 
	void setTotal(final BigDecimal total);
 
	String getErrorCode();
 
	void setErrorCode(final String errorCode);
 
}
