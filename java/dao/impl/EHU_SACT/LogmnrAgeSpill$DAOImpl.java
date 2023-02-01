package com.doc.common.dao.impl; 
 
public class LogmnrAgeSpill$DAOImpl extends GeneralDAOImpl<LogmnrAgeSpill$Po> implements ILogmnrAgeSpill$DAO { 
	public static final LogmnrAgeSpill$DAOImpl INSTANCE = new LogmnrAgeSpill$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_AGE_SPILL$"; 

	public LogmnrAgeSpill$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrAgeSpill$Po> CONVERTER = new MapConverter<LogmnrAgeSpill$Po>() { 
 
		@Override 
		public LogmnrAgeSpill$Po convert(final DataObject dataObject) { 
			final LogmnrAgeSpill$Po logmnrAgeSpill$Po = new LogmnrAgeSpill$Po(); 
			logmnrAgeSpill$Po.setSession#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.SESSION#.name()))); 
			logmnrAgeSpill$Po.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.XIDUSN.name()))); 
			logmnrAgeSpill$Po.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.XIDSLT.name()))); 
			logmnrAgeSpill$Po.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.XIDSQN.name()))); 
			logmnrAgeSpill$Po.setChunk(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.CHUNK.name()))); 
			logmnrAgeSpill$Po.setSequence#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.SEQUENCE#.name()))); 
			logmnrAgeSpill$Po.setOffset(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.OFFSET.name()))); 
			logmnrAgeSpill$Po.setSpillData(); 
			logmnrAgeSpill$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.SPARE1.name()))); 
			logmnrAgeSpill$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAgeSpill$Po.COLUMNS.SPARE2.name()))); 
			return logmnrAgeSpill$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrAgeSpill$Po logmnrAgeSpill$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.SESSION#.name(), logmnrAgeSpill$Po.getSession#()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.XIDUSN.name(), logmnrAgeSpill$Po.getXidusn()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.XIDSLT.name(), logmnrAgeSpill$Po.getXidslt()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.XIDSQN.name(), logmnrAgeSpill$Po.getXidsqn()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.CHUNK.name(), logmnrAgeSpill$Po.getChunk()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.SEQUENCE#.name(), logmnrAgeSpill$Po.getSequence#()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.OFFSET.name(), logmnrAgeSpill$Po.getOffset()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.SPILL_DATA.name(), logmnrAgeSpill$Po.getSpillData()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.SPARE1.name(), logmnrAgeSpill$Po.getSpare1()); 
			dataObject.setValue(LogmnrAgeSpill$Po.COLUMNS.SPARE2.name(), logmnrAgeSpill$Po.getSpare2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrAgeSpill$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrAgeSpill$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrAgeSpill$Po.COLUMNS.SESSION#.name(), po.getSession#()); 
		sqlWhere.add(LogmnrAgeSpill$Po.COLUMNS.XIDUSN.name(), po.getXidusn()); 
		sqlWhere.add(LogmnrAgeSpill$Po.COLUMNS.XIDSLT.name(), po.getXidslt()); 
		sqlWhere.add(LogmnrAgeSpill$Po.COLUMNS.XIDSQN.name(), po.getXidsqn()); 
		sqlWhere.add(LogmnrAgeSpill$Po.COLUMNS.CHUNK.name(), po.getChunk()); 
		sqlWhere.add(LogmnrAgeSpill$Po.COLUMNS.SEQUENCE#.name(), po.getSequence#()); 
		return sqlWhere; 
	} 
 
} 
