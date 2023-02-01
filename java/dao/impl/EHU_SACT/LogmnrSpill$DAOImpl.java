package com.doc.common.dao.impl; 
 
public class LogmnrSpill$DAOImpl extends GeneralDAOImpl<LogmnrSpill$Po> implements ILogmnrSpill$DAO { 
	public static final LogmnrSpill$DAOImpl INSTANCE = new LogmnrSpill$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_SPILL$"; 

	public LogmnrSpill$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrSpill$Po> CONVERTER = new MapConverter<LogmnrSpill$Po>() { 
 
		@Override 
		public LogmnrSpill$Po convert(final DataObject dataObject) { 
			final LogmnrSpill$Po logmnrSpill$Po = new LogmnrSpill$Po(); 
			logmnrSpill$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.SESSION#.name()))); 
			logmnrSpill$Po.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.XIDUSN.name()))); 
			logmnrSpill$Po.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.XIDSLT.name()))); 
			logmnrSpill$Po.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.XIDSQN.name()))); 
			logmnrSpill$Po.setChunk(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.CHUNK.name()))); 
			logmnrSpill$Po.setStartidx(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.STARTIDX.name()))); 
			logmnrSpill$Po.setEndidx(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.ENDIDX.name()))); 
			logmnrSpill$Po.setFlag(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.FLAG.name()))); 
			logmnrSpill$Po.setSequence#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.SEQUENCE#.name()))); 
			logmnrSpill$Po.setSpillData(); 
			logmnrSpill$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.SPARE1.name()))); 
			logmnrSpill$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrSpill$Po.COLUMNS.SPARE2.name()))); 
			return logmnrSpill$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrSpill$Po logmnrSpill$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.SESSION#.name(), logmnrSpill$Po.getSession#()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.XIDUSN.name(), logmnrSpill$Po.getXidusn()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.XIDSLT.name(), logmnrSpill$Po.getXidslt()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.XIDSQN.name(), logmnrSpill$Po.getXidsqn()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.CHUNK.name(), logmnrSpill$Po.getChunk()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.STARTIDX.name(), logmnrSpill$Po.getStartidx()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.ENDIDX.name(), logmnrSpill$Po.getEndidx()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.FLAG.name(), logmnrSpill$Po.getFlag()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.SEQUENCE#.name(), logmnrSpill$Po.getSequence#()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.SPILL_DATA.name(), logmnrSpill$Po.getSpillData()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.SPARE1.name(), logmnrSpill$Po.getSpare1()); 
			dataObject.setValue(LogmnrSpill$Po.COLUMNS.SPARE2.name(), logmnrSpill$Po.getSpare2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrSpill$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrSpill$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.XIDUSN.name(), po.getXidusn()); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.XIDSLT.name(), po.getXidslt()); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.XIDSQN.name(), po.getXidsqn()); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.CHUNK.name(), po.getChunk()); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.STARTIDX.name(), po.getStartidx()); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.ENDIDX.name(), po.getEndidx()); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.FLAG.name(), po.getFlag()); 
		sqlWhere.add(LogmnrSpill$Po.COLUMNS.SEQUENCE#.name(), po.getSequence#()); 
		return sqlWhere; 
	} 
 
} 
