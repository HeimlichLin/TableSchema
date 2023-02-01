package com.doc.common.po; 
 
public interface IInmonthPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getMonthno();
 
	void setMonthno(final String monthno);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	BigDecimal getMinqty();
 
	void setMinqty(final BigDecimal minqty);
 
	String getInunit();
 
	void setInunit(final String inunit);
 
}
