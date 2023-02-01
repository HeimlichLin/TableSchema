package com.doc.common.dao.impl; 
 
public class SystemActiveInfoDAOImpl extends GeneralDAOImpl<SystemActiveInfoPo> implements SystemActiveInfoDAO { 
	public static final SystemActiveInfoDAOImpl INSTANCE = new SystemActiveInfoDAOImpl(); 
	public static final String TABLENAME = "SYSTEM_ACTIVE_INFO"; 

	public SystemActiveInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SystemActiveInfoPo> CONVERTER = new MapConverter<SystemActiveInfoPo>() { 
 
		@Override 
		public SystemActiveInfoPo convert(final DataObject dataObject) { 
			final SystemActiveInfoPo systemActiveInfoPo = new SystemActiveInfoPo(); 
			systemActiveInfoPo.setSysCode(dataObject.getString(SystemActiveInfoPo.COLUMNS.SYS_CODE.name())); 
			systemActiveInfoPo.setFoodRegNum(dataObject.getString(SystemActiveInfoPo.COLUMNS.FOOD_REG_NUM.name())); 
			systemActiveInfoPo.setProdActCode(dataObject.getString(SystemActiveInfoPo.COLUMNS.PROD_ACT_CODE.name())); 
			systemActiveInfoPo.setStatus(dataObject.getString(SystemActiveInfoPo.COLUMNS.STATUS.name())); 
			systemActiveInfoPo.setApiKey(dataObject.getString(SystemActiveInfoPo.COLUMNS.API_KEY.name())); 
			systemActiveInfoPo.setSecurityKey(dataObject.getString(SystemActiveInfoPo.COLUMNS.SECURITY_KEY.name())); 
			systemActiveInfoPo.setInsertday(TimestampUtils.of(dataObject.getValue(SystemActiveInfoPo.COLUMNS.INSERTDAY.name()))); 
			systemActiveInfoPo.setIsAuth(dataObject.getString(SystemActiveInfoPo.COLUMNS.IS_AUTH.name())); 
			systemActiveInfoPo.setAuthId(dataObject.getString(SystemActiveInfoPo.COLUMNS.AUTH_ID.name())); 
			systemActiveInfoPo.setBan(dataObject.getString(SystemActiveInfoPo.COLUMNS.BAN.name())); 
			return systemActiveInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SystemActiveInfoPo systemActiveInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.SYS_CODE.name(), systemActiveInfoPo.getSysCode()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.FOOD_REG_NUM.name(), systemActiveInfoPo.getFoodRegNum()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.PROD_ACT_CODE.name(), systemActiveInfoPo.getProdActCode()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.STATUS.name(), systemActiveInfoPo.getStatus()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.API_KEY.name(), systemActiveInfoPo.getApiKey()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.SECURITY_KEY.name(), systemActiveInfoPo.getSecurityKey()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.INSERTDAY.name(), systemActiveInfoPo.getInsertday()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.IS_AUTH.name(), systemActiveInfoPo.getIsAuth()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.AUTH_ID.name(), systemActiveInfoPo.getAuthId()); 
			dataObject.setValue(SystemActiveInfoPo.COLUMNS.BAN.name(), systemActiveInfoPo.getBan()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SystemActiveInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SystemActiveInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(SystemActiveInfoPo.COLUMNS.SYS_CODE.name(), po.getSysCode()); 
		sqlWhere.add(SystemActiveInfoPo.COLUMNS.FOOD_REG_NUM.name(), po.getFoodRegNum()); 
		return sqlWhere; 
	} 
 
} 
