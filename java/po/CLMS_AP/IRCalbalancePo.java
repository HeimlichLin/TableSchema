package com.doc.common.po; 
 
public interface IRCalbalancePo {
 
	String getSessionid();
 
	void setSessionid(final String sessionid);
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getGdstype();
 
	void setGdstype(final String gdstype);
 
	String getDecltype();
 
	void setDecltype(final String decltype);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	BigDecimal getItemno();
 
	void setItemno(final BigDecimal itemno);
 
	String getStockno();
 
	void setStockno(final String stockno);
 
	String getIndate();
 
	void setIndate(final String indate);
 
	BigDecimal getRinqty();
 
	void setRinqty(final BigDecimal rinqty);
 
	String getInunit();
 
	void setInunit(final String inunit);
 
	String getInpost();
 
	void setInpost(final String inpost);
 
	BigDecimal getBalance();
 
	void setBalance(final BigDecimal balance);
 
	String getIsstock();
 
	void setIsstock(final String isstock);
 
	String getRmk();
 
	void setRmk(final String rmk);
 
	String getInstatus();
 
	void setInstatus(final String instatus);
 
	String getControlno();
 
	void setControlno(final String controlno);
 
	String getUpdtime();
 
	void setUpdtime(final String updtime);
 
}
