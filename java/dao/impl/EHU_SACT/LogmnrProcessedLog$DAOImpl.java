package com.doc.common.dao.impl; 
 
public class LogmnrProcessedLog$DAOImpl extends GeneralDAOImpl<LogmnrProcessedLog$Po> implements ILogmnrProcessedLog$DAO { 
	public static final LogmnrProcessedLog$DAOImpl INSTANCE = new LogmnrProcessedLog$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_PROCESSED_LOG$"; 

	public LogmnrProcessedLog$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrProcessedLog$Po> CONVERTER = new MapConverter<LogmnrProcessedLog$Po>() { 
 
		@Override 
		public LogmnrProcessedLog$Po convert(final DataObject dataObject) { 
			final LogmnrProcessedLog$Po logmnrProcessedLog$Po = new LogmnrProcessedLog$Po(); 
			logmnrProcessedLog$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.SESSION#.name()))); 
			logmnrProcessedLog$Po.setThread#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.THREAD#.name()))); 
			logmnrProcessedLog$Po.setSequence#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.SEQUENCE#.name()))); 
			logmnrProcessedLog$Po.setFirstChange#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.FIRST_CHANGE#.name()))); 
			logmnrProcessedLog$Po.setNextChange#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.NEXT_CHANGE#.name()))); 
			logmnrProcessedLog$Po.setFirstTime(TimestampUtils.of(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.FIRST_TIME.name()))); 
			logmnrProcessedLog$Po.setNextTime(TimestampUtils.of(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.NEXT_TIME.name()))); 
			logmnrProcessedLog$Po.setFileName(dataObject.getString(LogmnrProcessedLog$Po.COLUMNS.FILE_NAME.name())); 
			logmnrProcessedLog$Po.setStatus(BigDecimalUtils.formObj(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.STATUS.name()))); 
			logmnrProcessedLog$Po.setInfo(dataObject.getString(LogmnrProcessedLog$Po.COLUMNS.INFO.name())); 
			logmnrProcessedLog$Po.setTimestamp(TimestampUtils.of(dataObject.getValue(LogmnrProcessedLog$Po.COLUMNS.TIMESTAMP.name()))); 
			return logmnrProcessedLog$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrProcessedLog$Po logmnrProcessedLog$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.SESSION#.name(), logmnrProcessedLog$Po.getSession#()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.THREAD#.name(), logmnrProcessedLog$Po.getThread#()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.SEQUENCE#.name(), logmnrProcessedLog$Po.getSequence#()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.FIRST_CHANGE#.name(), logmnrProcessedLog$Po.getFirstChange#()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.NEXT_CHANGE#.name(), logmnrProcessedLog$Po.getNextChange#()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.FIRST_TIME.name(), logmnrProcessedLog$Po.getFirstTime()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.NEXT_TIME.name(), logmnrProcessedLog$Po.getNextTime()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.FILE_NAME.name(), logmnrProcessedLog$Po.getFileName()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.STATUS.name(), logmnrProcessedLog$Po.getStatus()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.INFO.name(), logmnrProcessedLog$Po.getInfo()); 
			dataObject.setValue(LogmnrProcessedLog$Po.COLUMNS.TIMESTAMP.name(), logmnrProcessedLog$Po.getTimestamp()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrProcessedLog$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrProcessedLog$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrProcessedLog$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrProcessedLog$Po.COLUMNS.THREAD#.name(), po.getThread#()); 
		return sqlWhere; 
	} 
 
} 
