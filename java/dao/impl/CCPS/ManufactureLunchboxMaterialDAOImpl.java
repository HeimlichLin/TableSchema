package com.doc.common.dao.impl; 
 
public class ManufactureLunchboxMaterialDAOImpl extends GeneralDAOImpl<ManufactureLunchboxMaterialPo> implements ManufactureLunchboxMaterialDAO { 
	public static final ManufactureLunchboxMaterialDAOImpl INSTANCE = new ManufactureLunchboxMaterialDAOImpl(); 
	public static final String TABLENAME = "MANUFACTURE_LUNCHBOX_MATERIAL"; 

	public ManufactureLunchboxMaterialDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ManufactureLunchboxMaterialPo> CONVERTER = new MapConverter<ManufactureLunchboxMaterialPo>() { 
 
		@Override 
		public ManufactureLunchboxMaterialPo convert(final DataObject dataObject) { 
			final ManufactureLunchboxMaterialPo manufactureLunchboxMaterialPo = new ManufactureLunchboxMaterialPo(); 
			manufactureLunchboxMaterialPo.setLunchboxesMaterialIdenCode(dataObject.getString(ManufactureLunchboxMaterialPo.COLUMNS.LUNCHBOXES_MATERIAL_IDEN_CODE.name())); 
			manufactureLunchboxMaterialPo.setManufactureMasterAssoCode(dataObject.getString(ManufactureLunchboxMaterialPo.COLUMNS.MANUFACTURE_MASTER_ASSO_CODE.name())); 
			manufactureLunchboxMaterialPo.setMaterialMasterAssoCode(dataObject.getString(ManufactureLunchboxMaterialPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name())); 
			manufactureLunchboxMaterialPo.setMaterialSelfCode(dataObject.getString(ManufactureLunchboxMaterialPo.COLUMNS.MATERIAL_SELF_CODE.name())); 
			manufactureLunchboxMaterialPo.setMaterialName(dataObject.getString(ManufactureLunchboxMaterialPo.COLUMNS.MATERIAL_NAME.name())); 
			return manufactureLunchboxMaterialPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ManufactureLunchboxMaterialPo manufactureLunchboxMaterialPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ManufactureLunchboxMaterialPo.COLUMNS.LUNCHBOXES_MATERIAL_IDEN_CODE.name(), manufactureLunchboxMaterialPo.getLunchboxesMaterialIdenCode()); 
			dataObject.setValue(ManufactureLunchboxMaterialPo.COLUMNS.MANUFACTURE_MASTER_ASSO_CODE.name(), manufactureLunchboxMaterialPo.getManufactureMasterAssoCode()); 
			dataObject.setValue(ManufactureLunchboxMaterialPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name(), manufactureLunchboxMaterialPo.getMaterialMasterAssoCode()); 
			dataObject.setValue(ManufactureLunchboxMaterialPo.COLUMNS.MATERIAL_SELF_CODE.name(), manufactureLunchboxMaterialPo.getMaterialSelfCode()); 
			dataObject.setValue(ManufactureLunchboxMaterialPo.COLUMNS.MATERIAL_NAME.name(), manufactureLunchboxMaterialPo.getMaterialName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ManufactureLunchboxMaterialPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ManufactureLunchboxMaterialPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ManufactureLunchboxMaterialPo.COLUMNS.LUNCHBOXES_MATERIAL_IDEN_CODE.name(), po.getLunchboxesMaterialIdenCode()); 
		sqlWhere.add(ManufactureLunchboxMaterialPo.COLUMNS.MANUFACTURE_MASTER_ASSO_CODE.name(), po.getManufactureMasterAssoCode()); 
		sqlWhere.add(ManufactureLunchboxMaterialPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name(), po.getMaterialMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
