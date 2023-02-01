package com.doc.common.po; 
 
public interface IMessageTmpPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getControlNo();
 
	void setControlNo(final String controlNo);
 
	BigDecimal getSerialNo();
 
	void setSerialNo(final BigDecimal serialNo);
 
	java.sql.Timestamp getTime();
 
	void setTime(final java.sql.Timestamp time);
 
	String getMsgType();
 
	void setMsgType(final String msgType);
 
	String getStatus();
 
	void setStatus(final String status);
 
	java.sql.Timestamp getDealbeginTime();
 
	void setDealbeginTime(final java.sql.Timestamp dealbeginTime);
 
	java.sql.Timestamp getDealfinishTime();
 
	void setDealfinishTime(final java.sql.Timestamp dealfinishTime);
 
}
