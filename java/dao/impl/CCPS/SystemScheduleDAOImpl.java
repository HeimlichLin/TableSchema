package com.doc.common.dao.impl; 
 
public class SystemScheduleDAOImpl extends GeneralDAOImpl<SystemSchedulePo> implements SystemScheduleDAO { 
	public static final SystemScheduleDAOImpl INSTANCE = new SystemScheduleDAOImpl(); 
	public static final String TABLENAME = "SYSTEM_SCHEDULE"; 

	public SystemScheduleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SystemSchedulePo> CONVERTER = new MapConverter<SystemSchedulePo>() { 
 
		@Override 
		public SystemSchedulePo convert(final DataObject dataObject) { 
			final SystemSchedulePo systemSchedulePo = new SystemSchedulePo(); 
			systemSchedulePo.setServiceName(dataObject.getString(SystemSchedulePo.COLUMNS.SERVICE_NAME.name())); 
			systemSchedulePo.setStatus(dataObject.getString(SystemSchedulePo.COLUMNS.STATUS.name())); 
			systemSchedulePo.setExecutionInterval(); 
			systemSchedulePo.setUpdateFrequency(); 
			systemSchedulePo.setLastUpdateTime(TimestampUtils.of(dataObject.getValue(SystemSchedulePo.COLUMNS.LAST_UPDATE_TIME.name()))); 
			return systemSchedulePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SystemSchedulePo systemSchedulePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SystemSchedulePo.COLUMNS.SERVICE_NAME.name(), systemSchedulePo.getServiceName()); 
			dataObject.setValue(SystemSchedulePo.COLUMNS.STATUS.name(), systemSchedulePo.getStatus()); 
			dataObject.setValue(SystemSchedulePo.COLUMNS.EXECUTION_INTERVAL.name(), systemSchedulePo.getExecutionInterval()); 
			dataObject.setValue(SystemSchedulePo.COLUMNS.UPDATE_FREQUENCY.name(), systemSchedulePo.getUpdateFrequency()); 
			dataObject.setValue(SystemSchedulePo.COLUMNS.LAST_UPDATE_TIME.name(), systemSchedulePo.getLastUpdateTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SystemSchedulePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SystemSchedulePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(SystemSchedulePo.COLUMNS.SERVICE_NAME.name(), po.getServiceName()); 
		return sqlWhere; 
	} 
 
} 
