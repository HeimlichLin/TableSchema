package com.doc.common.po; 
 
public interface IErrorlogPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getRefbillno();
 
	void setRefbillno(final String refbillno);
 
	String getStrtype();
 
	void setStrtype(final String strtype);
 
	String getSendflag();
 
	void setSendflag(final String sendflag);
 
	String getControlno();
 
	void setControlno(final String controlno);
 
	java.sql.Timestamp getSendtime();
 
	void setSendtime(final java.sql.Timestamp sendtime);
 
	String getNote();
 
	void setNote(final String note);
 
	java.sql.Timestamp getLogtime();
 
	void setLogtime(final java.sql.Timestamp logtime);
 
}
