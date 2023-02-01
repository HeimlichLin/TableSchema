package com.doc.common.po.impl; 
 
public class ProductListPo implements IProductListPo {
 
	public enum COLUMNS {
		PRODUCT_MLIST_MASTER_IDEN_CODE("產品原材料清單主檔識別碼"), //
		BUSINESS_INFO_ASSO_CODE("業者基本資料關聯碼"), //
		FACTORY_INFO_ASSO_CODE("工廠基本資料關聯碼"), //
		PRODUCT_SPEC_ASSO_CODE("產品包裝規格關聯碼"), //
		PRODUCT_SELF_CODE("產品自編碼"), //
		EXPIRY_START_DAY("有效起始日") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String productMlistMasterIdenCode;
	private String businessInfoAssoCode;
	private String factoryInfoAssoCode;
	private String productSpecAssoCode;
	private String productSelfCode;
	private String expiryStartDay;

	@Override
	public String getProductMlistMasterIdenCode() {
		return this.productMlistMasterIdenCode;
	}
 
	@Override
	public void setProductMlistMasterIdenCode(final String productMlistMasterIdenCode) {
		this.productMlistMasterIdenCode = productMlistMasterIdenCode; 
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
	public String getExpiryStartDay() {
		return this.expiryStartDay;
	}
 
	@Override
	public void setExpiryStartDay(final String expiryStartDay) {
		this.expiryStartDay = expiryStartDay; 
	}
 
}
