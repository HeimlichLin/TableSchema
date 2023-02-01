package com.doc.common.po.impl; 
 
public class ManufacturePo implements IManufacturePo {
 
	public enum COLUMNS {
		MANUFACTURE_IDEN_CODE("製造資料主檔識別碼"), //
		BUSINESS_INFO_ASSO_CODE("業者基本資料關聯碼"), //
		FACTORY_INFO_ASSO_CODE("工廠基本資料關聯碼"), //
		DECLARE_YEAR("申報年度"), //
		DECLARE_MONTH("申報月份"), //
		DECLARE_DAY("申報日期"), //
		DECLARE_SERIAL_NUMBER("申報日期流水號"), //
		PRODUCT_INFO_ASSO_CODE("產品資訊主檔關聯碼"), //
		PRODUCT_SPEC_ASSO_CODE("產品包裝規格關聯碼"), //
		PRODUCT_SELF_CODE("產品自編碼"), //
		PRODUCT_NAME("產品名稱"), //
		PACKAGE_SPEC("產品包裝規格"), //
		WEIGHT("總淨重"), //
		MANUFACTURE_QUANTITY("製造數量") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String manufactureIdenCode;
	private String businessInfoAssoCode;
	private String factoryInfoAssoCode;
	private String declareYear;
	private String declareMonth;
	private String declareDay;
	private String declareSerialNumber;
	private String productInfoAssoCode;
	private String productSpecAssoCode;
	private String productSelfCode;
	private String productName;
	private String packageSpec;
	private String weight;
	private String manufactureQuantity;

	@Override
	public String getManufactureIdenCode() {
		return this.manufactureIdenCode;
	}
 
	@Override
	public void setManufactureIdenCode(final String manufactureIdenCode) {
		this.manufactureIdenCode = manufactureIdenCode; 
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
	public String getFactoryInfoAssoCode() {
		return this.factoryInfoAssoCode;
	}
 
	@Override
	public void setFactoryInfoAssoCode(final String factoryInfoAssoCode) {
		this.factoryInfoAssoCode = factoryInfoAssoCode; 
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
	public String getPackageSpec() {
		return this.packageSpec;
	}
 
	@Override
	public void setPackageSpec(final String packageSpec) {
		this.packageSpec = packageSpec; 
	}
 
	@Override
	public String getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final String weight) {
		this.weight = weight; 
	}
 
	@Override
	public String getManufactureQuantity() {
		return this.manufactureQuantity;
	}
 
	@Override
	public void setManufactureQuantity(final String manufactureQuantity) {
		this.manufactureQuantity = manufactureQuantity; 
	}
 
}
