package com.doc.common.po; 
 
public interface IAccchkPo {
 
	java.sql.Timestamp getLogdate();
 
	void setLogdate(final java.sql.Timestamp logdate);
 
	BigDecimal getExptotal();
 
	void setExptotal(final BigDecimal exptotal);
 
	BigDecimal getOldtotla();
 
	void setOldtotla(final BigDecimal oldtotla);
 
	BigDecimal getAddtotal();
 
	void setAddtotal(final BigDecimal addtotal);
 
	BigDecimal getDifftotal();
 
	void setDifftotal(final BigDecimal difftotal);
 
	BigDecimal getCurtotal();
 
	void setCurtotal(final BigDecimal curtotal);
 
}
