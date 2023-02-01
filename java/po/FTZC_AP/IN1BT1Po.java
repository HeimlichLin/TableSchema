package com.doc.common.po; 
 
public interface IN1BT1Po {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getControlNo();
 
	void setControlNo(final String controlNo);
 
	java.sql.Timestamp getRecvTime();
 
	void setRecvTime(final java.sql.Timestamp recvTime);
 
	BigDecimal getVersion();
 
	void setVersion(final BigDecimal version);
 
	BigDecimal getSeqNo();
 
	void setSeqNo(final BigDecimal seqNo);
 
	String getFuncType();
 
	void setFuncType(final String funcType);
 
	String getPost();
 
	void setPost(final String post);
 
	String getAttribute();
 
	void setAttribute(final String attribute);
 
	String getIConfirmed();
 
	void setIConfirmed(final String iConfirmed);
 
}
