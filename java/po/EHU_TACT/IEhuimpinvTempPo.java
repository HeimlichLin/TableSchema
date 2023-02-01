package com.doc.common.po; 
 
public interface IEhuimpinvTempPo {
 
	String getAbnNo();
 
	void setAbnNo(final String abnNo);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	String getHoldarea();
 
	void setHoldarea(final String holdarea);
 
	String getUldNo();
 
	void setUldNo(final String uldNo);
 
	String getPicFrom();
 
	void setPicFrom(final String picFrom);
 
	String getPicTo();
 
	void setPicTo(final String picTo);
 
	String getScanBy();
 
	void setScanBy(final String scanBy);
 
	java.sql.Timestamp getScanTime();
 
	void setScanTime(final java.sql.Timestamp scanTime);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	String getNote();
 
	void setNote(final String note);
 
}
