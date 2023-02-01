package com.doc.common.po; 
 
public interface IImpcheckPo {
 
	java.sql.Timestamp getCheckdate();
 
	void setCheckdate(final java.sql.Timestamp checkdate);
 
	String getCheckuser();
 
	void setCheckuser(final String checkuser);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	BigDecimal getStatus();
 
	void setStatus(final BigDecimal status);
 
	String getHoldarea();
 
	void setHoldarea(final String holdarea);
 
	BigDecimal getSn();
 
	void setSn(final BigDecimal sn);
 
	BigDecimal getCnt();
 
	void setCnt(final BigDecimal cnt);
 
}
