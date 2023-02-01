package com.doc.common.dao.impl; 
 
public class LogmnrColtype$DAOImpl extends GeneralDAOImpl<LogmnrColtype$Po> implements ILogmnrColtype$DAO { 
	public static final LogmnrColtype$DAOImpl INSTANCE = new LogmnrColtype$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_COLTYPE$"; 

	public LogmnrColtype$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrColtype$Po> CONVERTER = new MapConverter<LogmnrColtype$Po>() { 
 
		@Override 
		public LogmnrColtype$Po convert(final DataObject dataObject) { 
			final LogmnrColtype$Po logmnrColtype$Po = new LogmnrColtype$Po(); 
			logmnrColtype$Po.setCol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.COL#.name()))); 
			logmnrColtype$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.INTCOL#.name()))); 
			logmnrColtype$Po.setToid(); 
			logmnrColtype$Po.setVersion#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.VERSION#.name()))); 
			logmnrColtype$Po.setPacked(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.PACKED.name()))); 
			logmnrColtype$Po.setIntcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.INTCOLS.name()))); 
			logmnrColtype$Po.setIntcol#s(); 
			logmnrColtype$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.FLAGS.name()))); 
			logmnrColtype$Po.setTypidcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.TYPIDCOL#.name()))); 
			logmnrColtype$Po.setSynobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.SYNOBJ#.name()))); 
			logmnrColtype$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.OBJ#.name()))); 
			logmnrColtype$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrColtype$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrColtype$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrColtype$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrColtype$Po logmnrColtype$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.COL#.name(), logmnrColtype$Po.getCol#()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.INTCOL#.name(), logmnrColtype$Po.getIntcol#()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.TOID.name(), logmnrColtype$Po.getToid()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.VERSION#.name(), logmnrColtype$Po.getVersion#()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.PACKED.name(), logmnrColtype$Po.getPacked()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.INTCOLS.name(), logmnrColtype$Po.getIntcols()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.INTCOL#S.name(), logmnrColtype$Po.getIntcol#s()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.FLAGS.name(), logmnrColtype$Po.getFlags()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.TYPIDCOL#.name(), logmnrColtype$Po.getTypidcol#()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.SYNOBJ#.name(), logmnrColtype$Po.getSynobj#()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.OBJ#.name(), logmnrColtype$Po.getObj#()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.LOGMNR_UID.name(), logmnrColtype$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrColtype$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrColtype$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrColtype$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrColtype$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrColtype$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrColtype$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrColtype$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
