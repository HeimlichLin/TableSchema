package com.doc.common.po; 
 
public interface ISystemSchedulePo {
 
	String getServiceName();
 
	void setServiceName(final String serviceName);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getExecutionInterval();
 
	void setExecutionInterval(final String executionInterval);
 
	String getUpdateFrequency();
 
	void setUpdateFrequency(final String updateFrequency);
 
	java.sql.Timestamp getLastUpdateTime();
 
	void setLastUpdateTime(final java.sql.Timestamp lastUpdateTime);
 
}
