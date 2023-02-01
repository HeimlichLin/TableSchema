package com.doc.common.dao.impl; 
 
public class LogmnrProps$DAOImpl extends GeneralDAOImpl<LogmnrProps$Po> implements ILogmnrProps$DAO { 
	public static final LogmnrProps$DAOImpl INSTANCE = new LogmnrProps$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_PROPS$"; 

	public LogmnrProps$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrProps$Po> CONVERTER = new MapConverter<LogmnrProps$Po>() { 
 
		@Override 
		public LogmnrProps$Po convert(final DataObject dataObject) { 
			final LogmnrProps$Po logmnrProps$Po = new LogmnrProps$Po(); 
			logmnrProps$Po.setValue$(dataObject.getString(LogmnrProps$Po.COLUMNS.VALUE$.name())); 
			logmnrProps$Po.setComment$(dataObject.getString(LogmnrProps$Po.COLUMNS.COMMENT$.name())); 
			logmnrProps$Po.setName(dataObject.getString(LogmnrProps$Po.COLUMNS.NAME.name())); 
			logmnrProps$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrProps$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrProps$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrProps$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrProps$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrProps$Po logmnrProps$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrProps$Po.COLUMNS.VALUE$.name(), logmnrProps$Po.getValue$()); 
			dataObject.setValue(LogmnrProps$Po.COLUMNS.COMMENT$.name(), logmnrProps$Po.getComment$()); 
			dataObject.setValue(LogmnrProps$Po.COLUMNS.NAME.name(), logmnrProps$Po.getName()); 
			dataObject.setValue(LogmnrProps$Po.COLUMNS.LOGMNR_UID.name(), logmnrProps$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrProps$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrProps$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrProps$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrProps$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrProps$Po.COLUMNS.NAME.name(), po.getName()); 
		sqlWhere.add(LogmnrProps$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
