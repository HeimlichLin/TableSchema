package com.doc.common.po; 
 
public interface IMailquePo {
 
	String getPgmId();
 
	void setPgmId(final String pgmId);
 
	java.sql.Timestamp getCreateDate();
 
	void setCreateDate(final java.sql.Timestamp createDate);
 
	String getSubject();
 
	void setSubject(final String subject);
 
	String getMailTo();
 
	void setMailTo(final String mailTo);
 
	String getMailCc();
 
	void setMailCc(final String mailCc);
 
	String getMailBcc();
 
	void setMailBcc(final String mailBcc);
 
	String getMailFrom();
 
	void setMailFrom(final String mailFrom);
 
	String getMessage();
 
	void setMessage(final String message);
 
	String getRemarks();
 
	void setRemarks(final String remarks);
 
	String getMailId();
 
	void setMailId(final String mailId);
 
	String getStatus();
 
	void setStatus(final String status);
 
	java.sql.Timestamp getSendDate();
 
	void setSendDate(final java.sql.Timestamp sendDate);
 
}
