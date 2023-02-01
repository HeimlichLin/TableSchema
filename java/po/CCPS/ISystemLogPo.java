package com.doc.common.po; 
 
public interface ISystemLogPo {
 
	String getTransactionId();
 
	void setTransactionId(final String transactionId);
 
	String getTransactionMode();
 
	void setTransactionMode(final String transactionMode);
 
	String getDataFormat();
 
	void setDataFormat(final String dataFormat);
 
	String getReturnCode();
 
	void setReturnCode(final String returnCode);
 
	String getReturnMsg();
 
	void setReturnMsg(final String returnMsg);
 
	String getUpdateUser();
 
	void setUpdateUser(final String updateUser);
 
	java.sql.Timestamp getUpdateDate();
 
	void setUpdateDate(final java.sql.Timestamp updateDate);
 
}
