package com.doc.common.po; 
 
public interface IBackerrorPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getRefbillno();
 
	void setRefbillno(final String refbillno);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getStrpost();
 
	void setStrpost(final String strpost);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	BigDecimal getItemno();
 
	void setItemno(final BigDecimal itemno);
 
	String getStrdate();
 
	void setStrdate(final String strdate);
 
	String getBacktable();
 
	void setBacktable(final String backtable);
 
	BigDecimal getErrcode();
 
	void setErrcode(final BigDecimal errcode);
 
	String getErrdesc();
 
	void setErrdesc(final String errdesc);
 
	String getLogtime();
 
	void setLogtime(final String logtime);
 
	String getStrtype();
 
	void setStrtype(final String strtype);
 
	String getBacktype();
 
	void setBacktype(final String backtype);
 
}
