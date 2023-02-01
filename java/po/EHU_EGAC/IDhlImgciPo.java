package com.doc.common.po; 
 
public interface IDhlImgciPo {
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
	BigDecimal getNop();
 
	void setNop(final BigDecimal nop);
 
	String getClearancetype();
 
	void setClearancetype(final String clearancetype);
 
	java.sql.Timestamp getGcidate();
 
	void setGcidate(final java.sql.Timestamp gcidate);
 
	java.sql.Timestamp getWdate();
 
	void setWdate(final java.sql.Timestamp wdate);
 
	java.sql.Timestamp getFtpdate();
 
	void setFtpdate(final java.sql.Timestamp ftpdate);
 
	String getFtpfile();
 
	void setFtpfile(final String ftpfile);
 
}
