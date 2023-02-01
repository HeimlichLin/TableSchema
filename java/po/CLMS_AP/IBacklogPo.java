package com.doc.common.po; 
 
public interface IBacklogPo {
 
	String getLogtable();
 
	void setLogtable(final String logtable);
 
	BigDecimal getInscnt();
 
	void setInscnt(final BigDecimal inscnt);
 
	BigDecimal getDelcnt();
 
	void setDelcnt(final BigDecimal delcnt);
 
	String getLogtime();
 
	void setLogtime(final String logtime);
 
	String getBackupdate();
 
	void setBackupdate(final String backupdate);
 
	String getExpdate();
 
	void setExpdate(final String expdate);
 
	String getCleardate();
 
	void setCleardate(final String cleardate);
 
	String getCleardate2();
 
	void setCleardate2(final String cleardate2);
 
}
