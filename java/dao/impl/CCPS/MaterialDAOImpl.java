package com.doc.common.dao.impl; 
 
public class MaterialDAOImpl extends GeneralDAOImpl<MaterialPo> implements MaterialDAO { 
	public static final MaterialDAOImpl INSTANCE = new MaterialDAOImpl(); 
	public static final String TABLENAME = "MATERIAL"; 

	public MaterialDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MaterialPo> CONVERTER = new MapConverter<MaterialPo>() { 
 
		@Override 
		public MaterialPo convert(final DataObject dataObject) { 
			final MaterialPo materialPo = new MaterialPo(); 
			materialPo.setMaterialMasterIdenCode(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_MASTER_IDEN_CODE.name())); 
			materialPo.setBusinessInfoAssoCode(dataObject.getString(MaterialPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name())); 
			materialPo.setFactoryInfoAssoCode(dataObject.getString(MaterialPo.COLUMNS.FACTORY_INFO_ASSO_CODE.name())); 
			materialPo.setMaterialSelfCode(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_SELF_CODE.name())); 
			materialPo.setMaterialAttribute(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_ATTRIBUTE.name())); 
			materialPo.setMaterialName(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_NAME.name())); 
			materialPo.setMaterialEngName(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_ENG_NAME.name())); 
			materialPo.setMaterialAliasName(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_ALIAS_NAME.name())); 
			materialPo.setMaterialMaterialRemark(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_MATERIAL_REMARK.name())); 
			materialPo.setMaterialSortBig(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_SORT_BIG.name())); 
			materialPo.setMaterialSortMid(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_SORT_MID.name())); 
			materialPo.setMaterialSortSmall(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_SORT_SMALL.name())); 
			materialPo.setMaterialSortCareful(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_SORT_CAREFUL.name())); 
			materialPo.setMaterialSource(dataObject.getString(MaterialPo.COLUMNS.MATERIAL_SOURCE.name())); 
			materialPo.setAnnouMaterialOrigin(dataObject.getString(MaterialPo.COLUMNS.ANNOU_MATERIAL_ORIGIN.name())); 
			return materialPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MaterialPo materialPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_MASTER_IDEN_CODE.name(), materialPo.getMaterialMasterIdenCode()); 
			dataObject.setValue(MaterialPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name(), materialPo.getBusinessInfoAssoCode()); 
			dataObject.setValue(MaterialPo.COLUMNS.FACTORY_INFO_ASSO_CODE.name(), materialPo.getFactoryInfoAssoCode()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_SELF_CODE.name(), materialPo.getMaterialSelfCode()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_ATTRIBUTE.name(), materialPo.getMaterialAttribute()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_NAME.name(), materialPo.getMaterialName()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_ENG_NAME.name(), materialPo.getMaterialEngName()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_ALIAS_NAME.name(), materialPo.getMaterialAliasName()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_MATERIAL_REMARK.name(), materialPo.getMaterialMaterialRemark()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_SORT_BIG.name(), materialPo.getMaterialSortBig()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_SORT_MID.name(), materialPo.getMaterialSortMid()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_SORT_SMALL.name(), materialPo.getMaterialSortSmall()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_SORT_CAREFUL.name(), materialPo.getMaterialSortCareful()); 
			dataObject.setValue(MaterialPo.COLUMNS.MATERIAL_SOURCE.name(), materialPo.getMaterialSource()); 
			dataObject.setValue(MaterialPo.COLUMNS.ANNOU_MATERIAL_ORIGIN.name(), materialPo.getAnnouMaterialOrigin()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MaterialPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MaterialPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MaterialPo.COLUMNS.MATERIAL_MASTER_IDEN_CODE.name(), po.getMaterialMasterIdenCode()); 
		return sqlWhere; 
	} 
 
} 
