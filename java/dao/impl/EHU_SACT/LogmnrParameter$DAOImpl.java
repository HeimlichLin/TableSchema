package com.doc.common.dao.impl; 
 
public class LogmnrParameter$DAOImpl extends GeneralDAOImpl<LogmnrParameter$Po> implements ILogmnrParameter$DAO { 
	public static final LogmnrParameter$DAOImpl INSTANCE = new LogmnrParameter$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_PARAMETER$"; 

	public LogmnrParameter$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrParameter$Po> CONVERTER = new MapConverter<LogmnrParameter$Po>() { 
 
		@Override 
		public LogmnrParameter$Po convert(final DataObject dataObject) { 
			final LogmnrParameter$Po logmnrParameter$Po = new LogmnrParameter$Po(); 
			logmnrParameter$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrParameter$Po.COLUMNS.SESSION#.name()))); 
			logmnrParameter$Po.setName(dataObject.getString(LogmnrParameter$Po.COLUMNS.NAME.name())); 
			logmnrParameter$Po.setValue(dataObject.getString(LogmnrParameter$Po.COLUMNS.VALUE.name())); 
			logmnrParameter$Po.setType(BigDecimalUtils.formObj(dataObject.getValue(LogmnrParameter$Po.COLUMNS.TYPE.name()))); 
			logmnrParameter$Po.setScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrParameter$Po.COLUMNS.SCN.name()))); 
			logmnrParameter$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrParameter$Po.COLUMNS.SPARE1.name()))); 
			logmnrParameter$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrParameter$Po.COLUMNS.SPARE2.name()))); 
			logmnrParameter$Po.setSpare3(dataObject.getString(LogmnrParameter$Po.COLUMNS.SPARE3.name())); 
			return logmnrParameter$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrParameter$Po logmnrParameter$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrParameter$Po.COLUMNS.SESSION#.name(), logmnrParameter$Po.getSession#()); 
			dataObject.setValue(LogmnrParameter$Po.COLUMNS.NAME.name(), logmnrParameter$Po.getName()); 
			dataObject.setValue(LogmnrParameter$Po.COLUMNS.VALUE.name(), logmnrParameter$Po.getValue()); 
			dataObject.setValue(LogmnrParameter$Po.COLUMNS.TYPE.name(), logmnrParameter$Po.getType()); 
			dataObject.setValue(LogmnrParameter$Po.COLUMNS.SCN.name(), logmnrParameter$Po.getScn()); 
			dataObject.setValue(LogmnrParameter$Po.COLUMNS.SPARE1.name(), logmnrParameter$Po.getSpare1()); 
			dataObject.setValue(LogmnrParameter$Po.COLUMNS.SPARE2.name(), logmnrParameter$Po.getSpare2()); 
			dataObject.setValue(LogmnrParameter$Po.COLUMNS.SPARE3.name(), logmnrParameter$Po.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrParameter$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrParameter$Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
