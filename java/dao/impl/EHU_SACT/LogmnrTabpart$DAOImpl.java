package com.doc.common.dao.impl; 
 
public class LogmnrTabpart$DAOImpl extends GeneralDAOImpl<LogmnrTabpart$Po> implements ILogmnrTabpart$DAO { 
	public static final LogmnrTabpart$DAOImpl INSTANCE = new LogmnrTabpart$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_TABPART$"; 

	public LogmnrTabpart$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrTabpart$Po> CONVERTER = new MapConverter<LogmnrTabpart$Po>() { 
 
		@Override 
		public LogmnrTabpart$Po convert(final DataObject dataObject) { 
			final LogmnrTabpart$Po logmnrTabpart$Po = new LogmnrTabpart$Po(); 
			logmnrTabpart$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabpart$Po.COLUMNS.OBJ#.name()))); 
			logmnrTabpart$Po.setTs#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabpart$Po.COLUMNS.TS#.name()))); 
			logmnrTabpart$Po.setPart#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabpart$Po.COLUMNS.PART#.name()))); 
			logmnrTabpart$Po.setBo#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabpart$Po.COLUMNS.BO#.name()))); 
			logmnrTabpart$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabpart$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrTabpart$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabpart$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrTabpart$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrTabpart$Po logmnrTabpart$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrTabpart$Po.COLUMNS.OBJ#.name(), logmnrTabpart$Po.getObj#()); 
			dataObject.setValue(LogmnrTabpart$Po.COLUMNS.TS#.name(), logmnrTabpart$Po.getTs#()); 
			dataObject.setValue(LogmnrTabpart$Po.COLUMNS.PART#.name(), logmnrTabpart$Po.getPart#()); 
			dataObject.setValue(LogmnrTabpart$Po.COLUMNS.BO#.name(), logmnrTabpart$Po.getBo#()); 
			dataObject.setValue(LogmnrTabpart$Po.COLUMNS.LOGMNR_UID.name(), logmnrTabpart$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrTabpart$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrTabpart$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrTabpart$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrTabpart$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrTabpart$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrTabpart$Po.COLUMNS.BO#.name(), po.getBo#()); 
		sqlWhere.add(LogmnrTabpart$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
