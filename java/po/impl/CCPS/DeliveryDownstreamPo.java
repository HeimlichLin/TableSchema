package com.doc.common.po.impl; 
 
public class DeliveryDownstreamPo implements IDeliveryDownstreamPo {
 
	public enum COLUMNS {
		DELIVERY_DOWNSTREAM_IDEN_CODE("交貨資料下游業者識別碼"), //
		DELIVERY_MASTER_ASSO_CODE("交貨資料主檔關聯碼"), //
		CUSTOMER_TRANSACTION_ASSO_CODE("客戶交易對象關聯碼"), //
		CUSTOMER_TRANSACTION_SELF_CODE("客戶交易對象自編碼"), //
		CUSTOMER_NAME("客戶名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String deliveryDownstreamIdenCode;
	private String deliveryMasterAssoCode;
	private String customerTransactionAssoCode;
	private String customerTransactionSelfCode;
	private String customerName;

	@Override
	public String getDeliveryDownstreamIdenCode() {
		return this.deliveryDownstreamIdenCode;
	}
 
	@Override
	public void setDeliveryDownstreamIdenCode(final String deliveryDownstreamIdenCode) {
		this.deliveryDownstreamIdenCode = deliveryDownstreamIdenCode; 
	}
 
	@Override
	public String getDeliveryMasterAssoCode() {
		return this.deliveryMasterAssoCode;
	}
 
	@Override
	public void setDeliveryMasterAssoCode(final String deliveryMasterAssoCode) {
		this.deliveryMasterAssoCode = deliveryMasterAssoCode; 
	}
 
	@Override
	public String getCustomerTransactionAssoCode() {
		return this.customerTransactionAssoCode;
	}
 
	@Override
	public void setCustomerTransactionAssoCode(final String customerTransactionAssoCode) {
		this.customerTransactionAssoCode = customerTransactionAssoCode; 
	}
 
	@Override
	public String getCustomerTransactionSelfCode() {
		return this.customerTransactionSelfCode;
	}
 
	@Override
	public void setCustomerTransactionSelfCode(final String customerTransactionSelfCode) {
		this.customerTransactionSelfCode = customerTransactionSelfCode; 
	}
 
	@Override
	public String getCustomerName() {
		return this.customerName;
	}
 
	@Override
	public void setCustomerName(final String customerName) {
		this.customerName = customerName; 
	}
 
}
