package com.doc.common.po; 
 
public interface IBomTLogPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getBomFile();
 
	void setBomFile(final String bomFile);
 
	String getBomDate();
 
	void setBomDate(final String bomDate);
 
	String getPrdtNo();
 
	void setPrdtNo(final String prdtNo);
 
	String getPartNo();
 
	void setPartNo(final String partNo);
 
	String getBomStatus();
 
	void setBomStatus(final String bomStatus);
 
	String getBomMsg();
 
	void setBomMsg(final String bomMsg);
 
	String getRecvDate();
 
	void setRecvDate(final String recvDate);
 
	String getCocompNo();
 
	void setCocompNo(final String cocompNo);
 
	BigDecimal getSeqNo();
 
	void setSeqNo(final BigDecimal seqNo);
 
	BigDecimal getSerialNo();
 
	void setSerialNo(final BigDecimal serialNo);
 
}
