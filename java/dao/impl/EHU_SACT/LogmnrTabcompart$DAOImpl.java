package com.doc.common.dao.impl; 
 
public class LogmnrTabcompart$DAOImpl extends GeneralDAOImpl<LogmnrTabcompart$Po> implements ILogmnrTabcompart$DAO { 
	public static final LogmnrTabcompart$DAOImpl INSTANCE = new LogmnrTabcompart$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_TABCOMPART$"; 

	public LogmnrTabcompart$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrTabcompart$Po> CONVERTER = new MapConverter<LogmnrTabcompart$Po>() { 
 
		@Override 
		public LogmnrTabcompart$Po convert(final DataObject dataObject) { 
			final LogmnrTabcompart$Po logmnrTabcompart$Po = new LogmnrTabcompart$Po(); 
			logmnrTabcompart$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabcompart$Po.COLUMNS.OBJ#.name()))); 
			logmnrTabcompart$Po.setBo#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabcompart$Po.COLUMNS.BO#.name()))); 
			logmnrTabcompart$Po.setPart#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabcompart$Po.COLUMNS.PART#.name()))); 
			logmnrTabcompart$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabcompart$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrTabcompart$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabcompart$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrTabcompart$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrTabcompart$Po logmnrTabcompart$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrTabcompart$Po.COLUMNS.OBJ#.name(), logmnrTabcompart$Po.getObj#()); 
			dataObject.setValue(LogmnrTabcompart$Po.COLUMNS.BO#.name(), logmnrTabcompart$Po.getBo#()); 
			dataObject.setValue(LogmnrTabcompart$Po.COLUMNS.PART#.name(), logmnrTabcompart$Po.getPart#()); 
			dataObject.setValue(LogmnrTabcompart$Po.COLUMNS.LOGMNR_UID.name(), logmnrTabcompart$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrTabcompart$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrTabcompart$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrTabcompart$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrTabcompart$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrTabcompart$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrTabcompart$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
