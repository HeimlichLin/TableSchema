package com.doc.common.dao.impl; 
 
public class TempgcocloudlogDAOImpl extends GeneralDAOImpl<TempgcocloudlogPo> implements TempgcocloudlogDAO { 
	public static final TempgcocloudlogDAOImpl INSTANCE = new TempgcocloudlogDAOImpl(); 
	public static final String TABLENAME = "TEMPGCOCLOUDLOG"; 

	public TempgcocloudlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempgcocloudlogPo> CONVERTER = new MapConverter<TempgcocloudlogPo>() { 
 
		@Override 
		public TempgcocloudlogPo convert(final DataObject dataObject) { 
			final TempgcocloudlogPo tempgcocloudlogPo = new TempgcocloudlogPo(); 
			tempgcocloudlogPo.setIe(dataObject.getString(TempgcocloudlogPo.COLUMNS.IE.name())); 
			tempgcocloudlogPo.setWhIo(dataObject.getString(TempgcocloudlogPo.COLUMNS.WH_IO.name())); 
			tempgcocloudlogPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(TempgcocloudlogPo.COLUMNS.SN.name()))); 
			tempgcocloudlogPo.setLogDate(dataObject.getString(TempgcocloudlogPo.COLUMNS.LOG_DATE.name())); 
			tempgcocloudlogPo.setHwbBag(dataObject.getString(TempgcocloudlogPo.COLUMNS.HWB_BAG.name())); 
			tempgcocloudlogPo.setMwb(dataObject.getString(TempgcocloudlogPo.COLUMNS.MWB.name())); 
			tempgcocloudlogPo.setLogType(dataObject.getString(TempgcocloudlogPo.COLUMNS.LOG_TYPE.name())); 
			tempgcocloudlogPo.setLogStatus(dataObject.getString(TempgcocloudlogPo.COLUMNS.LOG_STATUS.name())); 
			tempgcocloudlogPo.setLogNote1(dataObject.getString(TempgcocloudlogPo.COLUMNS.LOG_NOTE1.name())); 
			tempgcocloudlogPo.setLogNote2(dataObject.getString(TempgcocloudlogPo.COLUMNS.LOG_NOTE2.name())); 
			tempgcocloudlogPo.setCrtDate(TimestampUtils.of(dataObject.getValue(TempgcocloudlogPo.COLUMNS.CRT_DATE.name()))); 
			return tempgcocloudlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempgcocloudlogPo tempgcocloudlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.IE.name(), tempgcocloudlogPo.getIe()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.WH_IO.name(), tempgcocloudlogPo.getWhIo()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.SN.name(), tempgcocloudlogPo.getSn()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.LOG_DATE.name(), tempgcocloudlogPo.getLogDate()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.HWB_BAG.name(), tempgcocloudlogPo.getHwbBag()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.MWB.name(), tempgcocloudlogPo.getMwb()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.LOG_TYPE.name(), tempgcocloudlogPo.getLogType()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.LOG_STATUS.name(), tempgcocloudlogPo.getLogStatus()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.LOG_NOTE1.name(), tempgcocloudlogPo.getLogNote1()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.LOG_NOTE2.name(), tempgcocloudlogPo.getLogNote2()); 
			dataObject.setValue(TempgcocloudlogPo.COLUMNS.CRT_DATE.name(), tempgcocloudlogPo.getCrtDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempgcocloudlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempgcocloudlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
