package com.doc.common.po.impl; 
 
public class ReceiptMaterialPo implements IReceiptMaterialPo {
 
	public enum COLUMNS {
		RECEIPT_MATERIALDAY_IDEN_CODE("收貨資料原材料日期識別碼"), //
		RECEIPT_MASTER_ASSO_CODE("收貨資料主檔關聯碼"), //
		BATCH_NUMBER("批號"), //
		MATERIAL_MANUFACTURE_DAY("原材料製造日期"), //
		MATERIAL_EXPIRY_DAY("原材料有效日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String receiptMaterialdayIdenCode;
	private String receiptMasterAssoCode;
	private String batchNumber;
	private String materialManufactureDay;
	private String materialExpiryDay;

	@Override
	public String getReceiptMaterialdayIdenCode() {
		return this.receiptMaterialdayIdenCode;
	}
 
	@Override
	public void setReceiptMaterialdayIdenCode(final String receiptMaterialdayIdenCode) {
		this.receiptMaterialdayIdenCode = receiptMaterialdayIdenCode; 
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
	public String getMaterialManufactureDay() {
		return this.materialManufactureDay;
	}
 
	@Override
	public void setMaterialManufactureDay(final String materialManufactureDay) {
		this.materialManufactureDay = materialManufactureDay; 
	}
 
	@Override
	public String getMaterialExpiryDay() {
		return this.materialExpiryDay;
	}
 
	@Override
	public void setMaterialExpiryDay(final String materialExpiryDay) {
		this.materialExpiryDay = materialExpiryDay; 
	}
 
}
