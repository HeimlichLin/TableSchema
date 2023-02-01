package com.doc.common.po; 
 
public interface IPaymentRecordPo {
 
	String getWriteOffNo();
 
	void setWriteOffNo(final String writeOffNo);
 
	String getPayNo();
 
	void setPayNo(final String payNo);
 
	String getPaymentType();
 
	void setPaymentType(final String paymentType);
 
	java.sql.Timestamp getPayDate();
 
	void setPayDate(final java.sql.Timestamp payDate);
 
	BigDecimal getPayAmount();
 
	void setPayAmount(final BigDecimal payAmount);
 
	String getInvoiceTaxNo();
 
	void setInvoiceTaxNo(final String invoiceTaxNo);
 
	String getInvoiceTaxName();
 
	void setInvoiceTaxName(final String invoiceTaxName);
 
	String getCarrierType();
 
	void setCarrierType(final String carrierType);
 
	String getCarrierNo1();
 
	void setCarrierNo1(final String carrierNo1);
 
	String getNpoBan();
 
	void setNpoBan(final String npoBan);
 
	String getUpdateUser();
 
	void setUpdateUser(final String updateUser);
 
	java.sql.Timestamp getUpdateDate();
 
	void setUpdateDate(final java.sql.Timestamp updateDate);
 
	String getCarrierNo2();
 
	void setCarrierNo2(final String carrierNo2);
 
	String getPrintInvoice();
 
	void setPrintInvoice(final String printInvoice);
 
	String getPayStatus();
 
	void setPayStatus(final String payStatus);
 
	BigDecimal getHandlingFee();
 
	void setHandlingFee(final BigDecimal handlingFee);
 
}
