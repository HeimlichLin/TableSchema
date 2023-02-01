package com.doc.common.po.impl; 
 
public class PayeeAccountInfoPo implements IPayeeAccountInfoPo {
 
	public enum COLUMNS {
		PAYEE_NO("收款方編號"), //
		PAYEE_NAME("收款方名稱"), //
		PAYEE_EMAIL("收款方電子郵件"), //
		PAYEE_BANK_("收款方銀行代碼"), //
		PAYEE_BRANCH("收款方分行代碼"), //
		PAYEE_ACCOUNT("收款方帳號"), //
		UPDATE_USER("更新使用者"), //
		UPDATE_DATE("更新日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String payeeNo;
	private String payeeName;
	private String payeeEmail;
	private String payeeBank;
	private String payeeBranch;
	private String payeeAccount;
	private String updateUser;
	private java.sql.Timestamp updateDate;

	@Override
	public String getPayeeNo() {
		return this.payeeNo;
	}
 
	@Override
	public void setPayeeNo(final String payeeNo) {
		this.payeeNo = payeeNo; 
	}
 
	@Override
	public String getPayeeName() {
		return this.payeeName;
	}
 
	@Override
	public void setPayeeName(final String payeeName) {
		this.payeeName = payeeName; 
	}
 
	@Override
	public String getPayeeEmail() {
		return this.payeeEmail;
	}
 
	@Override
	public void setPayeeEmail(final String payeeEmail) {
		this.payeeEmail = payeeEmail; 
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
	public String getUpdateUser() {
		return this.updateUser;
	}
 
	@Override
	public void setUpdateUser(final String updateUser) {
		this.updateUser = updateUser; 
	}
 
	@Override
	public java.sql.Timestamp getUpdateDate() {
		return this.updateDate;
	}
 
	@Override
	public void setUpdateDate(final java.sql.Timestamp updateDate) {
		this.updateDate = updateDate; 
	}
 
}
