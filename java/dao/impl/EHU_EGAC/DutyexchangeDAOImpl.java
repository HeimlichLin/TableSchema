package com.doc.common.dao.impl; 
 
public class DutyexchangeDAOImpl extends GeneralDAOImpl<DutyexchangePo> implements DutyexchangeDAO { 
	public static final DutyexchangeDAOImpl INSTANCE = new DutyexchangeDAOImpl(); 
	public static final String TABLENAME = "DUTYEXCHANGE"; 

	public DutyexchangeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DutyexchangePo> CONVERTER = new MapConverter<DutyexchangePo>() { 
 
		@Override 
		public DutyexchangePo convert(final DataObject dataObject) { 
			final DutyexchangePo dutyexchangePo = new DutyexchangePo(); 
			dutyexchangePo.setReadytime(TimestampUtils.of(dataObject.getValue(DutyexchangePo.COLUMNS.READYTIME.name()))); 
			dutyexchangePo.setMwb(dataObject.getString(DutyexchangePo.COLUMNS.MWB.name())); 
			dutyexchangePo.setHwb(dataObject.getString(DutyexchangePo.COLUMNS.HWB.name())); 
			dutyexchangePo.setGcodate(TimestampUtils.of(dataObject.getValue(DutyexchangePo.COLUMNS.GCODATE.name()))); 
			dutyexchangePo.setExpressid(dataObject.getString(DutyexchangePo.COLUMNS.EXPRESSID.name())); 
			dutyexchangePo.setBoxno(dataObject.getString(DutyexchangePo.COLUMNS.BOXNO.name())); 
			dutyexchangePo.setTransind(dataObject.getString(DutyexchangePo.COLUMNS.TRANSIND.name())); 
			return dutyexchangePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DutyexchangePo dutyexchangePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DutyexchangePo.COLUMNS.READYTIME.name(), dutyexchangePo.getReadytime()); 
			dataObject.setValue(DutyexchangePo.COLUMNS.MWB.name(), dutyexchangePo.getMwb()); 
			dataObject.setValue(DutyexchangePo.COLUMNS.HWB.name(), dutyexchangePo.getHwb()); 
			dataObject.setValue(DutyexchangePo.COLUMNS.GCODATE.name(), dutyexchangePo.getGcodate()); 
			dataObject.setValue(DutyexchangePo.COLUMNS.EXPRESSID.name(), dutyexchangePo.getExpressid()); 
			dataObject.setValue(DutyexchangePo.COLUMNS.BOXNO.name(), dutyexchangePo.getBoxno()); 
			dataObject.setValue(DutyexchangePo.COLUMNS.TRANSIND.name(), dutyexchangePo.getTransind()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DutyexchangePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DutyexchangePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
