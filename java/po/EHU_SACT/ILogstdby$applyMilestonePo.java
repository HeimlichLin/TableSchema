package com.doc.common.po; 
 
public interface ILogstdby$applyMilestonePo {
 
	BigDecimal getSessionId();
 
	void setSessionId(final BigDecimal sessionId);
 
	BigDecimal getCommitScn();
 
	void setCommitScn(final BigDecimal commitScn);
 
	java.sql.Timestamp getCommitTime();
 
	void setCommitTime(final java.sql.Timestamp commitTime);
 
	BigDecimal getSynchScn();
 
	void setSynchScn(final BigDecimal synchScn);
 
	BigDecimal getEpoch();
 
	void setEpoch(final BigDecimal epoch);
 
	BigDecimal getProcessedScn();
 
	void setProcessedScn(final BigDecimal processedScn);
 
	java.sql.Timestamp getProcessedTime();
 
	void setProcessedTime(final java.sql.Timestamp processedTime);
 
	BigDecimal getFetchlwmScn();
 
	void setFetchlwmScn(final BigDecimal fetchlwmScn);
 
	BigDecimal getSpare1();
 
	void setSpare1(final BigDecimal spare1);
 
	BigDecimal getSpare2();
 
	void setSpare2(final BigDecimal spare2);
 
	String getSpare3();
 
	void setSpare3(final String spare3);
 
}
