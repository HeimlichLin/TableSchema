package com.doc.common.dao.impl; 
 
public class Logstdby$edsTablesDAOImpl extends GeneralDAOImpl<Logstdby$edsTablesPo> implements ILogstdby$edsTablesDAO { 
	public static final Logstdby$edsTablesDAOImpl INSTANCE = new Logstdby$edsTablesDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$EDS_TABLES"; 

	public Logstdby$edsTablesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$edsTablesPo> CONVERTER = new MapConverter<Logstdby$edsTablesPo>() { 
 
		@Override 
		public Logstdby$edsTablesPo convert(final DataObject dataObject) { 
			final Logstdby$edsTablesPo logstdby$edsTablesPo = new Logstdby$edsTablesPo(); 
			logstdby$edsTablesPo.setOwner(dataObject.getString(Logstdby$edsTablesPo.COLUMNS.OWNER.name())); 
			logstdby$edsTablesPo.setTableName(dataObject.getString(Logstdby$edsTablesPo.COLUMNS.TABLE_NAME.name())); 
			logstdby$edsTablesPo.setShadowTableName(dataObject.getString(Logstdby$edsTablesPo.COLUMNS.SHADOW_TABLE_NAME.name())); 
			logstdby$edsTablesPo.setBaseTriggerName(dataObject.getString(Logstdby$edsTablesPo.COLUMNS.BASE_TRIGGER_NAME.name())); 
			logstdby$edsTablesPo.setShadowTriggerName(dataObject.getString(Logstdby$edsTablesPo.COLUMNS.SHADOW_TRIGGER_NAME.name())); 
			logstdby$edsTablesPo.setDblink(dataObject.getString(Logstdby$edsTablesPo.COLUMNS.DBLINK.name())); 
			logstdby$edsTablesPo.setFlags(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$edsTablesPo.COLUMNS.FLAGS.name()))); 
			logstdby$edsTablesPo.setState(dataObject.getString(Logstdby$edsTablesPo.COLUMNS.STATE.name())); 
			logstdby$edsTablesPo.setObjv(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$edsTablesPo.COLUMNS.OBJV.name()))); 
			logstdby$edsTablesPo.setObj#(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$edsTablesPo.COLUMNS.OBJ#.name()))); 
			logstdby$edsTablesPo.setSobj#(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$edsTablesPo.COLUMNS.SOBJ#.name()))); 
			logstdby$edsTablesPo.setCtime(); 
			logstdby$edsTablesPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$edsTablesPo.COLUMNS.SPARE1.name()))); 
			logstdby$edsTablesPo.setSpare2(dataObject.getString(Logstdby$edsTablesPo.COLUMNS.SPARE2.name())); 
			logstdby$edsTablesPo.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$edsTablesPo.COLUMNS.SPARE3.name()))); 
			return logstdby$edsTablesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$edsTablesPo logstdby$edsTablesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.OWNER.name(), logstdby$edsTablesPo.getOwner()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.TABLE_NAME.name(), logstdby$edsTablesPo.getTableName()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.SHADOW_TABLE_NAME.name(), logstdby$edsTablesPo.getShadowTableName()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.BASE_TRIGGER_NAME.name(), logstdby$edsTablesPo.getBaseTriggerName()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.SHADOW_TRIGGER_NAME.name(), logstdby$edsTablesPo.getShadowTriggerName()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.DBLINK.name(), logstdby$edsTablesPo.getDblink()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.FLAGS.name(), logstdby$edsTablesPo.getFlags()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.STATE.name(), logstdby$edsTablesPo.getState()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.OBJV.name(), logstdby$edsTablesPo.getObjv()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.OBJ#.name(), logstdby$edsTablesPo.getObj#()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.SOBJ#.name(), logstdby$edsTablesPo.getSobj#()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.CTIME.name(), logstdby$edsTablesPo.getCtime()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.SPARE1.name(), logstdby$edsTablesPo.getSpare1()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.SPARE2.name(), logstdby$edsTablesPo.getSpare2()); 
			dataObject.setValue(Logstdby$edsTablesPo.COLUMNS.SPARE3.name(), logstdby$edsTablesPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$edsTablesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$edsTablesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Logstdby$edsTablesPo.COLUMNS.OWNER.name(), po.getOwner()); 
		sqlWhere.add(Logstdby$edsTablesPo.COLUMNS.TABLE_NAME.name(), po.getTableName()); 
		return sqlWhere; 
	} 
 
} 
