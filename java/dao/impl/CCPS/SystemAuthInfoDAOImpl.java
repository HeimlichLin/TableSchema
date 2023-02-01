package com.doc.common.dao.impl; 
 
public class SystemAuthInfoDAOImpl extends GeneralDAOImpl<SystemAuthInfoPo> implements SystemAuthInfoDAO { 
	public static final SystemAuthInfoDAOImpl INSTANCE = new SystemAuthInfoDAOImpl(); 
	public static final String TABLENAME = "SYSTEM_AUTH_INFO"; 

	public SystemAuthInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SystemAuthInfoPo> CONVERTER = new MapConverter<SystemAuthInfoPo>() { 
 
		@Override 
		public SystemAuthInfoPo convert(final DataObject dataObject) { 
			final SystemAuthInfoPo systemAuthInfoPo = new SystemAuthInfoPo(); 
			systemAuthInfoPo.setAuthId(dataObject.getString(SystemAuthInfoPo.COLUMNS.AUTH_ID.name())); 
			systemAuthInfoPo.setAuthPass(dataObject.getString(SystemAuthInfoPo.COLUMNS.AUTH_PASS.name())); 
			systemAuthInfoPo.setStatus(dataObject.getString(SystemAuthInfoPo.COLUMNS.STATUS.name())); 
			systemAuthInfoPo.setAuthModule(dataObject.getString(SystemAuthInfoPo.COLUMNS.AUTH_MODULE.name())); 
			systemAuthInfoPo.setSysCode(dataObject.getString(SystemAuthInfoPo.COLUMNS.SYS_CODE.name())); 
			return systemAuthInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SystemAuthInfoPo systemAuthInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SystemAuthInfoPo.COLUMNS.AUTH_ID.name(), systemAuthInfoPo.getAuthId()); 
			dataObject.setValue(SystemAuthInfoPo.COLUMNS.AUTH_PASS.name(), systemAuthInfoPo.getAuthPass()); 
			dataObject.setValue(SystemAuthInfoPo.COLUMNS.STATUS.name(), systemAuthInfoPo.getStatus()); 
			dataObject.setValue(SystemAuthInfoPo.COLUMNS.AUTH_MODULE.name(), systemAuthInfoPo.getAuthModule()); 
			dataObject.setValue(SystemAuthInfoPo.COLUMNS.SYS_CODE.name(), systemAuthInfoPo.getSysCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SystemAuthInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SystemAuthInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(SystemAuthInfoPo.COLUMNS.AUTH_ID.name(), po.getAuthId()); 
		sqlWhere.add(SystemAuthInfoPo.COLUMNS.AUTH_PASS.name(), po.getAuthPass()); 
		return sqlWhere; 
	} 
 
} 
