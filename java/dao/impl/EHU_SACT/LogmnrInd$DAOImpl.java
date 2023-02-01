package com.doc.common.dao.impl; 
 
public class LogmnrInd$DAOImpl extends GeneralDAOImpl<LogmnrInd$Po> implements ILogmnrInd$DAO { 
	public static final LogmnrInd$DAOImpl INSTANCE = new LogmnrInd$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_IND$"; 

	public LogmnrInd$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrInd$Po> CONVERTER = new MapConverter<LogmnrInd$Po>() { 
 
		@Override 
		public LogmnrInd$Po convert(final DataObject dataObject) { 
			final LogmnrInd$Po logmnrInd$Po = new LogmnrInd$Po(); 
			logmnrInd$Po.setBo#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrInd$Po.COLUMNS.BO#.name()))); 
			logmnrInd$Po.setCols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrInd$Po.COLUMNS.COLS.name()))); 
			logmnrInd$Po.setType#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrInd$Po.COLUMNS.TYPE#.name()))); 
			logmnrInd$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrInd$Po.COLUMNS.FLAGS.name()))); 
			logmnrInd$Po.setProperty(BigDecimalUtils.formObj(dataObject.getValue(LogmnrInd$Po.COLUMNS.PROPERTY.name()))); 
			logmnrInd$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrInd$Po.COLUMNS.OBJ#.name()))); 
			logmnrInd$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrInd$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrInd$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrInd$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrInd$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrInd$Po logmnrInd$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrInd$Po.COLUMNS.BO#.name(), logmnrInd$Po.getBo#()); 
			dataObject.setValue(LogmnrInd$Po.COLUMNS.COLS.name(), logmnrInd$Po.getCols()); 
			dataObject.setValue(LogmnrInd$Po.COLUMNS.TYPE#.name(), logmnrInd$Po.getType#()); 
			dataObject.setValue(LogmnrInd$Po.COLUMNS.FLAGS.name(), logmnrInd$Po.getFlags()); 
			dataObject.setValue(LogmnrInd$Po.COLUMNS.PROPERTY.name(), logmnrInd$Po.getProperty()); 
			dataObject.setValue(LogmnrInd$Po.COLUMNS.OBJ#.name(), logmnrInd$Po.getObj#()); 
			dataObject.setValue(LogmnrInd$Po.COLUMNS.LOGMNR_UID.name(), logmnrInd$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrInd$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrInd$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrInd$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrInd$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrInd$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrInd$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
