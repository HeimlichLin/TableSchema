package com.doc.common.po; 
 
public interface IOutmonthPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getMonthno();
 
	void setMonthno(final String monthno);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	BigDecimal getMoutqty();
 
	void setMoutqty(final BigDecimal moutqty);
 
	String getOutunit();
 
	void setOutunit(final String outunit);
 
}
