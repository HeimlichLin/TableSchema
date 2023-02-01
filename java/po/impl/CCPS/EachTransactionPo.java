package com.doc.common.po.impl; 
 
public class EachTransactionPo implements IEachTransactionPo {
 
	public enum COLUMNS {
		PAY_NO("繳費編號"), //
		TRANSACTION_TYPE("交易類別"), //
		PAYEE_NO("收款方編號"), //
		PAYEE_BANK("收款方銀行代碼"), //
		PAYEE_BRANCH("收款方分行代碼"), //
		PAYEE_ACCOUNT("收款方帳號"), //
		SD_AUTH_NO("代收授權書號碼"), //
		SC_TRANS_CODE("代付交易代號"), //
		PAYER_NO("付款方編號"), //
		PAYER_BANK("付款方銀行代碼"), //
		PAYER_BRANCH("付款方分行代碼"), //
		PAYER_ACCOUNT("付款方帳號"), //
		ORDER_NO("訂單編號"), //
		PAYMENT_STATUS("付款狀態"), //
		TRANSACTION_CODE("交易代碼"), //
		TRANSACTION_CODE_DESC("交易代碼描述"), //
		TRANSACTION_RESULT("交易結果") //
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
	private String transactionType;
	private String payeeNo;
	private String payeeBank;
	private String payeeBranch;
	private String payeeAccount;
	private String sdAuthNo;
	private String scTransCode;
	private String payerNo;
	private String payerBank;
	private String payerBranch;
	private String payerAccount;
	private String orderNo;
	private String paymentStatus;
	private String transactionCode;
	private String transactionCodeDesc;
	private String transactionResult;

	@Override
	public String getPayNo() {
		return this.payNo;
	}
 
	@Override
	public void setPayNo(final String payNo) {
		this.payNo = payNo; 
	}
 
	@Override
	public String getTransactionType() {
		return this.transactionType;
	}
 
	@Override
	public void setTransactionType(final String transactionType) {
		this.transactionType = transactionType; 
	}
 
	@Override
	public String getPayeeNo() {
		return this.payeeNo;
	}
 
	@Override
	public void setPayeeNo(final String payeeNo) {
		this.payeeNo = payeeNo; 
	}
 
	@Override
	public String getPayeeBank() {
		return this.payeeBank;
	}
 
	@Override
	public void setPayeeBank(final String payeeBank) {
		this.payeeBank = payeeBank; 
	}
 
	@Override
	public String getPayeeBranch() {
		return this.payeeBranch;
	}
 
	@Override
	public void setPayeeBranch(final String payeeBranch) {
		this.payeeBranch = payeeBranch; 
	}
 
	@Override
	public String getPayeeAccount() {
		return this.payeeAccount;
	}
 
	@Override
	public void setPayeeAccount(final String payeeAccount) {
		this.payeeAccount = payeeAccount; 
	}
 
	@Override
	public String getSdAuthNo() {
		return this.sdAuthNo;
	}
 
	@Override
	public void setSdAuthNo(final String sdAuthNo) {
		this.sdAuthNo = sdAuthNo; 
	}
 
	@Override
	public String getScTransCode() {
		return this.scTransCode;
	}
 
	@Override
	public void setScTransCode(final String scTransCode) {
		this.scTransCode = scTransCode; 
	}
 
	@Override
	public String getPayerNo() {
		return this.payerNo;
	}
 
	@Override
	public void setPayerNo(final String payerNo) {
		this.payerNo = payerNo; 
	}
 
	@Override
	public String getPayerBank() {
		return this.payerBank;
	}
 
	@Override
	public void setPayerBank(final String payerBank) {
		this.payerBank = payerBank; 
	}
 
	@Override
	public String getPayerBranch() {
		return this.payerBranch;
	}
 
	@Override
	public void setPayerBranch(final String payerBranch) {
		this.payerBranch = payerBranch; 
	}
 
	@Override
	public String getPayerAccount() {
		return this.payerAccount;
	}
 
	@Override
	public void setPayerAccount(final String payerAccount) {
		this.payerAccount = payerAccount; 
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
	public String getPaymentStatus() {
		return this.paymentStatus;
	}
 
	@Override
	public void setPaymentStatus(final String paymentStatus) {
		this.paymentStatus = paymentStatus; 
	}
 
	@Override
	public String getTransactionCode() {
		return this.transactionCode;
	}
 
	@Override
	public void setTransactionCode(final String transactionCode) {
		this.transactionCode = transactionCode; 
	}
 
	@Override
	public String getTransactionCodeDesc() {
		return this.transactionCodeDesc;
	}
 
	@Override
	public void setTransactionCodeDesc(final String transactionCodeDesc) {
		this.transactionCodeDesc = transactionCodeDesc; 
	}
 
	@Override
	public String getTransactionResult() {
		return this.transactionResult;
	}
 
	@Override
	public void setTransactionResult(final String transactionResult) {
		this.transactionResult = transactionResult; 
	}
 
}
