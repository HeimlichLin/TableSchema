package com.doc.common.dao.impl; 
 
public class LoginlogDAOImpl extends GeneralDAOImpl<LoginlogPo> implements LoginlogDAO { 
	public static final LoginlogDAOImpl INSTANCE = new LoginlogDAOImpl(); 
	public static final String TABLENAME = "LOGINLOG"; 

	public LoginlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LoginlogPo> CONVERTER = new MapConverter<LoginlogPo>() { 
 
		@Override 
		public LoginlogPo convert(final DataObject dataObject) { 
			final LoginlogPo loginlogPo = new LoginlogPo(); 
			loginlogPo.setUserId(dataObject.getString(LoginlogPo.COLUMNS.USER_ID.name())); 
			loginlogPo.setClentIp(dataObject.getString(LoginlogPo.COLUMNS.CLENT_IP.name())); 
			loginlogPo.setServerIp(dataObject.getString(LoginlogPo.COLUMNS.SERVER_IP.name())); 
			loginlogPo.setSessionId(dataObject.getString(LoginlogPo.COLUMNS.SESSION_ID.name())); 
			loginlogPo.setStatus(dataObject.getString(LoginlogPo.COLUMNS.STATUS.name())); 
			loginlogPo.setLoginTime(dataObject.getString(LoginlogPo.COLUMNS.LOGIN_TIME.name())); 
			return loginlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LoginlogPo loginlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LoginlogPo.COLUMNS.USER_ID.name(), loginlogPo.getUserId()); 
			dataObject.setValue(LoginlogPo.COLUMNS.CLENT_IP.name(), loginlogPo.getClentIp()); 
			dataObject.setValue(LoginlogPo.COLUMNS.SERVER_IP.name(), loginlogPo.getServerIp()); 
			dataObject.setValue(LoginlogPo.COLUMNS.SESSION_ID.name(), loginlogPo.getSessionId()); 
			dataObject.setValue(LoginlogPo.COLUMNS.STATUS.name(), loginlogPo.getStatus()); 
			dataObject.setValue(LoginlogPo.COLUMNS.LOGIN_TIME.name(), loginlogPo.getLoginTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LoginlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LoginlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
