package com.doc.common.po; 
 
public interface IL6LogPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getControlNo();
 
	void setControlNo(final String controlNo);
 
	BigDecimal getVersion();
 
	void setVersion(final BigDecimal version);
 
	BigDecimal getSeqNo();
 
	void setSeqNo(final BigDecimal seqNo);
 
	String getRefBillNo();
 
	void setRefBillNo(final String refBillNo);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getOilPost();
 
	void setOilPost(final String oilPost);
 
	String getNewPost();
 
	void setNewPost(final String newPost);
 
	BigDecimal getQty();
 
	void setQty(final BigDecimal qty);
 
	String getLogStatus();
 
	void setLogStatus(final String logStatus);
 
	String getLogRmk();
 
	void setLogRmk(final String logRmk);
 
	java.sql.Timestamp getL6Time();
 
	void setL6Time(final java.sql.Timestamp l6Time);
 
}
