package com.doc.common.dao.impl; 
 
public class LoginErrRecordDAOImpl extends GeneralDAOImpl<LoginErrRecordPo> implements LoginErrRecordDAO { 
	public static final LoginErrRecordDAOImpl INSTANCE = new LoginErrRecordDAOImpl(); 
	public static final String TABLENAME = "LOGIN_ERR_RECORD"; 

	public LoginErrRecordDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LoginErrRecordPo> CONVERTER = new MapConverter<LoginErrRecordPo>() { 
 
		@Override 
		public LoginErrRecordPo convert(final DataObject dataObject) { 
			final LoginErrRecordPo loginErrRecordPo = new LoginErrRecordPo(); 
			loginErrRecordPo.setLoginDate(dataObject.getString(LoginErrRecordPo.COLUMNS.LOGIN_DATE.name())); 
			loginErrRecordPo.setLoginUser(dataObject.getString(LoginErrRecordPo.COLUMNS.LOGIN_USER.name())); 
			loginErrRecordPo.setLoginErrNote(dataObject.getString(LoginErrRecordPo.COLUMNS.LOGIN_ERR_NOTE.name())); 
			loginErrRecordPo.setLoginIp(dataObject.getString(LoginErrRecordPo.COLUMNS.LOGIN_IP.name())); 
			return loginErrRecordPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LoginErrRecordPo loginErrRecordPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LoginErrRecordPo.COLUMNS.LOGIN_DATE.name(), loginErrRecordPo.getLoginDate()); 
			dataObject.setValue(LoginErrRecordPo.COLUMNS.LOGIN_USER.name(), loginErrRecordPo.getLoginUser()); 
			dataObject.setValue(LoginErrRecordPo.COLUMNS.LOGIN_ERR_NOTE.name(), loginErrRecordPo.getLoginErrNote()); 
			dataObject.setValue(LoginErrRecordPo.COLUMNS.LOGIN_IP.name(), loginErrRecordPo.getLoginIp()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LoginErrRecordPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LoginErrRecordPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
