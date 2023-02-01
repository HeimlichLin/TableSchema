package com.doc.common.po.impl; 
 
public class MaterialTracePo implements IMaterialTracePo {
 
	public enum COLUMNS {
		MATERIAL_TRACE_IDEN_CODE("原材料產品追溯系統串接識別碼"), //
		MATERIAL_MASTER_ASSO_CODE("原材料主檔關聯碼"), //
		MATERIAL_COMPANY_ASSO_CODE("原材料廠商資料關聯碼"), //
		PRODUCT_TRACE_CODE("產品追溯系統串接碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String materialTraceIdenCode;
	private String materialMasterAssoCode;
	private String materialCompanyAssoCode;
	private String productTraceCode;

	@Override
	public String getMaterialTraceIdenCode() {
		return this.materialTraceIdenCode;
	}
 
	@Override
	public void setMaterialTraceIdenCode(final String materialTraceIdenCode) {
		this.materialTraceIdenCode = materialTraceIdenCode; 
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
	public String getMaterialCompanyAssoCode() {
		return this.materialCompanyAssoCode;
	}
 
	@Override
	public void setMaterialCompanyAssoCode(final String materialCompanyAssoCode) {
		this.materialCompanyAssoCode = materialCompanyAssoCode; 
	}
 
	@Override
	public String getProductTraceCode() {
		return this.productTraceCode;
	}
 
	@Override
	public void setProductTraceCode(final String productTraceCode) {
		this.productTraceCode = productTraceCode; 
	}
 
}
