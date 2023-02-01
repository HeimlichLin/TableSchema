package com.doc.common.po; 
 
public interface IRepcat$ResolStatsControlPo {
 
	String getSname();
 
	void setSname(final String sname);
 
	String getOname();
 
	void setOname(final String oname);
 
	java.sql.Timestamp getCreated();
 
	void setCreated(final java.sql.Timestamp created);
 
	BigDecimal getStatus();
 
	void setStatus(final BigDecimal status);
 
	java.sql.Timestamp getStatusUpdateDate();
 
	void setStatusUpdateDate(final java.sql.Timestamp statusUpdateDate);
 
	java.sql.Timestamp getPurgedDate();
 
	void setPurgedDate(final java.sql.Timestamp purgedDate);
 
	java.sql.Timestamp getLastPurgeStartDate();
 
	void setLastPurgeStartDate(final java.sql.Timestamp lastPurgeStartDate);
 
	java.sql.Timestamp getLastPurgeEndDate();
 
	void setLastPurgeEndDate(final java.sql.Timestamp lastPurgeEndDate);
 
}
