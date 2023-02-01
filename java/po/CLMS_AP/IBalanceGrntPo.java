package com.doc.common.po; 
 
public interface IBalanceGrntPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getStrdate();
 
	void setStrdate(final String strdate);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	BigDecimal getItemno();
 
	void setItemno(final BigDecimal itemno);
 
	String getRefbillno();
 
	void setRefbillno(final String refbillno);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	BigDecimal getStrqty();
 
	void setStrqty(final BigDecimal strqty);
 
	BigDecimal getBalance();
 
	void setBalance(final BigDecimal balance);
 
	BigDecimal getTaxamt();
 
	void setTaxamt(final BigDecimal taxamt);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	BigDecimal getBalanceTax();
 
	void setBalanceTax(final BigDecimal balanceTax);
 
}
