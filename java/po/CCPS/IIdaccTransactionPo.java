package com.doc.common.po; 
 
public interface IIdaccTransactionPo {
 
	String getPayNo();
 
	void setPayNo(final String payNo);
 
	String getPayerInfo();
 
	void setPayerInfo(final String payerInfo);
 
	String getShopCode();
 
	void setShopCode(final String shopCode);
 
	String getIdNumber();
 
	void setIdNumber(final String idNumber);
 
	String getPayBank();
 
	void setPayBank(final String payBank);
 
	String getPayAccount();
 
	void setPayAccount(final String payAccount);
 
	String getVirtualAccBank();
 
	void setVirtualAccBank(final String virtualAccBank);
 
	BigDecimal getVirtualAccType();
 
	void setVirtualAccType(final BigDecimal virtualAccType);
 
	String getVirtualAccShop();
 
	void setVirtualAccShop(final String virtualAccShop);
 
	String getOrderNo();
 
	void setOrderNo(final String orderNo);
 
	String getReplyCode();
 
	void setReplyCode(final String replyCode);
 
	String getReplyCodeDesc();
 
	void setReplyCodeDesc(final String replyCodeDesc);
 
	String getTransSeqNo();
 
	void setTransSeqNo(final String transSeqNo);
 
	String getTransactionDateTime();
 
	void setTransactionDateTime(final String transactionDateTime);
 
	BigDecimal getPayerFee();
 
	void setPayerFee(final BigDecimal payerFee);
 
	String getVirtualAccount();
 
	void setVirtualAccount(final String virtualAccount);
 
	java.sql.Timestamp getDueDate();
 
	void setDueDate(final java.sql.Timestamp dueDate);
 
	String getPaymentStatus();
 
	void setPaymentStatus(final String paymentStatus);
 
}
