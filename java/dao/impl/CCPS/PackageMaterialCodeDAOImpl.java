package com.doc.common.dao.impl; 
 
public class PackageMaterialCodeDAOImpl extends GeneralDAOImpl<PackageMaterialCodePo> implements PackageMaterialCodeDAO { 
	public static final PackageMaterialCodeDAOImpl INSTANCE = new PackageMaterialCodeDAOImpl(); 
	public static final String TABLENAME = "PACKAGE_MATERIAL_CODE"; 

	public PackageMaterialCodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PackageMaterialCodePo> CONVERTER = new MapConverter<PackageMaterialCodePo>() { 
 
		@Override 
		public PackageMaterialCodePo convert(final DataObject dataObject) { 
			final PackageMaterialCodePo packageMaterialCodePo = new PackageMaterialCodePo(); 
			packageMaterialCodePo.setPackageMaterialCode(dataObject.getString(PackageMaterialCodePo.COLUMNS.PACKAGE_MATERIAL_CODE.name())); 
			packageMaterialCodePo.setPackageMaterialName(dataObject.getString(PackageMaterialCodePo.COLUMNS.PACKAGE_MATERIAL_NAME.name())); 
			packageMaterialCodePo.setPackageMaterialDescription(dataObject.getString(PackageMaterialCodePo.COLUMNS.PACKAGE_MATERIAL_DESCRIPTION.name())); 
			return packageMaterialCodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PackageMaterialCodePo packageMaterialCodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PackageMaterialCodePo.COLUMNS.PACKAGE_MATERIAL_CODE.name(), packageMaterialCodePo.getPackageMaterialCode()); 
			dataObject.setValue(PackageMaterialCodePo.COLUMNS.PACKAGE_MATERIAL_NAME.name(), packageMaterialCodePo.getPackageMaterialName()); 
			dataObject.setValue(PackageMaterialCodePo.COLUMNS.PACKAGE_MATERIAL_DESCRIPTION.name(), packageMaterialCodePo.getPackageMaterialDescription()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PackageMaterialCodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PackageMaterialCodePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(PackageMaterialCodePo.COLUMNS.PACKAGE_MATERIAL_CODE.name(), po.getPackageMaterialCode()); 
		sqlWhere.add(PackageMaterialCodePo.COLUMNS.PACKAGE_MATERIAL_NAME.name(), po.getPackageMaterialName()); 
		return sqlWhere; 
	} 
 
} 
