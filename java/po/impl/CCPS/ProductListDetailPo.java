package com.doc.common.po.impl; 
 
public class ProductListDetailPo implements IProductListDetailPo {
 
	public enum COLUMNS {
		PRODUCT_MLIST_DETAIL_IDEN_CODE("產品原材料清單明細檔識別碼"), //
		PRODUCT_MLIST_MASTER_ASSO_CODE("產品原材料清單主檔關聯碼"), //
		MATERIAL_MASTER_ASSO_CODE("原材料主檔關聯碼"), //
		MATERIAL_SELF_CODE("原材料自編碼"), //
		MATERIAL_NAME("原材料名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String productMlistDetailIdenCode;
	private String productMlistMasterAssoCode;
	private String materialMasterAssoCode;
	private String materialSelfCode;
	private String materialName;

	@Override
	public String getProductMlistDetailIdenCode() {
		return this.productMlistDetailIdenCode;
	}
 
	@Override
	public void setProductMlistDetailIdenCode(final String productMlistDetailIdenCode) {
		this.productMlistDetailIdenCode = productMlistDetailIdenCode; 
	}
 
	@Override
	public String getProductMlistMasterAssoCode() {
		return this.productMlistMasterAssoCode;
	}
 
	@Override
	public void setProductMlistMasterAssoCode(final String productMlistMasterAssoCode) {
		this.productMlistMasterAssoCode = productMlistMasterAssoCode; 
	}
 
	@Override
	public String getMaterialMasterAssoCode() {
		return this.materialMasterAssoCode;
	}
 
	@Override
	public void setMaterialMasterAssoCode(final String materialMasterAssoCode) {
		this.materialMasterAssoCode = materialMasterAssoCode; 
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
	public String getMaterialName() {
		return this.materialName;
	}
 
	@Override
	public void setMaterialName(final String materialName) {
		this.materialName = materialName; 
	}
 
}
