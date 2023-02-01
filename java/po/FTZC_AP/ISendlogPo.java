package com.doc.common.po; 
 
public interface ISendlogPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	String getStrType();
 
	void setStrType(final String strType);
 
	String getSendFlag();
 
	void setSendFlag(final String sendFlag);
 
	String getControlNo();
 
	void setControlNo(final String controlNo);
 
	String getSendTime();
 
	void setSendTime(final String sendTime);
 
	String getMsgFun();
 
	void setMsgFun(final String msgFun);
 
	String getMsgType();
 
	void setMsgType(final String msgType);
 
	String getAsType();
 
	void setAsType(final String asType);
 
	String getIoType();
 
	void setIoType(final String ioType);
 
	BigDecimal getDeclSeqNo();
 
	void setDeclSeqNo(final BigDecimal declSeqNo);
 
	String getMawbNo();
 
	void setMawbNo(final String mawbNo);
 
	String getHawbNo();
 
	void setHawbNo(final String hawbNo);
 
}
