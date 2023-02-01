package com.doc.common.po; 
 
public interface IWorkimpchargeTPo {
 
	String getBagno();
 
	void setBagno(final String bagno);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	BigDecimal getPrevpiece();
 
	void setPrevpiece(final BigDecimal prevpiece);
 
	BigDecimal getPrevfee();
 
	void setPrevfee(final BigDecimal prevfee);
 
	BigDecimal getPrevweight();
 
	void setPrevweight(final BigDecimal prevweight);
 
	BigDecimal getDiffpiece();
 
	void setDiffpiece(final BigDecimal diffpiece);
 
	BigDecimal getDifffee();
 
	void setDifffee(final BigDecimal difffee);
 
	BigDecimal getDiffweight();
 
	void setDiffweight(final BigDecimal diffweight);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getWarehouse();
 
	void setWarehouse(final String warehouse);
 
	java.sql.Timestamp getChargedate();
 
	void setChargedate(final java.sql.Timestamp chargedate);
 
	BigDecimal getExtrafee();
 
	void setExtrafee(final BigDecimal extrafee);
 
	String getExtrafeemark();
 
	void setExtrafeemark(final String extrafeemark);
 
	java.sql.Timestamp getCreatedate();
 
	void setCreatedate(final java.sql.Timestamp createdate);
 
	java.sql.Timestamp getLastchargedate();
 
	void setLastchargedate(final java.sql.Timestamp lastchargedate);
 
	String getIe();
 
	void setIe(final String ie);
 
}
