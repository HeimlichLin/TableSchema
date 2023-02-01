package com.doc.common.dao.impl; 
 
public class ManufactureProductdayDAOImpl extends GeneralDAOImpl<ManufactureProductdayPo> implements ManufactureProductdayDAO { 
	public static final ManufactureProductdayDAOImpl INSTANCE = new ManufactureProductdayDAOImpl(); 
	public static final String TABLENAME = "MANUFACTURE_PRODUCTDAY"; 

	public ManufactureProductdayDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ManufactureProductdayPo> CONVERTER = new MapConverter<ManufactureProductdayPo>() { 
 
		@Override 
		public ManufactureProductdayPo convert(final DataObject dataObject) { 
			final ManufactureProductdayPo manufactureProductdayPo = new ManufactureProductdayPo(); 
			manufactureProductdayPo.setManufactureDateIdenCode(dataObject.getString(ManufactureProductdayPo.COLUMNS.MANUFACTURE_DATE_IDEN_CODE.name())); 
			manufactureProductdayPo.setManufactureMasterAssoCode(dataObject.getString(ManufactureProductdayPo.COLUMNS.MANUFACTURE_MASTER_ASSO_CODE.name())); 
			manufactureProductdayPo.setManufactureDay(dataObject.getString(ManufactureProductdayPo.COLUMNS.MANUFACTURE_DAY.name())); 
			manufactureProductdayPo.setExpiryDay(dataObject.getString(ManufactureProductdayPo.COLUMNS.EXPIRY_DAY.name())); 
			return manufactureProductdayPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ManufactureProductdayPo manufactureProductdayPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ManufactureProductdayPo.COLUMNS.MANUFACTURE_DATE_IDEN_CODE.name(), manufactureProductdayPo.getManufactureDateIdenCode()); 
			dataObject.setValue(ManufactureProductdayPo.COLUMNS.MANUFACTURE_MASTER_ASSO_CODE.name(), manufactureProductdayPo.getManufactureMasterAssoCode()); 
			dataObject.setValue(ManufactureProductdayPo.COLUMNS.MANUFACTURE_DAY.name(), manufactureProductdayPo.getManufactureDay()); 
			dataObject.setValue(ManufactureProductdayPo.COLUMNS.EXPIRY_DAY.name(), manufactureProductdayPo.getExpiryDay()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ManufactureProductdayPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ManufactureProductdayPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ManufactureProductdayPo.COLUMNS.MANUFACTURE_DATE_IDEN_CODE.name(), po.getManufactureDateIdenCode()); 
		sqlWhere.add(ManufactureProductdayPo.COLUMNS.MANUFACTURE_MASTER_ASSO_CODE.name(), po.getManufactureMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
