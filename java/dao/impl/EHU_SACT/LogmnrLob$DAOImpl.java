package com.doc.common.dao.impl; 
 
public class LogmnrLob$DAOImpl extends GeneralDAOImpl<LogmnrLob$Po> implements ILogmnrLob$DAO { 
	public static final LogmnrLob$DAOImpl INSTANCE = new LogmnrLob$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_LOB$"; 

	public LogmnrLob$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrLob$Po> CONVERTER = new MapConverter<LogmnrLob$Po>() { 
 
		@Override 
		public LogmnrLob$Po convert(final DataObject dataObject) { 
			final LogmnrLob$Po logmnrLob$Po = new LogmnrLob$Po(); 
			logmnrLob$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLob$Po.COLUMNS.OBJ#.name()))); 
			logmnrLob$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLob$Po.COLUMNS.INTCOL#.name()))); 
			logmnrLob$Po.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLob$Po.COLUMNS.COL#.name()))); 
			logmnrLob$Po.setLobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLob$Po.COLUMNS.LOBJ#.name()))); 
			logmnrLob$Po.setChunk(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLob$Po.COLUMNS.CHUNK.name()))); 
			logmnrLob$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLob$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrLob$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLob$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrLob$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrLob$Po logmnrLob$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrLob$Po.COLUMNS.OBJ#.name(), logmnrLob$Po.getObj#()); 
			dataObject.setValue(LogmnrLob$Po.COLUMNS.INTCOL#.name(), logmnrLob$Po.getIntcol#()); 
			dataObject.setValue(LogmnrLob$Po.COLUMNS.COL#.name(), logmnrLob$Po.getCol#()); 
			dataObject.setValue(LogmnrLob$Po.COLUMNS.LOBJ#.name(), logmnrLob$Po.getLobj#()); 
			dataObject.setValue(LogmnrLob$Po.COLUMNS.CHUNK.name(), logmnrLob$Po.getChunk()); 
			dataObject.setValue(LogmnrLob$Po.COLUMNS.LOGMNR_UID.name(), logmnrLob$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrLob$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrLob$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrLob$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrLob$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrLob$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrLob$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrLob$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
