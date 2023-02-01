package com.doc.common.dao.impl; 
 
public class LogmnrRestartCkptTxinfo$DAOImpl extends GeneralDAOImpl<LogmnrRestartCkptTxinfo$Po> implements ILogmnrRestartCkptTxinfo$DAO { 
	public static final LogmnrRestartCkptTxinfo$DAOImpl INSTANCE = new LogmnrRestartCkptTxinfo$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_RESTART_CKPT_TXINFO$"; 

	public LogmnrRestartCkptTxinfo$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrRestartCkptTxinfo$Po> CONVERTER = new MapConverter<LogmnrRestartCkptTxinfo$Po>() { 
 
		@Override 
		public LogmnrRestartCkptTxinfo$Po convert(final DataObject dataObject) { 
			final LogmnrRestartCkptTxinfo$Po logmnrRestartCkptTxinfo$Po = new LogmnrRestartCkptTxinfo$Po(); 
			logmnrRestartCkptTxinfo$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.SESSION#.name()))); 
			logmnrRestartCkptTxinfo$Po.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDUSN.name()))); 
			logmnrRestartCkptTxinfo$Po.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDSLT.name()))); 
			logmnrRestartCkptTxinfo$Po.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDSQN.name()))); 
			logmnrRestartCkptTxinfo$Po.setSessionNum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.SESSION_NUM.name()))); 
			logmnrRestartCkptTxinfo$Po.setSerialNum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.SERIAL_NUM.name()))); 
			logmnrRestartCkptTxinfo$Po.setFlag(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.FLAG.name()))); 
			logmnrRestartCkptTxinfo$Po.setStartScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.START_SCN.name()))); 
			logmnrRestartCkptTxinfo$Po.setEffectiveScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.EFFECTIVE_SCN.name()))); 
			logmnrRestartCkptTxinfo$Po.setOffset(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.OFFSET.name()))); 
			logmnrRestartCkptTxinfo$Po.setTxData(); 
			return logmnrRestartCkptTxinfo$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrRestartCkptTxinfo$Po logmnrRestartCkptTxinfo$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.SESSION#.name(), logmnrRestartCkptTxinfo$Po.getSession#()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDUSN.name(), logmnrRestartCkptTxinfo$Po.getXidusn()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDSLT.name(), logmnrRestartCkptTxinfo$Po.getXidslt()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDSQN.name(), logmnrRestartCkptTxinfo$Po.getXidsqn()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.SESSION_NUM.name(), logmnrRestartCkptTxinfo$Po.getSessionNum()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.SERIAL_NUM.name(), logmnrRestartCkptTxinfo$Po.getSerialNum()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.FLAG.name(), logmnrRestartCkptTxinfo$Po.getFlag()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.START_SCN.name(), logmnrRestartCkptTxinfo$Po.getStartScn()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.EFFECTIVE_SCN.name(), logmnrRestartCkptTxinfo$Po.getEffectiveScn()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.OFFSET.name(), logmnrRestartCkptTxinfo$Po.getOffset()); 
			dataObject.setValue(LogmnrRestartCkptTxinfo$Po.COLUMNS.TX_DATA.name(), logmnrRestartCkptTxinfo$Po.getTxData()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrRestartCkptTxinfo$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrRestartCkptTxinfo$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrRestartCkptTxinfo$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDUSN.name(), po.getXidusn()); 
		sqlWhere.add(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDSLT.name(), po.getXidslt()); 
		sqlWhere.add(LogmnrRestartCkptTxinfo$Po.COLUMNS.XIDSQN.name(), po.getXidsqn()); 
		sqlWhere.add(LogmnrRestartCkptTxinfo$Po.COLUMNS.SESSION_NUM.name(), po.getSessionNum()); 
		sqlWhere.add(LogmnrRestartCkptTxinfo$Po.COLUMNS.SERIAL_NUM.name(), po.getSerialNum()); 
		sqlWhere.add(LogmnrRestartCkptTxinfo$Po.COLUMNS.EFFECTIVE_SCN.name(), po.getEffectiveScn()); 
		return sqlWhere; 
	} 
 
} 
