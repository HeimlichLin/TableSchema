package com.doc.common.dao.impl; 
 
public class UserinfLogDAOImpl extends GeneralDAOImpl<UserinfLogDo> implements UserinfLogDAOImpl { 
	public static final UserinfLogDAOImpl INSTANCE = new UserinfLogDAOImpl(); 
	public static final String TABLENAME = "USERINF_LOG"; 

	public UserinfLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<UserinfLogDo> CONVERTER = new MapConverter<UserinfLogDo>() { 
 
		@Override 
		public UserinfLogDo convert(final DataObject dataObject) { 
			final UserinfLogDo userinfLogDo = new UserinfLogDo(); 
			userinfLogDo.setUserid(dataObject.getString(UserinfLogDo.COLUMNS.USERID.name())); 
			userinfLogDo.setUserpw(dataObject.getString(UserinfLogDo.COLUMNS.USERPW.name())); 
			userinfLogDo.setAuthid(dataObject.getString(UserinfLogDo.COLUMNS.AUTHID.name())); 
			userinfLogDo.setUsername(dataObject.getString(UserinfLogDo.COLUMNS.USERNAME.name())); 
			userinfLogDo.setUseroffice(dataObject.getString(UserinfLogDo.COLUMNS.USEROFFICE.name())); 
			userinfLogDo.setStatus(dataObject.getString(UserinfLogDo.COLUMNS.STATUS.name())); 
			userinfLogDo.setActivedate(dataObject.getString(UserinfLogDo.COLUMNS.ACTIVEDATE.name())); 
			userinfLogDo.setEnddate(dataObject.getString(UserinfLogDo.COLUMNS.ENDDATE.name())); 
			userinfLogDo.setDepartment(dataObject.getString(UserinfLogDo.COLUMNS.DEPARTMENT.name())); 
			userinfLogDo.setTel(dataObject.getString(UserinfLogDo.COLUMNS.TEL.name())); 
			userinfLogDo.setLastlogin(dataObject.getString(UserinfLogDo.COLUMNS.LASTLOGIN.name())); 
			userinfLogDo.setProcesstime(CommUtils.objConver2Time(dataObject.getString(UserinfLogDo.COLUMNS.PROCESSTIME.name()))); 
			userinfLogDo.setProcessstate(dataObject.getString(UserinfLogDo.COLUMNS.PROCESSSTATE.name())); 
			return userinfLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserinfLogDo userinfLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserinfLogDo.COLUMNS.USERID.name(), userinfLogDo.getUserid()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.USERPW.name(), userinfLogDo.getUserpw()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.AUTHID.name(), userinfLogDo.getAuthid()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.USERNAME.name(), userinfLogDo.getUsername()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.USEROFFICE.name(), userinfLogDo.getUseroffice()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.STATUS.name(), userinfLogDo.getStatus()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.ACTIVEDATE.name(), userinfLogDo.getActivedate()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.ENDDATE.name(), userinfLogDo.getEnddate()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.DEPARTMENT.name(), userinfLogDo.getDepartment()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.TEL.name(), userinfLogDo.getTel()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.LASTLOGIN.name(), userinfLogDo.getLastlogin()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.PROCESSTIME.name(), userinfLogDo.getProcesstime()); 
			dataObject.setValue(UserinfLogDo.COLUMNS.PROCESSSTATE.name(), userinfLogDo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserinfLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserinfLogDo po) { 
	} 
 
} 