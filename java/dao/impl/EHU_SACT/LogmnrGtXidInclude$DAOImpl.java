package com.doc.common.dao.impl; 
 
public class LogmnrGtXidInclude$DAOImpl extends GeneralDAOImpl<LogmnrGtXidInclude$Po> implements ILogmnrGtXidInclude$DAO { 
	public static final LogmnrGtXidInclude$DAOImpl INSTANCE = new LogmnrGtXidInclude$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_GT_XID_INCLUDE$"; 

	public LogmnrGtXidInclude$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrGtXidInclude$Po> CONVERTER = new MapConverter<LogmnrGtXidInclude$Po>() { 
 
		@Override 
		public LogmnrGtXidInclude$Po convert(final DataObject dataObject) { 
			final LogmnrGtXidInclude$Po logmnrGtXidInclude$Po = new LogmnrGtXidInclude$Po(); 
			logmnrGtXidInclude$Po.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGtXidInclude$Po.COLUMNS.XIDUSN.name()))); 
			logmnrGtXidInclude$Po.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGtXidInclude$Po.COLUMNS.XIDSLT.name()))); 
			logmnrGtXidInclude$Po.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrGtXidInclude$Po.COLUMNS.XIDSQN.name()))); 
			return logmnrGtXidInclude$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrGtXidInclude$Po logmnrGtXidInclude$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrGtXidInclude$Po.COLUMNS.XIDUSN.name(), logmnrGtXidInclude$Po.getXidusn()); 
			dataObject.setValue(LogmnrGtXidInclude$Po.COLUMNS.XIDSLT.name(), logmnrGtXidInclude$Po.getXidslt()); 
			dataObject.setValue(LogmnrGtXidInclude$Po.COLUMNS.XIDSQN.name(), logmnrGtXidInclude$Po.getXidsqn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrGtXidInclude$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrGtXidInclude$Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
