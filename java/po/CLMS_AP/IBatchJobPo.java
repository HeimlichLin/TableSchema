package com.doc.common.po; 
 
public interface IBatchJobPo {
 
	String getTransaction();
 
	void setTransaction(final String transaction);
 
	String getExCode();
 
	void setExCode(final String exCode);
 
	String getCreater();
 
	void setCreater(final String creater);
 
	String getExGroup();
 
	void setExGroup(final String exGroup);
 
	java.sql.Timestamp getCreateTime();
 
	void setCreateTime(final java.sql.Timestamp createTime);
 
	java.sql.Timestamp getStartTime();
 
	void setStartTime(final java.sql.Timestamp startTime);
 
	java.sql.Timestamp getEndTime();
 
	void setEndTime(final java.sql.Timestamp endTime);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getParameter();
 
	void setParameter(final String parameter);
 
	String getParameterClass();
 
	void setParameterClass(final String parameterClass);
 
	String getTargetClass();
 
	void setTargetClass(final String targetClass);
 
	String getHasFile();
 
	void setHasFile(final String hasFile);
 
	String getIsRead();
 
	void setIsRead(final String isRead);
 
	String getMail();
 
	void setMail(final String mail);
 
	String getMessage();
 
	void setMessage(final String message);
 
	String getFileContent();
 
	void setFileContent(final String fileContent);
 
	String getFileName();
 
	void setFileName(final String fileName);
 
}
