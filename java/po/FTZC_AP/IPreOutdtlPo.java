package com.doc.common.po; 
 
public interface IPreOutdtlPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getODeclNo();
 
	void setODeclNo(final String oDeclNo);
 
	BigDecimal getOItemNo();
 
	void setOItemNo(final BigDecimal oItemNo);
 
	String getGoodsUnit();
 
	void setGoodsUnit(final String goodsUnit);
 
	String getOutStorageArea();
 
	void setOutStorageArea(final String outStorageArea);
 
	BigDecimal getSumqty();
 
	void setSumqty(final BigDecimal sumqty);
 
	String getCommodityNo();
 
	void setCommodityNo(final String commodityNo);
 
}
