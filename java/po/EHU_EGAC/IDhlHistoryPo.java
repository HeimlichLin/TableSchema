package com.doc.common.po; 
 
public interface IDhlHistoryPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	java.sql.Timestamp getFtpdate();
 
	void setFtpdate(final java.sql.Timestamp ftpdate);
 
	String getFtptype();
 
	void setFtptype(final String ftptype);
 
}
