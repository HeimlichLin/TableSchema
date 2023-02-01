package com.doc.common.po; 
 
public interface IAdjustmentPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getRefbillno();
 
	void setRefbillno(final String refbillno);
 
	BigDecimal getItem();
 
	void setItem(final BigDecimal item);
 
	String getInpost();
 
	void setInpost(final String inpost);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	BigDecimal getItemno();
 
	void setItemno(final BigDecimal itemno);
 
	BigDecimal getRinqty();
 
	void setRinqty(final BigDecimal rinqty);
 
	BigDecimal getAdjustqty();
 
	void setAdjustqty(final BigDecimal adjustqty);
 
	String getApprvno();
 
	void setApprvno(final String apprvno);
 
	String getApprvdate();
 
	void setApprvdate(final String apprvdate);
 
	String getRmk();
 
	void setRmk(final String rmk);
 
	String getUpdtime();
 
	void setUpdtime(final String updtime);
 
}
