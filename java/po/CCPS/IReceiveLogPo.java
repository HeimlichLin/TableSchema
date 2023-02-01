package com.doc.common.po; 
 
public interface IReceiveLogPo {
 
	String getTransIdenId();
 
	void setTransIdenId(final String transIdenId);
 
	String getSysCode();
 
	void setSysCode(final String sysCode);
 
	String getIp();
 
	void setIp(final String ip);
 
	String getFoodRegNum();
 
	void setFoodRegNum(final String foodRegNum);
 
	String getUserId();
 
	void setUserId(final String userId);
 
	String getSrcInfo();
 
	void setSrcInfo(final String srcInfo);
 
	String getRecvMode();
 
	void setRecvMode(final String recvMode);
 
	java.sql.Timestamp getRecvTime();
 
	void setRecvTime(final java.sql.Timestamp recvTime);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getSavePath();
 
	void setSavePath(final String savePath);
 
	String getSaveName();
 
	void setSaveName(final String saveName);
 
	String getFileName();
 
	void setFileName(final String fileName);
 
	String getReason();
 
	void setReason(final String reason);
 
	String getDataProcessNumber();
 
	void setDataProcessNumber(final String dataProcessNumber);
 
	String getBan();
 
	void setBan(final String ban);
 
}
