package com.doc.common.po; 
 
public interface IScrapinPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getScrapno();
 
	void setScrapno(final String scrapno);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	String getCcccode();
 
	void setCcccode(final String ccccode);
 
	String getDescrip();
 
	void setDescrip(final String descrip);
 
	BigDecimal getQty();
 
	void setQty(final BigDecimal qty);
 
	String getUnit();
 
	void setUnit(final String unit);
 
	BigDecimal getUnitprice();
 
	void setUnitprice(final BigDecimal unitprice);
 
	BigDecimal getNwght();
 
	void setNwght(final BigDecimal nwght);
 
	BigDecimal getGross();
 
	void setGross(final BigDecimal gross);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	BigDecimal getValueamt();
 
	void setValueamt(final BigDecimal valueamt);
 
	String getInpost();
 
	void setInpost(final String inpost);
 
}
