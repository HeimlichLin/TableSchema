package com.doc.common.dao.impl; 
 
public class LogmnrRefcon$DAOImpl extends GeneralDAOImpl<LogmnrRefcon$Po> implements ILogmnrRefcon$DAO { 
	public static final LogmnrRefcon$DAOImpl INSTANCE = new LogmnrRefcon$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_REFCON$"; 

	public LogmnrRefcon$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrRefcon$Po> CONVERTER = new MapConverter<LogmnrRefcon$Po>() { 
 
		@Override 
		public LogmnrRefcon$Po convert(final DataObject dataObject) { 
			final LogmnrRefcon$Po logmnrRefcon$Po = new LogmnrRefcon$Po(); 
			logmnrRefcon$Po.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRefcon$Po.COLUMNS.COL#.name()))); 
			logmnrRefcon$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRefcon$Po.COLUMNS.INTCOL#.name()))); 
			logmnrRefcon$Po.setReftyp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRefcon$Po.COLUMNS.REFTYP.name()))); 
			logmnrRefcon$Po.setStabid(); 
			logmnrRefcon$Po.setExpctoid(); 
			logmnrRefcon$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRefcon$Po.COLUMNS.OBJ#.name()))); 
			logmnrRefcon$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRefcon$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrRefcon$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRefcon$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrRefcon$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrRefcon$Po logmnrRefcon$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrRefcon$Po.COLUMNS.COL#.name(), logmnrRefcon$Po.getCol#()); 
			dataObject.setValue(LogmnrRefcon$Po.COLUMNS.INTCOL#.name(), logmnrRefcon$Po.getIntcol#()); 
			dataObject.setValue(LogmnrRefcon$Po.COLUMNS.REFTYP.name(), logmnrRefcon$Po.getReftyp()); 
			dataObject.setValue(LogmnrRefcon$Po.COLUMNS.STABID.name(), logmnrRefcon$Po.getStabid()); 
			dataObject.setValue(LogmnrRefcon$Po.COLUMNS.EXPCTOID.name(), logmnrRefcon$Po.getExpctoid()); 
			dataObject.setValue(LogmnrRefcon$Po.COLUMNS.OBJ#.name(), logmnrRefcon$Po.getObj#()); 
			dataObject.setValue(LogmnrRefcon$Po.COLUMNS.LOGMNR_UID.name(), logmnrRefcon$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrRefcon$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrRefcon$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrRefcon$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrRefcon$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrRefcon$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrRefcon$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrRefcon$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
