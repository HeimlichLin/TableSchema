package com.doc.common.po; 
 
public interface ICloudLogOldPo {
 
	String getIe();
 
	void setIe(final String ie);
 
	String getWhIo();
 
	void setWhIo(final String whIo);
 
	String getLogDate();
 
	void setLogDate(final String logDate);
 
	String getHwbBag();
 
	void setHwbBag(final String hwbBag);
 
	String getLogType();
 
	void setLogType(final String logType);
 
	String getLogStatus();
 
	void setLogStatus(final String logStatus);
 
	String getLogNote1();
 
	void setLogNote1(final String logNote1);
 
	String getLogNote2();
 
	void setLogNote2(final String logNote2);
 
	BigDecimal getSortNo();
 
	void setSortNo(final BigDecimal sortNo);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	java.sql.Timestamp getCrtDate();
 
	void setCrtDate(final java.sql.Timestamp crtDate);
 
}
