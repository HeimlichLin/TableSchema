package com.doc.common.dao.impl; 
 
public class DutyexchangeTestDAOImpl extends GeneralDAOImpl<DutyexchangeTestPo> implements DutyexchangeTestDAO { 
	public static final DutyexchangeTestDAOImpl INSTANCE = new DutyexchangeTestDAOImpl(); 
	public static final String TABLENAME = "DUTYEXCHANGE_TEST"; 

	public DutyexchangeTestDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DutyexchangeTestPo> CONVERTER = new MapConverter<DutyexchangeTestPo>() { 
 
		@Override 
		public DutyexchangeTestPo convert(final DataObject dataObject) { 
			final DutyexchangeTestPo dutyexchangeTestPo = new DutyexchangeTestPo(); 
			dutyexchangeTestPo.setReadytime(TimestampUtils.of(dataObject.getValue(DutyexchangeTestPo.COLUMNS.READYTIME.name()))); 
			dutyexchangeTestPo.setMwb(dataObject.getString(DutyexchangeTestPo.COLUMNS.MWB.name())); 
			dutyexchangeTestPo.setHwb(dataObject.getString(DutyexchangeTestPo.COLUMNS.HWB.name())); 
			dutyexchangeTestPo.setGcodate(TimestampUtils.of(dataObject.getValue(DutyexchangeTestPo.COLUMNS.GCODATE.name()))); 
			dutyexchangeTestPo.setExpressid(dataObject.getString(DutyexchangeTestPo.COLUMNS.EXPRESSID.name())); 
			dutyexchangeTestPo.setBoxno(dataObject.getString(DutyexchangeTestPo.COLUMNS.BOXNO.name())); 
			dutyexchangeTestPo.setTransind(dataObject.getString(DutyexchangeTestPo.COLUMNS.TRANSIND.name())); 
			return dutyexchangeTestPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DutyexchangeTestPo dutyexchangeTestPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DutyexchangeTestPo.COLUMNS.READYTIME.name(), dutyexchangeTestPo.getReadytime()); 
			dataObject.setValue(DutyexchangeTestPo.COLUMNS.MWB.name(), dutyexchangeTestPo.getMwb()); 
			dataObject.setValue(DutyexchangeTestPo.COLUMNS.HWB.name(), dutyexchangeTestPo.getHwb()); 
			dataObject.setValue(DutyexchangeTestPo.COLUMNS.GCODATE.name(), dutyexchangeTestPo.getGcodate()); 
			dataObject.setValue(DutyexchangeTestPo.COLUMNS.EXPRESSID.name(), dutyexchangeTestPo.getExpressid()); 
			dataObject.setValue(DutyexchangeTestPo.COLUMNS.BOXNO.name(), dutyexchangeTestPo.getBoxno()); 
			dataObject.setValue(DutyexchangeTestPo.COLUMNS.TRANSIND.name(), dutyexchangeTestPo.getTransind()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DutyexchangeTestPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DutyexchangeTestPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
