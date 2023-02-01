package com.doc.common.dao.impl; 
 
public class LogmnrpCtasPartMapDAOImpl extends GeneralDAOImpl<LogmnrpCtasPartMapPo> implements ILogmnrpCtasPartMapDAO { 
	public static final LogmnrpCtasPartMapDAOImpl INSTANCE = new LogmnrpCtasPartMapDAOImpl(); 
	public static final String TABLENAME = "LOGMNRP_CTAS_PART_MAP"; 

	public LogmnrpCtasPartMapDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrpCtasPartMapPo> CONVERTER = new MapConverter<LogmnrpCtasPartMapPo>() { 
 
		@Override 
		public LogmnrpCtasPartMapPo convert(final DataObject dataObject) { 
			final LogmnrpCtasPartMapPo logmnrpCtasPartMapPo = new LogmnrpCtasPartMapPo(); 
			logmnrpCtasPartMapPo.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrpCtasPartMapPo.COLUMNS.LOGMNR_UID.name()))); 
			logmnrpCtasPartMapPo.setBaseobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrpCtasPartMapPo.COLUMNS.BASEOBJ#.name()))); 
			logmnrpCtasPartMapPo.setBaseobjv#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrpCtasPartMapPo.COLUMNS.BASEOBJV#.name()))); 
			logmnrpCtasPartMapPo.setKeyobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrpCtasPartMapPo.COLUMNS.KEYOBJ#.name()))); 
			logmnrpCtasPartMapPo.setPart#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrpCtasPartMapPo.COLUMNS.PART#.name()))); 
			logmnrpCtasPartMapPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrpCtasPartMapPo.COLUMNS.SPARE1.name()))); 
			logmnrpCtasPartMapPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrpCtasPartMapPo.COLUMNS.SPARE2.name()))); 
			logmnrpCtasPartMapPo.setSpare3(dataObject.getString(LogmnrpCtasPartMapPo.COLUMNS.SPARE3.name())); 
			return logmnrpCtasPartMapPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrpCtasPartMapPo logmnrpCtasPartMapPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrpCtasPartMapPo.COLUMNS.LOGMNR_UID.name(), logmnrpCtasPartMapPo.getLogmnrUid()); 
			dataObject.setValue(LogmnrpCtasPartMapPo.COLUMNS.BASEOBJ#.name(), logmnrpCtasPartMapPo.getBaseobj#()); 
			dataObject.setValue(LogmnrpCtasPartMapPo.COLUMNS.BASEOBJV#.name(), logmnrpCtasPartMapPo.getBaseobjv#()); 
			dataObject.setValue(LogmnrpCtasPartMapPo.COLUMNS.KEYOBJ#.name(), logmnrpCtasPartMapPo.getKeyobj#()); 
			dataObject.setValue(LogmnrpCtasPartMapPo.COLUMNS.PART#.name(), logmnrpCtasPartMapPo.getPart#()); 
			dataObject.setValue(LogmnrpCtasPartMapPo.COLUMNS.SPARE1.name(), logmnrpCtasPartMapPo.getSpare1()); 
			dataObject.setValue(LogmnrpCtasPartMapPo.COLUMNS.SPARE2.name(), logmnrpCtasPartMapPo.getSpare2()); 
			dataObject.setValue(LogmnrpCtasPartMapPo.COLUMNS.SPARE3.name(), logmnrpCtasPartMapPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrpCtasPartMapPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrpCtasPartMapPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrpCtasPartMapPo.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		sqlWhere.add(LogmnrpCtasPartMapPo.COLUMNS.BASEOBJV#.name(), po.getBaseobjv#()); 
		sqlWhere.add(LogmnrpCtasPartMapPo.COLUMNS.KEYOBJ#.name(), po.getKeyobj#()); 
		return sqlWhere; 
	} 
 
} 
