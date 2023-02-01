package com.doc.common.dao.impl; 
 
public class LogmnrGtTabInclude$DAOImpl extends GeneralDAOImpl<LogmnrGtTabInclude$Po> implements ILogmnrGtTabInclude$DAO { 
	public static final LogmnrGtTabInclude$DAOImpl INSTANCE = new LogmnrGtTabInclude$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_GT_TAB_INCLUDE$"; 

	public LogmnrGtTabInclude$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrGtTabInclude$Po> CONVERTER = new MapConverter<LogmnrGtTabInclude$Po>() { 
 
		@Override 
		public LogmnrGtTabInclude$Po convert(final DataObject dataObject) { 
			final LogmnrGtTabInclude$Po logmnrGtTabInclude$Po = new LogmnrGtTabInclude$Po(); 
			logmnrGtTabInclude$Po.setSchemaName(dataObject.getString(LogmnrGtTabInclude$Po.COLUMNS.SCHEMA_NAME.name())); 
			logmnrGtTabInclude$Po.setTableName(dataObject.getString(LogmnrGtTabInclude$Po.COLUMNS.TABLE_NAME.name())); 
			return logmnrGtTabInclude$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrGtTabInclude$Po logmnrGtTabInclude$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrGtTabInclude$Po.COLUMNS.SCHEMA_NAME.name(), logmnrGtTabInclude$Po.getSchemaName()); 
			dataObject.setValue(LogmnrGtTabInclude$Po.COLUMNS.TABLE_NAME.name(), logmnrGtTabInclude$Po.getTableName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrGtTabInclude$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrGtTabInclude$Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
