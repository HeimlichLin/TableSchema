package com.doc.common.po; 
 
public interface IScrapInPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getScrapNo();
 
	void setScrapNo(final String scrapNo);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getPrdtNo();
 
	void setPrdtNo(final String prdtNo);
 
	String getDescrip();
 
	void setDescrip(final String descrip);
 
	BigDecimal getQty();
 
	void setQty(final BigDecimal qty);
 
	String getUnit();
 
	void setUnit(final String unit);
 
	BigDecimal getUnitPrice();
 
	void setUnitPrice(final BigDecimal unitPrice);
 
	BigDecimal getValueAmt();
 
	void setValueAmt(final BigDecimal valueAmt);
 
	String getInPost();
 
	void setInPost(final String inPost);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
}
