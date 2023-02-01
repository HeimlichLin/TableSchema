package com.doc.common.po.impl; 
 
public class IdaccTransactionPo implements IIdaccTransactionPo {
 
	public enum COLUMNS {
		PAY_NO("繳費編號"), //
		PAYER_INFO("付款人資訊"), //
		SHOP_CODE("特店代號"), //
		ID_NUMBER("身分證字號"), //
		PAY_BANK("支出銀行代碼"), //
		PAY_ACCOUNT("支出帳號"), //
		VIRTUAL_ACC_BANK("虛擬帳戶銀行代碼"), //
		VIRTUAL_ACC_TYPE("虛擬帳戶類型"), //
		VIRTUAL_ACC_SHOP("虛擬帳戶特店代碼"), //
		ORDER_NO("訂單編號"), //
		REPLY_CODE("回覆碼"), //
		REPLY_CODE_DESC("回覆碼說明"), //
		TRANS_SEQ_NO("傳送序號"), //
		TRANSACTION_DATE_TIME("交易日期時間"), //
		PAYER_FEE("付款人手續費"), //
		VIRTUAL_ACCOUNT("虛擬帳戶"), //
		DUE_DATE("到期日期"), //
		PAYMENT_STATUS("付款狀態") //
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
	private String payerInfo;
	private String shopCode;
	private String idNumber;
	private String payBank;
	private String payAccount;
	private String virtualAccBank;
	private BigDecimal virtualAccType;
	private String virtualAccShop;
	private String orderNo;
	private String replyCode;
	private String replyCodeDesc;
	private String transSeqNo;
	private String transactionDateTime;
	private BigDecimal payerFee;
	private String virtualAccount;
	private java.sql.Timestamp dueDate;
	private String paymentStatus;

	@Override
	public String getPayNo() {
		return this.payNo;
	}
 
	@Override
	public void setPayNo(final String payNo) {
		this.payNo = payNo; 
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
	public String getShopCode() {
		return this.shopCode;
	}
 
	@Override
	public void setShopCode(final String shopCode) {
		this.shopCode = shopCode; 
	}
 
	@Override
	public String getIdNumber() {
		return this.idNumber;
	}
 
	@Override
	public void setIdNumber(final String idNumber) {
		this.idNumber = idNumber; 
	}
 
	@Override
	public String getPayBank() {
		return this.payBank;
	}
 
	@Override
	public void setPayBank(final String payBank) {
		this.payBank = payBank; 
	}
 
	@Override
	public String getPayAccount() {
		return this.payAccount;
	}
 
	@Override
	public void setPayAccount(final String payAccount) {
		this.payAccount = payAccount; 
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
	public BigDecimal getVirtualAccType() {
		return this.virtualAccType;
	}
 
	@Override
	public void setVirtualAccType(final BigDecimal virtualAccType) {
		this.virtualAccType = virtualAccType; 
	}
 
	@Override
	public String getVirtualAccShop() {
		return this.virtualAccShop;
	}
 
	@Override
	public void setVirtualAccShop(final String virtualAccShop) {
		this.virtualAccShop = virtualAccShop; 
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
	public String getReplyCode() {
		return this.replyCode;
	}
 
	@Override
	public void setReplyCode(final String replyCode) {
		this.replyCode = replyCode; 
	}
 
	@Override
	public String getReplyCodeDesc() {
		return this.replyCodeDesc;
	}
 
	@Override
	public void setReplyCodeDesc(final String replyCodeDesc) {
		this.replyCodeDesc = replyCodeDesc; 
	}
 
	@Override
	public String getTransSeqNo() {
		return this.transSeqNo;
	}
 
	@Override
	public void setTransSeqNo(final String transSeqNo) {
		this.transSeqNo = transSeqNo; 
	}
 
	@Override
	public String getTransactionDateTime() {
		return this.transactionDateTime;
	}
 
	@Override
	public void setTransactionDateTime(final String transactionDateTime) {
		this.transactionDateTime = transactionDateTime; 
	}
 
	@Override
	public BigDecimal getPayerFee() {
		return this.payerFee;
	}
 
	@Override
	public void setPayerFee(final BigDecimal payerFee) {
		this.payerFee = payerFee; 
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
 
}
