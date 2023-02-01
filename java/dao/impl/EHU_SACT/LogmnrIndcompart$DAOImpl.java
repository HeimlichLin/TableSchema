package com.doc.common.dao.impl; 
 
public class LogmnrIndcompart$DAOImpl extends GeneralDAOImpl<LogmnrIndcompart$Po> implements ILogmnrIndcompart$DAO { 
	public static final LogmnrIndcompart$DAOImpl INSTANCE = new LogmnrIndcompart$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_INDCOMPART$"; 

	public LogmnrIndcompart$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrIndcompart$Po> CONVERTER = new MapConverter<LogmnrIndcompart$Po>() { 
 
		@Override 
		public LogmnrIndcompart$Po convert(final DataObject dataObject) { 
			final LogmnrIndcompart$Po logmnrIndcompart$Po = new LogmnrIndcompart$Po(); 
			logmnrIndcompart$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndcompart$Po.COLUMNS.OBJ#.name()))); 
			logmnrIndcompart$Po.setDataobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndcompart$Po.COLUMNS.DATAOBJ#.name()))); 
			logmnrIndcompart$Po.setBo#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndcompart$Po.COLUMNS.BO#.name()))); 
			logmnrIndcompart$Po.setPart#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndcompart$Po.COLUMNS.PART#.name()))); 
			logmnrIndcompart$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndcompart$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrIndcompart$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndcompart$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrIndcompart$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrIndcompart$Po logmnrIndcompart$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrIndcompart$Po.COLUMNS.OBJ#.name(), logmnrIndcompart$Po.getObj#()); 
			dataObject.setValue(LogmnrIndcompart$Po.COLUMNS.DATAOBJ#.name(), logmnrIndcompart$Po.getDataobj#()); 
			dataObject.setValue(LogmnrIndcompart$Po.COLUMNS.BO#.name(), logmnrIndcompart$Po.getBo#()); 
			dataObject.setValue(LogmnrIndcompart$Po.COLUMNS.PART#.name(), logmnrIndcompart$Po.getPart#()); 
			dataObject.setValue(LogmnrIndcompart$Po.COLUMNS.LOGMNR_UID.name(), logmnrIndcompart$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrIndcompart$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrIndcompart$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrIndcompart$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrIndcompart$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrIndcompart$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrIndcompart$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
