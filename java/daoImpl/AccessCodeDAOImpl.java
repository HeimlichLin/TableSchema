package com.doc.common.dao.impl; 
 
public class AccessCodeDAOImpl extends GeneralDAOImpl<AccessCodeDo> implements AccessCodeDAOImpl { 
	public static final AccessCodeDAOImpl INSTANCE = new AccessCodeDAOImpl(); 
	public static final String TABLENAME = "ACCESS_CODE"; 

	public AccessCodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<AccessCodeDo> CONVERTER = new MapConverter<AccessCodeDo>() { 
 
		@Override 
		public AccessCodeDo convert(final DataObject dataObject) { 
			final AccessCodeDo accessCodeDo = new AccessCodeDo(); 
			accessCodeDo.setCode(dataObject.getString(AccessCodeDo.COLUMNS.CODE.name())); 
			accessCodeDo.setCreateDate(dataObject.getString(AccessCodeDo.COLUMNS.CREATE_DATE.name())); 
			accessCodeDo.setExpiredDate(dataObject.getString(AccessCodeDo.COLUMNS.EXPIRED_DATE.name())); 
			accessCodeDo.setStatus(dataObject.getString(AccessCodeDo.COLUMNS.STATUS.name())); 
			accessCodeDo.setUserId(dataObject.getString(AccessCodeDo.COLUMNS.USER_ID.name())); 
			accessCodeDo.setRegRemoteAddr(dataObject.getString(AccessCodeDo.COLUMNS.REG_REMOTE_ADDR.name())); 
			accessCodeDo.setLastAccRemoteAddr(dataObject.getString(AccessCodeDo.COLUMNS.LAST_ACC_REMOTE_ADDR.name())); 
			accessCodeDo.setLastAccDate(dataObject.getString(AccessCodeDo.COLUMNS.LAST_ACC_DATE.name())); 
			return accessCodeDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AccessCodeDo accessCodeDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AccessCodeDo.COLUMNS.CODE.name(), accessCodeDo.getCode()); 
			dataObject.setValue(AccessCodeDo.COLUMNS.CREATE_DATE.name(), accessCodeDo.getCreateDate()); 
			dataObject.setValue(AccessCodeDo.COLUMNS.EXPIRED_DATE.name(), accessCodeDo.getExpiredDate()); 
			dataObject.setValue(AccessCodeDo.COLUMNS.STATUS.name(), accessCodeDo.getStatus()); 
			dataObject.setValue(AccessCodeDo.COLUMNS.USER_ID.name(), accessCodeDo.getUserId()); 
			dataObject.setValue(AccessCodeDo.COLUMNS.REG_REMOTE_ADDR.name(), accessCodeDo.getRegRemoteAddr()); 
			dataObject.setValue(AccessCodeDo.COLUMNS.LAST_ACC_REMOTE_ADDR.name(), accessCodeDo.getLastAccRemoteAddr()); 
			dataObject.setValue(AccessCodeDo.COLUMNS.LAST_ACC_DATE.name(), accessCodeDo.getLastAccDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AccessCodeDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AccessCodeDo po) { 
		sqlWhere.add(AccessCodeDo.COLUMNS.CODE.name(), po.getCode()); 
	} 
 
} 
