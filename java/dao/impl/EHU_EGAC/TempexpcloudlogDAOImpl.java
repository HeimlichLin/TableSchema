package com.doc.common.dao.impl; 
 
public class TempexpcloudlogDAOImpl extends GeneralDAOImpl<TempexpcloudlogPo> implements TempexpcloudlogDAO { 
	public static final TempexpcloudlogDAOImpl INSTANCE = new TempexpcloudlogDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPCLOUDLOG"; 

	public TempexpcloudlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpcloudlogPo> CONVERTER = new MapConverter<TempexpcloudlogPo>() { 
 
		@Override 
		public TempexpcloudlogPo convert(final DataObject dataObject) { 
			final TempexpcloudlogPo tempexpcloudlogPo = new TempexpcloudlogPo(); 
			tempexpcloudlogPo.setIe(dataObject.getString(TempexpcloudlogPo.COLUMNS.IE.name())); 
			tempexpcloudlogPo.setWhIo(dataObject.getString(TempexpcloudlogPo.COLUMNS.WH_IO.name())); 
			tempexpcloudlogPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudlogPo.COLUMNS.SN.name()))); 
			tempexpcloudlogPo.setLogDate(dataObject.getString(TempexpcloudlogPo.COLUMNS.LOG_DATE.name())); 
			tempexpcloudlogPo.setHwbBag(dataObject.getString(TempexpcloudlogPo.COLUMNS.HWB_BAG.name())); 
			tempexpcloudlogPo.setMwb(dataObject.getString(TempexpcloudlogPo.COLUMNS.MWB.name())); 
			tempexpcloudlogPo.setLogType(dataObject.getString(TempexpcloudlogPo.COLUMNS.LOG_TYPE.name())); 
			tempexpcloudlogPo.setLogStatus(dataObject.getString(TempexpcloudlogPo.COLUMNS.LOG_STATUS.name())); 
			tempexpcloudlogPo.setLogNote1(dataObject.getString(TempexpcloudlogPo.COLUMNS.LOG_NOTE1.name())); 
			tempexpcloudlogPo.setLogNote2(dataObject.getString(TempexpcloudlogPo.COLUMNS.LOG_NOTE2.name())); 
			tempexpcloudlogPo.setCrtDate(TimestampUtils.of(dataObject.getValue(TempexpcloudlogPo.COLUMNS.CRT_DATE.name()))); 
			return tempexpcloudlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpcloudlogPo tempexpcloudlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.IE.name(), tempexpcloudlogPo.getIe()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.WH_IO.name(), tempexpcloudlogPo.getWhIo()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.SN.name(), tempexpcloudlogPo.getSn()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.LOG_DATE.name(), tempexpcloudlogPo.getLogDate()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.HWB_BAG.name(), tempexpcloudlogPo.getHwbBag()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.MWB.name(), tempexpcloudlogPo.getMwb()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.LOG_TYPE.name(), tempexpcloudlogPo.getLogType()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.LOG_STATUS.name(), tempexpcloudlogPo.getLogStatus()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.LOG_NOTE1.name(), tempexpcloudlogPo.getLogNote1()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.LOG_NOTE2.name(), tempexpcloudlogPo.getLogNote2()); 
			dataObject.setValue(TempexpcloudlogPo.COLUMNS.CRT_DATE.name(), tempexpcloudlogPo.getCrtDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpcloudlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpcloudlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
