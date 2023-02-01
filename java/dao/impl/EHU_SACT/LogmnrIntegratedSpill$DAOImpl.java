package com.doc.common.dao.impl; 
 
public class LogmnrIntegratedSpill$DAOImpl extends GeneralDAOImpl<LogmnrIntegratedSpill$Po> implements ILogmnrIntegratedSpill$DAO { 
	public static final LogmnrIntegratedSpill$DAOImpl INSTANCE = new LogmnrIntegratedSpill$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_INTEGRATED_SPILL$"; 

	public LogmnrIntegratedSpill$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrIntegratedSpill$Po> CONVERTER = new MapConverter<LogmnrIntegratedSpill$Po>() { 
 
		@Override 
		public LogmnrIntegratedSpill$Po convert(final DataObject dataObject) { 
			final LogmnrIntegratedSpill$Po logmnrIntegratedSpill$Po = new LogmnrIntegratedSpill$Po(); 
			logmnrIntegratedSpill$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.SESSION#.name()))); 
			logmnrIntegratedSpill$Po.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.XIDUSN.name()))); 
			logmnrIntegratedSpill$Po.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.XIDSLT.name()))); 
			logmnrIntegratedSpill$Po.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.XIDSQN.name()))); 
			logmnrIntegratedSpill$Po.setChunk(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.CHUNK.name()))); 
			logmnrIntegratedSpill$Po.setFlag(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.FLAG.name()))); 
			logmnrIntegratedSpill$Po.setCtime(TimestampUtils.of(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.CTIME.name()))); 
			logmnrIntegratedSpill$Po.setMtime(TimestampUtils.of(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.MTIME.name()))); 
			logmnrIntegratedSpill$Po.setSpillData(); 
			logmnrIntegratedSpill$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE1.name()))); 
			logmnrIntegratedSpill$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE2.name()))); 
			logmnrIntegratedSpill$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE3.name()))); 
			logmnrIntegratedSpill$Po.setSpare4(TimestampUtils.of(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE4.name()))); 
			logmnrIntegratedSpill$Po.setSpare5(TimestampUtils.of(dataObject.getValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE5.name()))); 
			return logmnrIntegratedSpill$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrIntegratedSpill$Po logmnrIntegratedSpill$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.SESSION#.name(), logmnrIntegratedSpill$Po.getSession#()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.XIDUSN.name(), logmnrIntegratedSpill$Po.getXidusn()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.XIDSLT.name(), logmnrIntegratedSpill$Po.getXidslt()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.XIDSQN.name(), logmnrIntegratedSpill$Po.getXidsqn()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.CHUNK.name(), logmnrIntegratedSpill$Po.getChunk()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.FLAG.name(), logmnrIntegratedSpill$Po.getFlag()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.CTIME.name(), logmnrIntegratedSpill$Po.getCtime()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.MTIME.name(), logmnrIntegratedSpill$Po.getMtime()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.SPILL_DATA.name(), logmnrIntegratedSpill$Po.getSpillData()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE1.name(), logmnrIntegratedSpill$Po.getSpare1()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE2.name(), logmnrIntegratedSpill$Po.getSpare2()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE3.name(), logmnrIntegratedSpill$Po.getSpare3()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE4.name(), logmnrIntegratedSpill$Po.getSpare4()); 
			dataObject.setValue(LogmnrIntegratedSpill$Po.COLUMNS.SPARE5.name(), logmnrIntegratedSpill$Po.getSpare5()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrIntegratedSpill$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrIntegratedSpill$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrIntegratedSpill$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrIntegratedSpill$Po.COLUMNS.XIDUSN.name(), po.getXidusn()); 
		sqlWhere.add(LogmnrIntegratedSpill$Po.COLUMNS.XIDSLT.name(), po.getXidslt()); 
		sqlWhere.add(LogmnrIntegratedSpill$Po.COLUMNS.XIDSQN.name(), po.getXidsqn()); 
		sqlWhere.add(LogmnrIntegratedSpill$Po.COLUMNS.CHUNK.name(), po.getChunk()); 
		sqlWhere.add(LogmnrIntegratedSpill$Po.COLUMNS.FLAG.name(), po.getFlag()); 
		return sqlWhere; 
	} 
 
} 
