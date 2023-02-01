package com.doc.common.po; 
 
public interface ITranslogPo {
 
	String getSTable();
 
	void setSTable(final String sTable);
 
	String getTransId();
 
	void setTransId(final String transId);
 
	String getRmk();
 
	void setRmk(final String rmk);
 
	java.sql.Timestamp getProcDatm();
 
	void setProcDatm(final java.sql.Timestamp procDatm);
 
	BigDecimal getDaoNum();
 
	void setDaoNum(final BigDecimal daoNum);
 
}
