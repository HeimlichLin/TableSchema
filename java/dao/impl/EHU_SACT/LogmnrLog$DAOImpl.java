package com.doc.common.dao.impl; 
 
public class LogmnrLog$DAOImpl extends GeneralDAOImpl<LogmnrLog$Po> implements ILogmnrLog$DAO { 
	public static final LogmnrLog$DAOImpl INSTANCE = new LogmnrLog$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_LOG$"; 

	public LogmnrLog$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrLog$Po> CONVERTER = new MapConverter<LogmnrLog$Po>() { 
 
		@Override 
		public LogmnrLog$Po convert(final DataObject dataObject) { 
			final LogmnrLog$Po logmnrLog$Po = new LogmnrLog$Po(); 
			logmnrLog$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.SESSION#.name()))); 
			logmnrLog$Po.setThread#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.THREAD#.name()))); 
			logmnrLog$Po.setSequence#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.SEQUENCE#.name()))); 
			logmnrLog$Po.setFirstChange#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.FIRST_CHANGE#.name()))); 
			logmnrLog$Po.setNextChange#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.NEXT_CHANGE#.name()))); 
			logmnrLog$Po.setFirstTime(TimestampUtils.of(dataObject.getValue(LogmnrLog$Po.COLUMNS.FIRST_TIME.name()))); 
			logmnrLog$Po.setNextTime(TimestampUtils.of(dataObject.getValue(LogmnrLog$Po.COLUMNS.NEXT_TIME.name()))); 
			logmnrLog$Po.setFileName(dataObject.getString(LogmnrLog$Po.COLUMNS.FILE_NAME.name())); 
			logmnrLog$Po.setStatus(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.STATUS.name()))); 
			logmnrLog$Po.setInfo(dataObject.getString(LogmnrLog$Po.COLUMNS.INFO.name())); 
			logmnrLog$Po.setTimestamp(TimestampUtils.of(dataObject.getValue(LogmnrLog$Po.COLUMNS.TIMESTAMP.name()))); 
			logmnrLog$Po.setDictBegin(dataObject.getString(LogmnrLog$Po.COLUMNS.DICT_BEGIN.name())); 
			logmnrLog$Po.setDictEnd(dataObject.getString(LogmnrLog$Po.COLUMNS.DICT_END.name())); 
			logmnrLog$Po.setStatusInfo(dataObject.getString(LogmnrLog$Po.COLUMNS.STATUS_INFO.name())); 
			logmnrLog$Po.setDbId(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.DB_ID.name()))); 
			logmnrLog$Po.setResetlogsChange#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.RESETLOGS_CHANGE#.name()))); 
			logmnrLog$Po.setResetTimestamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.RESET_TIMESTAMP.name()))); 
			logmnrLog$Po.setPrevResetlogsChange#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.PREV_RESETLOGS_CHANGE#.name()))); 
			logmnrLog$Po.setPrevResetTimestamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.PREV_RESET_TIMESTAMP.name()))); 
			logmnrLog$Po.setBlocks(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.BLOCKS.name()))); 
			logmnrLog$Po.setBlockSize(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.BLOCK_SIZE.name()))); 
			logmnrLog$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.FLAGS.name()))); 
			logmnrLog$Po.setContents(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.CONTENTS.name()))); 
			logmnrLog$Po.setRecid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.RECID.name()))); 
			logmnrLog$Po.setRecstamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.RECSTAMP.name()))); 
			logmnrLog$Po.setMarkDeleteTimestamp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.MARK_DELETE_TIMESTAMP.name()))); 
			logmnrLog$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.SPARE1.name()))); 
			logmnrLog$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.SPARE2.name()))); 
			logmnrLog$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.SPARE3.name()))); 
			logmnrLog$Po.setSpare4(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.SPARE4.name()))); 
			logmnrLog$Po.setSpare5(BigDecimalUtils.formObj(dataObject.getValue(LogmnrLog$Po.COLUMNS.SPARE5.name()))); 
			return logmnrLog$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrLog$Po logmnrLog$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.SESSION#.name(), logmnrLog$Po.getSession#()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.THREAD#.name(), logmnrLog$Po.getThread#()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.SEQUENCE#.name(), logmnrLog$Po.getSequence#()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.FIRST_CHANGE#.name(), logmnrLog$Po.getFirstChange#()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.NEXT_CHANGE#.name(), logmnrLog$Po.getNextChange#()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.FIRST_TIME.name(), logmnrLog$Po.getFirstTime()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.NEXT_TIME.name(), logmnrLog$Po.getNextTime()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.FILE_NAME.name(), logmnrLog$Po.getFileName()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.STATUS.name(), logmnrLog$Po.getStatus()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.INFO.name(), logmnrLog$Po.getInfo()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.TIMESTAMP.name(), logmnrLog$Po.getTimestamp()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.DICT_BEGIN.name(), logmnrLog$Po.getDictBegin()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.DICT_END.name(), logmnrLog$Po.getDictEnd()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.STATUS_INFO.name(), logmnrLog$Po.getStatusInfo()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.DB_ID.name(), logmnrLog$Po.getDbId()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.RESETLOGS_CHANGE#.name(), logmnrLog$Po.getResetlogsChange#()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.RESET_TIMESTAMP.name(), logmnrLog$Po.getResetTimestamp()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.PREV_RESETLOGS_CHANGE#.name(), logmnrLog$Po.getPrevResetlogsChange#()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.PREV_RESET_TIMESTAMP.name(), logmnrLog$Po.getPrevResetTimestamp()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.BLOCKS.name(), logmnrLog$Po.getBlocks()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.BLOCK_SIZE.name(), logmnrLog$Po.getBlockSize()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.FLAGS.name(), logmnrLog$Po.getFlags()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.CONTENTS.name(), logmnrLog$Po.getContents()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.RECID.name(), logmnrLog$Po.getRecid()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.RECSTAMP.name(), logmnrLog$Po.getRecstamp()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.MARK_DELETE_TIMESTAMP.name(), logmnrLog$Po.getMarkDeleteTimestamp()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.SPARE1.name(), logmnrLog$Po.getSpare1()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.SPARE2.name(), logmnrLog$Po.getSpare2()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.SPARE3.name(), logmnrLog$Po.getSpare3()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.SPARE4.name(), logmnrLog$Po.getSpare4()); 
			dataObject.setValue(LogmnrLog$Po.COLUMNS.SPARE5.name(), logmnrLog$Po.getSpare5()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrLog$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrLog$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrLog$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrLog$Po.COLUMNS.THREAD#.name(), po.getThread#()); 
		sqlWhere.add(LogmnrLog$Po.COLUMNS.SEQUENCE#.name(), po.getSequence#()); 
		sqlWhere.add(LogmnrLog$Po.COLUMNS.FIRST_CHANGE#.name(), po.getFirstChange#()); 
		sqlWhere.add(LogmnrLog$Po.COLUMNS.DB_ID.name(), po.getDbId()); 
		sqlWhere.add(LogmnrLog$Po.COLUMNS.RESETLOGS_CHANGE#.name(), po.getResetlogsChange#()); 
		sqlWhere.add(LogmnrLog$Po.COLUMNS.RESET_TIMESTAMP.name(), po.getResetTimestamp()); 
		return sqlWhere; 
	} 
 
} 
