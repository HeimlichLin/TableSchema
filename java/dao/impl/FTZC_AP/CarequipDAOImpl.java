package com.doc.common.dao.impl; 
 
public class CarequipDAOImpl extends GeneralDAOImpl<CarequipPo> implements CarequipDAO { 
	public static final CarequipDAOImpl INSTANCE = new CarequipDAOImpl(); 
	public static final String TABLENAME = "CAREQUIP"; 

	public CarequipDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CarequipPo> CONVERTER = new MapConverter<CarequipPo>() { 
 
		@Override 
		public CarequipPo convert(final DataObject dataObject) { 
			final CarequipPo carequipPo = new CarequipPo(); 
			carequipPo.setRpttype(dataObject.getString(CarequipPo.COLUMNS.RPTTYPE.name())); 
			carequipPo.setCartype(dataObject.getString(CarequipPo.COLUMNS.CARTYPE.name())); 
			carequipPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(CarequipPo.COLUMNS.ITEMNO.name()))); 
			carequipPo.setContents(dataObject.getString(CarequipPo.COLUMNS.CONTENTS.name())); 
			carequipPo.setDeclno(dataObject.getString(CarequipPo.COLUMNS.DECLNO.name())); 
			carequipPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(CarequipPo.COLUMNS.ITEM.name()))); 
			return carequipPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CarequipPo carequipPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CarequipPo.COLUMNS.RPTTYPE.name(), carequipPo.getRpttype()); 
			dataObject.setValue(CarequipPo.COLUMNS.CARTYPE.name(), carequipPo.getCartype()); 
			dataObject.setValue(CarequipPo.COLUMNS.ITEMNO.name(), carequipPo.getItemno()); 
			dataObject.setValue(CarequipPo.COLUMNS.CONTENTS.name(), carequipPo.getContents()); 
			dataObject.setValue(CarequipPo.COLUMNS.DECLNO.name(), carequipPo.getDeclno()); 
			dataObject.setValue(CarequipPo.COLUMNS.ITEM.name(), carequipPo.getItem()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CarequipPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CarequipPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
