package com.doc.common.dao.impl; 
 
public class LogmnrSessionEvolve$DAOImpl extends GeneralDAOImpl<LogmnrSessionEvolve$Po> implements ILogmnrSessionEvolve$DAO { 
	public static final LogmnrSessionEvolve$DAOImpl INSTANCE = new LogmnrSessionEvolve$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_SESSION_EVOLVE$"; 

	public LogmnrSessionEvolve$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrSessionEvolve$Po> CONVERTER = new MapConverter<LogmnrSessionEvolve$Po>() { 
 
		@Override 
		public LogmnrSessionEvolve$Po convert(final DataObject dataObject) { 
			final LogmnrSessionEvolve$Po logmnrSessionEvolve$Po = new LogmnrSessionEvolve$Po(); 
			logmnrSessionEvolve$Po.setBranchLevel(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.BRANCH_LEVEL.name()))); 
			logmnrSessionEvolve$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.SESSION#.name()))); 
			logmnrSessionEvolve$Po.setDbId(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.DB_ID.name()))); 
			logmnrSessionEvolve$Po.setResetScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.RESET_SCN.name()))); 
			logmnrSessionEvolve$Po.setResetTimestamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.RESET_TIMESTAMP.name()))); 
			logmnrSessionEvolve$Po.setPrevResetScn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.PREV_RESET_SCN.name()))); 
			logmnrSessionEvolve$Po.setPrevResetTimestamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.PREV_RESET_TIMESTAMP.name()))); 
			logmnrSessionEvolve$Po.setStatus(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.STATUS.name()))); 
			logmnrSessionEvolve$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.SPARE1.name()))); 
			logmnrSessionEvolve$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.SPARE2.name()))); 
			logmnrSessionEvolve$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.SPARE3.name()))); 
			logmnrSessionEvolve$Po.setSpare4(TimestampUtils.of(dataObject.getValue(LogmnrSessionEvolve$Po.COLUMNS.SPARE4.name()))); 
			return logmnrSessionEvolve$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrSessionEvolve$Po logmnrSessionEvolve$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.BRANCH_LEVEL.name(), logmnrSessionEvolve$Po.getBranchLevel()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.SESSION#.name(), logmnrSessionEvolve$Po.getSession#()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.DB_ID.name(), logmnrSessionEvolve$Po.getDbId()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.RESET_SCN.name(), logmnrSessionEvolve$Po.getResetScn()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.RESET_TIMESTAMP.name(), logmnrSessionEvolve$Po.getResetTimestamp()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.PREV_RESET_SCN.name(), logmnrSessionEvolve$Po.getPrevResetScn()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.PREV_RESET_TIMESTAMP.name(), logmnrSessionEvolve$Po.getPrevResetTimestamp()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.STATUS.name(), logmnrSessionEvolve$Po.getStatus()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.SPARE1.name(), logmnrSessionEvolve$Po.getSpare1()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.SPARE2.name(), logmnrSessionEvolve$Po.getSpare2()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.SPARE3.name(), logmnrSessionEvolve$Po.getSpare3()); 
			dataObject.setValue(LogmnrSessionEvolve$Po.COLUMNS.SPARE4.name(), logmnrSessionEvolve$Po.getSpare4()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrSessionEvolve$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrSessionEvolve$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrSessionEvolve$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrSessionEvolve$Po.COLUMNS.DB_ID.name(), po.getDbId()); 
		sqlWhere.add(LogmnrSessionEvolve$Po.COLUMNS.RESET_SCN.name(), po.getResetScn()); 
		sqlWhere.add(LogmnrSessionEvolve$Po.COLUMNS.RESET_TIMESTAMP.name(), po.getResetTimestamp()); 
		return sqlWhere; 
	} 
 
} 
