package com.doc.common.po; 
 
public interface IGcoediPo {
 
	String getControlno();
 
	void setControlno(final String controlno);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	String getReleasedate();
 
	void setReleasedate(final String releasedate);
 
	String getReleasetime();
 
	void setReleasetime(final String releasetime);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getClearancetype();
 
	void setClearancetype(final String clearancetype);
 
	String getTranstype();
 
	void setTranstype(final String transtype);
 
	String getMessagetype();
 
	void setMessagetype(final String messagetype);
 
	String getDutyno();
 
	void setDutyno(final String dutyno);
 
	String getIe();
 
	void setIe(final String ie);
 
	BigDecimal getGciweight();
 
	void setGciweight(final BigDecimal gciweight);
 
	String getDutypayment();
 
	void setDutypayment(final String dutypayment);
 
}
