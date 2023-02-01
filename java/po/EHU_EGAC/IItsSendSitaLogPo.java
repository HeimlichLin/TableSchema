package com.doc.common.po; 
 
public interface IItsSendSitaLogPo {
 
	java.sql.Timestamp getDateTime();
 
	void setDateTime(final java.sql.Timestamp dateTime);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getDes();
 
	void setDes(final String des);
 
	BigDecimal getSeq();
 
	void setSeq(final BigDecimal seq);
 
	java.sql.Timestamp getDatMsgLog();
 
	void setDatMsgLog(final java.sql.Timestamp datMsgLog);
 
	String getCodSeqNum();
 
	void setCodSeqNum(final String codSeqNum);
 
	String getMintNum();
 
	void setMintNum(final String mintNum);
 
	String getSitaNum();
 
	void setSitaNum(final String sitaNum);
 
	String getDesErr();
 
	void setDesErr(final String desErr);
 
	String getReturnDate();
 
	void setReturnDate(final String returnDate);
 
}
