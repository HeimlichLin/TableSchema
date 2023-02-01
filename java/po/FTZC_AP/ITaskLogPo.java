package com.doc.common.po; 
 
public interface ITaskLogPo {
 
	String getCode();
 
	void setCode(final String code);
 
	BigDecimal getLine();
 
	void setLine(final BigDecimal line);
 
	String getMessage();
 
	void setMessage(final String message);
 
	String getTime();
 
	void setTime(final String time);
 
	String getPriority();
 
	void setPriority(final String priority);
 
}
