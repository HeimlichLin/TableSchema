package com.doc.common.po; 
 
public interface IL5LogPo {
 
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
 
	java.sql.Timestamp getL5Time();
 
	void setL5Time(final java.sql.Timestamp l5Time);
 
	String getMsgFun();
 
	void setMsgFun(final String msgFun);
 
	String getRefBillNo();
 
	void setRefBillNo(final String refBillNo);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
}
