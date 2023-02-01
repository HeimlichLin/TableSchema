package com.doc.common.po; 
 
public interface IEdiquerylogPo {
 
	String getUserid();
 
	void setUserid(final String userid);
 
	String getQuerytable();
 
	void setQuerytable(final String querytable);
 
	java.sql.Timestamp getQuerydate();
 
	void setQuerydate(final java.sql.Timestamp querydate);
 
	String getControlno();
 
	void setControlno(final String controlno);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getWs();
 
	void setWs(final String ws);
 
	java.sql.Timestamp getQuerystarttime();
 
	void setQuerystarttime(final java.sql.Timestamp querystarttime);
 
	java.sql.Timestamp getQueryendtime();
 
	void setQueryendtime(final java.sql.Timestamp queryendtime);
 
}
