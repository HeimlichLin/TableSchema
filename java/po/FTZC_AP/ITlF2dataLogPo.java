package com.doc.common.po; 
 
public interface ITlF2dataLogPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getControlNo();
 
	void setControlNo(final String controlNo);
 
	String getInvoiceNo();
 
	void setInvoiceNo(final String invoiceNo);
 
	BigDecimal getSerialNo();
 
	void setSerialNo(final BigDecimal serialNo);
 
	String getCommodityNo();
 
	void setCommodityNo(final String commodityNo);
 
	String getCustomsCommodityNo();
 
	void setCustomsCommodityNo(final String customsCommodityNo);
 
	BigDecimal getQty();
 
	void setQty(final BigDecimal qty);
 
	BigDecimal getRF2dataCnt();
 
	void setRF2dataCnt(final BigDecimal rF2dataCnt);
 
	String getRTempDeclNo();
 
	void setRTempDeclNo(final String rTempDeclNo);
 
	String getTempDeclHead();
 
	void setTempDeclHead(final String tempDeclHead);
 
	BigDecimal getItemCnt();
 
	void setItemCnt(final BigDecimal itemCnt);
 
	String getCnt();
 
	void setCnt(final String cnt);
 
	BigDecimal getNewbalance();
 
	void setNewbalance(final BigDecimal newbalance);
 
	String getErrmsg();
 
	void setErrmsg(final String errmsg);
 
	BigDecimal getInItemNo();
 
	void setInItemNo(final BigDecimal inItemNo);
 
	BigDecimal getGbalance();
 
	void setGbalance(final BigDecimal gbalance);
 
	String getOstatus();
 
	void setOstatus(final String ostatus);
 
	BigDecimal getOlastQty();
 
	void setOlastQty(final BigDecimal olastQty);
 
	BigDecimal getIcurrentQty();
 
	void setIcurrentQty(final BigDecimal icurrentQty);
 
	String getLogTime();
 
	void setLogTime(final String logTime);
 
}
