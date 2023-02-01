package com.doc.common.dao.impl; 
 
public class LogmnrNtab$DAOImpl extends GeneralDAOImpl<LogmnrNtab$Po> implements ILogmnrNtab$DAO { 
	public static final LogmnrNtab$DAOImpl INSTANCE = new LogmnrNtab$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_NTAB$"; 

	public LogmnrNtab$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrNtab$Po> CONVERTER = new MapConverter<LogmnrNtab$Po>() { 
 
		@Override 
		public LogmnrNtab$Po convert(final DataObject dataObject) { 
			final LogmnrNtab$Po logmnrNtab$Po = new LogmnrNtab$Po(); 
			logmnrNtab$Po.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrNtab$Po.COLUMNS.COL#.name()))); 
			logmnrNtab$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrNtab$Po.COLUMNS.INTCOL#.name()))); 
			logmnrNtab$Po.setNtab#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrNtab$Po.COLUMNS.NTAB#.name()))); 
			logmnrNtab$Po.setName(dataObject.getString(LogmnrNtab$Po.COLUMNS.NAME.name())); 
			logmnrNtab$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrNtab$Po.COLUMNS.OBJ#.name()))); 
			logmnrNtab$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrNtab$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrNtab$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrNtab$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrNtab$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrNtab$Po logmnrNtab$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrNtab$Po.COLUMNS.COL#.name(), logmnrNtab$Po.getCol#()); 
			dataObject.setValue(LogmnrNtab$Po.COLUMNS.INTCOL#.name(), logmnrNtab$Po.getIntcol#()); 
			dataObject.setValue(LogmnrNtab$Po.COLUMNS.NTAB#.name(), logmnrNtab$Po.getNtab#()); 
			dataObject.setValue(LogmnrNtab$Po.COLUMNS.NAME.name(), logmnrNtab$Po.getName()); 
			dataObject.setValue(LogmnrNtab$Po.COLUMNS.OBJ#.name(), logmnrNtab$Po.getObj#()); 
			dataObject.setValue(LogmnrNtab$Po.COLUMNS.LOGMNR_UID.name(), logmnrNtab$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrNtab$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrNtab$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrNtab$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrNtab$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrNtab$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrNtab$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrNtab$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
