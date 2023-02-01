package com.doc.common.dao.impl; 
 
public class LogmnrTs$DAOImpl extends GeneralDAOImpl<LogmnrTs$Po> implements ILogmnrTs$DAO { 
	public static final LogmnrTs$DAOImpl INSTANCE = new LogmnrTs$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_TS$"; 

	public LogmnrTs$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrTs$Po> CONVERTER = new MapConverter<LogmnrTs$Po>() { 
 
		@Override 
		public LogmnrTs$Po convert(final DataObject dataObject) { 
			final LogmnrTs$Po logmnrTs$Po = new LogmnrTs$Po(); 
			logmnrTs$Po.setTs#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTs$Po.COLUMNS.TS#.name()))); 
			logmnrTs$Po.setName(dataObject.getString(LogmnrTs$Po.COLUMNS.NAME.name())); 
			logmnrTs$Po.setOwner#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTs$Po.COLUMNS.OWNER#.name()))); 
			logmnrTs$Po.setBlocksize(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTs$Po.COLUMNS.BLOCKSIZE.name()))); 
			logmnrTs$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTs$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrTs$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrTs$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrTs$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrTs$Po logmnrTs$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrTs$Po.COLUMNS.TS#.name(), logmnrTs$Po.getTs#()); 
			dataObject.setValue(LogmnrTs$Po.COLUMNS.NAME.name(), logmnrTs$Po.getName()); 
			dataObject.setValue(LogmnrTs$Po.COLUMNS.OWNER#.name(), logmnrTs$Po.getOwner#()); 
			dataObject.setValue(LogmnrTs$Po.COLUMNS.BLOCKSIZE.name(), logmnrTs$Po.getBlocksize()); 
			dataObject.setValue(LogmnrTs$Po.COLUMNS.LOGMNR_UID.name(), logmnrTs$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrTs$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrTs$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrTs$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrTs$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrTs$Po.COLUMNS.TS#.name(), po.getTs#()); 
		sqlWhere.add(LogmnrTs$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
