package com.doc.common.po; 
 
public interface IRlsquePo {
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	java.sql.Timestamp getRlsDate();
 
	void setRlsDate(final java.sql.Timestamp rlsDate);
 
	String getTransId();
 
	void setTransId(final String transId);
 
	String getErrType();
 
	void setErrType(final String errType);
 
	String getRsn();
 
	void setRsn(final String rsn);
 
	String getLogDatm();
 
	void setLogDatm(final String logDatm);
 
	String getMsgType();
 
	void setMsgType(final String msgType);
 
	String getAsType();
 
	void setAsType(final String asType);
 
	String getIoType();
 
	void setIoType(final String ioType);
 
	String getMawbNo();
 
	void setMawbNo(final String mawbNo);
 
	String getHawbNo();
 
	void setHawbNo(final String hawbNo);
 
	String getDeclType();
 
	void setDeclType(final String declType);
 
}
