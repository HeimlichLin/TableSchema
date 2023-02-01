package com.doc.common.dao.impl; 
 
public class Logstdby$flashbackScnDAOImpl extends GeneralDAOImpl<Logstdby$flashbackScnPo> implements ILogstdby$flashbackScnDAO { 
	public static final Logstdby$flashbackScnDAOImpl INSTANCE = new Logstdby$flashbackScnDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$FLASHBACK_SCN"; 

	public Logstdby$flashbackScnDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$flashbackScnPo> CONVERTER = new MapConverter<Logstdby$flashbackScnPo>() { 
 
		@Override 
		public Logstdby$flashbackScnPo convert(final DataObject dataObject) { 
			final Logstdby$flashbackScnPo logstdby$flashbackScnPo = new Logstdby$flashbackScnPo(); 
			logstdby$flashbackScnPo.setPrimaryScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$flashbackScnPo.COLUMNS.PRIMARY_SCN.name()))); 
			logstdby$flashbackScnPo.setPrimaryTime(TimestampUtils.of(dataObject.getValue(Logstdby$flashbackScnPo.COLUMNS.PRIMARY_TIME.name()))); 
			logstdby$flashbackScnPo.setStandbyScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$flashbackScnPo.COLUMNS.STANDBY_SCN.name()))); 
			logstdby$flashbackScnPo.setStandbyTime(TimestampUtils.of(dataObject.getValue(Logstdby$flashbackScnPo.COLUMNS.STANDBY_TIME.name()))); 
			logstdby$flashbackScnPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$flashbackScnPo.COLUMNS.SPARE1.name()))); 
			logstdby$flashbackScnPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$flashbackScnPo.COLUMNS.SPARE2.name()))); 
			logstdby$flashbackScnPo.setSpare3(TimestampUtils.of(dataObject.getValue(Logstdby$flashbackScnPo.COLUMNS.SPARE3.name()))); 
			return logstdby$flashbackScnPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$flashbackScnPo logstdby$flashbackScnPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$flashbackScnPo.COLUMNS.PRIMARY_SCN.name(), logstdby$flashbackScnPo.getPrimaryScn()); 
			dataObject.setValue(Logstdby$flashbackScnPo.COLUMNS.PRIMARY_TIME.name(), logstdby$flashbackScnPo.getPrimaryTime()); 
			dataObject.setValue(Logstdby$flashbackScnPo.COLUMNS.STANDBY_SCN.name(), logstdby$flashbackScnPo.getStandbyScn()); 
			dataObject.setValue(Logstdby$flashbackScnPo.COLUMNS.STANDBY_TIME.name(), logstdby$flashbackScnPo.getStandbyTime()); 
			dataObject.setValue(Logstdby$flashbackScnPo.COLUMNS.SPARE1.name(), logstdby$flashbackScnPo.getSpare1()); 
			dataObject.setValue(Logstdby$flashbackScnPo.COLUMNS.SPARE2.name(), logstdby$flashbackScnPo.getSpare2()); 
			dataObject.setValue(Logstdby$flashbackScnPo.COLUMNS.SPARE3.name(), logstdby$flashbackScnPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$flashbackScnPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$flashbackScnPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Logstdby$flashbackScnPo.COLUMNS.PRIMARY_SCN.name(), po.getPrimaryScn()); 
		return sqlWhere; 
	} 
 
} 
