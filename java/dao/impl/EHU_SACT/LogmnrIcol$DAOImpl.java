package com.doc.common.dao.impl; 
 
public class LogmnrIcol$DAOImpl extends GeneralDAOImpl<LogmnrIcol$Po> implements ILogmnrIcol$DAO { 
	public static final LogmnrIcol$DAOImpl INSTANCE = new LogmnrIcol$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_ICOL$"; 

	public LogmnrIcol$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrIcol$Po> CONVERTER = new MapConverter<LogmnrIcol$Po>() { 
 
		@Override 
		public LogmnrIcol$Po convert(final DataObject dataObject) { 
			final LogmnrIcol$Po logmnrIcol$Po = new LogmnrIcol$Po(); 
			logmnrIcol$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIcol$Po.COLUMNS.OBJ#.name()))); 
			logmnrIcol$Po.setBo#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIcol$Po.COLUMNS.BO#.name()))); 
			logmnrIcol$Po.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIcol$Po.COLUMNS.COL#.name()))); 
			logmnrIcol$Po.setPos#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIcol$Po.COLUMNS.POS#.name()))); 
			logmnrIcol$Po.setSegcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIcol$Po.COLUMNS.SEGCOL#.name()))); 
			logmnrIcol$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIcol$Po.COLUMNS.INTCOL#.name()))); 
			logmnrIcol$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIcol$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrIcol$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIcol$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrIcol$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrIcol$Po logmnrIcol$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrIcol$Po.COLUMNS.OBJ#.name(), logmnrIcol$Po.getObj#()); 
			dataObject.setValue(LogmnrIcol$Po.COLUMNS.BO#.name(), logmnrIcol$Po.getBo#()); 
			dataObject.setValue(LogmnrIcol$Po.COLUMNS.COL#.name(), logmnrIcol$Po.getCol#()); 
			dataObject.setValue(LogmnrIcol$Po.COLUMNS.POS#.name(), logmnrIcol$Po.getPos#()); 
			dataObject.setValue(LogmnrIcol$Po.COLUMNS.SEGCOL#.name(), logmnrIcol$Po.getSegcol#()); 
			dataObject.setValue(LogmnrIcol$Po.COLUMNS.INTCOL#.name(), logmnrIcol$Po.getIntcol#()); 
			dataObject.setValue(LogmnrIcol$Po.COLUMNS.LOGMNR_UID.name(), logmnrIcol$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrIcol$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrIcol$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrIcol$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrIcol$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrIcol$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrIcol$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrIcol$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
