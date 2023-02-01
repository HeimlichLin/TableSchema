package com.doc.common.dao.impl; 
 
public class CarryDAOImpl extends GeneralDAOImpl<CarryPo> implements CarryDAO { 
	public static final CarryDAOImpl INSTANCE = new CarryDAOImpl(); 
	public static final String TABLENAME = "CARRY"; 

	public CarryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CarryPo> CONVERTER = new MapConverter<CarryPo>() { 
 
		@Override 
		public CarryPo convert(final DataObject dataObject) { 
			final CarryPo carryPo = new CarryPo(); 
			carryPo.setBondno(dataObject.getString(CarryPo.COLUMNS.BONDNO.name())); 
			carryPo.setDeclno(dataObject.getString(CarryPo.COLUMNS.DECLNO.name())); 
			carryPo.setUpdtime(dataObject.getString(CarryPo.COLUMNS.UPDTIME.name())); 
			carryPo.setCarryno(dataObject.getString(CarryPo.COLUMNS.CARRYNO.name())); 
			carryPo.setStrtype(dataObject.getString(CarryPo.COLUMNS.STRTYPE.name())); 
			return carryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CarryPo carryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CarryPo.COLUMNS.BONDNO.name(), carryPo.getBondno()); 
			dataObject.setValue(CarryPo.COLUMNS.DECLNO.name(), carryPo.getDeclno()); 
			dataObject.setValue(CarryPo.COLUMNS.UPDTIME.name(), carryPo.getUpdtime()); 
			dataObject.setValue(CarryPo.COLUMNS.CARRYNO.name(), carryPo.getCarryno()); 
			dataObject.setValue(CarryPo.COLUMNS.STRTYPE.name(), carryPo.getStrtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CarryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CarryPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(CarryPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(CarryPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(CarryPo.COLUMNS.CARRYNO.name(), po.getCarryno()); 
		sqlWhere.add(CarryPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		return sqlWhere; 
	} 
 
} 
