package com.doc.common.po; 
 
public interface IAq$SchedulesPo {
 
	String getOid();
 
	void setOid(final String oid);
 
	String getDestination();
 
	void setDestination(final String destination);
 
	java.sql.Timestamp getStartTime();
 
	void setStartTime(final java.sql.Timestamp startTime);
 
	String getDuration();
 
	void setDuration(final String duration);
 
	String getNextTime();
 
	void setNextTime(final String nextTime);
 
	String getLatency();
 
	void setLatency(final String latency);
 
	java.sql.Timestamp getLastTime();
 
	void setLastTime(final java.sql.Timestamp lastTime);
 
	BigDecimal getJobno();
 
	void setJobno(final BigDecimal jobno);
 
}
