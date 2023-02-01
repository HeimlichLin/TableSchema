package com.doc.common.po; 
 
public interface IImpgcichkPo {
 
	BigDecimal getUniqueid();
 
	void setUniqueid(final BigDecimal uniqueid);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	String getContainer();
 
	void setContainer(final String container);
 
	String getUldrmk();
 
	void setUldrmk(final String uldrmk);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	java.sql.Timestamp getFlightdate();
 
	void setFlightdate(final java.sql.Timestamp flightdate);
 
	String getInputmode();
 
	void setInputmode(final String inputmode);
 
	BigDecimal getChkpiece();
 
	void setChkpiece(final BigDecimal chkpiece);
 
	String getChkuser();
 
	void setChkuser(final String chkuser);
 
	java.sql.Timestamp getCheckdate();
 
	void setCheckdate(final java.sql.Timestamp checkdate);
 
	String getBagno();
 
	void setBagno(final String bagno);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	String getLastupuser();
 
	void setLastupuser(final String lastupuser);
 
}
