package com.doc.common.dao.impl; 
 
public class Logstdby$parametersDAOImpl extends GeneralDAOImpl<Logstdby$parametersPo> implements ILogstdby$parametersDAO { 
	public static final Logstdby$parametersDAOImpl INSTANCE = new Logstdby$parametersDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$PARAMETERS"; 

	public Logstdby$parametersDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$parametersPo> CONVERTER = new MapConverter<Logstdby$parametersPo>() { 
 
		@Override 
		public Logstdby$parametersPo convert(final DataObject dataObject) { 
			final Logstdby$parametersPo logstdby$parametersPo = new Logstdby$parametersPo(); 
			logstdby$parametersPo.setName(dataObject.getString(Logstdby$parametersPo.COLUMNS.NAME.name())); 
			logstdby$parametersPo.setValue(dataObject.getString(Logstdby$parametersPo.COLUMNS.VALUE.name())); 
			logstdby$parametersPo.setType(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$parametersPo.COLUMNS.TYPE.name()))); 
			logstdby$parametersPo.setScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$parametersPo.COLUMNS.SCN.name()))); 
			logstdby$parametersPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$parametersPo.COLUMNS.SPARE1.name()))); 
			logstdby$parametersPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$parametersPo.COLUMNS.SPARE2.name()))); 
			logstdby$parametersPo.setSpare3(dataObject.getString(Logstdby$parametersPo.COLUMNS.SPARE3.name())); 
			return logstdby$parametersPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$parametersPo logstdby$parametersPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$parametersPo.COLUMNS.NAME.name(), logstdby$parametersPo.getName()); 
			dataObject.setValue(Logstdby$parametersPo.COLUMNS.VALUE.name(), logstdby$parametersPo.getValue()); 
			dataObject.setValue(Logstdby$parametersPo.COLUMNS.TYPE.name(), logstdby$parametersPo.getType()); 
			dataObject.setValue(Logstdby$parametersPo.COLUMNS.SCN.name(), logstdby$parametersPo.getScn()); 
			dataObject.setValue(Logstdby$parametersPo.COLUMNS.SPARE1.name(), logstdby$parametersPo.getSpare1()); 
			dataObject.setValue(Logstdby$parametersPo.COLUMNS.SPARE2.name(), logstdby$parametersPo.getSpare2()); 
			dataObject.setValue(Logstdby$parametersPo.COLUMNS.SPARE3.name(), logstdby$parametersPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$parametersPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$parametersPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
