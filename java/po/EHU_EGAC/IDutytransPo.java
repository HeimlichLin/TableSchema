package com.doc.common.po; 
 
public interface IDutytransPo {
 
	String getDutyno();
 
	void setDutyno(final String dutyno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	java.sql.Timestamp getTranstime();
 
	void setTranstime(final java.sql.Timestamp transtime);
 
	java.sql.Timestamp getFtptime();
 
	void setFtptime(final java.sql.Timestamp ftptime);
 
}
