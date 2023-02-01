package com.doc.common.dao.impl; 
 
public class LogmnrSession$DAOImpl extends GeneralDAOImpl<LogmnrSession$Po> implements ILogmnrSession$DAO { 
	public static final LogmnrSession$DAOImpl INSTANCE = new LogmnrSession$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_SESSION$"; 

	public LogmnrSession$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrSession$Po> CONVERTER = new MapConverter<LogmnrSession$Po>() { 
 
		@Override 
		public LogmnrSession$Po convert(final DataObject dataObject) { 
			final LogmnrSession$Po logmnrSession$Po = new LogmnrSession$Po(); 
			logmnrSession$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.SESSION#.name()))); 
			logmnrSession$Po.setClient#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.CLIENT#.name()))); 
			logmnrSession$Po.setSessionName(dataObject.getString(LogmnrSession$Po.COLUMNS.SESSION_NAME.name())); 
			logmnrSession$Po.setDbId(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.DB_ID.name()))); 
			logmnrSession$Po.setResetlogsChange#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.RESETLOGS_CHANGE#.name()))); 
			logmnrSession$Po.setSessionAttr(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.SESSION_ATTR.name()))); 
			logmnrSession$Po.setSessionAttrVerbose(dataObject.getString(LogmnrSession$Po.COLUMNS.SESSION_ATTR_VERBOSE.name())); 
			logmnrSession$Po.setStartScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.START_SCN.name()))); 
			logmnrSession$Po.setEndScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.END_SCN.name()))); 
			logmnrSession$Po.setSpillScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.SPILL_SCN.name()))); 
			logmnrSession$Po.setSpillTime(TimestampUtils.of(dataObject.getValue(LogmnrSession$Po.COLUMNS.SPILL_TIME.name()))); 
			logmnrSession$Po.setOldestScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.OLDEST_SCN.name()))); 
			logmnrSession$Po.setResumeScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.RESUME_SCN.name()))); 
			logmnrSession$Po.setGlobalDbName(dataObject.getString(LogmnrSession$Po.COLUMNS.GLOBAL_DB_NAME.name())); 
			logmnrSession$Po.setResetTimestamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.RESET_TIMESTAMP.name()))); 
			logmnrSession$Po.setBranchScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.BRANCH_SCN.name()))); 
			logmnrSession$Po.setVersion(dataObject.getString(LogmnrSession$Po.COLUMNS.VERSION.name())); 
			logmnrSession$Po.setRedoCompat(dataObject.getString(LogmnrSession$Po.COLUMNS.REDO_COMPAT.name())); 
			logmnrSession$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.SPARE1.name()))); 
			logmnrSession$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.SPARE2.name()))); 
			logmnrSession$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.SPARE3.name()))); 
			logmnrSession$Po.setSpare4(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.SPARE4.name()))); 
			logmnrSession$Po.setSpare5(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSession$Po.COLUMNS.SPARE5.name()))); 
			logmnrSession$Po.setSpare6(TimestampUtils.of(dataObject.getValue(LogmnrSession$Po.COLUMNS.SPARE6.name()))); 
			logmnrSession$Po.setSpare7(dataObject.getString(LogmnrSession$Po.COLUMNS.SPARE7.name())); 
			logmnrSession$Po.setSpare8(dataObject.getString(LogmnrSession$Po.COLUMNS.SPARE8.name())); 
			return logmnrSession$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrSession$Po logmnrSession$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SESSION#.name(), logmnrSession$Po.getSession#()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.CLIENT#.name(), logmnrSession$Po.getClient#()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SESSION_NAME.name(), logmnrSession$Po.getSessionName()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.DB_ID.name(), logmnrSession$Po.getDbId()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.RESETLOGS_CHANGE#.name(), logmnrSession$Po.getResetlogsChange#()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SESSION_ATTR.name(), logmnrSession$Po.getSessionAttr()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SESSION_ATTR_VERBOSE.name(), logmnrSession$Po.getSessionAttrVerbose()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.START_SCN.name(), logmnrSession$Po.getStartScn()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.END_SCN.name(), logmnrSession$Po.getEndScn()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPILL_SCN.name(), logmnrSession$Po.getSpillScn()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPILL_TIME.name(), logmnrSession$Po.getSpillTime()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.OLDEST_SCN.name(), logmnrSession$Po.getOldestScn()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.RESUME_SCN.name(), logmnrSession$Po.getResumeScn()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.GLOBAL_DB_NAME.name(), logmnrSession$Po.getGlobalDbName()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.RESET_TIMESTAMP.name(), logmnrSession$Po.getResetTimestamp()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.BRANCH_SCN.name(), logmnrSession$Po.getBranchScn()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.VERSION.name(), logmnrSession$Po.getVersion()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.REDO_COMPAT.name(), logmnrSession$Po.getRedoCompat()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPARE1.name(), logmnrSession$Po.getSpare1()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPARE2.name(), logmnrSession$Po.getSpare2()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPARE3.name(), logmnrSession$Po.getSpare3()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPARE4.name(), logmnrSession$Po.getSpare4()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPARE5.name(), logmnrSession$Po.getSpare5()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPARE6.name(), logmnrSession$Po.getSpare6()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPARE7.name(), logmnrSession$Po.getSpare7()); 
			dataObject.setValue(LogmnrSession$Po.COLUMNS.SPARE8.name(), logmnrSession$Po.getSpare8()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrSession$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrSession$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrSession$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrSession$Po.COLUMNS.SESSION_NAME.name(), po.getSessionName()); 
		return sqlWhere; 
	} 
 
} 
