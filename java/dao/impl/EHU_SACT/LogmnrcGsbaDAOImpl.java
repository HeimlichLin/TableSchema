package com.doc.common.dao.impl; 
 
public class LogmnrcGsbaDAOImpl extends GeneralDAOImpl<LogmnrcGsbaPo> implements ILogmnrcGsbaDAO { 
	public static final LogmnrcGsbaDAOImpl INSTANCE = new LogmnrcGsbaDAOImpl(); 
	public static final String TABLENAME = "LOGMNRC_GSBA"; 

	public LogmnrcGsbaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrcGsbaPo> CONVERTER = new MapConverter<LogmnrcGsbaPo>() { 
 
		@Override 
		public LogmnrcGsbaPo convert(final DataObject dataObject) { 
			final LogmnrcGsbaPo logmnrcGsbaPo = new LogmnrcGsbaPo(); 
			logmnrcGsbaPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrcGsbaPo.setAsOfScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.AS_OF_SCN.name()))); 
			logmnrcGsbaPo.setFdoLength(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.FDO_LENGTH.name()))); 
			logmnrcGsbaPo.setFdoValue(); 
			logmnrcGsbaPo.setCharsetid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.CHARSETID.name()))); 
			logmnrcGsbaPo.setNcharsetid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.NCHARSETID.name()))); 
			logmnrcGsbaPo.setDbtimezoneLen(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.DBTIMEZONE_LEN.name()))); 
			logmnrcGsbaPo.setDbtimezoneValue(dataObject.getString(LogmnrcGsbaPo.COLUMNS.DBTIMEZONE_VALUE.name())); 
			logmnrcGsbaPo.setLogmnrSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_SPARE1.name()))); 
			logmnrcGsbaPo.setLogmnrSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_SPARE2.name()))); 
			logmnrcGsbaPo.setLogmnrSpare3(dataObject.getString(LogmnrcGsbaPo.COLUMNS.LOGMNR_SPARE3.name())); 
			logmnrcGsbaPo.setLogmnrSpare4(TimestampUtils.of(dataObject.getValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_SPARE4.name()))); 
			return logmnrcGsbaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrcGsbaPo logmnrcGsbaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_UID.name(), logmnrcGsbaPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.AS_OF_SCN.name(), logmnrcGsbaPo.getAsOfScn()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.FDO_LENGTH.name(), logmnrcGsbaPo.getFdoLength()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.FDO_VALUE.name(), logmnrcGsbaPo.getFdoValue()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.CHARSETID.name(), logmnrcGsbaPo.getCharsetid()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.NCHARSETID.name(), logmnrcGsbaPo.getNcharsetid()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.DBTIMEZONE_LEN.name(), logmnrcGsbaPo.getDbtimezoneLen()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.DBTIMEZONE_VALUE.name(), logmnrcGsbaPo.getDbtimezoneValue()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_SPARE1.name(), logmnrcGsbaPo.getLogmnrSpare1()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_SPARE2.name(), logmnrcGsbaPo.getLogmnrSpare2()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_SPARE3.name(), logmnrcGsbaPo.getLogmnrSpare3()); 
			dataObject.setValue(LogmnrcGsbaPo.COLUMNS.LOGMNR_SPARE4.name(), logmnrcGsbaPo.getLogmnrSpare4()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrcGsbaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrcGsbaPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrcGsbaPo.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		sqlWhere.add(LogmnrcGsbaPo.COLUMNS.AS_OF_SCN.name(), po.getAsOfScn()); 
		return sqlWhere; 
	} 
 
} 
