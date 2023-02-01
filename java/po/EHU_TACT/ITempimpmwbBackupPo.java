package com.doc.common.po; 
 
public interface ITempimpmwbBackupPo {
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	BigDecimal getHwbcount();
 
	void setHwbcount(final BigDecimal hwbcount);
 
	BigDecimal getHwbpiece();
 
	void setHwbpiece(final BigDecimal hwbpiece);
 
	BigDecimal getBagcount();
 
	void setBagcount(final BigDecimal bagcount);
 
	BigDecimal getBaghwb();
 
	void setBaghwb(final BigDecimal baghwb);
 
	BigDecimal getBagpiece();
 
	void setBagpiece(final BigDecimal bagpiece);
 
	BigDecimal getGcihwbcount();
 
	void setGcihwbcount(final BigDecimal gcihwbcount);
 
	BigDecimal getGcihwbpiece();
 
	void setGcihwbpiece(final BigDecimal gcihwbpiece);
 
	BigDecimal getGcibagcount();
 
	void setGcibagcount(final BigDecimal gcibagcount);
 
	BigDecimal getGcibaghwb();
 
	void setGcibaghwb(final BigDecimal gcibaghwb);
 
	BigDecimal getGcibagpiece();
 
	void setGcibagpiece(final BigDecimal gcibagpiece);
 
	String getWorking();
 
	void setWorking(final String working);
 
	java.sql.Timestamp getRelease();
 
	void setRelease(final java.sql.Timestamp release);
 
	String getIe();
 
	void setIe(final String ie);
 
	String getWorkarea();
 
	void setWorkarea(final String workarea);
 
}
