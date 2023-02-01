package com.doc.common.dao.impl; 
 
public class UserinfLogDAOImpl extends GeneralDAOImpl<UserinfLogPo> implements UserinfLogDAO { 
	public static final UserinfLogDAOImpl INSTANCE = new UserinfLogDAOImpl(); 
	public static final String TABLENAME = "USERINF_LOG"; 

	public UserinfLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UserinfLogPo> CONVERTER = new MapConverter<UserinfLogPo>() { 
 
		@Override 
		public UserinfLogPo convert(final DataObject dataObject) { 
			final UserinfLogPo userinfLogPo = new UserinfLogPo(); 
			userinfLogPo.setUserid(dataObject.getString(UserinfLogPo.COLUMNS.USERID.name())); 
			userinfLogPo.setUserpw(dataObject.getString(UserinfLogPo.COLUMNS.USERPW.name())); 
			userinfLogPo.setAuthid(dataObject.getString(UserinfLogPo.COLUMNS.AUTHID.name())); 
			userinfLogPo.setUsername(dataObject.getString(UserinfLogPo.COLUMNS.USERNAME.name())); 
			userinfLogPo.setUseroffice(dataObject.getString(UserinfLogPo.COLUMNS.USEROFFICE.name())); 
			userinfLogPo.setStatus(dataObject.getString(UserinfLogPo.COLUMNS.STATUS.name())); 
			userinfLogPo.setActivedate(dataObject.getString(UserinfLogPo.COLUMNS.ACTIVEDATE.name())); 
			userinfLogPo.setEnddate(dataObject.getString(UserinfLogPo.COLUMNS.ENDDATE.name())); 
			userinfLogPo.setDepartment(dataObject.getString(UserinfLogPo.COLUMNS.DEPARTMENT.name())); 
			userinfLogPo.setTel(dataObject.getString(UserinfLogPo.COLUMNS.TEL.name())); 
			userinfLogPo.setLastlogin(dataObject.getString(UserinfLogPo.COLUMNS.LASTLOGIN.name())); 
			userinfLogPo.setProcesstime(TimestampUtils.of(dataObject.getValue(UserinfLogPo.COLUMNS.PROCESSTIME.name()))); 
			userinfLogPo.setProcessstate(dataObject.getString(UserinfLogPo.COLUMNS.PROCESSSTATE.name())); 
			return userinfLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserinfLogPo userinfLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserinfLogPo.COLUMNS.USERID.name(), userinfLogPo.getUserid()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.USERPW.name(), userinfLogPo.getUserpw()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.AUTHID.name(), userinfLogPo.getAuthid()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.USERNAME.name(), userinfLogPo.getUsername()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.USEROFFICE.name(), userinfLogPo.getUseroffice()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.STATUS.name(), userinfLogPo.getStatus()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.ACTIVEDATE.name(), userinfLogPo.getActivedate()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.ENDDATE.name(), userinfLogPo.getEnddate()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.DEPARTMENT.name(), userinfLogPo.getDepartment()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.TEL.name(), userinfLogPo.getTel()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.LASTLOGIN.name(), userinfLogPo.getLastlogin()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.PROCESSTIME.name(), userinfLogPo.getProcesstime()); 
			dataObject.setValue(UserinfLogPo.COLUMNS.PROCESSSTATE.name(), userinfLogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserinfLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserinfLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
