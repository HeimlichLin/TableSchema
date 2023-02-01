package com.doc.common.po; 
 
public interface IDhlImdtyPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getDutyno();
 
	void setDutyno(final String dutyno);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	java.sql.Timestamp getGcodate();
 
	void setGcodate(final java.sql.Timestamp gcodate);
 
	java.sql.Timestamp getWdate();
 
	void setWdate(final java.sql.Timestamp wdate);
 
	java.sql.Timestamp getFtpdate();
 
	void setFtpdate(final java.sql.Timestamp ftpdate);
 
	String getFtpfile();
 
	void setFtpfile(final String ftpfile);
 
}
