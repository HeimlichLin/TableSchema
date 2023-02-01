package com.doc.common.dao.impl; 
 
public class LogmnrDictstate$DAOImpl extends GeneralDAOImpl<LogmnrDictstate$Po> implements ILogmnrDictstate$DAO { 
	public static final LogmnrDictstate$DAOImpl INSTANCE = new LogmnrDictstate$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_DICTSTATE$"; 

	public LogmnrDictstate$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrDictstate$Po> CONVERTER = new MapConverter<LogmnrDictstate$Po>() { 
 
		@Override 
		public LogmnrDictstate$Po convert(final DataObject dataObject) { 
			final LogmnrDictstate$Po logmnrDictstate$Po = new LogmnrDictstate$Po(); 
			logmnrDictstate$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrDictstate$Po.setStartScnbas(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.START_SCNBAS.name()))); 
			logmnrDictstate$Po.setStartScnwrp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.START_SCNWRP.name()))); 
			logmnrDictstate$Po.setEndScnbas(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.END_SCNBAS.name()))); 
			logmnrDictstate$Po.setEndScnwrp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.END_SCNWRP.name()))); 
			logmnrDictstate$Po.setRedoThread(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.REDO_THREAD.name()))); 
			logmnrDictstate$Po.setRbasqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.RBASQN.name()))); 
			logmnrDictstate$Po.setRbablk(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.RBABLK.name()))); 
			logmnrDictstate$Po.setRbabyte(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.RBABYTE.name()))); 
			logmnrDictstate$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrDictstate$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrDictstate$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrDictstate$Po logmnrDictstate$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.LOGMNR_UID.name(), logmnrDictstate$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.START_SCNBAS.name(), logmnrDictstate$Po.getStartScnbas()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.START_SCNWRP.name(), logmnrDictstate$Po.getStartScnwrp()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.END_SCNBAS.name(), logmnrDictstate$Po.getEndScnbas()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.END_SCNWRP.name(), logmnrDictstate$Po.getEndScnwrp()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.REDO_THREAD.name(), logmnrDictstate$Po.getRedoThread()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.RBASQN.name(), logmnrDictstate$Po.getRbasqn()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.RBABLK.name(), logmnrDictstate$Po.getRbablk()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.RBABYTE.name(), logmnrDictstate$Po.getRbabyte()); 
			dataObject.setValue(LogmnrDictstate$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrDictstate$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrDictstate$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrDictstate$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrDictstate$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
