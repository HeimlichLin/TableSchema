package com.doc.common.po; 
 
public interface IShortlandPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getDeliverType();
 
	void setDeliverType(final String deliverType);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	String getDeclType();
 
	void setDeclType(final String declType);
 
	String getItemNo();
 
	void setItemNo(final String itemNo);
 
	BigDecimal getDeclQty();
 
	void setDeclQty(final BigDecimal declQty);
 
	BigDecimal getShortLandQty();
 
	void setShortLandQty(final BigDecimal shortLandQty);
 
	String getPermitNo();
 
	void setPermitNo(final String permitNo);
 
	String getPermitDate();
 
	void setPermitDate(final String permitDate);
 
	String getRemark();
 
	void setRemark(final String remark);
 
	String getStorageArea();
 
	void setStorageArea(final String storageArea);
 
	String getODeclNo();
 
	void setODeclNo(final String oDeclNo);
 
	BigDecimal getOItemNo();
 
	void setOItemNo(final BigDecimal oItemNo);
 
}
