package com.doc.common.dao.impl; 
 
public class CarequipdescDAOImpl extends GeneralDAOImpl<CarequipdescPo> implements CarequipdescDAO { 
	public static final CarequipdescDAOImpl INSTANCE = new CarequipdescDAOImpl(); 
	public static final String TABLENAME = "CAREQUIPDESC"; 

	public CarequipdescDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CarequipdescPo> CONVERTER = new MapConverter<CarequipdescPo>() { 
 
		@Override 
		public CarequipdescPo convert(final DataObject dataObject) { 
			final CarequipdescPo carequipdescPo = new CarequipdescPo(); 
			carequipdescPo.setRpttype(dataObject.getString(CarequipdescPo.COLUMNS.RPTTYPE.name())); 
			carequipdescPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(CarequipdescPo.COLUMNS.ITEMNO.name()))); 
			carequipdescPo.setDescrip(dataObject.getString(CarequipdescPo.COLUMNS.DESCRIP.name())); 
			carequipdescPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(CarequipdescPo.COLUMNS.ITEM.name()))); 
			return carequipdescPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CarequipdescPo carequipdescPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CarequipdescPo.COLUMNS.RPTTYPE.name(), carequipdescPo.getRpttype()); 
			dataObject.setValue(CarequipdescPo.COLUMNS.ITEMNO.name(), carequipdescPo.getItemno()); 
			dataObject.setValue(CarequipdescPo.COLUMNS.DESCRIP.name(), carequipdescPo.getDescrip()); 
			dataObject.setValue(CarequipdescPo.COLUMNS.ITEM.name(), carequipdescPo.getItem()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CarequipdescPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CarequipdescPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
