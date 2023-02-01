package com.doc.common.po; 
 
public interface IDeclmlogPo {
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	String getDeclType();
 
	void setDeclType(final String declType);
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getUserId();
 
	void setUserId(final String userId);
 
	String getLogDatm();
 
	void setLogDatm(final String logDatm);
 
	String getLogTable();
 
	void setLogTable(final String logTable);
 
	String getLogAction();
 
	void setLogAction(final String logAction);
 
	String getLogColumn();
 
	void setLogColumn(final String logColumn);
 
	String getLogNew();
 
	void setLogNew(final String logNew);
 
	String getLogOld();
 
	void setLogOld(final String logOld);
 
	String getLogPgm();
 
	void setLogPgm(final String logPgm);
 
	BigDecimal getDeclSeqNo();
 
	void setDeclSeqNo(final BigDecimal declSeqNo);
 
}
