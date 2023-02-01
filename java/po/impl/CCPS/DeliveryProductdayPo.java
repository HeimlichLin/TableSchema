package com.doc.common.po.impl; 
 
public class DeliveryProductdayPo implements IDeliveryProductdayPo {
 
	public enum COLUMNS {
		DELIVERY_PRODUCTDAY_IDEN_CODE("交貨資料產品日期識別碼"), //
		DELIVERY_MASTER_ASSO_CODE("交貨資料主檔關聯碼"), //
		BATCH_NUMBER("批號"), //
		PRODUCT_MANUFACTURE_DAY("產品製造日期"), //
		PRODUCT_EXPIRY_DAY("產品有效日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String deliveryProductdayIdenCode;
	private String deliveryMasterAssoCode;
	private String batchNumber;
	private String productManufactureDay;
	private String productExpiryDay;

	@Override
	public String getDeliveryProductdayIdenCode() {
		return this.deliveryProductdayIdenCode;
	}
 
	@Override
	public void setDeliveryProductdayIdenCode(final String deliveryProductdayIdenCode) {
		this.deliveryProductdayIdenCode = deliveryProductdayIdenCode; 
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
	public String getBatchNumber() {
		return this.batchNumber;
	}
 
	@Override
	public void setBatchNumber(final String batchNumber) {
		this.batchNumber = batchNumber; 
	}
 
	@Override
	public String getProductManufactureDay() {
		return this.productManufactureDay;
	}
 
	@Override
	public void setProductManufactureDay(final String productManufactureDay) {
		this.productManufactureDay = productManufactureDay; 
	}
 
	@Override
	public String getProductExpiryDay() {
		return this.productExpiryDay;
	}
 
	@Override
	public void setProductExpiryDay(final String productExpiryDay) {
		this.productExpiryDay = productExpiryDay; 
	}
 
}
