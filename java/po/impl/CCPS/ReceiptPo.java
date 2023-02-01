package com.doc.common.po.impl; 
 
public class ReceiptPo implements IReceiptPo {
 
	public enum COLUMNS {
		RECEIPT_MASTER_IDEN_CODE("收貨資料主檔識別碼"), //
		BUSINESS_INFO_ASSO_CODE("業者基本資料關聯碼"), //
		DECLARE_YEAR("申報年度"), //
		DECLARE_MONTH("申報月份"), //
		DECLARE_DAY("申報日期"), //
		DECLARE_SERIAL_NUMBER("申報日期流水號"), //
		MATERIAL_ASSO_CODE("原材料主檔關聯碼"), //
		MATERIAL_SELF_CODE("原材料自編碼"), //
		MATERIAL_COMPANY_INFO_ASSO_COD("原材料廠商資料關聯碼"), //
		MATERIAL_COMPANY_SELF_CODE("原材料廠商自編碼"), //
		MATERIAL_NAME("原材料名稱"), //
		PRODUCT_INFO_ASSO_CODE("產品資訊主檔關聯碼"), //
		PRODUCT_SPEC_ASSO_CODE("產品包裝規格關聯碼"), //
		PRODUCT_SELF_CODE("產品自編碼"), //
		PRODUCT_CHINESE_NAME("產品名稱"), //
		RECEIPT_TOTAL_QUANTITY("收貨總數量"), //
		RECEIPT_TOTAL_WEIGHT("收貨總淨重"), //
		QUANTITY_TYPE("數量單位"), //
		RETURN_TOTAL_WEIGHT("退貨總淨重"), //
		INVENTORY_TOTAL_WEIGHT("庫存總淨重"), //
		INVENTORY_TOTAL_QUANTITY("庫存總數量") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String receiptMasterIdenCode;
	private String businessInfoAssoCode;
	private String declareYear;
	private String declareMonth;
	private String declareDay;
	private String declareSerialNumber;
	private String materialAssoCode;
	private String materialSelfCode;
	private String materialCompanyInfoAssoCod;
	private String materialCompanySelfCode;
	private String materialName;
	private String productInfoAssoCode;
	private String productSpecAssoCode;
	private String productSelfCode;
	private String productChineseName;
	private String receiptTotalQuantity;
	private String receiptTotalWeight;
	private String quantityType;
	private String returnTotalWeight;
	private String inventoryTotalWeight;
	private String inventoryTotalQuantity;

	@Override
	public String getReceiptMasterIdenCode() {
		return this.receiptMasterIdenCode;
	}
 
	@Override
	public void setReceiptMasterIdenCode(final String receiptMasterIdenCode) {
		this.receiptMasterIdenCode = receiptMasterIdenCode; 
	}
 
	@Override
	public String getBusinessInfoAssoCode() {
		return this.businessInfoAssoCode;
	}
 
	@Override
	public void setBusinessInfoAssoCode(final String businessInfoAssoCode) {
		this.businessInfoAssoCode = businessInfoAssoCode; 
	}
 
	@Override
	public String getDeclareYear() {
		return this.declareYear;
	}
 
	@Override
	public void setDeclareYear(final String declareYear) {
		this.declareYear = declareYear; 
	}
 
	@Override
	public String getDeclareMonth() {
		return this.declareMonth;
	}
 
	@Override
	public void setDeclareMonth(final String declareMonth) {
		this.declareMonth = declareMonth; 
	}
 
	@Override
	public String getDeclareDay() {
		return this.declareDay;
	}
 
	@Override
	public void setDeclareDay(final String declareDay) {
		this.declareDay = declareDay; 
	}
 
	@Override
	public String getDeclareSerialNumber() {
		return this.declareSerialNumber;
	}
 
	@Override
	public void setDeclareSerialNumber(final String declareSerialNumber) {
		this.declareSerialNumber = declareSerialNumber; 
	}
 
