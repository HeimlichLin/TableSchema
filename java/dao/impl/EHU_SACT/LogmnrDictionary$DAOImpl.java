package com.doc.common.dao.impl; 
 
public class LogmnrDictionary$DAOImpl extends GeneralDAOImpl<LogmnrDictionary$Po> implements ILogmnrDictionary$DAO { 
	public static final LogmnrDictionary$DAOImpl INSTANCE = new LogmnrDictionary$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_DICTIONARY$"; 

	public LogmnrDictionary$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrDictionary$Po> CONVERTER = new MapConverter<LogmnrDictionary$Po>() { 
 
		@Override 
		public LogmnrDictionary$Po convert(final DataObject dataObject) { 
			final LogmnrDictionary$Po logmnrDictionary$Po = new LogmnrDictionary$Po(); 
			logmnrDictionary$Po.setDbName(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_NAME.name())); 
			logmnrDictionary$Po.setDbId(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.DB_ID.name()))); 
			logmnrDictionary$Po.setDbCreated(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_CREATED.name())); 
			logmnrDictionary$Po.setDbDictCreated(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_DICT_CREATED.name())); 
			logmnrDictionary$Po.setDbDictScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.DB_DICT_SCN.name()))); 
			logmnrDictionary$Po.setDbThreadMap(); 
			logmnrDictionary$Po.setDbTxnScnbas(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.DB_TXN_SCNBAS.name()))); 
			logmnrDictionary$Po.setDbTxnScnwrp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.DB_TXN_SCNWRP.name()))); 
			logmnrDictionary$Po.setDbResetlogsChange#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.DB_RESETLOGS_CHANGE#.name()))); 
			logmnrDictionary$Po.setDbResetlogsTime(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_RESETLOGS_TIME.name())); 
			logmnrDictionary$Po.setDbVersionTime(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_VERSION_TIME.name())); 
			logmnrDictionary$Po.setDbRedoTypeId(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_REDO_TYPE_ID.name())); 
			logmnrDictionary$Po.setDbRedoRelease(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_REDO_RELEASE.name())); 
			logmnrDictionary$Po.setDbCharacterSet(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_CHARACTER_SET.name())); 
			logmnrDictionary$Po.setDbVersion(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_VERSION.name())); 
			logmnrDictionary$Po.setDbStatus(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_STATUS.name())); 
			logmnrDictionary$Po.setDbGlobalName(dataObject.getString(LogmnrDictionary$Po.COLUMNS.DB_GLOBAL_NAME.name())); 
			logmnrDictionary$Po.setDbDictMaxobjects(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.DB_DICT_MAXOBJECTS.name()))); 
			logmnrDictionary$Po.setDbDictObjectcount(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.DB_DICT_OBJECTCOUNT.name()))); 
			logmnrDictionary$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrDictionary$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictionary$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrDictionary$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrDictionary$Po logmnrDictionary$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_NAME.name(), logmnrDictionary$Po.getDbName()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_ID.name(), logmnrDictionary$Po.getDbId()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_CREATED.name(), logmnrDictionary$Po.getDbCreated()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_DICT_CREATED.name(), logmnrDictionary$Po.getDbDictCreated()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_DICT_SCN.name(), logmnrDictionary$Po.getDbDictScn()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_THREAD_MAP.name(), logmnrDictionary$Po.getDbThreadMap()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_TXN_SCNBAS.name(), logmnrDictionary$Po.getDbTxnScnbas()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_TXN_SCNWRP.name(), logmnrDictionary$Po.getDbTxnScnwrp()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_RESETLOGS_CHANGE#.name(), logmnrDictionary$Po.getDbResetlogsChange#()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_RESETLOGS_TIME.name(), logmnrDictionary$Po.getDbResetlogsTime()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_VERSION_TIME.name(), logmnrDictionary$Po.getDbVersionTime()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_REDO_TYPE_ID.name(), logmnrDictionary$Po.getDbRedoTypeId()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_REDO_RELEASE.name(), logmnrDictionary$Po.getDbRedoRelease()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_CHARACTER_SET.name(), logmnrDictionary$Po.getDbCharacterSet()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_VERSION.name(), logmnrDictionary$Po.getDbVersion()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_STATUS.name(), logmnrDictionary$Po.getDbStatus()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_GLOBAL_NAME.name(), logmnrDictionary$Po.getDbGlobalName()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_DICT_MAXOBJECTS.name(), logmnrDictionary$Po.getDbDictMaxobjects()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.DB_DICT_OBJECTCOUNT.name(), logmnrDictionary$Po.getDbDictObjectcount()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.LOGMNR_UID.name(), logmnrDictionary$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrDictionary$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrDictionary$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrDictionary$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrDictionary$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrDictionary$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
