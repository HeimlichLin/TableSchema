package com.doc.common.po; 
 
public interface ILogmnrcGsbaPo {
 
	BigDecimal getLogmnrUid();
 
	void setLogmnrUid(final BigDecimal logmnrUid);
 
	BigDecimal getAsOfScn();
 
	void setAsOfScn(final BigDecimal asOfScn);
 
	BigDecimal getFdoLength();
 
	void setFdoLength(final BigDecimal fdoLength);
 
	String getFdoValue();
 
	void setFdoValue(final String fdoValue);
 
	BigDecimal getCharsetid();
 
	void setCharsetid(final BigDecimal charsetid);
 
	BigDecimal getNcharsetid();
 
	void setNcharsetid(final BigDecimal ncharsetid);
 
	BigDecimal getDbtimezoneLen();
 
	void setDbtimezoneLen(final BigDecimal dbtimezoneLen);
 
	String getDbtimezoneValue();
 
	void setDbtimezoneValue(final String dbtimezoneValue);
 
	BigDecimal getLogmnrSpare1();
 
	void setLogmnrSpare1(final BigDecimal logmnrSpare1);
 
	BigDecimal getLogmnrSpare2();
 
	void setLogmnrSpare2(final BigDecimal logmnrSpare2);
 
	String getLogmnrSpare3();
 
	void setLogmnrSpare3(final String logmnrSpare3);
 
	java.sql.Timestamp getLogmnrSpare4();
 
	void setLogmnrSpare4(final java.sql.Timestamp logmnrSpare4);
 
}
