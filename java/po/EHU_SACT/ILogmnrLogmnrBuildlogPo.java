package com.doc.common.po; 
 
public interface ILogmnrLogmnrBuildlogPo {
 
	String getBuildDate();
 
	void setBuildDate(final String buildDate);
 
	BigDecimal getDbTxnScnbas();
 
	void setDbTxnScnbas(final BigDecimal dbTxnScnbas);
 
	BigDecimal getDbTxnScnwrp();
 
	void setDbTxnScnwrp(final BigDecimal dbTxnScnwrp);
 
	BigDecimal getCurrentBuildState();
 
	void setCurrentBuildState(final BigDecimal currentBuildState);
 
	BigDecimal getCompletionStatus();
 
	void setCompletionStatus(final BigDecimal completionStatus);
 
	BigDecimal getMarkedLogFileLowScn();
 
	void setMarkedLogFileLowScn(final BigDecimal markedLogFileLowScn);
 
	String getInitialXid();
 
	void setInitialXid(final String initialXid);
 
	BigDecimal getLogmnrUid();
 
	void setLogmnrUid(final BigDecimal logmnrUid);
 
	BigDecimal getLogmnrFlags();
 
	void setLogmnrFlags(final BigDecimal logmnrFlags);
 
}
