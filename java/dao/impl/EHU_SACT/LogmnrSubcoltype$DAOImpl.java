package com.doc.common.dao.impl; 
 
public class LogmnrSubcoltype$DAOImpl extends GeneralDAOImpl<LogmnrSubcoltype$Po> implements ILogmnrSubcoltype$DAO { 
	public static final LogmnrSubcoltype$DAOImpl INSTANCE = new LogmnrSubcoltype$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_SUBCOLTYPE$"; 

	public LogmnrSubcoltype$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrSubcoltype$Po> CONVERTER = new MapConverter<LogmnrSubcoltype$Po>() { 
 
		@Override 
		public LogmnrSubcoltype$Po convert(final DataObject dataObject) { 
			final LogmnrSubcoltype$Po logmnrSubcoltype$Po = new LogmnrSubcoltype$Po(); 
			logmnrSubcoltype$Po.setIntcol#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSubcoltype$Po.COLUMNS.INTCOL#.name()))); 
			logmnrSubcoltype$Po.setToid(); 
			logmnrSubcoltype$Po.setVersion#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSubcoltype$Po.COLUMNS.VERSION#.name()))); 
			logmnrSubcoltype$Po.setIntcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSubcoltype$Po.COLUMNS.INTCOLS.name()))); 
			logmnrSubcoltype$Po.setIntcol#s(); 
			logmnrSubcoltype$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSubcoltype$Po.COLUMNS.FLAGS.name()))); 
			logmnrSubcoltype$Po.setSynobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSubcoltype$Po.COLUMNS.SYNOBJ#.name()))); 
			logmnrSubcoltype$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSubcoltype$Po.COLUMNS.OBJ#.name()))); 
			logmnrSubcoltype$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSubcoltype$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrSubcoltype$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSubcoltype$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrSubcoltype$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrSubcoltype$Po logmnrSubcoltype$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.INTCOL#.name(), logmnrSubcoltype$Po.getIntcol#()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.TOID.name(), logmnrSubcoltype$Po.getToid()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.VERSION#.name(), logmnrSubcoltype$Po.getVersion#()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.INTCOLS.name(), logmnrSubcoltype$Po.getIntcols()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.INTCOL#S.name(), logmnrSubcoltype$Po.getIntcol#s()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.FLAGS.name(), logmnrSubcoltype$Po.getFlags()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.SYNOBJ#.name(), logmnrSubcoltype$Po.getSynobj#()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.OBJ#.name(), logmnrSubcoltype$Po.getObj#()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.LOGMNR_UID.name(), logmnrSubcoltype$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrSubcoltype$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrSubcoltype$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrSubcoltype$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrSubcoltype$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrSubcoltype$Po.COLUMNS.INTCOL#.name(), po.getIntcol#()); 
		sqlWhere.add(LogmnrSubcoltype$Po.COLUMNS.TOID.name(), po.getToid()); 
		sqlWhere.add(LogmnrSubcoltype$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrSubcoltype$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
