package com.doc.common.po.impl; 
 
public class ReceiptProductdayPo implements IReceiptProductdayPo {
 
	public enum COLUMNS {
		RECEIPT_PRODUCTDAY_IDEN_CODE("收貨資料產品日期識別碼"), //
		RECEIPT_MASTER_ASSO_CODE("收貨資料主檔關聯碼"), //
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
 
	private String receiptProductdayIdenCode;
	private String receiptMasterAssoCode;
	private String batchNumber;
	private String productManufactureDay;
	private String productExpiryDay;

	@Override
	public String getReceiptProductdayIdenCode() {
		return this.receiptProductdayIdenCode;
	}
 
	@Override
	public void setReceiptProductdayIdenCode(final String receiptProductdayIdenCode) {
		this.receiptProductdayIdenCode = receiptProductdayIdenCode; 
	}
 
	@Override
	public String getReceiptMasterAssoCode() {
		return this.receiptMasterAssoCode;
	}
 
	@Override
	public void setReceiptMasterAssoCode(final String receiptMasterAssoCode) {
		this.receiptMasterAssoCode = receiptMasterAssoCode; 
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
