package com.doc.common.dao.impl; 
 
public class LogmnrcGsiiDAOImpl extends GeneralDAOImpl<LogmnrcGsiiPo> implements ILogmnrcGsiiDAO { 
	public static final LogmnrcGsiiDAOImpl INSTANCE = new LogmnrcGsiiDAOImpl(); 
	public static final String TABLENAME = "LOGMNRC_GSII"; 

	public LogmnrcGsiiDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrcGsiiPo> CONVERTER = new MapConverter<LogmnrcGsiiPo>() { 
 
		@Override 
		public LogmnrcGsiiPo convert(final DataObject dataObject) { 
			final LogmnrcGsiiPo logmnrcGsiiPo = new LogmnrcGsiiPo(); 
			logmnrcGsiiPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrcGsiiPo.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsiiPo.COLUMNS.OBJ#.name()))); 
			logmnrcGsiiPo.setBo#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsiiPo.COLUMNS.BO#.name()))); 
			logmnrcGsiiPo.setIndtype#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsiiPo.COLUMNS.INDTYPE#.name()))); 
			logmnrcGsiiPo.setDropScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsiiPo.COLUMNS.DROP_SCN.name()))); 
			logmnrcGsiiPo.setLogmnrSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_SPARE1.name()))); 
			logmnrcGsiiPo.setLogmnrSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_SPARE2.name()))); 
			logmnrcGsiiPo.setLogmnrSpare3(dataObject.getString(LogmnrcGsiiPo.COLUMNS.LOGMNR_SPARE3.name())); 
			logmnrcGsiiPo.setLogmnrSpare4(TimestampUtils.of(dataObject.getValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_SPARE4.name()))); 
			return logmnrcGsiiPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrcGsiiPo logmnrcGsiiPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_UID.name(), logmnrcGsiiPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.OBJ#.name(), logmnrcGsiiPo.getObj#()); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.BO#.name(), logmnrcGsiiPo.getBo#()); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.INDTYPE#.name(), logmnrcGsiiPo.getIndtype#()); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.DROP_SCN.name(), logmnrcGsiiPo.getDropScn()); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_SPARE1.name(), logmnrcGsiiPo.getLogmnrSpare1()); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_SPARE2.name(), logmnrcGsiiPo.getLogmnrSpare2()); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_SPARE3.name(), logmnrcGsiiPo.getLogmnrSpare3()); 
			dataObject.setValue(LogmnrcGsiiPo.COLUMNS.LOGMNR_SPARE4.name(), logmnrcGsiiPo.getLogmnrSpare4()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrcGsiiPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrcGsiiPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrcGsiiPo.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		sqlWhere.add(LogmnrcGsiiPo.COLUMNS.OBJ#.name(), po.getObj#()); 
		return sqlWhere; 
	} 
 
} 
