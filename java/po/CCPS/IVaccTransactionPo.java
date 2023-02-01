package com.doc.common.po; 
 
public interface IVaccTransactionPo {
 
	String getPayNo();
 
	void setPayNo(final String payNo);
 
	String getShopCode();
 
	void setShopCode(final String shopCode);
 
	String getVirtualAccBank();
 
	void setVirtualAccBank(final String virtualAccBank);
 
	String getPayerInfo();
 
	void setPayerInfo(final String payerInfo);
 
	String getOrderNo();
 
	void setOrderNo(final String orderNo);
 
	String getVirtualAccount();
 
	void setVirtualAccount(final String virtualAccount);
 
	java.sql.Timestamp getDueDate();
 
	void setDueDate(final java.sql.Timestamp dueDate);
 
	String getPaymentStatus();
 
	void setPaymentStatus(final String paymentStatus);
 
	String getTransactionDate();
 
	void setTransactionDate(final String transactionDate);
 
	String getTransactionSerNo();
 
	void setTransactionSerNo(final String transactionSerNo);
 
}
