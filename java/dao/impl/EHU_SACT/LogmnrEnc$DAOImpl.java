package com.doc.common.dao.impl; 
 
public class LogmnrEnc$DAOImpl extends GeneralDAOImpl<LogmnrEnc$Po> implements ILogmnrEnc$DAO { 
	public static final LogmnrEnc$DAOImpl INSTANCE = new LogmnrEnc$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_ENC$"; 

	public LogmnrEnc$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrEnc$Po> CONVERTER = new MapConverter<LogmnrEnc$Po>() { 
 
		@Override 
		public LogmnrEnc$Po convert(final DataObject dataObject) { 
			final LogmnrEnc$Po logmnrEnc$Po = new LogmnrEnc$Po(); 
			logmnrEnc$Po.setObj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrEnc$Po.COLUMNS.OBJ#.name()))); 
			logmnrEnc$Po.setOwner#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrEnc$Po.COLUMNS.OWNER#.name()))); 
			logmnrEnc$Po.setEncalg(BigDecimalUtils.formObj(dataObject.getValue(LogmnrEnc$Po.COLUMNS.ENCALG.name()))); 
			logmnrEnc$Po.setIntalg(BigDecimalUtils.formObj(dataObject.getValue(LogmnrEnc$Po.COLUMNS.INTALG.name()))); 
			logmnrEnc$Po.setColklc(); 
			logmnrEnc$Po.setKlclen(BigDecimalUtils.formObj(dataObject.getValue(LogmnrEnc$Po.COLUMNS.KLCLEN.name()))); 
			logmnrEnc$Po.setFlag(BigDecimalUtils.formObj(dataObject.getValue(LogmnrEnc$Po.COLUMNS.FLAG.name()))); 
			logmnrEnc$Po.setMkeyid(dataObject.getString(LogmnrEnc$Po.COLUMNS.MKEYID.name())); 
			logmnrEnc$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrEnc$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrEnc$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrEnc$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrEnc$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrEnc$Po logmnrEnc$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.OBJ#.name(), logmnrEnc$Po.getObj#()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.OWNER#.name(), logmnrEnc$Po.getOwner#()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.ENCALG.name(), logmnrEnc$Po.getEncalg()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.INTALG.name(), logmnrEnc$Po.getIntalg()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.COLKLC.name(), logmnrEnc$Po.getColklc()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.KLCLEN.name(), logmnrEnc$Po.getKlclen()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.FLAG.name(), logmnrEnc$Po.getFlag()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.MKEYID.name(), logmnrEnc$Po.getMkeyid()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.LOGMNR_UID.name(), logmnrEnc$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrEnc$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrEnc$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrEnc$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrEnc$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrEnc$Po.COLUMNS.OBJ#.name(), po.getObj#()); 
		sqlWhere.add(LogmnrEnc$Po.COLUMNS.OWNER#.name(), po.getOwner#()); 
		sqlWhere.add(LogmnrEnc$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
