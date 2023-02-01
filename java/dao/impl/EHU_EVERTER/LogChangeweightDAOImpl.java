package com.doc.common.dao.impl; 
 
public class LogChangeweightDAOImpl extends GeneralDAOImpl<LogChangeweightPo> implements LogChangeweightDAO { 
	public static final LogChangeweightDAOImpl INSTANCE = new LogChangeweightDAOImpl(); 
	public static final String TABLENAME = "LOG_CHANGEWEIGHT"; 

	public LogChangeweightDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogChangeweightPo> CONVERTER = new MapConverter<LogChangeweightPo>() { 
 
		@Override 
		public LogChangeweightPo convert(final DataObject dataObject) { 
			final LogChangeweightPo logChangeweightPo = new LogChangeweightPo(); 
			logChangeweightPo.setMwb(dataObject.getString(LogChangeweightPo.COLUMNS.MWB.name())); 
			logChangeweightPo.setHwb(dataObject.getString(LogChangeweightPo.COLUMNS.HWB.name())); 
			logChangeweightPo.setExpbagno(dataObject.getString(LogChangeweightPo.COLUMNS.EXPBAGNO.name())); 
			logChangeweightPo.setWeight1(BigDecimalUtils.formObj(dataObject.getValue(LogChangeweightPo.COLUMNS.WEIGHT1.name()))); 
			logChangeweightPo.setWeight2(BigDecimalUtils.formObj(dataObject.getValue(LogChangeweightPo.COLUMNS.WEIGHT2.name()))); 
			logChangeweightPo.setReason(dataObject.getString(LogChangeweightPo.COLUMNS.REASON.name())); 
			logChangeweightPo.setWs(dataObject.getString(LogChangeweightPo.COLUMNS.WS.name())); 
			logChangeweightPo.setUserid(dataObject.getString(LogChangeweightPo.COLUMNS.USERID.name())); 
			logChangeweightPo.setTime(TimestampUtils.of(dataObject.getValue(LogChangeweightPo.COLUMNS.TIME.name()))); 
			logChangeweightPo.setIe(dataObject.getString(LogChangeweightPo.COLUMNS.IE.name())); 
			logChangeweightPo.setExpressid(dataObject.getString(LogChangeweightPo.COLUMNS.EXPRESSID.name())); 
			return logChangeweightPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogChangeweightPo logChangeweightPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.MWB.name(), logChangeweightPo.getMwb()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.HWB.name(), logChangeweightPo.getHwb()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.EXPBAGNO.name(), logChangeweightPo.getExpbagno()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.WEIGHT1.name(), logChangeweightPo.getWeight1()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.WEIGHT2.name(), logChangeweightPo.getWeight2()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.REASON.name(), logChangeweightPo.getReason()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.WS.name(), logChangeweightPo.getWs()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.USERID.name(), logChangeweightPo.getUserid()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.TIME.name(), logChangeweightPo.getTime()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.IE.name(), logChangeweightPo.getIe()); 
			dataObject.setValue(LogChangeweightPo.COLUMNS.EXPRESSID.name(), logChangeweightPo.getExpressid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogChangeweightPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogChangeweightPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
