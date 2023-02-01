package com.doc.common.dao.impl; 
 
public class Logstdby$skipDAOImpl extends GeneralDAOImpl<Logstdby$skipPo> implements ILogstdby$skipDAO { 
	public static final Logstdby$skipDAOImpl INSTANCE = new Logstdby$skipDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$SKIP"; 

	public Logstdby$skipDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$skipPo> CONVERTER = new MapConverter<Logstdby$skipPo>() { 
 
		@Override 
		public Logstdby$skipPo convert(final DataObject dataObject) { 
			final Logstdby$skipPo logstdby$skipPo = new Logstdby$skipPo(); 
			logstdby$skipPo.setError(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipPo.COLUMNS.ERROR.name()))); 
			logstdby$skipPo.setStatementOpt(dataObject.getString(Logstdby$skipPo.COLUMNS.STATEMENT_OPT.name())); 
			logstdby$skipPo.setSchema(dataObject.getString(Logstdby$skipPo.COLUMNS.SCHEMA.name())); 
			logstdby$skipPo.setName(dataObject.getString(Logstdby$skipPo.COLUMNS.NAME.name())); 
			logstdby$skipPo.setUseLike(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipPo.COLUMNS.USE_LIKE.name()))); 
			logstdby$skipPo.setEsc(dataObject.getString(Logstdby$skipPo.COLUMNS.ESC.name())); 
			logstdby$skipPo.setProc(dataObject.getString(Logstdby$skipPo.COLUMNS.PROC.name())); 
			logstdby$skipPo.setActive(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipPo.COLUMNS.ACTIVE.name()))); 
			logstdby$skipPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipPo.COLUMNS.SPARE1.name()))); 
			logstdby$skipPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipPo.COLUMNS.SPARE2.name()))); 
			logstdby$skipPo.setSpare3(dataObject.getString(Logstdby$skipPo.COLUMNS.SPARE3.name())); 
			return logstdby$skipPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$skipPo logstdby$skipPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.ERROR.name(), logstdby$skipPo.getError()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.STATEMENT_OPT.name(), logstdby$skipPo.getStatementOpt()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.SCHEMA.name(), logstdby$skipPo.getSchema()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.NAME.name(), logstdby$skipPo.getName()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.USE_LIKE.name(), logstdby$skipPo.getUseLike()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.ESC.name(), logstdby$skipPo.getEsc()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.PROC.name(), logstdby$skipPo.getProc()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.ACTIVE.name(), logstdby$skipPo.getActive()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.SPARE1.name(), logstdby$skipPo.getSpare1()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.SPARE2.name(), logstdby$skipPo.getSpare2()); 
			dataObject.setValue(Logstdby$skipPo.COLUMNS.SPARE3.name(), logstdby$skipPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$skipPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$skipPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