	@Override
	public String getMaterialAssoCode() {
		return this.materialAssoCode;
	}
 
	@Override
	public void setMaterialAssoCode(final String materialAssoCode) {
		this.materialAssoCode = materialAssoCode; 
	}
 
	@Override
	public String getMaterialSelfCode() {
		return this.materialSelfCode;
	}
 
	@Override
	public void setMaterialSelfCode(final String materialSelfCode) {
		this.materialSelfCode = materialSelfCode; 
	}
 
	@Override
	public String getMaterialCompanyInfoAssoCod() {
		return this.materialCompanyInfoAssoCod;
	}
 
	@Override
	public void setMaterialCompanyInfoAssoCod(final String materialCompanyInfoAssoCod) {
		this.materialCompanyInfoAssoCod = materialCompanyInfoAssoCod; 
	}
 
	@Override
	public String getMaterialCompanySelfCode() {
		return this.materialCompanySelfCode;
	}
 
	@Override
	public void setMaterialCompanySelfCode(final String materialCompanySelfCode) {
		this.materialCompanySelfCode = materialCompanySelfCode; 
	}
 
	@Override
	public String getMaterialName() {
		return this.materialName;
	}
 
	@Override
	public void setMaterialName(final String materialName) {
		this.materialName = materialName; 
	}
 
	@Override
	public String getProductInfoAssoCode() {
		return this.productInfoAssoCode;
	}
 
	@Override
	public void setProductInfoAssoCode(final String productInfoAssoCode) {
		this.productInfoAssoCode = productInfoAssoCode; 
	}
 
	@Override
	public String getProductSpecAssoCode() {
		return this.productSpecAssoCode;
	}
 
	@Override
	public void setProductSpecAssoCode(final String productSpecAssoCode) {
		this.productSpecAssoCode = productSpecAssoCode; 
	}
 
	@Override
	public String getProductSelfCode() {
		return this.productSelfCode;
	}
 
	@Override
	public void setProductSelfCode(final String productSelfCode) {
		this.productSelfCode = productSelfCode; 
	}
 
	@Override
	public String getProductChineseName() {
		return this.productChineseName;
	}
 
	@Override
	public void setProductChineseName(final String productChineseName) {
		this.productChineseName = productChineseName; 
	}
 
	@Override
	public String getReceiptTotalQuantity() {
		return this.receiptTotalQuantity;
	}
 
	@Override
	public void setReceiptTotalQuantity(final String receiptTotalQuantity) {
		this.receiptTotalQuantity = receiptTotalQuantity; 
	}
 
	@Override
	public String getReceiptTotalWeight() {
		return this.receiptTotalWeight;
	}
 
	@Override
	public void setReceiptTotalWeight(final String receiptTotalWeight) {
		this.receiptTotalWeight = receiptTotalWeight; 
	}
 
	@Override
	public String getQuantityType() {
		return this.quantityType;
	}
 
	@Override
	public void setQuantityType(final String quantityType) {
		this.quantityType = quantityType; 
	}
 
	@Override
	public String getReturnTotalWeight() {
		return this.returnTotalWeight;
	}
 
	@Override
	public void setReturnTotalWeight(final String returnTotalWeight) {
		this.returnTotalWeight = returnTotalWeight; 
	}
 
	@Override
	public String getInventoryTotalWeight() {
		return this.inventoryTotalWeight;
	}
 
	@Override
	public void setInventoryTotalWeight(final String inventoryTotalWeight) {
		this.inventoryTotalWeight = inventoryTotalWeight; 
	}
 
	@Override
	public String getInventoryTotalQuantity() {
		return this.inventoryTotalQuantity;
	}
 
	@Override
	public void setInventoryTotalQuantity(final String inventoryTotalQuantity) {
		this.inventoryTotalQuantity = inventoryTotalQuantity; 
	}
 
}
