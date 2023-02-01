package com.doc.common.po.impl; 
 
public class MaterialPo implements IMaterialPo {
 
	public enum COLUMNS {
		MATERIAL_MASTER_IDEN_CODE("原材料主檔識別碼"), //
		BUSINESS_INFO_ASSO_CODE("業者基本資料關聯碼"), //
		FACTORY_INFO_ASSO_CODE("工廠基本資料關聯碼"), //
		MATERIAL_SELF_CODE("原材料自編碼"), //
		MATERIAL_ATTRIBUTE("原材料屬性"), //
		MATERIAL_NAME("原材料名稱"), //
		MATERIAL_ENG_NAME("原材料英文名稱"), //
		MATERIAL_ALIAS_NAME("原材料別名"), //
		MATERIAL_MATERIAL_REMARK("原材料材質備註"), //
		MATERIAL_SORT_BIG("原材料分類大分類"), //
		MATERIAL_SORT_MID("原材料分類中分類"), //
		MATERIAL_SORT_SMALL("原材料分類小分類"), //
		MATERIAL_SORT_CAREFUL("原材料分類細分類"), //
		MATERIAL_SOURCE("肉品來源"), //
		ANNOU_MATERIAL_ORIGIN("公開原料原產地及原料名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String materialMasterIdenCode;
	private String businessInfoAssoCode;
	private String factoryInfoAssoCode;
	private String materialSelfCode;
	private String materialAttribute;
	private String materialName;
	private String materialEngName;
	private String materialAliasName;
	private String materialMaterialRemark;
	private String materialSortBig;
	private String materialSortMid;
	private String materialSortSmall;
	private String materialSortCareful;
	private String materialSource;
	private String annouMaterialOrigin;

	@Override
	public String getMaterialMasterIdenCode() {
		return this.materialMasterIdenCode;
	}
 
	@Override
	public void setMaterialMasterIdenCode(final String materialMasterIdenCode) {
		this.materialMasterIdenCode = materialMasterIdenCode; 
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
	public String getMaterialSelfCode() {
		return this.materialSelfCode;
	}
 
	@Override
	public void setMaterialSelfCode(final String materialSelfCode) {
		this.materialSelfCode = materialSelfCode; 
	}
 
	@Override
	public String getMaterialAttribute() {
		return this.materialAttribute;
	}
 
	@Override
	public void setMaterialAttribute(final String materialAttribute) {
		this.materialAttribute = materialAttribute; 
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
	public String getMaterialEngName() {
		return this.materialEngName;
	}
 
	@Override
	public void setMaterialEngName(final String materialEngName) {
		this.materialEngName = materialEngName; 
	}
 
	@Override
	public String getMaterialAliasName() {
		return this.materialAliasName;
	}
 
	@Override
	public void setMaterialAliasName(final String materialAliasName) {
		this.materialAliasName = materialAliasName; 
	}
 
	@Override
	public String getMaterialMaterialRemark() {
		return this.materialMaterialRemark;
	}
 
	@Override
	public void setMaterialMaterialRemark(final String materialMaterialRemark) {
		this.materialMaterialRemark = materialMaterialRemark; 
	}
 
	@Override
	public String getMaterialSortBig() {
		return this.materialSortBig;
	}
 
	@Override
	public void setMaterialSortBig(final String materialSortBig) {
		this.materialSortBig = materialSortBig; 
	}
 
	@Override
	public String getMaterialSortMid() {
		return this.materialSortMid;
	}
 
	@Override
	public void setMaterialSortMid(final String materialSortMid) {
		this.materialSortMid = materialSortMid; 
	}
 
	@Override
	public String getMaterialSortSmall() {
		return this.materialSortSmall;
	}
 
	@Override
	public void setMaterialSortSmall(final String materialSortSmall) {
		this.materialSortSmall = materialSortSmall; 
	}
 
	@Override
	public String getMaterialSortCareful() {
		return this.materialSortCareful;
	}
 
	@Override
	public void setMaterialSortCareful(final String materialSortCareful) {
		this.materialSortCareful = materialSortCareful; 
	}
 
	@Override
	public String getMaterialSource() {
		return this.materialSource;
	}
 
	@Override
	public void setMaterialSource(final String materialSource) {
		this.materialSource = materialSource; 
	}
 
	@Override
	public String getAnnouMaterialOrigin() {
		return this.annouMaterialOrigin;
	}
 
	@Override
	public void setAnnouMaterialOrigin(final String annouMaterialOrigin) {
		this.annouMaterialOrigin = annouMaterialOrigin; 
	}
 
}
