package com.doc.common.dao.impl; 
 
public class LogmnrIndpart$DAOImpl extends GeneralDAOImpl<LogmnrIndpart$Po> implements ILogmnrIndpart$DAO { 
	public static final LogmnrIndpart$DAOImpl INSTANCE = new LogmnrIndpart$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_INDPART$"; 

	public LogmnrIndpart$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrIndpart$Po> CONVERTER = new MapConverter<LogmnrIndpart$Po>() { 
 
		@Override 
		public LogmnrIndpart$Po convert(final DataObject dataObject) { 
			final LogmnrIndpart$Po logmnrIndpart$Po = new LogmnrIndpart$Po(); 
			logmnrIndpart$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndpart$Po.COLUMNS.OBJ#.name()))); 
			logmnrIndpart$Po.setBo#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndpart$Po.COLUMNS.BO#.name()))); 
			logmnrIndpart$Po.setPart#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndpart$Po.COLUMNS.PART#.name()))); 
			logmnrIndpart$Po.setTs#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndpart$Po.COLUMNS.TS#.name()))); 
			logmnrIndpart$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndpart$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrIndpart$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndpart$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrIndpart$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrIndpart$Po logmnrIndpart$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrIndpart$Po.COLUMNS.OBJ#.name(), logmnrIndpart$Po.getObj#()); 
			dataObject.setValue(LogmnrIndpart$Po.COLUMNS.BO#.name(), logmnrIndpart$Po.getBo#()); 
			dataObject.setValue(LogmnrIndpart$Po.COLUMNS.PART#.name(), logmnrIndpart$Po.getPart#()); 
			dataObject.setValue(LogmnrIndpart$Po.COLUMNS.TS#.name(), logmnrIndpart$Po.getTs#()); 
			dataObject.setValue(LogmnrIndpart$Po.COLUMNS.LOGMNR_UID.name(), logmnrIndpart$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrIndpart$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrIndpart$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrIndpart$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrIndpart$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrIndpart$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrIndpart$Po.COLUMNS.BO#.name(), po.getBo#()); 
		sqlWhere.add(LogmnrIndpart$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
