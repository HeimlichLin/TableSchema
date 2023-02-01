package com.doc.common.po; 
 
public interface ISystemActiveInfoPo {
 
	String getSysCode();
 
	void setSysCode(final String sysCode);
 
	String getFoodRegNum();
 
	void setFoodRegNum(final String foodRegNum);
 
	String getProdActCode();
 
	void setProdActCode(final String prodActCode);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getApiKey();
 
	void setApiKey(final String apiKey);
 
	String getSecurityKey();
 
	void setSecurityKey(final String securityKey);
 
	java.sql.Timestamp getInsertday();
 
	void setInsertday(final java.sql.Timestamp insertday);
 
	String getIsAuth();
 
	void setIsAuth(final String isAuth);
 
	String getAuthId();
 
	void setAuthId(final String authId);
 
	String getBan();
 
	void setBan(final String ban);
 
}
