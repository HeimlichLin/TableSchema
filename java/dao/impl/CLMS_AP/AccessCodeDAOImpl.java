package com.doc.common.dao.impl; 
 
public class AccessCodeDAOImpl extends GeneralDAOImpl<AccessCodePo> implements AccessCodeDAO { 
	public static final AccessCodeDAOImpl INSTANCE = new AccessCodeDAOImpl(); 
	public static final String TABLENAME = "ACCESS_CODE"; 

	public AccessCodeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AccessCodePo> CONVERTER = new MapConverter<AccessCodePo>() { 
 
		@Override 
		public AccessCodePo convert(final DataObject dataObject) { 
			final AccessCodePo accessCodePo = new AccessCodePo(); 
			accessCodePo.setCode(dataObject.getString(AccessCodePo.COLUMNS.CODE.name())); 
			accessCodePo.setCreateDate(); 
			accessCodePo.setExpiredDate(); 
			accessCodePo.setStatus(dataObject.getString(AccessCodePo.COLUMNS.STATUS.name())); 
			accessCodePo.setUserId(dataObject.getString(AccessCodePo.COLUMNS.USER_ID.name())); 
			accessCodePo.setRegRemoteAddr(dataObject.getString(AccessCodePo.COLUMNS.REG_REMOTE_ADDR.name())); 
			accessCodePo.setLastAccRemoteAddr(dataObject.getString(AccessCodePo.COLUMNS.LAST_ACC_REMOTE_ADDR.name())); 
			accessCodePo.setLastAccDate(); 
			return accessCodePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AccessCodePo accessCodePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AccessCodePo.COLUMNS.CODE.name(), accessCodePo.getCode()); 
			dataObject.setValue(AccessCodePo.COLUMNS.CREATE_DATE.name(), accessCodePo.getCreateDate()); 
			dataObject.setValue(AccessCodePo.COLUMNS.EXPIRED_DATE.name(), accessCodePo.getExpiredDate()); 
			dataObject.setValue(AccessCodePo.COLUMNS.STATUS.name(), accessCodePo.getStatus()); 
			dataObject.setValue(AccessCodePo.COLUMNS.USER_ID.name(), accessCodePo.getUserId()); 
			dataObject.setValue(AccessCodePo.COLUMNS.REG_REMOTE_ADDR.name(), accessCodePo.getRegRemoteAddr()); 
			dataObject.setValue(AccessCodePo.COLUMNS.LAST_ACC_REMOTE_ADDR.name(), accessCodePo.getLastAccRemoteAddr()); 
			dataObject.setValue(AccessCodePo.COLUMNS.LAST_ACC_DATE.name(), accessCodePo.getLastAccDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AccessCodePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AccessCodePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(AccessCodePo.COLUMNS.CODE.name(), po.getCode()); 
		return sqlWhere; 
	} 
 
} 
