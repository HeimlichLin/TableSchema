package com.doc.common.po; 
 
public interface IBatchdtlPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getTransId();
 
	void setTransId(final String transId);
 
	String getDeliverNo();
 
	void setDeliverNo(final String deliverNo);
 
	BigDecimal getItemNo();
 
	void setItemNo(final BigDecimal itemNo);
 
	String getDeliverType();
 
	void setDeliverType(final String deliverType);
 
	String getSplitNo();
 
	void setSplitNo(final String splitNo);
 
	BigDecimal getDeliverQty();
 
	void setDeliverQty(final BigDecimal deliverQty);
 
	String getDeliverDate();
 
	void setDeliverDate(final String deliverDate);
 
	String getUserId();
 
	void setUserId(final String userId);
 
	String getRemark();
 
	void setRemark(final String remark);
 
}
