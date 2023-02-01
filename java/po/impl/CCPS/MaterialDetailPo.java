package com.doc.common.po.impl; 
 
public class MaterialDetailPo implements IMaterialDetailPo {
 
	public enum COLUMNS {
		MATERIAL_DETAIL_IDEN_CODE("原材料材質識別碼"), //
		MATERIAL_ASSO_CODE("原材料主檔關聯碼"), //
		PRODUCT_CONTAINER_ASSO_CODE("產品包裝容器材質代碼關聯碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String materialDetailIdenCode;
	private String materialAssoCode;
	private String productContainerAssoCode;

	@Override
	public String getMaterialDetailIdenCode() {
		return this.materialDetailIdenCode;
	}
 
	@Override
	public void setMaterialDetailIdenCode(final String materialDetailIdenCode) {
		this.materialDetailIdenCode = materialDetailIdenCode; 
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
	public String getProductContainerAssoCode() {
		return this.productContainerAssoCode;
	}
 
	@Override
	public void setProductContainerAssoCode(final String productContainerAssoCode) {
		this.productContainerAssoCode = productContainerAssoCode; 
	}
 
}
