package com.doc.common.dao.impl; 
 
public class Ehu4olapDAOImpl extends GeneralDAOImpl<Ehu4olapPo> implements Ehu4olapDAO { 
	public static final Ehu4olapDAOImpl INSTANCE = new Ehu4olapDAOImpl(); 
	public static final String TABLENAME = "EHU4OLAP"; 

	public Ehu4olapDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Ehu4olapPo> CONVERTER = new MapConverter<Ehu4olapPo>() { 
 
		@Override 
		public Ehu4olapPo convert(final DataObject dataObject) { 
			final Ehu4olapPo ehu4olapPo = new Ehu4olapPo(); 
			ehu4olapPo.setCargoLocation(dataObject.getString(Ehu4olapPo.COLUMNS.CARGO_LOCATION.name())); 
			ehu4olapPo.setLocalType(dataObject.getString(Ehu4olapPo.COLUMNS.LOCAL_TYPE.name())); 
			ehu4olapPo.setDataType(dataObject.getString(Ehu4olapPo.COLUMNS.DATA_TYPE.name())); 
			ehu4olapPo.setDataDate(dataObject.getString(Ehu4olapPo.COLUMNS.DATA_DATE.name())); 
			ehu4olapPo.setCusType(dataObject.getString(Ehu4olapPo.COLUMNS.CUS_TYPE.name())); 
			ehu4olapPo.setCusNo(dataObject.getString(Ehu4olapPo.COLUMNS.CUS_NO.name())); 
			ehu4olapPo.setAmount(BigDecimalUtils.formObj(dataObject.getValue(Ehu4olapPo.COLUMNS.AMOUNT.name()))); 
			ehu4olapPo.setWet(BigDecimalUtils.formObj(dataObject.getValue(Ehu4olapPo.COLUMNS.WET.name()))); 
			ehu4olapPo.setPcs(BigDecimalUtils.formObj(dataObject.getValue(Ehu4olapPo.COLUMNS.PCS.name()))); 
			ehu4olapPo.setCount(BigDecimalUtils.formObj(dataObject.getValue(Ehu4olapPo.COLUMNS.COUNT.name()))); 
			ehu4olapPo.setLastupdate(TimestampUtils.of(dataObject.getValue(Ehu4olapPo.COLUMNS.LASTUPDATE.name()))); 
			return ehu4olapPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Ehu4olapPo ehu4olapPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.CARGO_LOCATION.name(), ehu4olapPo.getCargoLocation()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.LOCAL_TYPE.name(), ehu4olapPo.getLocalType()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.DATA_TYPE.name(), ehu4olapPo.getDataType()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.DATA_DATE.name(), ehu4olapPo.getDataDate()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.CUS_TYPE.name(), ehu4olapPo.getCusType()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.CUS_NO.name(), ehu4olapPo.getCusNo()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.AMOUNT.name(), ehu4olapPo.getAmount()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.WET.name(), ehu4olapPo.getWet()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.PCS.name(), ehu4olapPo.getPcs()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.COUNT.name(), ehu4olapPo.getCount()); 
			dataObject.setValue(Ehu4olapPo.COLUMNS.LASTUPDATE.name(), ehu4olapPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Ehu4olapPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Ehu4olapPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
