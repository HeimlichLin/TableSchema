package com.doc.common.dao.impl; 
 
public class Logstdby$plsqlDAOImpl extends GeneralDAOImpl<Logstdby$plsqlPo> implements ILogstdby$plsqlDAO { 
	public static final Logstdby$plsqlDAOImpl INSTANCE = new Logstdby$plsqlDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$PLSQL"; 

	public Logstdby$plsqlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$plsqlPo> CONVERTER = new MapConverter<Logstdby$plsqlPo>() { 
 
		@Override 
		public Logstdby$plsqlPo convert(final DataObject dataObject) { 
			final Logstdby$plsqlPo logstdby$plsqlPo = new Logstdby$plsqlPo(); 
			logstdby$plsqlPo.setSessionId(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$plsqlPo.COLUMNS.SESSION_ID.name()))); 
			logstdby$plsqlPo.setStartFinish(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$plsqlPo.COLUMNS.START_FINISH.name()))); 
			logstdby$plsqlPo.setCallText(); 
			logstdby$plsqlPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$plsqlPo.COLUMNS.SPARE1.name()))); 
			logstdby$plsqlPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$plsqlPo.COLUMNS.SPARE2.name()))); 
			logstdby$plsqlPo.setSpare3(dataObject.getString(Logstdby$plsqlPo.COLUMNS.SPARE3.name())); 
			return logstdby$plsqlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$plsqlPo logstdby$plsqlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$plsqlPo.COLUMNS.SESSION_ID.name(), logstdby$plsqlPo.getSessionId()); 
			dataObject.setValue(Logstdby$plsqlPo.COLUMNS.START_FINISH.name(), logstdby$plsqlPo.getStartFinish()); 
			dataObject.setValue(Logstdby$plsqlPo.COLUMNS.CALL_TEXT.name(), logstdby$plsqlPo.getCallText()); 
			dataObject.setValue(Logstdby$plsqlPo.COLUMNS.SPARE1.name(), logstdby$plsqlPo.getSpare1()); 
			dataObject.setValue(Logstdby$plsqlPo.COLUMNS.SPARE2.name(), logstdby$plsqlPo.getSpare2()); 
			dataObject.setValue(Logstdby$plsqlPo.COLUMNS.SPARE3.name(), logstdby$plsqlPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$plsqlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$plsqlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
