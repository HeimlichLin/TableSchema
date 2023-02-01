package com.doc.common.dao.impl; 
 
public class LogmnrSeed$DAOImpl extends GeneralDAOImpl<LogmnrSeed$Po> implements ILogmnrSeed$DAO { 
	public static final LogmnrSeed$DAOImpl INSTANCE = new LogmnrSeed$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_SEED$"; 

	public LogmnrSeed$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrSeed$Po> CONVERTER = new MapConverter<LogmnrSeed$Po>() { 
 
		@Override 
		public LogmnrSeed$Po convert(final DataObject dataObject) { 
			final LogmnrSeed$Po logmnrSeed$Po = new LogmnrSeed$Po(); 
			logmnrSeed$Po.setSeedVersion(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.SEED_VERSION.name()))); 
			logmnrSeed$Po.setGatherVersion(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.GATHER_VERSION.name()))); 
			logmnrSeed$Po.setSchemaname(dataObject.getString(LogmnrSeed$Po.COLUMNS.SCHEMANAME.name())); 
			logmnrSeed$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.OBJ#.name()))); 
			logmnrSeed$Po.setObjv#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.OBJV#.name()))); 
			logmnrSeed$Po.setTableName(dataObject.getString(LogmnrSeed$Po.COLUMNS.TABLE_NAME.name())); 
			logmnrSeed$Po.setColName(dataObject.getString(LogmnrSeed$Po.COLUMNS.COL_NAME.name())); 
			logmnrSeed$Po.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.COL#.name()))); 
			logmnrSeed$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.INTCOL#.name()))); 
			logmnrSeed$Po.setSegcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.SEGCOL#.name()))); 
			logmnrSeed$Po.setType#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.TYPE#.name()))); 
			logmnrSeed$Po.setLength(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.LENGTH.name()))); 
			logmnrSeed$Po.setPrecision#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.PRECISION#.name()))); 
			logmnrSeed$Po.setScale(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.SCALE.name()))); 
			logmnrSeed$Po.setNull$(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.NULL$.name()))); 
			logmnrSeed$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrSeed$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSeed$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrSeed$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrSeed$Po logmnrSeed$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.SEED_VERSION.name(), logmnrSeed$Po.getSeedVersion()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.GATHER_VERSION.name(), logmnrSeed$Po.getGatherVersion()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.SCHEMANAME.name(), logmnrSeed$Po.getSchemaname()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.OBJ#.name(), logmnrSeed$Po.getObj#()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.OBJV#.name(), logmnrSeed$Po.getObjv#()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.TABLE_NAME.name(), logmnrSeed$Po.getTableName()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.COL_NAME.name(), logmnrSeed$Po.getColName()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.COL#.name(), logmnrSeed$Po.getCol#()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.INTCOL#.name(), logmnrSeed$Po.getIntcol#()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.SEGCOL#.name(), logmnrSeed$Po.getSegcol#()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.TYPE#.name(), logmnrSeed$Po.getType#()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.LENGTH.name(), logmnrSeed$Po.getLength()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.PRECISION#.name(), logmnrSeed$Po.getPrecision#()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.SCALE.name(), logmnrSeed$Po.getScale()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.NULL$.name(), logmnrSeed$Po.getNull$()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.LOGMNR_UID.name(), logmnrSeed$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrSeed$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrSeed$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrSeed$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrSeed$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrSeed$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrSeed$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrSeed$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
