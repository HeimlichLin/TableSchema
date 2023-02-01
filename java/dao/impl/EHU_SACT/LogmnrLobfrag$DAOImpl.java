package com.doc.common.dao.impl; 
 
public class LogmnrLobfrag$DAOImpl extends GeneralDAOImpl<LogmnrLobfrag$Po> implements ILogmnrLobfrag$DAO { 
	public static final LogmnrLobfrag$DAOImpl INSTANCE = new LogmnrLobfrag$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_LOBFRAG$"; 

	public LogmnrLobfrag$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrLobfrag$Po> CONVERTER = new MapConverter<LogmnrLobfrag$Po>() { 
 
		@Override 
		public LogmnrLobfrag$Po convert(final DataObject dataObject) { 
			final LogmnrLobfrag$Po logmnrLobfrag$Po = new LogmnrLobfrag$Po(); 
			logmnrLobfrag$Po.setFragobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLobfrag$Po.COLUMNS.FRAGOBJ#.name()))); 
			logmnrLobfrag$Po.setParentobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLobfrag$Po.COLUMNS.PARENTOBJ#.name()))); 
			logmnrLobfrag$Po.setTabfragobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLobfrag$Po.COLUMNS.TABFRAGOBJ#.name()))); 
			logmnrLobfrag$Po.setIndfragobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLobfrag$Po.COLUMNS.INDFRAGOBJ#.name()))); 
			logmnrLobfrag$Po.setFrag#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLobfrag$Po.COLUMNS.FRAG#.name()))); 
			logmnrLobfrag$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLobfrag$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrLobfrag$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLobfrag$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrLobfrag$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrLobfrag$Po logmnrLobfrag$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrLobfrag$Po.COLUMNS.FRAGOBJ#.name(), logmnrLobfrag$Po.getFragobj#()); 
			dataObject.setValue(LogmnrLobfrag$Po.COLUMNS.PARENTOBJ#.name(), logmnrLobfrag$Po.getParentobj#()); 
			dataObject.setValue(LogmnrLobfrag$Po.COLUMNS.TABFRAGOBJ#.name(), logmnrLobfrag$Po.getTabfragobj#()); 
			dataObject.setValue(LogmnrLobfrag$Po.COLUMNS.INDFRAGOBJ#.name(), logmnrLobfrag$Po.getIndfragobj#()); 
			dataObject.setValue(LogmnrLobfrag$Po.COLUMNS.FRAG#.name(), logmnrLobfrag$Po.getFrag#()); 
			dataObject.setValue(LogmnrLobfrag$Po.COLUMNS.LOGMNR_UID.name(), logmnrLobfrag$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrLobfrag$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrLobfrag$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrLobfrag$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrLobfrag$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrLobfrag$Po.COLUMNS.FRAGOBJ#.name(), po.getFragobj#()); 
		sqlWhere.add(LogmnrLobfrag$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
