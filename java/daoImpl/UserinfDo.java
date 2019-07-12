package com.doc.common.dao.impl; 
 
public class UserinfDAO extends GeneralDAOImpl<UserinfDo> implements UserinfDAO { 
	public static final UserinfDAOImpl INSTANCE = new UserinfDAOImpl(); 
	public static final String TABLENAME = "USERINF"; 

	public UserinfDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<UserinfDo> CONVERTER = new MapConverter<UserinfDo>() { 
 
		@Override 
		public UserinfDo convert(final DataObject dataObject) { 
			final UserinfDo userinfDo = new UserinfDo(); 
			userinfDo.setUserid(dataObject.getString(UserinfDo.COLUMNS.USERID.name())); 
			userinfDo.setUserpw(dataObject.getString(UserinfDo.COLUMNS.USERPW.name())); 
			userinfDo.setAuthid(dataObject.getString(UserinfDo.COLUMNS.AUTHID.name())); 
			userinfDo.setUsername(dataObject.getString(UserinfDo.COLUMNS.USERNAME.name())); 
			userinfDo.setUseroffice(dataObject.getString(UserinfDo.COLUMNS.USEROFFICE.name())); 
			userinfDo.setStatus(dataObject.getString(UserinfDo.COLUMNS.STATUS.name())); 
			userinfDo.setActivedate(dataObject.getString(UserinfDo.COLUMNS.ACTIVEDATE.name())); 
			userinfDo.setEnddate(dataObject.getString(UserinfDo.COLUMNS.ENDDATE.name())); 
			userinfDo.setDepartment(dataObject.getString(UserinfDo.COLUMNS.DEPARTMENT.name())); 
			userinfDo.setTel(dataObject.getString(UserinfDo.COLUMNS.TEL.name())); 
			userinfDo.setLastlogin(dataObject.getString(UserinfDo.COLUMNS.LASTLOGIN.name())); 
			userinfDo.setApId(dataObject.getString(UserinfDo.COLUMNS.AP_ID.name())); 
			userinfDo.setPageType(dataObject.getString(UserinfDo.COLUMNS.PAGE_TYPE.name())); 
			userinfDo.setVersion(dataObject.getString(UserinfDo.COLUMNS.VERSION.name())); 
			userinfDo.setUserIp(dataObject.getString(UserinfDo.COLUMNS.USER_IP.name())); 
			return userinfDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserinfDo userinfDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserinfDo.COLUMNS.USERID.name(), userinfDo.getUserid()); 
			dataObject.setValue(UserinfDo.COLUMNS.USERPW.name(), userinfDo.getUserpw()); 
			dataObject.setValue(UserinfDo.COLUMNS.AUTHID.name(), userinfDo.getAuthid()); 
			dataObject.setValue(UserinfDo.COLUMNS.USERNAME.name(), userinfDo.getUsername()); 
			dataObject.setValue(UserinfDo.COLUMNS.USEROFFICE.name(), userinfDo.getUseroffice()); 
			dataObject.setValue(UserinfDo.COLUMNS.STATUS.name(), userinfDo.getStatus()); 
			dataObject.setValue(UserinfDo.COLUMNS.ACTIVEDATE.name(), userinfDo.getActivedate()); 
			dataObject.setValue(UserinfDo.COLUMNS.ENDDATE.name(), userinfDo.getEnddate()); 
			dataObject.setValue(UserinfDo.COLUMNS.DEPARTMENT.name(), userinfDo.getDepartment()); 
			dataObject.setValue(UserinfDo.COLUMNS.TEL.name(), userinfDo.getTel()); 
			dataObject.setValue(UserinfDo.COLUMNS.LASTLOGIN.name(), userinfDo.getLastlogin()); 
			dataObject.setValue(UserinfDo.COLUMNS.AP_ID.name(), userinfDo.getApId()); 
			dataObject.setValue(UserinfDo.COLUMNS.PAGE_TYPE.name(), userinfDo.getPageType()); 
			dataObject.setValue(UserinfDo.COLUMNS.VERSION.name(), userinfDo.getVersion()); 
			dataObject.setValue(UserinfDo.COLUMNS.USER_IP.name(), userinfDo.getUserIp()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserinfDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserinfDo po) { 
		sqlWhere.add(UserinfDo.COLUMNS.USERPW.name(), po.getUserpw()); 
		sqlWhere.add(UserinfDo.COLUMNS.AUTHID.name(), po.getAuthid()); 
		sqlWhere.add(UserinfDo.COLUMNS.USERNAME.name(), po.getUsername()); 
		sqlWhere.add(UserinfDo.COLUMNS.USEROFFICE.name(), po.getUseroffice()); 
		sqlWhere.add(UserinfDo.COLUMNS.STATUS.name(), po.getStatus()); 
		sqlWhere.add(UserinfDo.COLUMNS.ACTIVEDATE.name(), po.getActivedate()); 
		sqlWhere.add(UserinfDo.COLUMNS.ENDDATE.name(), po.getEnddate()); 
		sqlWhere.add(UserinfDo.COLUMNS.DEPARTMENT.name(), po.getDepartment()); 
		sqlWhere.add(UserinfDo.COLUMNS.TEL.name(), po.getTel()); 
		sqlWhere.add(UserinfDo.COLUMNS.LASTLOGIN.name(), po.getLastlogin()); 
		sqlWhere.add(UserinfDo.COLUMNS.AP_ID.name(), po.getApId()); 
		sqlWhere.add(UserinfDo.COLUMNS.PAGE_TYPE.name(), po.getPageType()); 
		sqlWhere.add(UserinfDo.COLUMNS.VERSION.name(), po.getVersion()); 
		sqlWhere.add(UserinfDo.COLUMNS.USER_IP.name(), po.getUserIp()); 
	} 
 
} 
