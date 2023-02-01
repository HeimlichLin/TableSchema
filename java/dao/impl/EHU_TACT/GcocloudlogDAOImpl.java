package com.doc.common.dao.impl; 
 
public class GcocloudlogDAOImpl extends GeneralDAOImpl<GcocloudlogPo> implements GcocloudlogDAO { 
	public static final GcocloudlogDAOImpl INSTANCE = new GcocloudlogDAOImpl(); 
	public static final String TABLENAME = "GCOCLOUDLOG"; 

	public GcocloudlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcocloudlogPo> CONVERTER = new MapConverter<GcocloudlogPo>() { 
 
		@Override 
		public GcocloudlogPo convert(final DataObject dataObject) { 
			final GcocloudlogPo gcocloudlogPo = new GcocloudlogPo(); 
			gcocloudlogPo.setIe(dataObject.getString(GcocloudlogPo.COLUMNS.IE.name())); 
			gcocloudlogPo.setWhIo(dataObject.getString(GcocloudlogPo.COLUMNS.WH_IO.name())); 
			gcocloudlogPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(GcocloudlogPo.COLUMNS.SN.name()))); 
			gcocloudlogPo.setLogDate(dataObject.getString(GcocloudlogPo.COLUMNS.LOG_DATE.name())); 
			gcocloudlogPo.setHwbBag(dataObject.getString(GcocloudlogPo.COLUMNS.HWB_BAG.name())); 
			gcocloudlogPo.setMwb(dataObject.getString(GcocloudlogPo.COLUMNS.MWB.name())); 
			gcocloudlogPo.setLogType(dataObject.getString(GcocloudlogPo.COLUMNS.LOG_TYPE.name())); 
			gcocloudlogPo.setLogStatus(dataObject.getString(GcocloudlogPo.COLUMNS.LOG_STATUS.name())); 
			gcocloudlogPo.setLogNote1(dataObject.getString(GcocloudlogPo.COLUMNS.LOG_NOTE1.name())); 
			gcocloudlogPo.setLogNote2(dataObject.getString(GcocloudlogPo.COLUMNS.LOG_NOTE2.name())); 
			gcocloudlogPo.setCrtDate(TimestampUtils.of(dataObject.getValue(GcocloudlogPo.COLUMNS.CRT_DATE.name()))); 
			return gcocloudlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcocloudlogPo gcocloudlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.IE.name(), gcocloudlogPo.getIe()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.WH_IO.name(), gcocloudlogPo.getWhIo()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.SN.name(), gcocloudlogPo.getSn()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.LOG_DATE.name(), gcocloudlogPo.getLogDate()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.HWB_BAG.name(), gcocloudlogPo.getHwbBag()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.MWB.name(), gcocloudlogPo.getMwb()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.LOG_TYPE.name(), gcocloudlogPo.getLogType()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.LOG_STATUS.name(), gcocloudlogPo.getLogStatus()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.LOG_NOTE1.name(), gcocloudlogPo.getLogNote1()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.LOG_NOTE2.name(), gcocloudlogPo.getLogNote2()); 
			dataObject.setValue(GcocloudlogPo.COLUMNS.CRT_DATE.name(), gcocloudlogPo.getCrtDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcocloudlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcocloudlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
