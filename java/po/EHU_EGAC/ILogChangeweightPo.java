package com.doc.common.po; 
 
public interface ILogChangeweightPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	BigDecimal getWeight1();
 
	void setWeight1(final BigDecimal weight1);
 
	BigDecimal getWeight2();
 
	void setWeight2(final BigDecimal weight2);
 
	String getReason();
 
	void setReason(final String reason);
 
	String getWs();
 
	void setWs(final String ws);
 
	String getUserid();
 
	void setUserid(final String userid);
 
	java.sql.Timestamp getTime();
 
	void setTime(final java.sql.Timestamp time);
 
	String getIe();
 
	void setIe(final String ie);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
}
