package com.doc.common.dao.impl; 
 
public class Logstdby$eventsDAOImpl extends GeneralDAOImpl<Logstdby$eventsPo> implements ILogstdby$eventsDAO { 
	public static final Logstdby$eventsDAOImpl INSTANCE = new Logstdby$eventsDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$EVENTS"; 

	public Logstdby$eventsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$eventsPo> CONVERTER = new MapConverter<Logstdby$eventsPo>() { 
 
		@Override 
		public Logstdby$eventsPo convert(final DataObject dataObject) { 
			final Logstdby$eventsPo logstdby$eventsPo = new Logstdby$eventsPo(); 
			logstdby$eventsPo.setEventTime(); 
			logstdby$eventsPo.setCurrentScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$eventsPo.COLUMNS.CURRENT_SCN.name()))); 
			logstdby$eventsPo.setCommitScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$eventsPo.COLUMNS.COMMIT_SCN.name()))); 
			logstdby$eventsPo.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$eventsPo.COLUMNS.XIDUSN.name()))); 
			logstdby$eventsPo.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$eventsPo.COLUMNS.XIDSLT.name()))); 
			logstdby$eventsPo.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$eventsPo.COLUMNS.XIDSQN.name()))); 
			logstdby$eventsPo.setErrval(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$eventsPo.COLUMNS.ERRVAL.name()))); 
			logstdby$eventsPo.setEvent(dataObject.getString(Logstdby$eventsPo.COLUMNS.EVENT.name())); 
			logstdby$eventsPo.setFullEvent(); 
			logstdby$eventsPo.setError(dataObject.getString(Logstdby$eventsPo.COLUMNS.ERROR.name())); 
			logstdby$eventsPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$eventsPo.COLUMNS.SPARE1.name()))); 
			logstdby$eventsPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$eventsPo.COLUMNS.SPARE2.name()))); 
			logstdby$eventsPo.setSpare3(dataObject.getString(Logstdby$eventsPo.COLUMNS.SPARE3.name())); 
			return logstdby$eventsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$eventsPo logstdby$eventsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.EVENT_TIME.name(), logstdby$eventsPo.getEventTime()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.CURRENT_SCN.name(), logstdby$eventsPo.getCurrentScn()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.COMMIT_SCN.name(), logstdby$eventsPo.getCommitScn()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.XIDUSN.name(), logstdby$eventsPo.getXidusn()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.XIDSLT.name(), logstdby$eventsPo.getXidslt()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.XIDSQN.name(), logstdby$eventsPo.getXidsqn()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.ERRVAL.name(), logstdby$eventsPo.getErrval()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.EVENT.name(), logstdby$eventsPo.getEvent()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.FULL_EVENT.name(), logstdby$eventsPo.getFullEvent()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.ERROR.name(), logstdby$eventsPo.getError()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.SPARE1.name(), logstdby$eventsPo.getSpare1()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.SPARE2.name(), logstdby$eventsPo.getSpare2()); 
			dataObject.setValue(Logstdby$eventsPo.COLUMNS.SPARE3.name(), logstdby$eventsPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$eventsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$eventsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
