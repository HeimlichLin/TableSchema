package com.doc.common.po; 
 
public interface IRecvlogPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getRecvType();
 
	void setRecvType(final String recvType);
 
	String getKeyword();
 
	void setKeyword(final String keyword);
 
	String getMsgType();
 
	void setMsgType(final String msgType);
 
	java.sql.Timestamp getProcTime();
 
	void setProcTime(final java.sql.Timestamp procTime);
 
	BigDecimal getProcStatus();
 
	void setProcStatus(final BigDecimal procStatus);
 
	String getProcRmk();
 
	void setProcRmk(final String procRmk);
 
	String getControlNo();
 
	void setControlNo(final String controlNo);
 
	String getSrcType();
 
	void setSrcType(final String srcType);
 
	String getMawbNo();
 
	void setMawbNo(final String mawbNo);
 
	String getHawbNo();
 
	void setHawbNo(final String hawbNo);
 
}
