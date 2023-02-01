package com.doc.common.dao.impl; 
 
public class Logstdby$scnDAOImpl extends GeneralDAOImpl<Logstdby$scnPo> implements ILogstdby$scnDAO { 
	public static final Logstdby$scnDAOImpl INSTANCE = new Logstdby$scnDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$SCN"; 

	public Logstdby$scnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$scnPo> CONVERTER = new MapConverter<Logstdby$scnPo>() { 
 
		@Override 
		public Logstdby$scnPo convert(final DataObject dataObject) { 
			final Logstdby$scnPo logstdby$scnPo = new Logstdby$scnPo(); 
			logstdby$scnPo.setObj#(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$scnPo.COLUMNS.OBJ#.name()))); 
			logstdby$scnPo.setObjname(dataObject.getString(Logstdby$scnPo.COLUMNS.OBJNAME.name())); 
			logstdby$scnPo.setSchema(dataObject.getString(Logstdby$scnPo.COLUMNS.SCHEMA.name())); 
			logstdby$scnPo.setType(dataObject.getString(Logstdby$scnPo.COLUMNS.TYPE.name())); 
			logstdby$scnPo.setScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$scnPo.COLUMNS.SCN.name()))); 
			logstdby$scnPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$scnPo.COLUMNS.SPARE1.name()))); 
			logstdby$scnPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$scnPo.COLUMNS.SPARE2.name()))); 
			logstdby$scnPo.setSpare3(dataObject.getString(Logstdby$scnPo.COLUMNS.SPARE3.name())); 
			return logstdby$scnPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$scnPo logstdby$scnPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$scnPo.COLUMNS.OBJ#.name(), logstdby$scnPo.getObj#()); 
			dataObject.setValue(Logstdby$scnPo.COLUMNS.OBJNAME.name(), logstdby$scnPo.getObjname()); 
			dataObject.setValue(Logstdby$scnPo.COLUMNS.SCHEMA.name(), logstdby$scnPo.getSchema()); 
			dataObject.setValue(Logstdby$scnPo.COLUMNS.TYPE.name(), logstdby$scnPo.getType()); 
			dataObject.setValue(Logstdby$scnPo.COLUMNS.SCN.name(), logstdby$scnPo.getScn()); 
			dataObject.setValue(Logstdby$scnPo.COLUMNS.SPARE1.name(), logstdby$scnPo.getSpare1()); 
			dataObject.setValue(Logstdby$scnPo.COLUMNS.SPARE2.name(), logstdby$scnPo.getSpare2()); 
			dataObject.setValue(Logstdby$scnPo.COLUMNS.SPARE3.name(), logstdby$scnPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$scnPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$scnPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
