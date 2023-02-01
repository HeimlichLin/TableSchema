package com.doc.common.po; 
 
public interface IMwbnologPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getIe();
 
	void setIe(final String ie);
 
	BigDecimal getGcipiece();
 
	void setGcipiece(final BigDecimal gcipiece);
 
	BigDecimal getGcopiece();
 
	void setGcopiece(final BigDecimal gcopiece);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
}
