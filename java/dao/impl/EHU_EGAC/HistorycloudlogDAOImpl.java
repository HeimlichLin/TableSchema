package com.doc.common.dao.impl; 
 
public class HistorycloudlogDAOImpl extends GeneralDAOImpl<HistorycloudlogPo> implements HistorycloudlogDAO { 
	public static final HistorycloudlogDAOImpl INSTANCE = new HistorycloudlogDAOImpl(); 
	public static final String TABLENAME = "HISTORYCLOUDLOG"; 

	public HistorycloudlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistorycloudlogPo> CONVERTER = new MapConverter<HistorycloudlogPo>() { 
 
		@Override 
		public HistorycloudlogPo convert(final DataObject dataObject) { 
			final HistorycloudlogPo historycloudlogPo = new HistorycloudlogPo(); 
			historycloudlogPo.setIe(dataObject.getString(HistorycloudlogPo.COLUMNS.IE.name())); 
			historycloudlogPo.setWhIo(dataObject.getString(HistorycloudlogPo.COLUMNS.WH_IO.name())); 
			historycloudlogPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudlogPo.COLUMNS.SN.name()))); 
			historycloudlogPo.setLogDate(dataObject.getString(HistorycloudlogPo.COLUMNS.LOG_DATE.name())); 
			historycloudlogPo.setHwbBag(dataObject.getString(HistorycloudlogPo.COLUMNS.HWB_BAG.name())); 
			historycloudlogPo.setMwb(dataObject.getString(HistorycloudlogPo.COLUMNS.MWB.name())); 
			historycloudlogPo.setLogType(dataObject.getString(HistorycloudlogPo.COLUMNS.LOG_TYPE.name())); 
			historycloudlogPo.setLogStatus(dataObject.getString(HistorycloudlogPo.COLUMNS.LOG_STATUS.name())); 
			historycloudlogPo.setLogNote1(dataObject.getString(HistorycloudlogPo.COLUMNS.LOG_NOTE1.name())); 
			historycloudlogPo.setLogNote2(dataObject.getString(HistorycloudlogPo.COLUMNS.LOG_NOTE2.name())); 
			historycloudlogPo.setCrtDate(TimestampUtils.of(dataObject.getValue(HistorycloudlogPo.COLUMNS.CRT_DATE.name()))); 
			return historycloudlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistorycloudlogPo historycloudlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.IE.name(), historycloudlogPo.getIe()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.WH_IO.name(), historycloudlogPo.getWhIo()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.SN.name(), historycloudlogPo.getSn()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.LOG_DATE.name(), historycloudlogPo.getLogDate()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.HWB_BAG.name(), historycloudlogPo.getHwbBag()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.MWB.name(), historycloudlogPo.getMwb()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.LOG_TYPE.name(), historycloudlogPo.getLogType()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.LOG_STATUS.name(), historycloudlogPo.getLogStatus()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.LOG_NOTE1.name(), historycloudlogPo.getLogNote1()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.LOG_NOTE2.name(), historycloudlogPo.getLogNote2()); 
			dataObject.setValue(HistorycloudlogPo.COLUMNS.CRT_DATE.name(), historycloudlogPo.getCrtDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistorycloudlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistorycloudlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
