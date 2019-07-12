package com.doc.common.dao.impl; 
 
public class CarryDAOImpl extends GeneralDAOImpl<CarryDo> implements CarryDAOImpl { 
	public static final CarryDAOImpl INSTANCE = new CarryDAOImpl(); 
	public static final String TABLENAME = "CARRY"; 

	public CarryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<CarryDo> CONVERTER = new MapConverter<CarryDo>() { 
 
		@Override 
		public CarryDo convert(final DataObject dataObject) { 
			final CarryDo carryDo = new CarryDo(); 
			carryDo.setBondno(dataObject.getString(CarryDo.COLUMNS.BONDNO.name())); 
			carryDo.setDeclno(dataObject.getString(CarryDo.COLUMNS.DECLNO.name())); 
			carryDo.setUpdtime(dataObject.getString(CarryDo.COLUMNS.UPDTIME.name())); 
			carryDo.setCarryno(dataObject.getString(CarryDo.COLUMNS.CARRYNO.name())); 
			carryDo.setStrtype(dataObject.getString(CarryDo.COLUMNS.STRTYPE.name())); 
			return carryDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CarryDo carryDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CarryDo.COLUMNS.BONDNO.name(), carryDo.getBondno()); 
			dataObject.setValue(CarryDo.COLUMNS.DECLNO.name(), carryDo.getDeclno()); 
			dataObject.setValue(CarryDo.COLUMNS.UPDTIME.name(), carryDo.getUpdtime()); 
			dataObject.setValue(CarryDo.COLUMNS.CARRYNO.name(), carryDo.getCarryno()); 
			dataObject.setValue(CarryDo.COLUMNS.STRTYPE.name(), carryDo.getStrtype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CarryDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CarryDo po) { 
		sqlWhere.add(CarryDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(CarryDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(CarryDo.COLUMNS.CARRYNO.name(), po.getCarryno()); 
		sqlWhere.add(CarryDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
	} 
 
} 
