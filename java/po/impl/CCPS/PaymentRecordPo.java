package com.doc.common.po.impl; 
 
public class PaymentRecordPo implements IPaymentRecordPo {
 
	public enum COLUMNS {
		WRITE_OFF_NO("銷帳編號"), //
		PAY_NO("繳費編號"), //
		PAYMENT_TYPE("支付類別"), //
		PAY_DATE("繳費日期"), //
		PAY_AMOUNT("繳費金額"), //
		INVOICE_TAX_NO("發票統編"), //
		INVOICE_TAX_NAME("發票抬頭"), //
		CARRIER_TYPE("載具類別"), //
		CARRIER_NO1("載具號碼顯碼"), //
		NPO_BAN("捐贈對象"), //
		UPDATE_USER("更新使用者"), //
		UPDATE_DATE("更新日期"), //
		CARRIER_NO2("載具號碼隱碼"), //
		PRINT_INVOICE("列印發票"), //
		PAY_STATUS("繳費狀態"), //
		HANDLING_FEE("手續費") //
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
	private String payNo;
	private String paymentType;
	private java.sql.Timestamp payDate;
	private BigDecimal payAmount;
	private String invoiceTaxNo;
	private String invoiceTaxName;
	private String carrierType;
	private String carrierNo1;
	private String npoBan;
	private String updateUser;
	private java.sql.Timestamp updateDate;
	private String carrierNo2;
	private String printInvoice;
	private String payStatus;
	private BigDecimal handlingFee;

	@Override
	public String getWriteOffNo() {
		return this.writeOffNo;
	}
 
	@Override
	public void setWriteOffNo(final String writeOffNo) {
		this.writeOffNo = writeOffNo; 
	}
 
	@Override
	public String getPayNo() {
		return this.payNo;
	}
 
	@Override
	public void setPayNo(final String payNo) {
		this.payNo = payNo; 
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
	public java.sql.Timestamp getPayDate() {
		return this.payDate;
	}
 
	@Override
	public void setPayDate(final java.sql.Timestamp payDate) {
		this.payDate = payDate; 
	}
 
	@Override
	public BigDecimal getPayAmount() {
		return this.payAmount;
	}
 
	@Override
	public void setPayAmount(final BigDecimal payAmount) {
		this.payAmount = payAmount; 
	}
 
	@Override
	public String getInvoiceTaxNo() {
		return this.invoiceTaxNo;
	}
 
	@Override
	public void setInvoiceTaxNo(final String invoiceTaxNo) {
		this.invoiceTaxNo = invoiceTaxNo; 
	}
 
	@Override
	public String getInvoiceTaxName() {
		return this.invoiceTaxName;
	}
 
	@Override
	public void setInvoiceTaxName(final String invoiceTaxName) {
		this.invoiceTaxName = invoiceTaxName; 
	}
 
	@Override
	public String getCarrierType() {
		return this.carrierType;
	}
 
	@Override
	public void setCarrierType(final String carrierType) {
		this.carrierType = carrierType; 
	}
 
	@Override
	public String getCarrierNo1() {
		return this.carrierNo1;
	}
 
	@Override
	public void setCarrierNo1(final String carrierNo1) {
		this.carrierNo1 = carrierNo1; 
	}
 
	@Override
	public String getNpoBan() {
		return this.npoBan;
	}
 
	@Override
	public void setNpoBan(final String npoBan) {
		this.npoBan = npoBan; 
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
	public String getCarrierNo2() {
		return this.carrierNo2;
	}
 
	@Override
	public void setCarrierNo2(final String carrierNo2) {
		this.carrierNo2 = carrierNo2; 
	}
 
	@Override
	public String getPrintInvoice() {
		return this.printInvoice;
	}
 
	@Override
	public void setPrintInvoice(final String printInvoice) {
		this.printInvoice = printInvoice; 
	}
 
	@Override
	public String getPayStatus() {
		return this.payStatus;
	}
 
	@Override
	public void setPayStatus(final String payStatus) {
		this.payStatus = payStatus; 
	}
 
	@Override
	public BigDecimal getHandlingFee() {
		return this.handlingFee;
	}
 
	@Override
	public void setHandlingFee(final BigDecimal handlingFee) {
		this.handlingFee = handlingFee; 
	}
 
}
