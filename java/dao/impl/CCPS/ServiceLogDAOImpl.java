package com.doc.common.dao.impl; 
 
public class ServiceLogDAOImpl extends GeneralDAOImpl<ServiceLogPo> implements ServiceLogDAO { 
	public static final ServiceLogDAOImpl INSTANCE = new ServiceLogDAOImpl(); 
	public static final String TABLENAME = "SERVICE_LOG"; 

	public ServiceLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ServiceLogPo> CONVERTER = new MapConverter<ServiceLogPo>() { 
 
		@Override 
		public ServiceLogPo convert(final DataObject dataObject) { 
			final ServiceLogPo serviceLogPo = new ServiceLogPo(); 
			serviceLogPo.setLogDatetime(dataObject.getString(ServiceLogPo.COLUMNS.LOG_DATETIME.name())); 
			serviceLogPo.setLogGuid(dataObject.getString(ServiceLogPo.COLUMNS.LOG_GUID.name())); 
			serviceLogPo.setLogType(dataObject.getString(ServiceLogPo.COLUMNS.LOG_TYPE.name())); 
			serviceLogPo.setLogDesc(dataObject.getString(ServiceLogPo.COLUMNS.LOG_DESC.name())); 
			serviceLogPo.setLogContent(dataObject.getString(ServiceLogPo.COLUMNS.LOG_CONTENT.name())); 
			serviceLogPo.setLogSource(dataObject.getString(ServiceLogPo.COLUMNS.LOG_SOURCE.name())); 
			serviceLogPo.setLogStatus(dataObject.getString(ServiceLogPo.COLUMNS.LOG_STATUS.name())); 
			serviceLogPo.setLogRemark(dataObject.getString(ServiceLogPo.COLUMNS.LOG_REMARK.name())); 
			serviceLogPo.setLogFilename(dataObject.getString(ServiceLogPo.COLUMNS.LOG_FILENAME.name())); 
			serviceLogPo.setFoodRegNum(dataObject.getString(ServiceLogPo.COLUMNS.FOOD_REG_NUM.name())); 
			return serviceLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ServiceLogPo serviceLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_DATETIME.name(), serviceLogPo.getLogDatetime()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_GUID.name(), serviceLogPo.getLogGuid()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_TYPE.name(), serviceLogPo.getLogType()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_DESC.name(), serviceLogPo.getLogDesc()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_CONTENT.name(), serviceLogPo.getLogContent()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_SOURCE.name(), serviceLogPo.getLogSource()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_STATUS.name(), serviceLogPo.getLogStatus()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_REMARK.name(), serviceLogPo.getLogRemark()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.LOG_FILENAME.name(), serviceLogPo.getLogFilename()); 
			dataObject.setValue(ServiceLogPo.COLUMNS.FOOD_REG_NUM.name(), serviceLogPo.getFoodRegNum()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ServiceLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ServiceLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
