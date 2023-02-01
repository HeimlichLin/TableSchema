package com.doc.common.po.impl; 
 
public class VaccTransactionPo implements IVaccTransactionPo {
 
	public enum COLUMNS {
		PAY_NO("繳費編號"), //
		SHOP_CODE("特店代號"), //
		VIRTUAL_ACC_BANK("虛擬帳戶銀行代碼"), //
		PAYER_INFO("付款人資訊"), //
		ORDER_NO("訂單編號"), //
		VIRTUAL_ACCOUNT("虛擬帳戶"), //
		DUE_DATE("到期日期"), //
		PAYMENT_STATUS("付款狀態"), //
		TRANSACTION_DATE("交易日期"), //
		TRANSACTION_SER_NO("交易流水號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String payNo;
	private String shopCode;
	private String virtualAccBank;
	private String payerInfo;
	private String orderNo;
	private String virtualAccount;
	private java.sql.Timestamp dueDate;
	private String paymentStatus;
	private String transactionDate;
	private String transactionSerNo;

	@Override
	public String getPayNo() {
		return this.payNo;
	}
 
	@Override
	public void setPayNo(final String payNo) {
		this.payNo = payNo; 
	}
 
	@Override
	public String getShopCode() {
		return this.shopCode;
	}
 
	@Override
	public void setShopCode(final String shopCode) {
		this.shopCode = shopCode; 
	}
 
	@Override
	public String getVirtualAccBank() {
		return this.virtualAccBank;
	}
 
	@Override
	public void setVirtualAccBank(final String virtualAccBank) {
		this.virtualAccBank = virtualAccBank; 
	}
 
	@Override
	public String getPayerInfo() {
		return this.payerInfo;
	}
 
	@Override
	public void setPayerInfo(final String payerInfo) {
		this.payerInfo = payerInfo; 
	}
 
	@Override
	public String getOrderNo() {
		return this.orderNo;
	}
 
	@Override
	public void setOrderNo(final String orderNo) {
		this.orderNo = orderNo; 
	}
 
	@Override
	public String getVirtualAccount() {
		return this.virtualAccount;
	}
 
	@Override
	public void setVirtualAccount(final String virtualAccount) {
		this.virtualAccount = virtualAccount; 
	}
 
	@Override
	public java.sql.Timestamp getDueDate() {
		return this.dueDate;
	}
 
	@Override
	public void setDueDate(final java.sql.Timestamp dueDate) {
		this.dueDate = dueDate; 
	}
 
	@Override
	public String getPaymentStatus() {
		return this.paymentStatus;
	}
 
	@Override
	public void setPaymentStatus(final String paymentStatus) {
		this.paymentStatus = paymentStatus; 
	}
 
	@Override
	public String getTransactionDate() {
		return this.transactionDate;
	}
 
	@Override
	public void setTransactionDate(final String transactionDate) {
		this.transactionDate = transactionDate; 
	}
 
	@Override
	public String getTransactionSerNo() {
		return this.transactionSerNo;
	}
 
	@Override
	public void setTransactionSerNo(final String transactionSerNo) {
		this.transactionSerNo = transactionSerNo; 
	}
 
}
