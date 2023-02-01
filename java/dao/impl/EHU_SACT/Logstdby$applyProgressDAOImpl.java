package com.doc.common.dao.impl; 
 
public class Logstdby$applyProgressDAOImpl extends GeneralDAOImpl<Logstdby$applyProgressPo> implements ILogstdby$applyProgressDAO { 
	public static final Logstdby$applyProgressDAOImpl INSTANCE = new Logstdby$applyProgressDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$APPLY_PROGRESS"; 

	public Logstdby$applyProgressDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$applyProgressPo> CONVERTER = new MapConverter<Logstdby$applyProgressPo>() { 
 
		@Override 
		public Logstdby$applyProgressPo convert(final DataObject dataObject) { 
			final Logstdby$applyProgressPo logstdby$applyProgressPo = new Logstdby$applyProgressPo(); 
			logstdby$applyProgressPo.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyProgressPo.COLUMNS.XIDUSN.name()))); 
			logstdby$applyProgressPo.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyProgressPo.COLUMNS.XIDSLT.name()))); 
			logstdby$applyProgressPo.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyProgressPo.COLUMNS.XIDSQN.name()))); 
			logstdby$applyProgressPo.setCommitScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyProgressPo.COLUMNS.COMMIT_SCN.name()))); 
			logstdby$applyProgressPo.setCommitTime(TimestampUtils.of(dataObject.getValue(Logstdby$applyProgressPo.COLUMNS.COMMIT_TIME.name()))); 
			logstdby$applyProgressPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyProgressPo.COLUMNS.SPARE1.name()))); 
			logstdby$applyProgressPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$applyProgressPo.COLUMNS.SPARE2.name()))); 
			logstdby$applyProgressPo.setSpare3(dataObject.getString(Logstdby$applyProgressPo.COLUMNS.SPARE3.name())); 
			return logstdby$applyProgressPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$applyProgressPo logstdby$applyProgressPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$applyProgressPo.COLUMNS.XIDUSN.name(), logstdby$applyProgressPo.getXidusn()); 
			dataObject.setValue(Logstdby$applyProgressPo.COLUMNS.XIDSLT.name(), logstdby$applyProgressPo.getXidslt()); 
			dataObject.setValue(Logstdby$applyProgressPo.COLUMNS.XIDSQN.name(), logstdby$applyProgressPo.getXidsqn()); 
			dataObject.setValue(Logstdby$applyProgressPo.COLUMNS.COMMIT_SCN.name(), logstdby$applyProgressPo.getCommitScn()); 
			dataObject.setValue(Logstdby$applyProgressPo.COLUMNS.COMMIT_TIME.name(), logstdby$applyProgressPo.getCommitTime()); 
			dataObject.setValue(Logstdby$applyProgressPo.COLUMNS.SPARE1.name(), logstdby$applyProgressPo.getSpare1()); 
			dataObject.setValue(Logstdby$applyProgressPo.COLUMNS.SPARE2.name(), logstdby$applyProgressPo.getSpare2()); 
			dataObject.setValue(Logstdby$applyProgressPo.COLUMNS.SPARE3.name(), logstdby$applyProgressPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$applyProgressPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$applyProgressPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
