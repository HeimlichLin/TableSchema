package com.doc.common.dao.impl; 
 
public class LogmnrCcol$DAOImpl extends GeneralDAOImpl<LogmnrCcol$Po> implements ILogmnrCcol$DAO { 
	public static final LogmnrCcol$DAOImpl INSTANCE = new LogmnrCcol$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_CCOL$"; 

	public LogmnrCcol$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrCcol$Po> CONVERTER = new MapConverter<LogmnrCcol$Po>() { 
 
		@Override 
		public LogmnrCcol$Po convert(final DataObject dataObject) { 
			final LogmnrCcol$Po logmnrCcol$Po = new LogmnrCcol$Po(); 
			logmnrCcol$Po.setCon#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCcol$Po.COLUMNS.CON#.name()))); 
			logmnrCcol$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCcol$Po.COLUMNS.OBJ#.name()))); 
			logmnrCcol$Po.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCcol$Po.COLUMNS.COL#.name()))); 
			logmnrCcol$Po.setPos#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCcol$Po.COLUMNS.POS#.name()))); 
			logmnrCcol$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCcol$Po.COLUMNS.INTCOL#.name()))); 
			logmnrCcol$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCcol$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrCcol$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCcol$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrCcol$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrCcol$Po logmnrCcol$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrCcol$Po.COLUMNS.CON#.name(), logmnrCcol$Po.getCon#()); 
			dataObject.setValue(LogmnrCcol$Po.COLUMNS.OBJ#.name(), logmnrCcol$Po.getObj#()); 
			dataObject.setValue(LogmnrCcol$Po.COLUMNS.COL#.name(), logmnrCcol$Po.getCol#()); 
			dataObject.setValue(LogmnrCcol$Po.COLUMNS.POS#.name(), logmnrCcol$Po.getPos#()); 
			dataObject.setValue(LogmnrCcol$Po.COLUMNS.INTCOL#.name(), logmnrCcol$Po.getIntcol#()); 
			dataObject.setValue(LogmnrCcol$Po.COLUMNS.LOGMNR_UID.name(), logmnrCcol$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrCcol$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrCcol$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrCcol$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrCcol$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrCcol$Po.COLUMNS.CON#.name(), po.getCon#()); 
		sqlWhere.add(LogmnrCcol$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrCcol$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
