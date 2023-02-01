package com.doc.common.dao.impl; 
 
public class LogmnrUid$DAOImpl extends GeneralDAOImpl<LogmnrUid$Po> implements ILogmnrUid$DAO { 
	public static final LogmnrUid$DAOImpl INSTANCE = new LogmnrUid$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_UID$"; 

	public LogmnrUid$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrUid$Po> CONVERTER = new MapConverter<LogmnrUid$Po>() { 
 
		@Override 
		public LogmnrUid$Po convert(final DataObject dataObject) { 
			final LogmnrUid$Po logmnrUid$Po = new LogmnrUid$Po(); 
			logmnrUid$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrUid$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrUid$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrUid$Po.COLUMNS.SESSION#.name()))); 
			return logmnrUid$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrUid$Po logmnrUid$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrUid$Po.COLUMNS.LOGMNR_UID.name(), logmnrUid$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrUid$Po.COLUMNS.SESSION#.name(), logmnrUid$Po.getSession#()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrUid$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrUid$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrUid$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		return sqlWhere; 
	} 
 
} 
