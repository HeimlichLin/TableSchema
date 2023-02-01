package com.doc.common.po; 
 
public interface IProcLogPo {
 
	String getProgrameId();
 
	void setProgrameId(final String programeId);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getMesssage();
 
	void setMesssage(final String messsage);
 
	String getYyyymmdd();
 
	void setYyyymmdd(final String yyyymmdd);
 
	String getHhmmss();
 
	void setHhmmss(final String hhmmss);
 
	String getMethod();
 
	void setMethod(final String method);
 
	String getLine();
 
	void setLine(final String line);
 
	String getIp();
 
	void setIp(final String ip);
 
	String getStacktrace();
 
	void setStacktrace(final String stacktrace);
 
}
