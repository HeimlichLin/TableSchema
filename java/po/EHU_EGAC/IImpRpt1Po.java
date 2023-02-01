package com.doc.common.po; 
 
public interface IImpRpt1Po {
 
	String getDeclFlightno();
 
	void setDeclFlightno(final String declFlightno);
 
	java.sql.Timestamp getDeclFlightdate();
 
	void setDeclFlightdate(final java.sql.Timestamp declFlightdate);
 
	String getDeclMwb();
 
	void setDeclMwb(final String declMwb);
 
	String getDeclExpbagno();
 
	void setDeclExpbagno(final String declExpbagno);
 
	BigDecimal getDeclPiece();
 
	void setDeclPiece(final BigDecimal declPiece);
 
	String getImpContainer();
 
	void setImpContainer(final String impContainer);
 
	String getImpFlightno();
 
	void setImpFlightno(final String impFlightno);
 
	String getImpExpbagno();
 
	void setImpExpbagno(final String impExpbagno);
 
	BigDecimal getImpChkpiece();
 
	void setImpChkpiece(final BigDecimal impChkpiece);
 
	BigDecimal getImpGcipiece();
 
	void setImpGcipiece(final BigDecimal impGcipiece);
 
	BigDecimal getImpDiffpiece();
 
	void setImpDiffpiece(final BigDecimal impDiffpiece);
 
	String getImpInputmode();
 
	void setImpInputmode(final String impInputmode);
 
	java.sql.Timestamp getImpChkdate();
 
	void setImpChkdate(final java.sql.Timestamp impChkdate);
 
	java.sql.Timestamp getImpGcidate();
 
	void setImpGcidate(final java.sql.Timestamp impGcidate);
 
	java.sql.Timestamp getImpGcodate();
 
	void setImpGcodate(final java.sql.Timestamp impGcodate);
 
	BigDecimal getImpPiece();
 
	void setImpPiece(final BigDecimal impPiece);
 
	String getRepno();
 
	void setRepno(final String repno);
 
}
