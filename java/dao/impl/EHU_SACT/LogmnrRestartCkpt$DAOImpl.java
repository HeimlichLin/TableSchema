package com.doc.common.dao.impl; 
 
public class LogmnrRestartCkpt$DAOImpl extends GeneralDAOImpl<LogmnrRestartCkpt$Po> implements ILogmnrRestartCkpt$DAO { 
	public static final LogmnrRestartCkpt$DAOImpl INSTANCE = new LogmnrRestartCkpt$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_RESTART_CKPT$"; 

	public LogmnrRestartCkpt$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrRestartCkpt$Po> CONVERTER = new MapConverter<LogmnrRestartCkpt$Po>() { 
 
		@Override 
		public LogmnrRestartCkpt$Po convert(final DataObject dataObject) { 
			final LogmnrRestartCkpt$Po logmnrRestartCkpt$Po = new LogmnrRestartCkpt$Po(); 
			logmnrRestartCkpt$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.SESSION#.name()))); 
			logmnrRestartCkpt$Po.setValid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.VALID.name()))); 
			logmnrRestartCkpt$Po.setCkptScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.CKPT_SCN.name()))); 
			logmnrRestartCkpt$Po.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.XIDUSN.name()))); 
			logmnrRestartCkpt$Po.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.XIDSLT.name()))); 
			logmnrRestartCkpt$Po.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.XIDSQN.name()))); 
			logmnrRestartCkpt$Po.setSessionNum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.SESSION_NUM.name()))); 
			logmnrRestartCkpt$Po.setSerialNum(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.SERIAL_NUM.name()))); 
			logmnrRestartCkpt$Po.setCkptInfo(); 
			logmnrRestartCkpt$Po.setFlag(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.FLAG.name()))); 
			logmnrRestartCkpt$Po.setOffset(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.OFFSET.name()))); 
			logmnrRestartCkpt$Po.setClientData(); 
			logmnrRestartCkpt$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.SPARE1.name()))); 
			logmnrRestartCkpt$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrRestartCkpt$Po.COLUMNS.SPARE2.name()))); 
			return logmnrRestartCkpt$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrRestartCkpt$Po logmnrRestartCkpt$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.SESSION#.name(), logmnrRestartCkpt$Po.getSession#()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.VALID.name(), logmnrRestartCkpt$Po.getValid()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.CKPT_SCN.name(), logmnrRestartCkpt$Po.getCkptScn()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.XIDUSN.name(), logmnrRestartCkpt$Po.getXidusn()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.XIDSLT.name(), logmnrRestartCkpt$Po.getXidslt()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.XIDSQN.name(), logmnrRestartCkpt$Po.getXidsqn()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.SESSION_NUM.name(), logmnrRestartCkpt$Po.getSessionNum()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.SERIAL_NUM.name(), logmnrRestartCkpt$Po.getSerialNum()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.CKPT_INFO.name(), logmnrRestartCkpt$Po.getCkptInfo()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.FLAG.name(), logmnrRestartCkpt$Po.getFlag()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.OFFSET.name(), logmnrRestartCkpt$Po.getOffset()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.CLIENT_DATA.name(), logmnrRestartCkpt$Po.getClientData()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.SPARE1.name(), logmnrRestartCkpt$Po.getSpare1()); 
			dataObject.setValue(LogmnrRestartCkpt$Po.COLUMNS.SPARE2.name(), logmnrRestartCkpt$Po.getSpare2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrRestartCkpt$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrRestartCkpt$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrRestartCkpt$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrRestartCkpt$Po.COLUMNS.CKPT_SCN.name(), po.getCkptScn()); 
		sqlWhere.add(LogmnrRestartCkpt$Po.COLUMNS.XIDUSN.name(), po.getXidusn()); 
		sqlWhere.add(LogmnrRestartCkpt$Po.COLUMNS.XIDSLT.name(), po.getXidslt()); 
		sqlWhere.add(LogmnrRestartCkpt$Po.COLUMNS.XIDSQN.name(), po.getXidsqn()); 
		sqlWhere.add(LogmnrRestartCkpt$Po.COLUMNS.SESSION_NUM.name(), po.getSessionNum()); 
		sqlWhere.add(LogmnrRestartCkpt$Po.COLUMNS.SERIAL_NUM.name(), po.getSerialNum()); 
		return sqlWhere; 
	} 
 
} 
