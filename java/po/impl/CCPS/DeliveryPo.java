package com.doc.common.po.impl; 
 
public class DeliveryPo implements IDeliveryPo {
 
	public enum COLUMNS {
		DELIVERY_MASTER_IDEN_CODE("交貨資料主檔識別碼"), //
		BUSINESS_INFO_ASSO_CODE("業者基本資料關聯碼"), //
		DECLARE_YEAR("申報年度"), //
		DECLARE_MONTH("申報月份"), //
		DECLARE_DAY("申報日期"), //
		DECLARE_SERIAL_NUMBER("申報日期流水號"), //
		PRODUCT_INFO_ASSO_CODE("產品資訊主檔關聯碼"), //
		PRODUCT_SPEC_ASSO_CODE("產品包裝規格關聯碼"), //
		PRODUCT_SPEC("包裝規格"), //
		PRODUCT_SELF_CODE("產品自編碼"), //
		PRODUCT_NAME("產品名稱"), //
		DELIVERY_TOTAL_WEIGHT("交貨總淨重"), //
		DELIVERY_TOTAL_QUANTITY("交貨總數量"), //
		RETURN_TOTAL_WEIGHT("退貨總淨重"), //
		INVENTORY_TOTAL_WEIGHT("庫存總淨重"), //
		INVENTORY_TOTAL_QUANTITY("庫存總數量"), //
		LOGISTICS_INDUSTRY("物流業者"), //
		DOWNSTREAM_COMPANY("下游業者"), //
		DELIVERY_REMARKS("交貨備註") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String deliveryMasterIdenCode;
	private String businessInfoAssoCode;
	private String declareYear;
	private String declareMonth;
	private String declareDay;
	private String declareSerialNumber;
	private String productInfoAssoCode;
	private String productSpecAssoCode;
	private String productSpec;
	private String productSelfCode;
	private String productName;
	private String deliveryTotalWeight;
	private String deliveryTotalQuantity;
	private String returnTotalWeight;
	private String inventoryTotalWeight;
	private String inventoryTotalQuantity;
	private String logisticsIndustry;
	private String downstreamCompany;
	private String deliveryRemarks;

	@Override
	public String getDeliveryMasterIdenCode() {
		return this.deliveryMasterIdenCode;
	}
 
	@Override
	public void setDeliveryMasterIdenCode(final String deliveryMasterIdenCode) {
		this.deliveryMasterIdenCode = deliveryMasterIdenCode; 
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
	public String getProductSpec() {
		return this.productSpec;
	}
 
	@Override
	public void setProductSpec(final String productSpec) {
		this.productSpec = productSpec; 
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
	public String getProductName() {
		return this.productName;
	}
 
	@Override
	public void setProductName(final String productName) {
		this.productName = productName; 
	}
 
	@Override
	public String getDeliveryTotalWeight() {
		return this.deliveryTotalWeight;
	}
 
	@Override
	public void setDeliveryTotalWeight(final String deliveryTotalWeight) {
		this.deliveryTotalWeight = deliveryTotalWeight; 
	}
 
	@Override
	public String getDeliveryTotalQuantity() {
		return this.deliveryTotalQuantity;
	}
 
	@Override
	public void setDeliveryTotalQuantity(final String deliveryTotalQuantity) {
		this.deliveryTotalQuantity = deliveryTotalQuantity; 
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
 
	@Override
	public String getLogisticsIndustry() {
		return this.logisticsIndustry;
	}
 
	@Override
	public void setLogisticsIndustry(final String logisticsIndustry) {
		this.logisticsIndustry = logisticsIndustry; 
	}
 
	@Override
	public String getDownstreamCompany() {
		return this.downstreamCompany;
	}
 
	@Override
	public void setDownstreamCompany(final String downstreamCompany) {
		this.downstreamCompany = downstreamCompany; 
	}
 
	@Override
	public String getDeliveryRemarks() {
		return this.deliveryRemarks;
	}
 
	@Override
	public void setDeliveryRemarks(final String deliveryRemarks) {
		this.deliveryRemarks = deliveryRemarks; 
	}
 
}
