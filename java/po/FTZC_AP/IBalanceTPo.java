package com.doc.common.po; 
 
public interface IBalanceTPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	BigDecimal getItemNo();
 
	void setItemNo(final BigDecimal itemNo);
 
	String getCommodityNo();
 
	void setCommodityNo(final String commodityNo);
 
	String getGoodsUnit();
 
	void setGoodsUnit(final String goodsUnit);
 
	BigDecimal getBalanceQty();
 
	void setBalanceQty(final BigDecimal balanceQty);
 
	BigDecimal getVerifyQty();
 
	void setVerifyQty(final BigDecimal verifyQty);
 
	String getVerifyStatus();
 
	void setVerifyStatus(final String verifyStatus);
 
	String getExtendDoc();
 
	void setExtendDoc(final String extendDoc);
 
	String getExtendDate();
 
	void setExtendDate(final String extendDate);
 
	String getExpireMark();
 
	void setExpireMark(final String expireMark);
 
	String getCocompNo();
 
	void setCocompNo(final String cocompNo);
 
	String getCtmCode();
 
	void setCtmCode(final String ctmCode);
 
	String getCreateDatm();
 
	void setCreateDatm(final String createDatm);
 
	String getEditMark();
 
	void setEditMark(final String editMark);
 
	String getApproveDoc();
 
	void setApproveDoc(final String approveDoc);
 
	String getApproveDate();
 
	void setApproveDate(final String approveDate);
 
	String getYzDeclNo();
 
	void setYzDeclNo(final String yzDeclNo);
 
	BigDecimal getYzItemNo();
 
	void setYzItemNo(final BigDecimal yzItemNo);
 
	String getInvtryType();
 
	void setInvtryType(final String invtryType);
 
	String getOutStorageArea();
 
	void setOutStorageArea(final String outStorageArea);
 
}
