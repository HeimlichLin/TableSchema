package com.doc.common.dao.impl; 
 
public class LogmnrGtUserInclude$DAOImpl extends GeneralDAOImpl<LogmnrGtUserInclude$Po> implements ILogmnrGtUserInclude$DAO { 
	public static final LogmnrGtUserInclude$DAOImpl INSTANCE = new LogmnrGtUserInclude$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_GT_USER_INCLUDE$"; 

	public LogmnrGtUserInclude$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrGtUserInclude$Po> CONVERTER = new MapConverter<LogmnrGtUserInclude$Po>() { 
 
		@Override 
		public LogmnrGtUserInclude$Po convert(final DataObject dataObject) { 
			final LogmnrGtUserInclude$Po logmnrGtUserInclude$Po = new LogmnrGtUserInclude$Po(); 
			logmnrGtUserInclude$Po.setUserName(dataObject.getString(LogmnrGtUserInclude$Po.COLUMNS.USER_NAME.name())); 
			logmnrGtUserInclude$Po.setUserType(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGtUserInclude$Po.COLUMNS.USER_TYPE.name()))); 
			return logmnrGtUserInclude$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrGtUserInclude$Po logmnrGtUserInclude$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrGtUserInclude$Po.COLUMNS.USER_NAME.name(), logmnrGtUserInclude$Po.getUserName()); 
			dataObject.setValue(LogmnrGtUserInclude$Po.COLUMNS.USER_TYPE.name(), logmnrGtUserInclude$Po.getUserType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrGtUserInclude$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrGtUserInclude$Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
