package com.doc.common.po.impl; 
 
public class MaterialCompanyPo implements IMaterialCompanyPo {
 
	public enum COLUMNS {
		MATERIAL_COMPANY_IDEN_CODE("原材料廠商資料識別碼"), //
		MATERIAL_MASTER_ASSO_CODE("原材料主檔關聯碼"), //
		MATERIAL_COMPANY_SELF_CODE("原材料廠商自編碼"), //
		DOMESTIC_RESPONSIBLE_COMPANY("國內負責廠商"), //
		MANUFACTURE_COMPANY("製造廠商"), //
		GS1_PRODUCT_CODE("GS1商品條碼"), //
		PACKAGE_SPEC_FORM("包裝規格包裝形式"), //
		PACKAGE_SPEC_WEIGHT("包裝規格重量"), //
		PACKAGE_SPEC_WEIGHT_TYPE("包裝規格重量單位"), //
		PACKAGE_SPEC_TYPE_ASSO_CODE("包裝規格單位代碼關聯碼"), //
		PACKAGE_SPEC_BULK_REMARK("包裝規格散裝備註"), //
		SHELF_LIFE("保存期限"), //
		STORAGE_TRANS_CONDITION("儲運條件"), //
		STORAGE_TRANS_CONDITION_REMARK("儲運條件其他備註"), //
		OTHER_STORAGE_TRANS_CONDITION("其他儲運條件"), //
		IS_FOOD_ADDITIVE("是否為食品添加物"), //
		ADDITIVE_PRODUCT_REGISTER_CODE("食品添加物產品登錄碼"), //
		ANNOU_MATERIAL_ORIGIN_PERSION("非屬公告要求應標示原料原產地者") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String materialCompanyIdenCode;
	private String materialMasterAssoCode;
	private String materialCompanySelfCode;
	private String domesticResponsibleCompany;
	private String manufactureCompany;
	private String gs1ProductCode;
	private String packageSpecForm;
	private String packageSpecWeight;
	private String packageSpecWeightType;
	private String packageSpecTypeAssoCode;
	private String packageSpecBulkRemark;
	private String shelfLife;
	private String storageTransCondition;
	private String storageTransConditionRemark;
	private String otherStorageTransCondition;
	private String isFoodAdditive;
	private String additiveProductRegisterCode;
	private String annouMaterialOriginPersion;

	@Override
	public String getMaterialCompanyIdenCode() {
		return this.materialCompanyIdenCode;
	}
 
	@Override
	public void setMaterialCompanyIdenCode(final String materialCompanyIdenCode) {
		this.materialCompanyIdenCode = materialCompanyIdenCode; 
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
	public String getMaterialCompanySelfCode() {
		return this.materialCompanySelfCode;
	}
 
	@Override
	public void setMaterialCompanySelfCode(final String materialCompanySelfCode) {
		this.materialCompanySelfCode = materialCompanySelfCode; 
	}
 
	@Override
	public String getDomesticResponsibleCompany() {
		return this.domesticResponsibleCompany;
	}
 
	@Override
	public void setDomesticResponsibleCompany(final String domesticResponsibleCompany) {
		this.domesticResponsibleCompany = domesticResponsibleCompany; 
	}
 
	@Override
	public String getManufactureCompany() {
		return this.manufactureCompany;
	}
 
	@Override
	public void setManufactureCompany(final String manufactureCompany) {
		this.manufactureCompany = manufactureCompany; 
	}
 
	@Override
	public String getGs1ProductCode() {
		return this.gs1ProductCode;
	}
 
	@Override
	public void setGs1ProductCode(final String gs1ProductCode) {
		this.gs1ProductCode = gs1ProductCode; 
	}
 
	@Override
	public String getPackageSpecForm() {
		return this.packageSpecForm;
	}
 
	@Override
	public void setPackageSpecForm(final String packageSpecForm) {
		this.packageSpecForm = packageSpecForm; 
	}
 
	@Override
	public String getPackageSpecWeight() {
		return this.packageSpecWeight;
	}
 
	@Override
	public void setPackageSpecWeight(final String packageSpecWeight) {
		this.packageSpecWeight = packageSpecWeight; 
	}
 
	@Override
	public String getPackageSpecWeightType() {
		return this.packageSpecWeightType;
	}
 
	@Override
	public void setPackageSpecWeightType(final String packageSpecWeightType) {
		this.packageSpecWeightType = packageSpecWeightType; 
	}
 
	@Override
	public String getPackageSpecTypeAssoCode() {
		return this.packageSpecTypeAssoCode;
	}
 
	@Override
	public void setPackageSpecTypeAssoCode(final String packageSpecTypeAssoCode) {
		this.packageSpecTypeAssoCode = packageSpecTypeAssoCode; 
	}
 
	@Override
	public String getPackageSpecBulkRemark() {
		return this.packageSpecBulkRemark;
	}
 
	@Override
	public void setPackageSpecBulkRemark(final String packageSpecBulkRemark) {
		this.packageSpecBulkRemark = packageSpecBulkRemark; 
	}
 
	@Override
	public String getShelfLife() {
		return this.shelfLife;
	}
 
	@Override
	public void setShelfLife(final String shelfLife) {
		this.shelfLife = shelfLife; 
	}
 
	@Override
	public String getStorageTransCondition() {
		return this.storageTransCondition;
	}
 
	@Override
	public void setStorageTransCondition(final String storageTransCondition) {
		this.storageTransCondition = storageTransCondition; 
	}
 
	@Override
	public String getStorageTransConditionRemark() {
		return this.storageTransConditionRemark;
	}
 
	@Override
	public void setStorageTransConditionRemark(final String storageTransConditionRemark) {
		this.storageTransConditionRemark = storageTransConditionRemark; 
	}
 
	@Override
	public String getOtherStorageTransCondition() {
		return this.otherStorageTransCondition;
	}
 
	@Override
	public void setOtherStorageTransCondition(final String otherStorageTransCondition) {
		this.otherStorageTransCondition = otherStorageTransCondition; 
	}
 
	@Override
	public String getIsFoodAdditive() {
		return this.isFoodAdditive;
	}
 
	@Override
	public void setIsFoodAdditive(final String isFoodAdditive) {
		this.isFoodAdditive = isFoodAdditive; 
	}
 
	@Override
	public String getAdditiveProductRegisterCode() {
		return this.additiveProductRegisterCode;
	}
 
	@Override
	public void setAdditiveProductRegisterCode(final String additiveProductRegisterCode) {
		this.additiveProductRegisterCode = additiveProductRegisterCode; 
	}
 
	@Override
	public String getAnnouMaterialOriginPersion() {
		return this.annouMaterialOriginPersion;
	}
 
	@Override
	public void setAnnouMaterialOriginPersion(final String annouMaterialOriginPersion) {
		this.annouMaterialOriginPersion = annouMaterialOriginPersion; 
	}
 
}
