package com.doc.common.po; 
 
public interface IRptImportexportclasssummaryPo {
 
	BigDecimal getUniqueid();
 
	void setUniqueid(final BigDecimal uniqueid);
 
	BigDecimal getTranid();
 
	void setTranid(final BigDecimal tranid);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getExpresscname();
 
	void setExpresscname(final String expresscname);
 
	BigDecimal getC1piece();
 
	void setC1piece(final BigDecimal c1piece);
 
	BigDecimal getC2piece();
 
	void setC2piece(final BigDecimal c2piece);
 
	BigDecimal getC3piece();
 
	void setC3piece(final BigDecimal c3piece);
 
	BigDecimal getTotalpiece();
 
	void setTotalpiece(final BigDecimal totalpiece);
 
	BigDecimal getC1weight();
 
	void setC1weight(final BigDecimal c1weight);
 
	BigDecimal getC2weight();
 
	void setC2weight(final BigDecimal c2weight);
 
	BigDecimal getC3weight();
 
	void setC3weight(final BigDecimal c3weight);
 
	BigDecimal getTotalweight();
 
	void setTotalweight(final BigDecimal totalweight);
 
	BigDecimal getC1fee();
 
	void setC1fee(final BigDecimal c1fee);
 
	BigDecimal getC2fee();
 
	void setC2fee(final BigDecimal c2fee);
 
	BigDecimal getC3fee();
 
	void setC3fee(final BigDecimal c3fee);
 
	BigDecimal getTotalfee();
 
	void setTotalfee(final BigDecimal totalfee);
 
	java.sql.Timestamp getCreatedate();
 
	void setCreatedate(final java.sql.Timestamp createdate);
 
}
