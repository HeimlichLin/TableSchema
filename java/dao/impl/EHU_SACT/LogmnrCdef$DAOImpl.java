package com.doc.common.dao.impl; 
 
public class LogmnrCdef$DAOImpl extends GeneralDAOImpl<LogmnrCdef$Po> implements ILogmnrCdef$DAO { 
	public static final LogmnrCdef$DAOImpl INSTANCE = new LogmnrCdef$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_CDEF$"; 

	public LogmnrCdef$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrCdef$Po> CONVERTER = new MapConverter<LogmnrCdef$Po>() { 
 
		@Override 
		public LogmnrCdef$Po convert(final DataObject dataObject) { 
			final LogmnrCdef$Po logmnrCdef$Po = new LogmnrCdef$Po(); 
			logmnrCdef$Po.setCon#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.CON#.name()))); 
			logmnrCdef$Po.setCols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.COLS.name()))); 
			logmnrCdef$Po.setType#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.TYPE#.name()))); 
			logmnrCdef$Po.setRobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.ROBJ#.name()))); 
			logmnrCdef$Po.setRcon#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.RCON#.name()))); 
			logmnrCdef$Po.setEnabled(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.ENABLED.name()))); 
			logmnrCdef$Po.setDefer(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.DEFER.name()))); 
			logmnrCdef$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.OBJ#.name()))); 
			logmnrCdef$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrCdef$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCdef$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrCdef$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrCdef$Po logmnrCdef$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.CON#.name(), logmnrCdef$Po.getCon#()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.COLS.name(), logmnrCdef$Po.getCols()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.TYPE#.name(), logmnrCdef$Po.getType#()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.ROBJ#.name(), logmnrCdef$Po.getRobj#()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.RCON#.name(), logmnrCdef$Po.getRcon#()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.ENABLED.name(), logmnrCdef$Po.getEnabled()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.DEFER.name(), logmnrCdef$Po.getDefer()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.OBJ#.name(), logmnrCdef$Po.getObj#()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.LOGMNR_UID.name(), logmnrCdef$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrCdef$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrCdef$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrCdef$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrCdef$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrCdef$Po.COLUMNS.CON#.name(), po.getCon#()); 
		sqlWhere.add(LogmnrCdef$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
