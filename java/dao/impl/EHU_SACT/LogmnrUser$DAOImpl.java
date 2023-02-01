package com.doc.common.dao.impl; 
 
public class LogmnrUser$DAOImpl extends GeneralDAOImpl<LogmnrUser$Po> implements ILogmnrUser$DAO { 
	public static final LogmnrUser$DAOImpl INSTANCE = new LogmnrUser$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_USER$"; 

	public LogmnrUser$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrUser$Po> CONVERTER = new MapConverter<LogmnrUser$Po>() { 
 
		@Override 
		public LogmnrUser$Po convert(final DataObject dataObject) { 
			final LogmnrUser$Po logmnrUser$Po = new LogmnrUser$Po(); 
			logmnrUser$Po.setUser#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrUser$Po.COLUMNS.USER#.name()))); 
			logmnrUser$Po.setName(dataObject.getString(LogmnrUser$Po.COLUMNS.NAME.name())); 
			logmnrUser$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrUser$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrUser$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrUser$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrUser$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrUser$Po logmnrUser$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrUser$Po.COLUMNS.USER#.name(), logmnrUser$Po.getUser#()); 
			dataObject.setValue(LogmnrUser$Po.COLUMNS.NAME.name(), logmnrUser$Po.getName()); 
			dataObject.setValue(LogmnrUser$Po.COLUMNS.LOGMNR_UID.name(), logmnrUser$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrUser$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrUser$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrUser$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrUser$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrUser$Po.COLUMNS.USER#.name(), po.getUser#()); 
		sqlWhere.add(LogmnrUser$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
