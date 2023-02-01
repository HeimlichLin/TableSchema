package com.doc.common.po; 
 
public interface IWorkimpitemsPo {
 
	String getBagno();
 
	void setBagno(final String bagno);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	BigDecimal getItemno();
 
	void setItemno(final BigDecimal itemno);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	String getGciws();
 
	void setGciws(final String gciws);
 
	String getGciuser();
 
	void setGciuser(final String gciuser);
 
	java.sql.Timestamp getGcidate();
 
	void setGcidate(final java.sql.Timestamp gcidate);
 
	BigDecimal getGciweight();
 
	void setGciweight(final BigDecimal gciweight);
 
	String getGcows();
 
	void setGcows(final String gcows);
 
	String getGcouser();
 
	void setGcouser(final String gcouser);
 
	java.sql.Timestamp getGcodate();
 
	void setGcodate(final java.sql.Timestamp gcodate);
 
	BigDecimal getGcosn();
 
	void setGcosn(final BigDecimal gcosn);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getContainer();
 
	void setContainer(final String container);
 
	String getCustomsid();
 
	void setCustomsid(final String customsid);
 
	String getOcustomsid();
 
	void setOcustomsid(final String ocustomsid);
 
	String getPkgbagno();
 
	void setPkgbagno(final String pkgbagno);
 
}
