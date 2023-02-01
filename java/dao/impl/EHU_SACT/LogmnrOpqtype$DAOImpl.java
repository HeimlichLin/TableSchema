package com.doc.common.dao.impl; 
 
public class LogmnrOpqtype$DAOImpl extends GeneralDAOImpl<LogmnrOpqtype$Po> implements ILogmnrOpqtype$DAO { 
	public static final LogmnrOpqtype$DAOImpl INSTANCE = new LogmnrOpqtype$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_OPQTYPE$"; 

	public LogmnrOpqtype$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrOpqtype$Po> CONVERTER = new MapConverter<LogmnrOpqtype$Po>() { 
 
		@Override 
		public LogmnrOpqtype$Po convert(final DataObject dataObject) { 
			final LogmnrOpqtype$Po logmnrOpqtype$Po = new LogmnrOpqtype$Po(); 
			logmnrOpqtype$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.INTCOL#.name()))); 
			logmnrOpqtype$Po.setType(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.TYPE.name()))); 
			logmnrOpqtype$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.FLAGS.name()))); 
			logmnrOpqtype$Po.setLobcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.LOBCOL.name()))); 
			logmnrOpqtype$Po.setObjcol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.OBJCOL.name()))); 
			logmnrOpqtype$Po.setExtracol(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.EXTRACOL.name()))); 
			logmnrOpqtype$Po.setSchemaoid(); 
			logmnrOpqtype$Po.setElemnum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.ELEMNUM.name()))); 
			logmnrOpqtype$Po.setSchemaurl(dataObject.getString(LogmnrOpqtype$Po.COLUMNS.SCHEMAURL.name())); 
			logmnrOpqtype$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.OBJ#.name()))); 
			logmnrOpqtype$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrOpqtype$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrOpqtype$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrOpqtype$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrOpqtype$Po logmnrOpqtype$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.INTCOL#.name(), logmnrOpqtype$Po.getIntcol#()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.TYPE.name(), logmnrOpqtype$Po.getType()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.FLAGS.name(), logmnrOpqtype$Po.getFlags()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.LOBCOL.name(), logmnrOpqtype$Po.getLobcol()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.OBJCOL.name(), logmnrOpqtype$Po.getObjcol()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.EXTRACOL.name(), logmnrOpqtype$Po.getExtracol()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.SCHEMAOID.name(), logmnrOpqtype$Po.getSchemaoid()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.ELEMNUM.name(), logmnrOpqtype$Po.getElemnum()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.SCHEMAURL.name(), logmnrOpqtype$Po.getSchemaurl()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.OBJ#.name(), logmnrOpqtype$Po.getObj#()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.LOGMNR_UID.name(), logmnrOpqtype$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrOpqtype$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrOpqtype$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrOpqtype$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrOpqtype$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrOpqtype$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrOpqtype$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrOpqtype$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
