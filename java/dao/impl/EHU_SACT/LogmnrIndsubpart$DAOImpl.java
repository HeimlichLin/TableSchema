package com.doc.common.dao.impl; 
 
public class LogmnrIndsubpart$DAOImpl extends GeneralDAOImpl<LogmnrIndsubpart$Po> implements ILogmnrIndsubpart$DAO { 
	public static final LogmnrIndsubpart$DAOImpl INSTANCE = new LogmnrIndsubpart$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_INDSUBPART$"; 

	public LogmnrIndsubpart$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrIndsubpart$Po> CONVERTER = new MapConverter<LogmnrIndsubpart$Po>() { 
 
		@Override 
		public LogmnrIndsubpart$Po convert(final DataObject dataObject) { 
			final LogmnrIndsubpart$Po logmnrIndsubpart$Po = new LogmnrIndsubpart$Po(); 
			logmnrIndsubpart$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndsubpart$Po.COLUMNS.OBJ#.name()))); 
			logmnrIndsubpart$Po.setDataobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndsubpart$Po.COLUMNS.DATAOBJ#.name()))); 
			logmnrIndsubpart$Po.setPobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndsubpart$Po.COLUMNS.POBJ#.name()))); 
			logmnrIndsubpart$Po.setSubpart#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndsubpart$Po.COLUMNS.SUBPART#.name()))); 
			logmnrIndsubpart$Po.setTs#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndsubpart$Po.COLUMNS.TS#.name()))); 
			logmnrIndsubpart$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndsubpart$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrIndsubpart$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIndsubpart$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrIndsubpart$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrIndsubpart$Po logmnrIndsubpart$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrIndsubpart$Po.COLUMNS.OBJ#.name(), logmnrIndsubpart$Po.getObj#()); 
			dataObject.setValue(LogmnrIndsubpart$Po.COLUMNS.DATAOBJ#.name(), logmnrIndsubpart$Po.getDataobj#()); 
			dataObject.setValue(LogmnrIndsubpart$Po.COLUMNS.POBJ#.name(), logmnrIndsubpart$Po.getPobj#()); 
			dataObject.setValue(LogmnrIndsubpart$Po.COLUMNS.SUBPART#.name(), logmnrIndsubpart$Po.getSubpart#()); 
			dataObject.setValue(LogmnrIndsubpart$Po.COLUMNS.TS#.name(), logmnrIndsubpart$Po.getTs#()); 
			dataObject.setValue(LogmnrIndsubpart$Po.COLUMNS.LOGMNR_UID.name(), logmnrIndsubpart$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrIndsubpart$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrIndsubpart$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrIndsubpart$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrIndsubpart$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrIndsubpart$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrIndsubpart$Po.COLUMNS.POBJ#.name(), po.getPobj#()); 
		sqlWhere.add(LogmnrIndsubpart$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
