package com.doc.common.dao.impl; 
 
public class LogmnrError$DAOImpl extends GeneralDAOImpl<LogmnrError$Po> implements ILogmnrError$DAO { 
	public static final LogmnrError$DAOImpl INSTANCE = new LogmnrError$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_ERROR$"; 

	public LogmnrError$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrError$Po> CONVERTER = new MapConverter<LogmnrError$Po>() { 
 
		@Override 
		public LogmnrError$Po convert(final DataObject dataObject) { 
			final LogmnrError$Po logmnrError$Po = new LogmnrError$Po(); 
			logmnrError$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrError$Po.COLUMNS.SESSION#.name()))); 
			logmnrError$Po.setTimeOfError(TimestampUtils.of(dataObject.getValue(LogmnrError$Po.COLUMNS.TIME_OF_ERROR.name()))); 
			logmnrError$Po.setCode(BigDecimalUtils.formObj(dataObject.getValue(LogmnrError$Po.COLUMNS.CODE.name()))); 
			logmnrError$Po.setMessage(dataObject.getString(LogmnrError$Po.COLUMNS.MESSAGE.name())); 
			logmnrError$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrError$Po.COLUMNS.SPARE1.name()))); 
			logmnrError$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrError$Po.COLUMNS.SPARE2.name()))); 
			logmnrError$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrError$Po.COLUMNS.SPARE3.name()))); 
			logmnrError$Po.setSpare4(dataObject.getString(LogmnrError$Po.COLUMNS.SPARE4.name())); 
			logmnrError$Po.setSpare5(dataObject.getString(LogmnrError$Po.COLUMNS.SPARE5.name())); 
			return logmnrError$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrError$Po logmnrError$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.SESSION#.name(), logmnrError$Po.getSession#()); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.TIME_OF_ERROR.name(), logmnrError$Po.getTimeOfError()); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.CODE.name(), logmnrError$Po.getCode()); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.MESSAGE.name(), logmnrError$Po.getMessage()); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.SPARE1.name(), logmnrError$Po.getSpare1()); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.SPARE2.name(), logmnrError$Po.getSpare2()); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.SPARE3.name(), logmnrError$Po.getSpare3()); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.SPARE4.name(), logmnrError$Po.getSpare4()); 
			dataObject.setValue(LogmnrError$Po.COLUMNS.SPARE5.name(), logmnrError$Po.getSpare5()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrError$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrError$Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
