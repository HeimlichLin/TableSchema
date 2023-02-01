package com.doc.common.po; 
 
public interface IN1ALogPo {
 
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
 
	String getRefBillNo();
 
	void setRefBillNo(final String refBillNo);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getOutStorageArea();
 
	void setOutStorageArea(final String outStorageArea);
 
}
