package com.doc.common.dao.impl; 
 
public class LogmnrGlobal$DAOImpl extends GeneralDAOImpl<LogmnrGlobal$Po> implements ILogmnrGlobal$DAO { 
	public static final LogmnrGlobal$DAOImpl INSTANCE = new LogmnrGlobal$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_GLOBAL$"; 

	public LogmnrGlobal$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrGlobal$Po> CONVERTER = new MapConverter<LogmnrGlobal$Po>() { 
 
		@Override 
		public LogmnrGlobal$Po convert(final DataObject dataObject) { 
			final LogmnrGlobal$Po logmnrGlobal$Po = new LogmnrGlobal$Po(); 
			logmnrGlobal$Po.setHighRecidForeign(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.HIGH_RECID_FOREIGN.name()))); 
			logmnrGlobal$Po.setHighRecidDeleted(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.HIGH_RECID_DELETED.name()))); 
			logmnrGlobal$Po.setLocalResetScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.LOCAL_RESET_SCN.name()))); 
			logmnrGlobal$Po.setLocalResetTimestamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.LOCAL_RESET_TIMESTAMP.name()))); 
			logmnrGlobal$Po.setVersionTimestamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.VERSION_TIMESTAMP.name()))); 
			logmnrGlobal$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.SPARE1.name()))); 
			logmnrGlobal$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.SPARE2.name()))); 
			logmnrGlobal$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.SPARE3.name()))); 
			logmnrGlobal$Po.setSpare4(dataObject.getString(LogmnrGlobal$Po.COLUMNS.SPARE4.name())); 
			logmnrGlobal$Po.setSpare5(TimestampUtils.of(dataObject.getValue(LogmnrGlobal$Po.COLUMNS.SPARE5.name()))); 
			return logmnrGlobal$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrGlobal$Po logmnrGlobal$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.HIGH_RECID_FOREIGN.name(), logmnrGlobal$Po.getHighRecidForeign()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.HIGH_RECID_DELETED.name(), logmnrGlobal$Po.getHighRecidDeleted()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.LOCAL_RESET_SCN.name(), logmnrGlobal$Po.getLocalResetScn()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.LOCAL_RESET_TIMESTAMP.name(), logmnrGlobal$Po.getLocalResetTimestamp()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.VERSION_TIMESTAMP.name(), logmnrGlobal$Po.getVersionTimestamp()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.SPARE1.name(), logmnrGlobal$Po.getSpare1()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.SPARE2.name(), logmnrGlobal$Po.getSpare2()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.SPARE3.name(), logmnrGlobal$Po.getSpare3()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.SPARE4.name(), logmnrGlobal$Po.getSpare4()); 
			dataObject.setValue(LogmnrGlobal$Po.COLUMNS.SPARE5.name(), logmnrGlobal$Po.getSpare5()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrGlobal$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrGlobal$Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
