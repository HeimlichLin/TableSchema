package com.doc.common.po; 
 
public interface IImpincomehaPo {
 
	String getAwb();
 
	void setAwb(final String awb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	BigDecimal getPiece();
 
	void setPiece(final BigDecimal piece);
 
	java.sql.Timestamp getIncomedate();
 
	void setIncomedate(final java.sql.Timestamp incomedate);
 
	BigDecimal getIncomepiece();
 
	void setIncomepiece(final BigDecimal incomepiece);
 
	String getUldno();
 
	void setUldno(final String uldno);
 
	String getDele();
 
	void setDele(final String dele);
 
	String getNote();
 
	void setNote(final String note);
 
	java.sql.Timestamp getIncomedate1();
 
	void setIncomedate1(final java.sql.Timestamp incomedate1);
 
}
