package com.doc.common.dao.impl; 
 
public class LogmnrFilter$DAOImpl extends GeneralDAOImpl<LogmnrFilter$Po> implements ILogmnrFilter$DAO { 
	public static final LogmnrFilter$DAOImpl INSTANCE = new LogmnrFilter$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_FILTER$"; 

	public LogmnrFilter$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrFilter$Po> CONVERTER = new MapConverter<LogmnrFilter$Po>() { 
 
		@Override 
		public LogmnrFilter$Po convert(final DataObject dataObject) { 
			final LogmnrFilter$Po logmnrFilter$Po = new LogmnrFilter$Po(); 
			logmnrFilter$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.SESSION#.name()))); 
			logmnrFilter$Po.setFilterType(dataObject.getString(LogmnrFilter$Po.COLUMNS.FILTER_TYPE.name())); 
			logmnrFilter$Po.setAttr1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.ATTR1.name()))); 
			logmnrFilter$Po.setAttr2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.ATTR2.name()))); 
			logmnrFilter$Po.setAttr3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.ATTR3.name()))); 
			logmnrFilter$Po.setAttr4(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.ATTR4.name()))); 
			logmnrFilter$Po.setAttr5(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.ATTR5.name()))); 
			logmnrFilter$Po.setAttr6(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.ATTR6.name()))); 
			logmnrFilter$Po.setFilterScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.FILTER_SCN.name()))); 
			logmnrFilter$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.SPARE1.name()))); 
			logmnrFilter$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrFilter$Po.COLUMNS.SPARE2.name()))); 
			logmnrFilter$Po.setSpare3(TimestampUtils.of(dataObject.getValue(LogmnrFilter$Po.COLUMNS.SPARE3.name()))); 
			return logmnrFilter$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrFilter$Po logmnrFilter$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.SESSION#.name(), logmnrFilter$Po.getSession#()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.FILTER_TYPE.name(), logmnrFilter$Po.getFilterType()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.ATTR1.name(), logmnrFilter$Po.getAttr1()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.ATTR2.name(), logmnrFilter$Po.getAttr2()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.ATTR3.name(), logmnrFilter$Po.getAttr3()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.ATTR4.name(), logmnrFilter$Po.getAttr4()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.ATTR5.name(), logmnrFilter$Po.getAttr5()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.ATTR6.name(), logmnrFilter$Po.getAttr6()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.FILTER_SCN.name(), logmnrFilter$Po.getFilterScn()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.SPARE1.name(), logmnrFilter$Po.getSpare1()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.SPARE2.name(), logmnrFilter$Po.getSpare2()); 
			dataObject.setValue(LogmnrFilter$Po.COLUMNS.SPARE3.name(), logmnrFilter$Po.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrFilter$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrFilter$Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
