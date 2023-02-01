package com.doc.common.po; 
 
public interface IRegcologPo {
 
	String getBagno();
 
	void setBagno(final String bagno);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	String getReason();
 
	void setReason(final String reason);
 
	String getIe();
 
	void setIe(final String ie);
 
	java.sql.Timestamp getPridate2();
 
	void setPridate2(final java.sql.Timestamp pridate2);
 
	String getPriuser();
 
	void setPriuser(final String priuser);
 
	String getPriws();
 
	void setPriws(final String priws);
 
	java.sql.Timestamp getRedate();
 
	void setRedate(final java.sql.Timestamp redate);
 
	String getReuser();
 
	void setReuser(final String reuser);
 
	String getRews();
 
	void setRews(final String rews);
 
}
