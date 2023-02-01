package com.doc.common.dao.impl; 
 
public class Logstdby$historyDAOImpl extends GeneralDAOImpl<Logstdby$historyPo> implements ILogstdby$historyDAO { 
	public static final Logstdby$historyDAOImpl INSTANCE = new Logstdby$historyDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$HISTORY"; 

	public Logstdby$historyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$historyPo> CONVERTER = new MapConverter<Logstdby$historyPo>() { 
 
		@Override 
		public Logstdby$historyPo convert(final DataObject dataObject) { 
			final Logstdby$historyPo logstdby$historyPo = new Logstdby$historyPo(); 
			logstdby$historyPo.setStreamSequence#(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.STREAM_SEQUENCE#.name()))); 
			logstdby$historyPo.setLmnrSid(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.LMNR_SID.name()))); 
			logstdby$historyPo.setDbid(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.DBID.name()))); 
			logstdby$historyPo.setFirstChange#(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.FIRST_CHANGE#.name()))); 
			logstdby$historyPo.setLastChange#(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.LAST_CHANGE#.name()))); 
			logstdby$historyPo.setSource(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.SOURCE.name()))); 
			logstdby$historyPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.STATUS.name()))); 
			logstdby$historyPo.setFirstTime(TimestampUtils.of(dataObject.getValue(Logstdby$historyPo.COLUMNS.FIRST_TIME.name()))); 
			logstdby$historyPo.setLastTime(TimestampUtils.of(dataObject.getValue(Logstdby$historyPo.COLUMNS.LAST_TIME.name()))); 
			logstdby$historyPo.setDgname(dataObject.getString(Logstdby$historyPo.COLUMNS.DGNAME.name())); 
			logstdby$historyPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.SPARE1.name()))); 
			logstdby$historyPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$historyPo.COLUMNS.SPARE2.name()))); 
			logstdby$historyPo.setSpare3(dataObject.getString(Logstdby$historyPo.COLUMNS.SPARE3.name())); 
			return logstdby$historyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$historyPo logstdby$historyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.STREAM_SEQUENCE#.name(), logstdby$historyPo.getStreamSequence#()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.LMNR_SID.name(), logstdby$historyPo.getLmnrSid()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.DBID.name(), logstdby$historyPo.getDbid()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.FIRST_CHANGE#.name(), logstdby$historyPo.getFirstChange#()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.LAST_CHANGE#.name(), logstdby$historyPo.getLastChange#()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.SOURCE.name(), logstdby$historyPo.getSource()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.STATUS.name(), logstdby$historyPo.getStatus()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.FIRST_TIME.name(), logstdby$historyPo.getFirstTime()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.LAST_TIME.name(), logstdby$historyPo.getLastTime()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.DGNAME.name(), logstdby$historyPo.getDgname()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.SPARE1.name(), logstdby$historyPo.getSpare1()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.SPARE2.name(), logstdby$historyPo.getSpare2()); 
			dataObject.setValue(Logstdby$historyPo.COLUMNS.SPARE3.name(), logstdby$historyPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$historyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$historyPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
