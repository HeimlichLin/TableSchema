package com.doc.common.po.impl; 
 
public class BillingMasterPo implements IBillingMasterPo {
 
	public enum COLUMNS {
		WRITE_OFF_NO("銷帳編號"), //
		PAY_DEADLINE("繳費期限"), //
		BILLING_STATUS("帳單狀態"), //
		BILLING_NO("帳單號碼"), //
		BILLING_DATE("帳單日期"), //
		BILLING_AMOUNT("帳單金額"), //
		BILLING_CUST_NO("帳單客戶編號"), //
		BILLING_CUST_NAME("帳單客戶名稱"), //
		BILLING_CUST_EMAIL("帳單客戶電子郵件"), //
		PAYER_NO("付款方編號"), //
		PAYER_NAME("付款方名稱"), //
		PAYER_EMAIL("付款方電子郵件"), //
		PAYEE_NO("收款方編號"), //
		PAYEE_NAME("收款方名稱"), //
		PAYEE_EMAIL("收款方電子郵件"), //
		PAYMENT_TYPE("支付類別"), //
		UPDATE_USER("更新使用者"), //
		UPDATE_DATE("更新日期"), //
		HANDLING_FEE("手續費"), //
		REMARK("備註"), //
		WRITE_OFF_REF("銷帳編號參考") //
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
	private java.sql.Timestamp payDeadline;
	private String billingStatus;
	private String billingNo;
	private java.sql.Timestamp billingDate;
	private BigDecimal billingAmount;
	private String billingCustNo;
	private String billingCustName;
	private String billingCustEmail;
	private String payerNo;
	private String payerName;
	private String payerEmail;
	private String payeeNo;
	private String payeeName;
	private String payeeEmail;
	private String paymentType;
	private String updateUser;
	private java.sql.Timestamp updateDate;
	private BigDecimal handlingFee;
	private String remark;
	private String writeOffRef;

	@Override
	public String getWriteOffNo() {
		return this.writeOffNo;
	}
 
	@Override
	public void setWriteOffNo(final String writeOffNo) {
		this.writeOffNo = writeOffNo; 
	}
 
	@Override
	public java.sql.Timestamp getPayDeadline() {
		return this.payDeadline;
	}
 
	@Override
	public void setPayDeadline(final java.sql.Timestamp payDeadline) {
		this.payDeadline = payDeadline; 
	}
 
	@Override
	public String getBillingStatus() {
		return this.billingStatus;
	}
 
	@Override
	public void setBillingStatus(final String billingStatus) {
		this.billingStatus = billingStatus; 
	}
 
	@Override
	public String getBillingNo() {
		return this.billingNo;
	}
 
	@Override
	public void setBillingNo(final String billingNo) {
		this.billingNo = billingNo; 
	}
 
	@Override
	public java.sql.Timestamp getBillingDate() {
		return this.billingDate;
	}
 
	@Override
	public void setBillingDate(final java.sql.Timestamp billingDate) {
		this.billingDate = billingDate; 
	}
 
	@Override
	public BigDecimal getBillingAmount() {
		return this.billingAmount;
	}
 
	@Override
	public void setBillingAmount(final BigDecimal billingAmount) {
		this.billingAmount = billingAmount; 
	}
 
	@Override
	public String getBillingCustNo() {
		return this.billingCustNo;
	}
 
	@Override
	public void setBillingCustNo(final String billingCustNo) {
		this.billingCustNo = billingCustNo; 
	}
 
	@Override
	public String getBillingCustName() {
		return this.billingCustName;
	}
 
	@Override
	public void setBillingCustName(final String billingCustName) {
		this.billingCustName = billingCustName; 
	}
 
	@Override
	public String getBillingCustEmail() {
		return this.billingCustEmail;
	}
 
	@Override
	public void setBillingCustEmail(final String billingCustEmail) {
		this.billingCustEmail = billingCustEmail; 
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
	public String getPayerName() {
		return this.payerName;
	}
 
	@Override
	public void setPayerName(final String payerName) {
		this.payerName = payerName; 
	}
 
	@Override
	public String getPayerEmail() {
		return this.payerEmail;
	}
 
	@Override
	public void setPayerEmail(final String payerEmail) {
		this.payerEmail = payerEmail; 
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
	public String getPaymentType() {
		return this.paymentType;
	}
 
	@Override
	public void setPaymentType(final String paymentType) {
		this.paymentType = paymentType; 
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
 
	@Override
	public BigDecimal getHandlingFee() {
		return this.handlingFee;
	}
 
	@Override
	public void setHandlingFee(final BigDecimal handlingFee) {
		this.handlingFee = handlingFee; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
	@Override
	public String getWriteOffRef() {
		return this.writeOffRef;
	}
 
	@Override
	public void setWriteOffRef(final String writeOffRef) {
		this.writeOffRef = writeOffRef; 
	}
 
}
