package com.doc.common.po.impl; 
 
public class ShopChargingSettingPo implements IShopChargingSettingPo {
 
	public enum COLUMNS {
		WRITE_OFF_NO("銷帳編號"), //
		PAYMENT_TYPE("支付類別"), //
		SHOP_CODE("特店代號"), //
		PAYEE_NO("收款方編號"), //
		PAYEE_BANK_("收款方銀行代碼"), //
		PAYEE_BRANCH("收款方分行代碼"), //
		PAYEE_ACCOUNT("收款方帳號") //
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
	private String paymentType;
	private String shopCode;
	private String payeeNo;
	private String payeeBank;
	private String payeeBranch;
	private String payeeAccount;

	@Override
	public String getWriteOffNo() {
		return this.writeOffNo;
	}
 
	@Override
	public void setWriteOffNo(final String writeOffNo) {
		this.writeOffNo = writeOffNo; 
	}
 
	@Override
	public String getPaymentType() {
		return this.paymentType;
	}
 
	@Override
	public void setPaymentType(final String paymentType) {
		this.paymentType = paymentType; 
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
 
}
