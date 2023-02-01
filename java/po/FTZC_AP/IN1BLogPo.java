package com.doc.common.po; 
 
public interface IN1BLogPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getControlNo();
 
	void setControlNo(final String controlNo);
 
	BigDecimal getVersion();
 
	void setVersion(final BigDecimal version);
 
	BigDecimal getSeqNo();
 
	void setSeqNo(final BigDecimal seqNo);
 
	String getLogStatus();
 
	void setLogStatus(final String logStatus);
 
	String getLogRmk();
 
	void setLogRmk(final String logRmk);
 
	java.sql.Timestamp getRecvTime();
 
	void setRecvTime(final java.sql.Timestamp recvTime);
 
	String getFuncType();
 
	void setFuncType(final String funcType);
 
	String getPost();
 
	void setPost(final String post);
 
	String getAttribute();
 
	void setAttribute(final String attribute);
 
}
