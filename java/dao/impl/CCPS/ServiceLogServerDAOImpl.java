package com.doc.common.dao.impl; 
 
public class ServiceLogServerDAOImpl extends GeneralDAOImpl<ServiceLogServerPo> implements ServiceLogServerDAO { 
	public static final ServiceLogServerDAOImpl INSTANCE = new ServiceLogServerDAOImpl(); 
	public static final String TABLENAME = "SERVICE_LOG_SERVER"; 

	public ServiceLogServerDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ServiceLogServerPo> CONVERTER = new MapConverter<ServiceLogServerPo>() { 
 
		@Override 
		public ServiceLogServerPo convert(final DataObject dataObject) { 
			final ServiceLogServerPo serviceLogServerPo = new ServiceLogServerPo(); 
			serviceLogServerPo.setLogDatetime(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_DATETIME.name())); 
			serviceLogServerPo.setLogGuid(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_GUID.name())); 
			serviceLogServerPo.setLogType(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_TYPE.name())); 
			serviceLogServerPo.setLogDesc(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_DESC.name())); 
			serviceLogServerPo.setLogContent(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_CONTENT.name())); 
			serviceLogServerPo.setLogSource(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_SOURCE.name())); 
			serviceLogServerPo.setLogStatus(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_STATUS.name())); 
			serviceLogServerPo.setLogRemark(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_REMARK.name())); 
			serviceLogServerPo.setLogFilename(dataObject.getString(ServiceLogServerPo.COLUMNS.LOG_FILENAME.name())); 
			serviceLogServerPo.setFoodRegNum(dataObject.getString(ServiceLogServerPo.COLUMNS.FOOD_REG_NUM.name())); 
			return serviceLogServerPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ServiceLogServerPo serviceLogServerPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_DATETIME.name(), serviceLogServerPo.getLogDatetime()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_GUID.name(), serviceLogServerPo.getLogGuid()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_TYPE.name(), serviceLogServerPo.getLogType()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_DESC.name(), serviceLogServerPo.getLogDesc()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_CONTENT.name(), serviceLogServerPo.getLogContent()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_SOURCE.name(), serviceLogServerPo.getLogSource()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_STATUS.name(), serviceLogServerPo.getLogStatus()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_REMARK.name(), serviceLogServerPo.getLogRemark()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.LOG_FILENAME.name(), serviceLogServerPo.getLogFilename()); 
			dataObject.setValue(ServiceLogServerPo.COLUMNS.FOOD_REG_NUM.name(), serviceLogServerPo.getFoodRegNum()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ServiceLogServerPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ServiceLogServerPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
