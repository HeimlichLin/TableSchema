package com.doc.common.po; 
 
public interface IImpStockPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	String getContainer();
 
	void setContainer(final String container);
 
	String getStocktype();
 
	void setStocktype(final String stocktype);
 
	String getStockno();
 
	void setStockno(final String stockno);
 
	String getInputmode();
 
	void setInputmode(final String inputmode);
 
	BigDecimal getChkpiece();
 
	void setChkpiece(final BigDecimal chkpiece);
 
	String getChkuser();
 
	void setChkuser(final String chkuser);
 
	java.sql.Timestamp getCheckdate();
 
	void setCheckdate(final java.sql.Timestamp checkdate);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getLastupuser();
 
	void setLastupuser(final String lastupuser);
 
	BigDecimal getUniqueid();
 
	void setUniqueid(final BigDecimal uniqueid);
 
}
