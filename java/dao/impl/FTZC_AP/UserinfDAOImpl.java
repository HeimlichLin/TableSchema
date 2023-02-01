package com.doc.common.dao.impl; 
 
public class UserinfDAOImpl extends GeneralDAOImpl<UserinfPo> implements UserinfDAO { 
	public static final UserinfDAOImpl INSTANCE = new UserinfDAOImpl(); 
	public static final String TABLENAME = "USERINF"; 

	public UserinfDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UserinfPo> CONVERTER = new MapConverter<UserinfPo>() { 
 
		@Override 
		public UserinfPo convert(final DataObject dataObject) { 
			final UserinfPo userinfPo = new UserinfPo(); 
			userinfPo.setUserId(dataObject.getString(UserinfPo.COLUMNS.USER_ID.name())); 
			userinfPo.setUserPw(dataObject.getString(UserinfPo.COLUMNS.USER_PW.name())); 
			userinfPo.setAuthId(dataObject.getString(UserinfPo.COLUMNS.AUTH_ID.name())); 
			userinfPo.setUserName(dataObject.getString(UserinfPo.COLUMNS.USER_NAME.name())); 
			userinfPo.setUserOffice(dataObject.getString(UserinfPo.COLUMNS.USER_OFFICE.name())); 
			userinfPo.setStatus(dataObject.getString(UserinfPo.COLUMNS.STATUS.name())); 
			userinfPo.setActiveDate(dataObject.getString(UserinfPo.COLUMNS.ACTIVE_DATE.name())); 
			userinfPo.setEndDate(dataObject.getString(UserinfPo.COLUMNS.END_DATE.name())); 
			userinfPo.setDepartment(dataObject.getString(UserinfPo.COLUMNS.DEPARTMENT.name())); 
			userinfPo.setTel(dataObject.getString(UserinfPo.COLUMNS.TEL.name())); 
			userinfPo.setLastLogin(dataObject.getString(UserinfPo.COLUMNS.LAST_LOGIN.name())); 
			userinfPo.setCtmCode(dataObject.getString(UserinfPo.COLUMNS.CTM_CODE.name())); 
			return userinfPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserinfPo userinfPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserinfPo.COLUMNS.USER_ID.name(), userinfPo.getUserId()); 
			dataObject.setValue(UserinfPo.COLUMNS.USER_PW.name(), userinfPo.getUserPw()); 
			dataObject.setValue(UserinfPo.COLUMNS.AUTH_ID.name(), userinfPo.getAuthId()); 
			dataObject.setValue(UserinfPo.COLUMNS.USER_NAME.name(), userinfPo.getUserName()); 
			dataObject.setValue(UserinfPo.COLUMNS.USER_OFFICE.name(), userinfPo.getUserOffice()); 
			dataObject.setValue(UserinfPo.COLUMNS.STATUS.name(), userinfPo.getStatus()); 
			dataObject.setValue(UserinfPo.COLUMNS.ACTIVE_DATE.name(), userinfPo.getActiveDate()); 
			dataObject.setValue(UserinfPo.COLUMNS.END_DATE.name(), userinfPo.getEndDate()); 
			dataObject.setValue(UserinfPo.COLUMNS.DEPARTMENT.name(), userinfPo.getDepartment()); 
			dataObject.setValue(UserinfPo.COLUMNS.TEL.name(), userinfPo.getTel()); 
			dataObject.setValue(UserinfPo.COLUMNS.LAST_LOGIN.name(), userinfPo.getLastLogin()); 
			dataObject.setValue(UserinfPo.COLUMNS.CTM_CODE.name(), userinfPo.getCtmCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserinfPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserinfPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
