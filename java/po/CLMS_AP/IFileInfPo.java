package com.doc.common.po; 
 
public interface IFileInfPo {
 
	String getTransaction();
 
	void setTransaction(final String transaction);
 
	String getContent();
 
	void setContent(final String content);
 
	String getFileName();
 
	void setFileName(final String fileName);
 
	java.sql.Timestamp getCreaTime();
 
	void setCreaTime(final java.sql.Timestamp creaTime);
 
	BigDecimal getFileSize();
 
	void setFileSize(final BigDecimal fileSize);
 
}
