package com.doc.common.dao.impl; 
 
public class MaterialCompanyDAOImpl extends GeneralDAOImpl<MaterialCompanyPo> implements MaterialCompanyDAO { 
	public static final MaterialCompanyDAOImpl INSTANCE = new MaterialCompanyDAOImpl(); 
	public static final String TABLENAME = "MATERIAL_COMPANY"; 

	public MaterialCompanyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MaterialCompanyPo> CONVERTER = new MapConverter<MaterialCompanyPo>() { 
 
		@Override 
		public MaterialCompanyPo convert(final DataObject dataObject) { 
			final MaterialCompanyPo materialCompanyPo = new MaterialCompanyPo(); 
			materialCompanyPo.setMaterialCompanyIdenCode(dataObject.getString(MaterialCompanyPo.COLUMNS.MATERIAL_COMPANY_IDEN_CODE.name())); 
			materialCompanyPo.setMaterialMasterAssoCode(dataObject.getString(MaterialCompanyPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name())); 
			materialCompanyPo.setMaterialCompanySelfCode(dataObject.getString(MaterialCompanyPo.COLUMNS.MATERIAL_COMPANY_SELF_CODE.name())); 
			materialCompanyPo.setDomesticResponsibleCompany(dataObject.getString(MaterialCompanyPo.COLUMNS.DOMESTIC_RESPONSIBLE_COMPANY.name())); 
			materialCompanyPo.setManufactureCompany(dataObject.getString(MaterialCompanyPo.COLUMNS.MANUFACTURE_COMPANY.name())); 
			materialCompanyPo.setGs1ProductCode(dataObject.getString(MaterialCompanyPo.COLUMNS.GS1_PRODUCT_CODE.name())); 
			materialCompanyPo.setPackageSpecForm(dataObject.getString(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_FORM.name())); 
			materialCompanyPo.setPackageSpecWeight(dataObject.getString(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_WEIGHT.name())); 
			materialCompanyPo.setPackageSpecWeightType(dataObject.getString(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_WEIGHT_TYPE.name())); 
			materialCompanyPo.setPackageSpecTypeAssoCode(dataObject.getString(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_TYPE_ASSO_CODE.name())); 
			materialCompanyPo.setPackageSpecBulkRemark(dataObject.getString(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_BULK_REMARK.name())); 
			materialCompanyPo.setShelfLife(dataObject.getString(MaterialCompanyPo.COLUMNS.SHELF_LIFE.name())); 
			materialCompanyPo.setStorageTransCondition(dataObject.getString(MaterialCompanyPo.COLUMNS.STORAGE_TRANS_CONDITION.name())); 
			materialCompanyPo.setStorageTransConditionRemark(dataObject.getString(MaterialCompanyPo.COLUMNS.STORAGE_TRANS_CONDITION_REMARK.name())); 
			materialCompanyPo.setOtherStorageTransCondition(dataObject.getString(MaterialCompanyPo.COLUMNS.OTHER_STORAGE_TRANS_CONDITION.name())); 
			materialCompanyPo.setIsFoodAdditive(dataObject.getString(MaterialCompanyPo.COLUMNS.IS_FOOD_ADDITIVE.name())); 
			materialCompanyPo.setAdditiveProductRegisterCode(dataObject.getString(MaterialCompanyPo.COLUMNS.ADDITIVE_PRODUCT_REGISTER_CODE.name())); 
			materialCompanyPo.setAnnouMaterialOriginPersion(dataObject.getString(MaterialCompanyPo.COLUMNS.ANNOU_MATERIAL_ORIGIN_PERSION.name())); 
			return materialCompanyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MaterialCompanyPo materialCompanyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.MATERIAL_COMPANY_IDEN_CODE.name(), materialCompanyPo.getMaterialCompanyIdenCode()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name(), materialCompanyPo.getMaterialMasterAssoCode()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.MATERIAL_COMPANY_SELF_CODE.name(), materialCompanyPo.getMaterialCompanySelfCode()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.DOMESTIC_RESPONSIBLE_COMPANY.name(), materialCompanyPo.getDomesticResponsibleCompany()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.MANUFACTURE_COMPANY.name(), materialCompanyPo.getManufactureCompany()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.GS1_PRODUCT_CODE.name(), materialCompanyPo.getGs1ProductCode()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_FORM.name(), materialCompanyPo.getPackageSpecForm()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_WEIGHT.name(), materialCompanyPo.getPackageSpecWeight()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_WEIGHT_TYPE.name(), materialCompanyPo.getPackageSpecWeightType()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_TYPE_ASSO_CODE.name(), materialCompanyPo.getPackageSpecTypeAssoCode()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.PACKAGE_SPEC_BULK_REMARK.name(), materialCompanyPo.getPackageSpecBulkRemark()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.SHELF_LIFE.name(), materialCompanyPo.getShelfLife()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.STORAGE_TRANS_CONDITION.name(), materialCompanyPo.getStorageTransCondition()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.STORAGE_TRANS_CONDITION_REMARK.name(), materialCompanyPo.getStorageTransConditionRemark()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.OTHER_STORAGE_TRANS_CONDITION.name(), materialCompanyPo.getOtherStorageTransCondition()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.IS_FOOD_ADDITIVE.name(), materialCompanyPo.getIsFoodAdditive()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.ADDITIVE_PRODUCT_REGISTER_CODE.name(), materialCompanyPo.getAdditiveProductRegisterCode()); 
			dataObject.setValue(MaterialCompanyPo.COLUMNS.ANNOU_MATERIAL_ORIGIN_PERSION.name(), materialCompanyPo.getAnnouMaterialOriginPersion()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MaterialCompanyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MaterialCompanyPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MaterialCompanyPo.COLUMNS.MATERIAL_COMPANY_IDEN_CODE.name(), po.getMaterialCompanyIdenCode()); 
		sqlWhere.add(MaterialCompanyPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name(), po.getMaterialMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
