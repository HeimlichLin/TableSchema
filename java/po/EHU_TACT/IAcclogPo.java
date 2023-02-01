package com.doc.common.po; 
 
public interface IAcclogPo {
 
	String getLoguserid();
 
	void setLoguserid(final String loguserid);
 
	java.sql.Timestamp getLogdate();
 
	void setLogdate(final java.sql.Timestamp logdate);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	BigDecimal getOldbaseref();
 
	void setOldbaseref(final BigDecimal oldbaseref);
 
	BigDecimal getOldcurrenttotoal();
 
	void setOldcurrenttotoal(final BigDecimal oldcurrenttotoal);
 
	BigDecimal getOldbaseline();
 
	void setOldbaseline(final BigDecimal oldbaseline);
 
	BigDecimal getAddcurrent();
 
	void setAddcurrent(final BigDecimal addcurrent);
 
	BigDecimal getNewbaseref();
 
	void setNewbaseref(final BigDecimal newbaseref);
 
	BigDecimal getNewcurrenttotal();
 
	void setNewcurrenttotal(final BigDecimal newcurrenttotal);
 
	BigDecimal getNewbaseline();
 
	void setNewbaseline(final BigDecimal newbaseline);
 
	String getLogtype();
 
	void setLogtype(final String logtype);
 
	BigDecimal getVraddcurrent();
 
	void setVraddcurrent(final BigDecimal vraddcurrent);
 
	String getVraccount();
 
	void setVraccount(final String vraccount);
 
}
