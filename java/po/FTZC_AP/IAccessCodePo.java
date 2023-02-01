package com.doc.common.po; 
 
public interface IAccessCodePo {
 
	String getCode();
 
	void setCode(final String code);
 
	String getCreateDate();
 
	void setCreateDate(final String createDate);
 
	String getExpiredDate();
 
	void setExpiredDate(final String expiredDate);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getUserId();
 
	void setUserId(final String userId);
 
	String getRegRemoteAddr();
 
	void setRegRemoteAddr(final String regRemoteAddr);
 
	String getLastAccRemoteAddr();
 
	void setLastAccRemoteAddr(final String lastAccRemoteAddr);
 
	String getLastAccDate();
 
	void setLastAccDate(final String lastAccDate);
 
}
