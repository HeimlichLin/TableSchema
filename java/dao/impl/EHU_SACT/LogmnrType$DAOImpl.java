package com.doc.common.dao.impl; 
 
public class LogmnrType$DAOImpl extends GeneralDAOImpl<LogmnrType$Po> implements ILogmnrType$DAO { 
	public static final LogmnrType$DAOImpl INSTANCE = new LogmnrType$DAOImpl(); 
	public static final String TABLENAME = "LOGMNR_TYPE$"; 

	public LogmnrType$DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogmnrType$Po> CONVERTER = new MapConverter<LogmnrType$Po>() { 
 
		@Override 
		public LogmnrType$Po convert(final DataObject dataObject) { 
			final LogmnrType$Po logmnrType$Po = new LogmnrType$Po(); 
			logmnrType$Po.setVersion#(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.VERSION#.name()))); 
			logmnrType$Po.setVersion(dataObject.getString(LogmnrType$Po.COLUMNS.VERSION.name())); 
			logmnrType$Po.setTvoid(); 
			logmnrType$Po.setTypecode(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.TYPECODE.name()))); 
			logmnrType$Po.setProperties(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.PROPERTIES.name()))); 
			logmnrType$Po.setAttributes(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.ATTRIBUTES.name()))); 
			logmnrType$Po.setMethods(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.METHODS.name()))); 
			logmnrType$Po.setHiddenmethods(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.HIDDENMETHODS.name()))); 
			logmnrType$Po.setSupertypes(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.SUPERTYPES.name()))); 
			logmnrType$Po.setSubtypes(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.SUBTYPES.name()))); 
			logmnrType$Po.setExterntype(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.EXTERNTYPE.name()))); 
			logmnrType$Po.setExternname(dataObject.getString(LogmnrType$Po.COLUMNS.EXTERNNAME.name())); 
			logmnrType$Po.setHelperclassname(dataObject.getString(LogmnrType$Po.COLUMNS.HELPERCLASSNAME.name())); 
			logmnrType$Po.setLocalAttrs(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.LOCAL_ATTRS.name()))); 
			logmnrType$Po.setLocalMethods(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.LOCAL_METHODS.name()))); 
			logmnrType$Po.setTypeid(); 
			logmnrType$Po.setRoottoid(); 
			logmnrType$Po.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.SPARE1.name()))); 
			logmnrType$Po.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.SPARE2.name()))); 
			logmnrType$Po.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.SPARE3.name()))); 
			logmnrType$Po.setSupertoid(); 
			logmnrType$Po.setHashcode(); 
			logmnrType$Po.setToid(); 
			logmnrType$Po.setLogmnrUid(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.LOGMNR_UID.name()))); 
			logmnrType$Po.setLogmnrFlags(BigDecimalUtils.formObj(dataObject.getValue(LogmnrType$Po.COLUMNS.LOGMNR_FLAGS.name()))); 
			return logmnrType$Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogmnrType$Po logmnrType$Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.VERSION#.name(), logmnrType$Po.getVersion#()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.VERSION.name(), logmnrType$Po.getVersion()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.TVOID.name(), logmnrType$Po.getTvoid()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.TYPECODE.name(), logmnrType$Po.getTypecode()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.PROPERTIES.name(), logmnrType$Po.getProperties()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.ATTRIBUTES.name(), logmnrType$Po.getAttributes()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.METHODS.name(), logmnrType$Po.getMethods()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.HIDDENMETHODS.name(), logmnrType$Po.getHiddenmethods()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.SUPERTYPES.name(), logmnrType$Po.getSupertypes()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.SUBTYPES.name(), logmnrType$Po.getSubtypes()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.EXTERNTYPE.name(), logmnrType$Po.getExterntype()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.EXTERNNAME.name(), logmnrType$Po.getExternname()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.HELPERCLASSNAME.name(), logmnrType$Po.getHelperclassname()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.LOCAL_ATTRS.name(), logmnrType$Po.getLocalAttrs()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.LOCAL_METHODS.name(), logmnrType$Po.getLocalMethods()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.TYPEID.name(), logmnrType$Po.getTypeid()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.ROOTTOID.name(), logmnrType$Po.getRoottoid()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.SPARE1.name(), logmnrType$Po.getSpare1()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.SPARE2.name(), logmnrType$Po.getSpare2()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.SPARE3.name(), logmnrType$Po.getSpare3()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.SUPERTOID.name(), logmnrType$Po.getSupertoid()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.HASHCODE.name(), logmnrType$Po.getHashcode()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.TOID.name(), logmnrType$Po.getToid()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.LOGMNR_UID.name(), logmnrType$Po.getLogmnrUid()); 
			dataObject.setValue(LogmnrType$Po.COLUMNS.LOGMNR_FLAGS.name(), logmnrType$Po.getLogmnrFlags()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogmnrType$Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogmnrType$Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(LogmnrType$Po.COLUMNS.VERSION#.name(), po.getVersion#()); 
		sqlWhere.add(LogmnrType$Po.COLUMNS.TOID.name(), po.getToid()); 
		sqlWhere.add(LogmnrType$Po.COLUMNS.LOGMNR_UID.name(), po.getLogmnrUid()); 
		return sqlWhere; 
	} 
 
} 
