package com.doc.common.dao.impl; 
 
public class Repcat$ExceptionsDAOImpl extends GeneralDAOImpl<Repcat$ExceptionsPo> implements IRepcat$ExceptionsDAO { 
	public static final Repcat$ExceptionsDAOImpl INSTANCE = new Repcat$ExceptionsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_EXCEPTIONS"; 

	public Repcat$ExceptionsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$ExceptionsPo> CONVERTER = new MapConverter<Repcat$ExceptionsPo>() { 
 
		@Override 
		public Repcat$ExceptionsPo convert(final DataObject dataObject) { 
			final Repcat$ExceptionsPo repcat$ExceptionsPo = new Repcat$ExceptionsPo(); 
			repcat$ExceptionsPo.setExceptionId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExceptionsPo.COLUMNS.EXCEPTION_ID.name()))); 
			repcat$ExceptionsPo.setUserName(dataObject.getString(Repcat$ExceptionsPo.COLUMNS.USER_NAME.name())); 
			repcat$ExceptionsPo.setRequest(); 
			repcat$ExceptionsPo.setJob(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExceptionsPo.COLUMNS.JOB.name()))); 
			repcat$ExceptionsPo.setErrorDate(TimestampUtils.of(dataObject.getValue(Repcat$ExceptionsPo.COLUMNS.ERROR_DATE.name()))); 
			repcat$ExceptionsPo.setErrorNumber(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExceptionsPo.COLUMNS.ERROR_NUMBER.name()))); 
			repcat$ExceptionsPo.setErrorMessage(dataObject.getString(Repcat$ExceptionsPo.COLUMNS.ERROR_MESSAGE.name())); 
			repcat$ExceptionsPo.setLineNumber(BigDecimalUtils.formObj(dataObject.getValue(Repcat$ExceptionsPo.COLUMNS.LINE_NUMBER.name()))); 
			return repcat$ExceptionsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$ExceptionsPo repcat$ExceptionsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$ExceptionsPo.COLUMNS.EXCEPTION_ID.name(), repcat$ExceptionsPo.getExceptionId()); 
			dataObject.setValue(Repcat$ExceptionsPo.COLUMNS.USER_NAME.name(), repcat$ExceptionsPo.getUserName()); 
			dataObject.setValue(Repcat$ExceptionsPo.COLUMNS.REQUEST.name(), repcat$ExceptionsPo.getRequest()); 
			dataObject.setValue(Repcat$ExceptionsPo.COLUMNS.JOB.name(), repcat$ExceptionsPo.getJob()); 
			dataObject.setValue(Repcat$ExceptionsPo.COLUMNS.ERROR_DATE.name(), repcat$ExceptionsPo.getErrorDate()); 
			dataObject.setValue(Repcat$ExceptionsPo.COLUMNS.ERROR_NUMBER.name(), repcat$ExceptionsPo.getErrorNumber()); 
			dataObject.setValue(Repcat$ExceptionsPo.COLUMNS.ERROR_MESSAGE.name(), repcat$ExceptionsPo.getErrorMessage()); 
			dataObject.setValue(Repcat$ExceptionsPo.COLUMNS.LINE_NUMBER.name(), repcat$ExceptionsPo.getLineNumber()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$ExceptionsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$ExceptionsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$ExceptionsPo.COLUMNS.EXCEPTION_ID.name(), po.getExceptionId()); 
		return sqlWhere; 
	} 
 
} 
