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
			userinfPo.setUserid(dataObject.getString(UserinfPo.COLUMNS.USERID.name())); 
			userinfPo.setUserpw(dataObject.getString(UserinfPo.COLUMNS.USERPW.name())); 
			userinfPo.setAuthid(dataObject.getString(UserinfPo.COLUMNS.AUTHID.name())); 
			userinfPo.setUsername(dataObject.getString(UserinfPo.COLUMNS.USERNAME.name())); 
			userinfPo.setUseroffice(dataObject.getString(UserinfPo.COLUMNS.USEROFFICE.name())); 
			userinfPo.setStatus(dataObject.getString(UserinfPo.COLUMNS.STATUS.name())); 
			userinfPo.setActivedate(dataObject.getString(UserinfPo.COLUMNS.ACTIVEDATE.name())); 
			userinfPo.setEnddate(dataObject.getString(UserinfPo.COLUMNS.ENDDATE.name())); 
			userinfPo.setDepartment(dataObject.getString(UserinfPo.COLUMNS.DEPARTMENT.name())); 
			userinfPo.setTel(dataObject.getString(UserinfPo.COLUMNS.TEL.name())); 
			userinfPo.setLastlogin(dataObject.getString(UserinfPo.COLUMNS.LASTLOGIN.name())); 
			return userinfPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserinfPo userinfPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserinfPo.COLUMNS.USERID.name(), userinfPo.getUserid()); 
			dataObject.setValue(UserinfPo.COLUMNS.USERPW.name(), userinfPo.getUserpw()); 
			dataObject.setValue(UserinfPo.COLUMNS.AUTHID.name(), userinfPo.getAuthid()); 
			dataObject.setValue(UserinfPo.COLUMNS.USERNAME.name(), userinfPo.getUsername()); 
			dataObject.setValue(UserinfPo.COLUMNS.USEROFFICE.name(), userinfPo.getUseroffice()); 
			dataObject.setValue(UserinfPo.COLUMNS.STATUS.name(), userinfPo.getStatus()); 
			dataObject.setValue(UserinfPo.COLUMNS.ACTIVEDATE.name(), userinfPo.getActivedate()); 
			dataObject.setValue(UserinfPo.COLUMNS.ENDDATE.name(), userinfPo.getEnddate()); 
			dataObject.setValue(UserinfPo.COLUMNS.DEPARTMENT.name(), userinfPo.getDepartment()); 
			dataObject.setValue(UserinfPo.COLUMNS.TEL.name(), userinfPo.getTel()); 
			dataObject.setValue(UserinfPo.COLUMNS.LASTLOGIN.name(), userinfPo.getLastlogin()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserinfPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserinfPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(UserinfPo.COLUMNS.USERID.name(), po.getUserid()); 
		return sqlWhere; 
	} 
 
} 
