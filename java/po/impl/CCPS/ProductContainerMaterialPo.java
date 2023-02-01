package com.doc.common.po.impl; 
 
public class ProductContainerMaterialPo implements IProductContainerMaterialPo {
 
	public enum COLUMNS {
		PRODUCT_MATERIAL_IDEN_CODE("產品容器材質識別碼"), //
		PRODUCT_SPEC_ASSO_CODE("產品包裝規格關聯碼"), //
		PRODUCT_SELF_CODE("產品自編碼"), //
		PACKAGE_MATERIA_ASSO_CODE("包裝容器材質關連碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String productMaterialIdenCode;
	private String productSpecAssoCode;
	private String productSelfCode;
	private String packageMateriaAssoCode;

	@Override
	public String getProductMaterialIdenCode() {
		return this.productMaterialIdenCode;
	}
 
	@Override
	public void setProductMaterialIdenCode(final String productMaterialIdenCode) {
		this.productMaterialIdenCode = productMaterialIdenCode; 
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
	public String getPackageMateriaAssoCode() {
		return this.packageMateriaAssoCode;
	}
 
	@Override
	public void setPackageMateriaAssoCode(final String packageMateriaAssoCode) {
		this.packageMateriaAssoCode = packageMateriaAssoCode; 
	}
 
}
