package com.doc.common.dao.impl; 
 
public class LogmnrAttrcol$DAOImpl extends GeneralDAOImpl<LogmnrAttrcol$Po> implements ILogmnrAttrcol$DAO { 
	public static final LogmnrAttrcol$DAOImpl INSTANCE = new LogmnrAttrcol$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_ATTRCOL$"; 

	public LogmnrAttrcol$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrAttrcol$Po> CONVERTER = new MapConverter<LogmnrAttrcol$Po>() { 
 
		@Override 
		public LogmnrAttrcol$Po convert(final DataObject dataObject) { 
			final LogmnrAttrcol$Po logmnrAttrcol$Po = new LogmnrAttrcol$Po(); 
			logmnrAttrcol$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttrcol$Po.COLUMNS.INTCOL#.name()))); 
			logmnrAttrcol$Po.setName(dataObject.getString(LogmnrAttrcol$Po.COLUMNS.NAME.name())); 
			logmnrAttrcol$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttrcol$Po.COLUMNS.OBJ#.name()))); 
			logmnrAttrcol$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttrcol$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrAttrcol$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttrcol$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrAttrcol$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrAttrcol$Po logmnrAttrcol$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrAttrcol$Po.COLUMNS.INTCOL#.name(), logmnrAttrcol$Po.getIntcol#()); 
			dataObject.setValue(LogmnrAttrcol$Po.COLUMNS.NAME.name(), logmnrAttrcol$Po.getName()); 
			dataObject.setValue(LogmnrAttrcol$Po.COLUMNS.OBJ#.name(), logmnrAttrcol$Po.getObj#()); 
			dataObject.setValue(LogmnrAttrcol$Po.COLUMNS.LOGMNR_UID.name(), logmnrAttrcol$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrAttrcol$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrAttrcol$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrAttrcol$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrAttrcol$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrAttrcol$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrAttrcol$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrAttrcol$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
