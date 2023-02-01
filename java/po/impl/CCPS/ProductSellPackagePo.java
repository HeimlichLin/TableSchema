package com.doc.common.po.impl; 
 
public class ProductSellPackagePo implements IProductSellPackagePo {
 
	public enum COLUMNS {
		PRODUCT_SELL_PACKAGE_IDEN_CODE("產品販售包裝識別碼"), //
		PRODUCT_INFO_ASSO_CODE("產品資訊主檔關聯碼(輸入業)"), //
		PRODUCT_SPEC_ASSO_CODE("產品包裝規格關聯碼(製造業)"), //
		PRODUCT_SELF_CODE("產品自編碼"), //
		SELL_PACKAGE_TYPE("產品販售包裝單位"), //
		SELL_PACKAGE_WEIGHT("產品販售包裝重量"), //
		SELL_PACKAGE_WEIGHT_TYPE("產品販售包裝重量單位"), //
		SELL_PACKAGE_REMARK("產品販售包裝備註") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String productSellPackageIdenCode;
	private String productInfoAssoCode;
	private String productSpecAssoCode;
	private String productSelfCode;
	private String sellPackageType;
	private String sellPackageWeight;
	private String sellPackageWeightType;
	private String sellPackageRemark;

	@Override
	public String getProductSellPackageIdenCode() {
		return this.productSellPackageIdenCode;
	}
 
	@Override
	public void setProductSellPackageIdenCode(final String productSellPackageIdenCode) {
		this.productSellPackageIdenCode = productSellPackageIdenCode; 
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
	public String getSellPackageType() {
		return this.sellPackageType;
	}
 
	@Override
	public void setSellPackageType(final String sellPackageType) {
		this.sellPackageType = sellPackageType; 
	}
 
	@Override
	public String getSellPackageWeight() {
		return this.sellPackageWeight;
	}
 
	@Override
	public void setSellPackageWeight(final String sellPackageWeight) {
		this.sellPackageWeight = sellPackageWeight; 
	}
 
	@Override
	public String getSellPackageWeightType() {
		return this.sellPackageWeightType;
	}
 
	@Override
	public void setSellPackageWeightType(final String sellPackageWeightType) {
		this.sellPackageWeightType = sellPackageWeightType; 
	}
 
	@Override
	public String getSellPackageRemark() {
		return this.sellPackageRemark;
	}
 
	@Override
	public void setSellPackageRemark(final String sellPackageRemark) {
		this.sellPackageRemark = sellPackageRemark; 
	}
 
}
