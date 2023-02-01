package com.doc.common.po; 
 
public interface IGrntbillPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getBillno();
 
	void setBillno(final String billno);
 
	String getDepsdate();
 
	void setDepsdate(final String depsdate);
 
	BigDecimal getDepsamt();
 
	void setDepsamt(final BigDecimal depsamt);
 
	String getRmks();
 
	void setRmks(final String rmks);
 
	String getMsgfun();
 
	void setMsgfun(final String msgfun);
 
	String getValiddate();
 
	void setValiddate(final String validdate);
 
}
