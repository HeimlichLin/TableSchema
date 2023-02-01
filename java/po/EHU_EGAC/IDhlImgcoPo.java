package com.doc.common.po; 
 
public interface IDhlImgcoPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
	BigDecimal getNop();
 
	void setNop(final BigDecimal nop);
 
	String getReleasetime();
 
	void setReleasetime(final String releasetime);
 
	java.sql.Timestamp getGcodate();
 
	void setGcodate(final java.sql.Timestamp gcodate);
 
	java.sql.Timestamp getWdate();
 
	void setWdate(final java.sql.Timestamp wdate);
 
	java.sql.Timestamp getFtpdate();
 
	void setFtpdate(final java.sql.Timestamp ftpdate);
 
	String getFtpfile();
 
	void setFtpfile(final String ftpfile);
 
}
