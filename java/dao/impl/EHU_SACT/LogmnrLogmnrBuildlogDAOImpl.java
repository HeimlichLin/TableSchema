package com.doc.common.dao.impl; 
 
public class LogmnrLogmnrBuildlogDAOImpl extends GeneralDAOImpl<LogmnrLogmnrBuildlogPo> implements ILogmnrLogmnrBuildlogDAO { 
	public static final LogmnrLogmnrBuildlogDAOImpl INSTANCE = new LogmnrLogmnrBuildlogDAOImpl(); 
	public static final String TABLENAME = "LOGMNR_LOGMNR_BUILDLOG"; 

	public LogmnrLogmnrBuildlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrLogmnrBuildlogPo> CONVERTER = new MapConverter<LogmnrLogmnrBuildlogPo>() { 
 
		@Override 
		public LogmnrLogmnrBuildlogPo convert(final DataObject dataObject) { 
			final LogmnrLogmnrBuildlogPo logmnrLogmnrBuildlogPo = new LogmnrLogmnrBuildlogPo(); 
			logmnrLogmnrBuildlogPo.setBuildDate(dataObject.getString(LogmnrLogmnrBuildlogPo.COLUMNS.BUILD_DATE.name())); 
			logmnrLogmnrBuildlogPo.setDbTxnScnbas(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLogmnrBuildlogPo.COLUMNS.DB_TXN_SCNBAS.name()))); 
			logmnrLogmnrBuildlogPo.setDbTxnScnwrp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLogmnrBuildlogPo.COLUMNS.DB_TXN_SCNWRP.name()))); 
			logmnrLogmnrBuildlogPo.setCurrentBuildState(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLogmnrBuildlogPo.COLUMNS.CURRENT_BUILD_STATE.name()))); 
			logmnrLogmnrBuildlogPo.setCompletionStatus(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLogmnrBuildlogPo.COLUMNS.COMPLETION_STATUS.name()))); 
			logmnrLogmnrBuildlogPo.setMarkedLogFileLowScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLogmnrBuildlogPo.COLUMNS.MARKED_LOG_FILE_LOW_SCN.name()))); 
			logmnrLogmnrBuildlogPo.setInitialXid(dataObject.getString(LogmnrLogmnrBuildlogPo.COLUMNS.INITIAL_XID.name())); 
			logmnrLogmnrBuildlogPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLogmnrBuildlogPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrLogmnrBuildlogPo.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLogmnrBuildlogPo.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrLogmnrBuildlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrLogmnrBuildlogPo logmnrLogmnrBuildlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.BUILD_DATE.name(), logmnrLogmnrBuildlogPo.getBuildDate()); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.DB_TXN_SCNBAS.name(), logmnrLogmnrBuildlogPo.getDbTxnScnbas()); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.DB_TXN_SCNWRP.name(), logmnrLogmnrBuildlogPo.getDbTxnScnwrp()); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.CURRENT_BUILD_STATE.name(), logmnrLogmnrBuildlogPo.getCurrentBuildState()); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.COMPLETION_STATUS.name(), logmnrLogmnrBuildlogPo.getCompletionStatus()); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.MARKED_LOG_FILE_LOW_SCN.name(), logmnrLogmnrBuildlogPo.getMarkedLogFileLowScn()); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.INITIAL_XID.name(), logmnrLogmnrBuildlogPo.getInitialXid()); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.LOGMNR_UID.name(), logmnrLogmnrBuildlogPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrLogmnrBuildlogPo.COLUMNS.LOGMNR_FLAGS.name(), logmnrLogmnrBuildlogPo.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrLogmnrBuildlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrLogmnrBuildlogPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrLogmnrBuildlogPo.COLUMNS.INITIAL_XID.name(), po.getInitialXid()); 
		sqlWhere.add(LogmnrLogmnrBuildlogPo.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
