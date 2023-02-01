package com.doc.common.po; 
 
public interface IBalancePo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getOutGuid();
 
	void setOutGuid(final String outGuid);
 
	String getOutNo();
 
	void setOutNo(final String outNo);
 
	BigDecimal getOutItemNo();
 
	void setOutItemNo(final BigDecimal outItemNo);
 
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
 
	String getOutStorageArea();
 
	void setOutStorageArea(final String outStorageArea);
 
	String getEditMark();
 
	void setEditMark(final String editMark);
 
	String getApproveDoc();
 
	void setApproveDoc(final String approveDoc);
 
	String getApproveDate();
 
	void setApproveDate(final String approveDate);
 
}
