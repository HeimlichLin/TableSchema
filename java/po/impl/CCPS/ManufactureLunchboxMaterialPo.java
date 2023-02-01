package com.doc.common.po.impl; 
 
public class ManufactureLunchboxMaterialPo implements IManufactureLunchboxMaterialPo {
 
	public enum COLUMNS {
		LUNCHBOXES_MATERIAL_IDEN_CODE("製造餐盒原材料識別碼"), //
		MANUFACTURE_MASTER_ASSO_CODE("製造資料主檔關聯碼"), //
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
 
	private String lunchboxesMaterialIdenCode;
	private String manufactureMasterAssoCode;
	private String materialMasterAssoCode;
	private String materialSelfCode;
	private String materialName;

	@Override
	public String getLunchboxesMaterialIdenCode() {
		return this.lunchboxesMaterialIdenCode;
	}
 
	@Override
	public void setLunchboxesMaterialIdenCode(final String lunchboxesMaterialIdenCode) {
		this.lunchboxesMaterialIdenCode = lunchboxesMaterialIdenCode; 
	}
 
	@Override
	public String getManufactureMasterAssoCode() {
		return this.manufactureMasterAssoCode;
	}
 
	@Override
	public void setManufactureMasterAssoCode(final String manufactureMasterAssoCode) {
		this.manufactureMasterAssoCode = manufactureMasterAssoCode; 
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
