package com.doc.common.po.impl; 
 
public class BillingChargingSettingPo implements IBillingChargingSettingPo {
 
	public enum COLUMNS {
		WRITE_OFF_NO("銷帳編號"), //
		PAYMENT_TYPE("支付類別") //
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
 
}
