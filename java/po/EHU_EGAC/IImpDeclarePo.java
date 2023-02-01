package com.doc.common.po; 
 
public interface IImpDeclarePo {
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	BigDecimal getDeclareNo();
 
	void setDeclareNo(final BigDecimal declareNo);
 
	String getExpbagno();
 
	void setExpbagno(final String expbagno);
 
	BigDecimal getDeclarePiece();
 
	void setDeclarePiece(final BigDecimal declarePiece);
 
	java.sql.Timestamp getCrtDate();
 
	void setCrtDate(final java.sql.Timestamp crtDate);
 
	String getCrtUser();
 
	void setCrtUser(final String crtUser);
 
	java.sql.Timestamp getModDate();
 
	void setModDate(final java.sql.Timestamp modDate);
 
	String getModUser();
 
	void setModUser(final String modUser);
 
	java.sql.Timestamp getDelDate();
 
	void setDelDate(final java.sql.Timestamp delDate);
 
	String getDelUser();
 
	void setDelUser(final String delUser);
 
	String getBagno();
 
	void setBagno(final String bagno);
 
	String getFlightdate();
 
	void setFlightdate(final String flightdate);
 
}
