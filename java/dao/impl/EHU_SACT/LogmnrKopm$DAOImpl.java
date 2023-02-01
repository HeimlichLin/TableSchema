package com.doc.common.dao.impl; 
 
public class LogmnrKopm$DAOImpl extends GeneralDAOImpl<LogmnrKopm$Po> implements ILogmnrKopm$DAO { 
	public static final LogmnrKopm$DAOImpl INSTANCE = new LogmnrKopm$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_KOPM$"; 

	public LogmnrKopm$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrKopm$Po> CONVERTER = new MapConverter<LogmnrKopm$Po>() { 
 
		@Override 
		public LogmnrKopm$Po convert(final DataObject dataObject) { 
			final LogmnrKopm$Po logmnrKopm$Po = new LogmnrKopm$Po(); 
			logmnrKopm$Po.setLength(BigDecimalUtils.formObj(dataObject.getValue(LogmnrKopm$Po.COLUMNS.LENGTH.name()))); 
			logmnrKopm$Po.setMetadata(); 
			logmnrKopm$Po.setName(dataObject.getString(LogmnrKopm$Po.COLUMNS.NAME.name())); 
			logmnrKopm$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrKopm$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrKopm$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrKopm$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrKopm$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrKopm$Po logmnrKopm$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrKopm$Po.COLUMNS.LENGTH.name(), logmnrKopm$Po.getLength()); 
			dataObject.setValue(LogmnrKopm$Po.COLUMNS.METADATA.name(), logmnrKopm$Po.getMetadata()); 
			dataObject.setValue(LogmnrKopm$Po.COLUMNS.NAME.name(), logmnrKopm$Po.getName()); 
			dataObject.setValue(LogmnrKopm$Po.COLUMNS.LOGMNR_UID.name(), logmnrKopm$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrKopm$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrKopm$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrKopm$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrKopm$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrKopm$Po.COLUMNS.NAME.name(), po.getName()); 
		sqlWhere.add(LogmnrKopm$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
