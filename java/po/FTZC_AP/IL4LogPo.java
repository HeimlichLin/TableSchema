package com.doc.common.po; 
 
public interface IL4LogPo {
 
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
 
	java.sql.Timestamp getL4Time();
 
	void setL4Time(final java.sql.Timestamp l4Time);
 
	String getMsgFun();
 
	void setMsgFun(final String msgFun);
 
	String getRefBillNo();
 
	void setRefBillNo(final String refBillNo);
 
	String getItem();
 
	void setItem(final String item);
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	String getItemNo();
 
	void setItemNo(final String itemNo);
 
	BigDecimal getDeclSeqNo();
 
	void setDeclSeqNo(final BigDecimal declSeqNo);
 
}
