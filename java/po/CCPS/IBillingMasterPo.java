package com.doc.common.po; 
 
public interface IBillingMasterPo {
 
	String getWriteOffNo();
 
	void setWriteOffNo(final String writeOffNo);
 
	java.sql.Timestamp getPayDeadline();
 
	void setPayDeadline(final java.sql.Timestamp payDeadline);
 
	String getBillingStatus();
 
	void setBillingStatus(final String billingStatus);
 
	String getBillingNo();
 
	void setBillingNo(final String billingNo);
 
	java.sql.Timestamp getBillingDate();
 
	void setBillingDate(final java.sql.Timestamp billingDate);
 
	BigDecimal getBillingAmount();
 
	void setBillingAmount(final BigDecimal billingAmount);
 
	String getBillingCustNo();
 
	void setBillingCustNo(final String billingCustNo);
 
	String getBillingCustName();
 
	void setBillingCustName(final String billingCustName);
 
	String getBillingCustEmail();
 
	void setBillingCustEmail(final String billingCustEmail);
 
	String getPayerNo();
 
	void setPayerNo(final String payerNo);
 
	String getPayerName();
 
	void setPayerName(final String payerName);
 
	String getPayerEmail();
 
	void setPayerEmail(final String payerEmail);
 
	String getPayeeNo();
 
	void setPayeeNo(final String payeeNo);
 
	String getPayeeName();
 
	void setPayeeName(final String payeeName);
 
	String getPayeeEmail();
 
	void setPayeeEmail(final String payeeEmail);
 
	String getPaymentType();
 
	void setPaymentType(final String paymentType);
 
	String getUpdateUser();
 
	void setUpdateUser(final String updateUser);
 
	java.sql.Timestamp getUpdateDate();
 
	void setUpdateDate(final java.sql.Timestamp updateDate);
 
	BigDecimal getHandlingFee();
 
	void setHandlingFee(final BigDecimal handlingFee);
 
	String getRemark();
 
	void setRemark(final String remark);
 
	String getWriteOffRef();
 
	void setWriteOffRef(final String writeOffRef);
 
}
