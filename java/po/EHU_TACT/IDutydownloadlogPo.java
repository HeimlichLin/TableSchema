package com.doc.common.po; 
 
public interface IDutydownloadlogPo {
 
	String getDutyno();
 
	void setDutyno(final String dutyno);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	java.sql.Timestamp getDownloaddate();
 
	void setDownloaddate(final java.sql.Timestamp downloaddate);
 
	java.sql.Timestamp getWdate();
 
	void setWdate(final java.sql.Timestamp wdate);
 
	String getDlip();
 
	void setDlip(final String dlip);
 
}
