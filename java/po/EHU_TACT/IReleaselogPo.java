package com.doc.common.po; 
 
public interface IReleaselogPo {
 
	String getUserid();
 
	void setUserid(final String userid);
 
	java.sql.Timestamp getLogdate();
 
	void setLogdate(final java.sql.Timestamp logdate);
 
	String getWs();
 
	void setWs(final String ws);
 
	String getAction();
 
	void setAction(final String action);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getIe();
 
	void setIe(final String ie);
 
	String getClearancetype();
 
	void setClearancetype(final String clearancetype);
 
}
