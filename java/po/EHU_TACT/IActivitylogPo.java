package com.doc.common.po; 
 
public interface IActivitylogPo {
 
	String getWs();
 
	void setWs(final String ws);
 
	String getUserid();
 
	void setUserid(final String userid);
 
	java.sql.Timestamp getApuptime();
 
	void setApuptime(final java.sql.Timestamp apuptime);
 
	java.sql.Timestamp getApdowntime();
 
	void setApdowntime(final java.sql.Timestamp apdowntime);
 
	java.sql.Timestamp getUserlogintime();
 
	void setUserlogintime(final java.sql.Timestamp userlogintime);
 
	java.sql.Timestamp getUserlogouttime();
 
	void setUserlogouttime(final java.sql.Timestamp userlogouttime);
 
	java.sql.Timestamp getFormuptime();
 
	void setFormuptime(final java.sql.Timestamp formuptime);
 
	java.sql.Timestamp getFormdowntime();
 
	void setFormdowntime(final java.sql.Timestamp formdowntime);
 
	String getForm();
 
	void setForm(final String form);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getAction();
 
	void setAction(final String action);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	BigDecimal getOriweight();
 
	void setOriweight(final BigDecimal oriweight);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getDownuserid();
 
	void setDownuserid(final String downuserid);
 
	java.sql.Timestamp getDownformtime();
 
	void setDownformtime(final java.sql.Timestamp downformtime);
 
	String getDownform();
 
	void setDownform(final String downform);
 
	String getTryinguserid();
 
	void setTryinguserid(final String tryinguserid);
 
	java.sql.Timestamp getTryingtime();
 
	void setTryingtime(final java.sql.Timestamp tryingtime);
 
}
