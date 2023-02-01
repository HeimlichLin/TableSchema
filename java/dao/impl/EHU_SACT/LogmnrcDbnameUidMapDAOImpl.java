package com.doc.common.dao.impl; 
 
public class LogmnrcDbnameUidMapDAOImpl extends GeneralDAOImpl<LogmnrcDbnameUidMapPo> implements ILogmnrcDbnameUidMapDAO { 
	public static final LogmnrcDbnameUidMapDAOImpl INSTANCE = new LogmnrcDbnameUidMapDAOImpl(); 
	public static final String TABLENAME = "LOGMNRC_DBNAME_UID_MAP"; 

	public LogmnrcDbnameUidMapDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrcDbnameUidMapPo> CONVERTER = new MapConverter<LogmnrcDbnameUidMapPo>() { 
 
		@Override 
		public LogmnrcDbnameUidMapPo convert(final DataObject dataObject) { 
			final LogmnrcDbnameUidMapPo logmnrcDbnameUidMapPo = new LogmnrcDbnameUidMapPo(); 
			logmnrcDbnameUidMapPo.setGlobalName(dataObject.getString(LogmnrcDbnameUidMapPo.COLUMNS.GLOBAL_NAME.name())); 
			logmnrcDbnameUidMapPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcDbnameUidMapPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrcDbnameUidMapPo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrcDbnameUidMapPo.COLUMNS.FLAGS.name()))); 
			return logmnrcDbnameUidMapPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrcDbnameUidMapPo logmnrcDbnameUidMapPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrcDbnameUidMapPo.COLUMNS.GLOBAL_NAME.name(), logmnrcDbnameUidMapPo.getGlobalName()); 
			dataObject.setValue(LogmnrcDbnameUidMapPo.COLUMNS.LOGMNR_UID.name(), logmnrcDbnameUidMapPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrcDbnameUidMapPo.COLUMNS.FLAGS.name(), logmnrcDbnameUidMapPo.getFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrcDbnameUidMapPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrcDbnameUidMapPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrcDbnameUidMapPo.COLUMNS.GLOBAL_NAME.name(), po.getGlobalName()); 
		return sqlWhere; 
	} 
 
} 
