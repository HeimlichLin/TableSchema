package com.doc.common.dao.impl; 
 
public class Logstdby$applyMilestoneDAOImpl extends GeneralDAOImpl<Logstdby$applyMilestonePo> implements ILogstdby$applyMilestoneDAO { 
	public static final Logstdby$applyMilestoneDAOImpl INSTANCE = new Logstdby$applyMilestoneDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$APPLY_MILESTONE"; 

	public Logstdby$applyMilestoneDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$applyMilestonePo> CONVERTER = new MapConverter<Logstdby$applyMilestonePo>() { 
 
		@Override 
		public Logstdby$applyMilestonePo convert(final DataObject dataObject) { 
			final Logstdby$applyMilestonePo logstdby$applyMilestonePo = new Logstdby$applyMilestonePo(); 
			logstdby$applyMilestonePo.setSessionId(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.SESSION_ID.name()))); 
			logstdby$applyMilestonePo.setCommitScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.COMMIT_SCN.name()))); 
			logstdby$applyMilestonePo.setCommitTime(TimestampUtils.of(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.COMMIT_TIME.name()))); 
			logstdby$applyMilestonePo.setSynchScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.SYNCH_SCN.name()))); 
			logstdby$applyMilestonePo.setEpoch(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.EPOCH.name()))); 
			logstdby$applyMilestonePo.setProcessedScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.PROCESSED_SCN.name()))); 
			logstdby$applyMilestonePo.setProcessedTime(TimestampUtils.of(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.PROCESSED_TIME.name()))); 
			logstdby$applyMilestonePo.setFetchlwmScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.FETCHLWM_SCN.name()))); 
			logstdby$applyMilestonePo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.SPARE1.name()))); 
			logstdby$applyMilestonePo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyMilestonePo.COLUMNS.SPARE2.name()))); 
			logstdby$applyMilestonePo.setSpare3(dataObject.getString(Logstdby$applyMilestonePo.COLUMNS.SPARE3.name())); 
			return logstdby$applyMilestonePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$applyMilestonePo logstdby$applyMilestonePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.SESSION_ID.name(), logstdby$applyMilestonePo.getSessionId()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.COMMIT_SCN.name(), logstdby$applyMilestonePo.getCommitScn()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.COMMIT_TIME.name(), logstdby$applyMilestonePo.getCommitTime()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.SYNCH_SCN.name(), logstdby$applyMilestonePo.getSynchScn()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.EPOCH.name(), logstdby$applyMilestonePo.getEpoch()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.PROCESSED_SCN.name(), logstdby$applyMilestonePo.getProcessedScn()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.PROCESSED_TIME.name(), logstdby$applyMilestonePo.getProcessedTime()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.FETCHLWM_SCN.name(), logstdby$applyMilestonePo.getFetchlwmScn()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.SPARE1.name(), logstdby$applyMilestonePo.getSpare1()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.SPARE2.name(), logstdby$applyMilestonePo.getSpare2()); 
			dataObject.setValue(Logstdby$applyMilestonePo.COLUMNS.SPARE3.name(), logstdby$applyMilestonePo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$applyMilestonePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$applyMilestonePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
