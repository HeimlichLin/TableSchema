package com.doc.common.dao.impl; 
 
public class LogmnrObj$DAOImpl extends GeneralDAOImpl<LogmnrObj$Po> implements ILogmnrObj$DAO { 
	public static final LogmnrObj$DAOImpl INSTANCE = new LogmnrObj$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_OBJ$"; 

	public LogmnrObj$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrObj$Po> CONVERTER = new MapConverter<LogmnrObj$Po>() { 
 
		@Override 
		public LogmnrObj$Po convert(final DataObject dataObject) { 
			final LogmnrObj$Po logmnrObj$Po = new LogmnrObj$Po(); 
			logmnrObj$Po.setObjv#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.OBJV#.name()))); 
			logmnrObj$Po.setOwner#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.OWNER#.name()))); 
			logmnrObj$Po.setName(dataObject.getString(LogmnrObj$Po.COLUMNS.NAME.name())); 
			logmnrObj$Po.setNamespace(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.NAMESPACE.name()))); 
			logmnrObj$Po.setSubname(dataObject.getString(LogmnrObj$Po.COLUMNS.SUBNAME.name())); 
			logmnrObj$Po.setType#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.TYPE#.name()))); 
			logmnrObj$Po.setOid$(); 
			logmnrObj$Po.setRemoteowner(dataObject.getString(LogmnrObj$Po.COLUMNS.REMOTEOWNER.name())); 
			logmnrObj$Po.setLinkname(dataObject.getString(LogmnrObj$Po.COLUMNS.LINKNAME.name())); 
			logmnrObj$Po.setFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.FLAGS.name()))); 
			logmnrObj$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.SPARE3.name()))); 
			logmnrObj$Po.setStime(TimestampUtils.of(dataObject.getValue(LogmnrObj$Po.COLUMNS.STIME.name()))); 
			logmnrObj$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.OBJ#.name()))); 
			logmnrObj$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrObj$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			logmnrObj$Po.setStartScnbas(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.START_SCNBAS.name()))); 
			logmnrObj$Po.setStartScnwrp(BigDecimalUtils.formObj(dataObject.getValue(LogmnrObj$Po.COLUMNS.START_SCNWRP.name()))); 
			return logmnrObj$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrObj$Po logmnrObj$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.OBJV#.name(), logmnrObj$Po.getObjv#()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.OWNER#.name(), logmnrObj$Po.getOwner#()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.NAME.name(), logmnrObj$Po.getName()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.NAMESPACE.name(), logmnrObj$Po.getNamespace()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.SUBNAME.name(), logmnrObj$Po.getSubname()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.TYPE#.name(), logmnrObj$Po.getType#()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.OID$.name(), logmnrObj$Po.getOid$()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.REMOTEOWNER.name(), logmnrObj$Po.getRemoteowner()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.LINKNAME.name(), logmnrObj$Po.getLinkname()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.FLAGS.name(), logmnrObj$Po.getFlags()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.SPARE3.name(), logmnrObj$Po.getSpare3()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.STIME.name(), logmnrObj$Po.getStime()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.OBJ#.name(), logmnrObj$Po.getObj#()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.LOGMNR_UID.name(), logmnrObj$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrObj$Po.getLogmnrFlags()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.START_SCNBAS.name(), logmnrObj$Po.getStartScnbas()); 
			dataObject.setValue(LogmnrObj$Po.COLUMNS.START_SCNWRP.name(), logmnrObj$Po.getStartScnwrp()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrObj$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrObj$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrObj$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrObj$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
