package com.doc.common.dao.impl; 
 
public class LogmnrTab$DAOImpl extends GeneralDAOImpl<LogmnrTab$Po> implements ILogmnrTab$DAO { 
	public static final LogmnrTab$DAOImpl INSTANCE = new LogmnrTab$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_TAB$"; 

	public LogmnrTab$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrTab$Po> CONVERTER = new MapConverter<LogmnrTab$Po>() { 
 
		@Override 
		public LogmnrTab$Po convert(final DataObject dataObject) { 
			final LogmnrTab$Po logmnrTab$Po = new LogmnrTab$Po(); 
			logmnrTab$Po.setTs#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.TS#.name()))); 
			logmnrTab$Po.setCols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.COLS.name()))); 
			logmnrTab$Po.setProperty(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.PROPERTY.name()))); 
			logmnrTab$Po.setIntcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.INTCOLS.name()))); 
			logmnrTab$Po.setKernelcols(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.KERNELCOLS.name()))); 
			logmnrTab$Po.setBobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.BOBJ#.name()))); 
			logmnrTab$Po.setTrigflag(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.TRIGFLAG.name()))); 
			logmnrTab$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.FLAGS.name()))); 
			logmnrTab$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.OBJ#.name()))); 
			logmnrTab$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrTab$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTab$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrTab$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrTab$Po logmnrTab$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.TS#.name(), logmnrTab$Po.getTs#()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.COLS.name(), logmnrTab$Po.getCols()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.PROPERTY.name(), logmnrTab$Po.getProperty()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.INTCOLS.name(), logmnrTab$Po.getIntcols()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.KERNELCOLS.name(), logmnrTab$Po.getKernelcols()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.BOBJ#.name(), logmnrTab$Po.getBobj#()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.TRIGFLAG.name(), logmnrTab$Po.getTrigflag()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.FLAGS.name(), logmnrTab$Po.getFlags()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.OBJ#.name(), logmnrTab$Po.getObj#()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.LOGMNR_UID.name(), logmnrTab$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrTab$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrTab$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrTab$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrTab$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrTab$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrTab$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
