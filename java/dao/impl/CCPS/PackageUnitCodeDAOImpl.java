package com.doc.common.dao.impl; 
 
public class PackageUnitCodeDAOImpl extends GeneralDAOImpl<PackageUnitCodePo> implements PackageUnitCodeDAO { 
	public static final PackageUnitCodeDAOImpl INSTANCE = new PackageUnitCodeDAOImpl(); 
	public static final String TABLENAME = "PACKAGE_UNIT_CODE"; 

	public PackageUnitCodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PackageUnitCodePo> CONVERTER = new MapConverter<PackageUnitCodePo>() { 
 
		@Override 
		public PackageUnitCodePo convert(final DataObject dataObject) { 
			final PackageUnitCodePo packageUnitCodePo = new PackageUnitCodePo(); 
			packageUnitCodePo.setPackageUnitCode(dataObject.getString(PackageUnitCodePo.COLUMNS.PACKAGE_UNIT_CODE.name())); 
			packageUnitCodePo.setPackageUnitName(dataObject.getString(PackageUnitCodePo.COLUMNS.PACKAGE_UNIT_NAME.name())); 
			return packageUnitCodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PackageUnitCodePo packageUnitCodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PackageUnitCodePo.COLUMNS.PACKAGE_UNIT_CODE.name(), packageUnitCodePo.getPackageUnitCode()); 
			dataObject.setValue(PackageUnitCodePo.COLUMNS.PACKAGE_UNIT_NAME.name(), packageUnitCodePo.getPackageUnitName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PackageUnitCodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PackageUnitCodePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(PackageUnitCodePo.COLUMNS.PACKAGE_UNIT_CODE.name(), po.getPackageUnitCode()); 
		sqlWhere.add(PackageUnitCodePo.COLUMNS.PACKAGE_UNIT_NAME.name(), po.getPackageUnitName()); 
		return sqlWhere; 
	} 
 
} 
