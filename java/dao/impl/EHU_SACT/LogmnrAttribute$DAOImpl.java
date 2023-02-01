package com.doc.common.dao.impl; 
 
public class LogmnrAttribute$DAOImpl extends GeneralDAOImpl<LogmnrAttribute$Po> implements ILogmnrAttribute$DAO { 
	public static final LogmnrAttribute$DAOImpl INSTANCE = new LogmnrAttribute$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_ATTRIBUTE$"; 

	public LogmnrAttribute$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrAttribute$Po> CONVERTER = new MapConverter<LogmnrAttribute$Po>() { 
 
		@Override 
		public LogmnrAttribute$Po convert(final DataObject dataObject) { 
			final LogmnrAttribute$Po logmnrAttribute$Po = new LogmnrAttribute$Po(); 
			logmnrAttribute$Po.setVersion#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.VERSION#.name()))); 
			logmnrAttribute$Po.setName(dataObject.getString(LogmnrAttribute$Po.COLUMNS.NAME.name())); 
			logmnrAttribute$Po.setAttribute#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.ATTRIBUTE#.name()))); 
			logmnrAttribute$Po.setAttrToid(); 
			logmnrAttribute$Po.setAttrVersion#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.ATTR_VERSION#.name()))); 
			logmnrAttribute$Po.setSynobj#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.SYNOBJ#.name()))); 
			logmnrAttribute$Po.setProperties(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.PROPERTIES.name()))); 
			logmnrAttribute$Po.setCharsetid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.CHARSETID.name()))); 
			logmnrAttribute$Po.setCharsetform(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.CHARSETFORM.name()))); 
			logmnrAttribute$Po.setLength(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.LENGTH.name()))); 
			logmnrAttribute$Po.setPrecision#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.PRECISION#.name()))); 
			logmnrAttribute$Po.setScale(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.SCALE.name()))); 
			logmnrAttribute$Po.setExternname(dataObject.getString(LogmnrAttribute$Po.COLUMNS.EXTERNNAME.name())); 
			logmnrAttribute$Po.setXflags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.XFLAGS.name()))); 
			logmnrAttribute$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.SPARE1.name()))); 
			logmnrAttribute$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.SPARE2.name()))); 
			logmnrAttribute$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.SPARE3.name()))); 
			logmnrAttribute$Po.setSpare4(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.SPARE4.name()))); 
			logmnrAttribute$Po.setSpare5(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.SPARE5.name()))); 
			logmnrAttribute$Po.setSetter(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.SETTER.name()))); 
			logmnrAttribute$Po.setGetter(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.GETTER.name()))); 
			logmnrAttribute$Po.setToid(); 
			logmnrAttribute$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrAttribute$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrAttribute$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrAttribute$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrAttribute$Po logmnrAttribute$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.VERSION#.name(), logmnrAttribute$Po.getVersion#()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.NAME.name(), logmnrAttribute$Po.getName()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.ATTRIBUTE#.name(), logmnrAttribute$Po.getAttribute#()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.ATTR_TOID.name(), logmnrAttribute$Po.getAttrToid()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.ATTR_VERSION#.name(), logmnrAttribute$Po.getAttrVersion#()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.SYNOBJ#.name(), logmnrAttribute$Po.getSynobj#()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.PROPERTIES.name(), logmnrAttribute$Po.getProperties()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.CHARSETID.name(), logmnrAttribute$Po.getCharsetid()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.CHARSETFORM.name(), logmnrAttribute$Po.getCharsetform()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.LENGTH.name(), logmnrAttribute$Po.getLength()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.PRECISION#.name(), logmnrAttribute$Po.getPrecision#()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.SCALE.name(), logmnrAttribute$Po.getScale()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.EXTERNNAME.name(), logmnrAttribute$Po.getExternname()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.XFLAGS.name(), logmnrAttribute$Po.getXflags()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.SPARE1.name(), logmnrAttribute$Po.getSpare1()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.SPARE2.name(), logmnrAttribute$Po.getSpare2()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.SPARE3.name(), logmnrAttribute$Po.getSpare3()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.SPARE4.name(), logmnrAttribute$Po.getSpare4()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.SPARE5.name(), logmnrAttribute$Po.getSpare5()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.SETTER.name(), logmnrAttribute$Po.getSetter()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.GETTER.name(), logmnrAttribute$Po.getGetter()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.TOID.name(), logmnrAttribute$Po.getToid()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.LOGMNR_UID.name(), logmnrAttribute$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrAttribute$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrAttribute$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrAttribute$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrAttribute$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrAttribute$Po.COLUMNS.VERSION#.name(), po.getVersion#()); 
		sqlWhere.add(LogmnrAttribute$Po.COLUMNS.ATTRIBUTE#.name(), po.getAttribute#()); 
		sqlWhere.add(LogmnrAttribute$Po.COLUMNS.TOID.name(), po.getToid()); 
		sqlWhere.add(LogmnrAttribute$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
