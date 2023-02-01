package com.doc.common.po; 
 
public interface ICloudgciBackupPo {
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	BigDecimal getWeight();
 
	void setWeight(final BigDecimal weight);
 
	java.sql.Timestamp getGcidate();
 
	void setGcidate(final java.sql.Timestamp gcidate);
 
	BigDecimal getGcipiece();
 
	void setGcipiece(final BigDecimal gcipiece);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
}
