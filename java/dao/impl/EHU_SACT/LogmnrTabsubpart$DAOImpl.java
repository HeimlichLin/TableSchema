package com.doc.common.dao.impl; 
 
public class LogmnrTabsubpart$DAOImpl extends GeneralDAOImpl<LogmnrTabsubpart$Po> implements ILogmnrTabsubpart$DAO { 
	public static final LogmnrTabsubpart$DAOImpl INSTANCE = new LogmnrTabsubpart$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_TABSUBPART$"; 

	public LogmnrTabsubpart$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrTabsubpart$Po> CONVERTER = new MapConverter<LogmnrTabsubpart$Po>() { 
 
		@Override 
		public LogmnrTabsubpart$Po convert(final DataObject dataObject) { 
			final LogmnrTabsubpart$Po logmnrTabsubpart$Po = new LogmnrTabsubpart$Po(); 
			logmnrTabsubpart$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabsubpart$Po.COLUMNS.OBJ#.name()))); 
			logmnrTabsubpart$Po.setDataobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabsubpart$Po.COLUMNS.DATAOBJ#.name()))); 
			logmnrTabsubpart$Po.setPobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabsubpart$Po.COLUMNS.POBJ#.name()))); 
			logmnrTabsubpart$Po.setSubpart#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabsubpart$Po.COLUMNS.SUBPART#.name()))); 
			logmnrTabsubpart$Po.setTs#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabsubpart$Po.COLUMNS.TS#.name()))); 
			logmnrTabsubpart$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabsubpart$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrTabsubpart$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTabsubpart$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrTabsubpart$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrTabsubpart$Po logmnrTabsubpart$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrTabsubpart$Po.COLUMNS.OBJ#.name(), logmnrTabsubpart$Po.getObj#()); 
			dataObject.setValue(LogmnrTabsubpart$Po.COLUMNS.DATAOBJ#.name(), logmnrTabsubpart$Po.getDataobj#()); 
			dataObject.setValue(LogmnrTabsubpart$Po.COLUMNS.POBJ#.name(), logmnrTabsubpart$Po.getPobj#()); 
			dataObject.setValue(LogmnrTabsubpart$Po.COLUMNS.SUBPART#.name(), logmnrTabsubpart$Po.getSubpart#()); 
			dataObject.setValue(LogmnrTabsubpart$Po.COLUMNS.TS#.name(), logmnrTabsubpart$Po.getTs#()); 
			dataObject.setValue(LogmnrTabsubpart$Po.COLUMNS.LOGMNR_UID.name(), logmnrTabsubpart$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrTabsubpart$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrTabsubpart$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrTabsubpart$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrTabsubpart$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrTabsubpart$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrTabsubpart$Po.COLUMNS.POBJ#.name(), po.getPobj#()); 
		sqlWhere.add(LogmnrTabsubpart$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
