package com.doc.common.po; 
 
public interface IN1AT1Po {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getControlNo();
 
	void setControlNo(final String controlNo);
 
	java.sql.Timestamp getRecvTime();
 
	void setRecvTime(final java.sql.Timestamp recvTime);
 
	BigDecimal getVersion();
 
	void setVersion(final BigDecimal version);
 
	BigDecimal getSeqNo();
 
	void setSeqNo(final BigDecimal seqNo);
 
	String getRefBillNo();
 
	void setRefBillNo(final String refBillNo);
 
	String getItem();
 
	void setItem(final String item);
 
	String getOutStorageArea();
 
	void setOutStorageArea(final String outStorageArea);
 
	String getCommodityNo();
 
	void setCommodityNo(final String commodityNo);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	BigDecimal getItemNo();
 
	void setItemNo(final BigDecimal itemNo);
 
	String getDeclType();
 
	void setDeclType(final String declType);
 
	String getExtendDate();
 
	void setExtendDate(final String extendDate);
 
	String getExtendDoc();
 
	void setExtendDoc(final String extendDoc);
 
	String getIConfirmed();
 
	void setIConfirmed(final String iConfirmed);
 
}
