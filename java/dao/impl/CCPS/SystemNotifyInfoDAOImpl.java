package com.doc.common.dao.impl; 
 
public class SystemNotifyInfoDAOImpl extends GeneralDAOImpl<SystemNotifyInfoPo> implements SystemNotifyInfoDAO { 
	public static final SystemNotifyInfoDAOImpl INSTANCE = new SystemNotifyInfoDAOImpl(); 
	public static final String TABLENAME = "SYSTEM_NOTIFY_INFO"; 

	public SystemNotifyInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SystemNotifyInfoPo> CONVERTER = new MapConverter<SystemNotifyInfoPo>() { 
 
		@Override 
		public SystemNotifyInfoPo convert(final DataObject dataObject) { 
			final SystemNotifyInfoPo systemNotifyInfoPo = new SystemNotifyInfoPo(); 
			systemNotifyInfoPo.setAuthId(dataObject.getString(SystemNotifyInfoPo.COLUMNS.AUTH_ID.name())); 
			systemNotifyInfoPo.setSysCode(dataObject.getString(SystemNotifyInfoPo.COLUMNS.SYS_CODE.name())); 
			systemNotifyInfoPo.setFoodRegNum(dataObject.getString(SystemNotifyInfoPo.COLUMNS.FOOD_REG_NUM.name())); 
			systemNotifyInfoPo.setNotifyType(dataObject.getString(SystemNotifyInfoPo.COLUMNS.NOTIFY_TYPE.name())); 
			systemNotifyInfoPo.setNotifyInfo(dataObject.getString(SystemNotifyInfoPo.COLUMNS.NOTIFY_INFO.name())); 
			return systemNotifyInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SystemNotifyInfoPo systemNotifyInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SystemNotifyInfoPo.COLUMNS.AUTH_ID.name(), systemNotifyInfoPo.getAuthId()); 
			dataObject.setValue(SystemNotifyInfoPo.COLUMNS.SYS_CODE.name(), systemNotifyInfoPo.getSysCode()); 
			dataObject.setValue(SystemNotifyInfoPo.COLUMNS.FOOD_REG_NUM.name(), systemNotifyInfoPo.getFoodRegNum()); 
			dataObject.setValue(SystemNotifyInfoPo.COLUMNS.NOTIFY_TYPE.name(), systemNotifyInfoPo.getNotifyType()); 
			dataObject.setValue(SystemNotifyInfoPo.COLUMNS.NOTIFY_INFO.name(), systemNotifyInfoPo.getNotifyInfo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SystemNotifyInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SystemNotifyInfoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
