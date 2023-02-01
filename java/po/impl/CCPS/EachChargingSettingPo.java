package com.doc.common.po.impl; 
 
public class EachChargingSettingPo implements IEachChargingSettingPo {
 
	public enum COLUMNS {
		WRITE_OFF_NO("銷帳編號"), //
		PAYEE_NO("收款方編號"), //
		PAYEE_BANK("收款方銀行代碼"), //
		PAYEE_BRANCH("收款方分行代碼"), //
		PAYEE_ACCOUNT("收款方帳號"), //
		TRANSACTION_ID("交易代號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String writeOffNo;
	private String payeeNo;
	private String payeeBank;
	private String payeeBranch;
	private String payeeAccount;
	private String transactionId;

	@Override
	public String getWriteOffNo() {
		return this.writeOffNo;
	}
 
	@Override
	public void setWriteOffNo(final String writeOffNo) {
		this.writeOffNo = writeOffNo; 
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
	public String getTransactionId() {
		return this.transactionId;
	}
 
	@Override
	public void setTransactionId(final String transactionId) {
		this.transactionId = transactionId; 
	}
 
}
