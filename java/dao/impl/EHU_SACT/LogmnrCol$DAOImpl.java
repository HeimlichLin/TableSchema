package com.doc.common.dao.impl; 
 
public class LogmnrCol$DAOImpl extends GeneralDAOImpl<LogmnrCol$Po> implements ILogmnrCol$DAO { 
	public static final LogmnrCol$DAOImpl INSTANCE = new LogmnrCol$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_COL$"; 

	public LogmnrCol$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrCol$Po> CONVERTER = new MapConverter<LogmnrCol$Po>() { 
 
		@Override 
		public LogmnrCol$Po convert(final DataObject dataObject) { 
			final LogmnrCol$Po logmnrCol$Po = new LogmnrCol$Po(); 
			logmnrCol$Po.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.COL#.name()))); 
			logmnrCol$Po.setSegcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.SEGCOL#.name()))); 
			logmnrCol$Po.setName(dataObject.getString(LogmnrCol$Po.COLUMNS.NAME.name())); 
			logmnrCol$Po.setType#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.TYPE#.name()))); 
			logmnrCol$Po.setLength(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.LENGTH.name()))); 
			logmnrCol$Po.setPrecision#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.PRECISION#.name()))); 
			logmnrCol$Po.setScale(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.SCALE.name()))); 
			logmnrCol$Po.setNull$(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.NULL$.name()))); 
			logmnrCol$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.INTCOL#.name()))); 
			logmnrCol$Po.setProperty(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.PROPERTY.name()))); 
			logmnrCol$Po.setCharsetid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.CHARSETID.name()))); 
			logmnrCol$Po.setCharsetform(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.CHARSETFORM.name()))); 
			logmnrCol$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.SPARE1.name()))); 
			logmnrCol$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.SPARE2.name()))); 
			logmnrCol$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.OBJ#.name()))); 
			logmnrCol$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrCol$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrCol$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrCol$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrCol$Po logmnrCol$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.COL#.name(), logmnrCol$Po.getCol#()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.SEGCOL#.name(), logmnrCol$Po.getSegcol#()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.NAME.name(), logmnrCol$Po.getName()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.TYPE#.name(), logmnrCol$Po.getType#()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.LENGTH.name(), logmnrCol$Po.getLength()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.PRECISION#.name(), logmnrCol$Po.getPrecision#()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.SCALE.name(), logmnrCol$Po.getScale()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.NULL$.name(), logmnrCol$Po.getNull$()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.INTCOL#.name(), logmnrCol$Po.getIntcol#()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.PROPERTY.name(), logmnrCol$Po.getProperty()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.CHARSETID.name(), logmnrCol$Po.getCharsetid()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.CHARSETFORM.name(), logmnrCol$Po.getCharsetform()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.SPARE1.name(), logmnrCol$Po.getSpare1()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.SPARE2.name(), logmnrCol$Po.getSpare2()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.OBJ#.name(), logmnrCol$Po.getObj#()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.LOGMNR_UID.name(), logmnrCol$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrCol$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrCol$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrCol$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrCol$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrCol$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrCol$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrCol$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
