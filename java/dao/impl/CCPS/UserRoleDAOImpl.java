package com.doc.common.dao.impl; 
 
public class UserRoleDAOImpl extends GeneralDAOImpl<UserRolePo> implements UserRoleDAO { 
	public static final UserRoleDAOImpl INSTANCE = new UserRoleDAOImpl(); 
	public static final String TABLENAME = "USER_ROLE"; 

	public UserRoleDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UserRolePo> CONVERTER = new MapConverter<UserRolePo>() { 
 
		@Override 
		public UserRolePo convert(final DataObject dataObject) { 
			final UserRolePo userRolePo = new UserRolePo(); 
			userRolePo.setUserId(dataObject.getString(UserRolePo.COLUMNS.USER_ID.name())); 
			userRolePo.setRoleId(dataObject.getString(UserRolePo.COLUMNS.ROLE_ID.name())); 
			return userRolePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserRolePo userRolePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserRolePo.COLUMNS.USER_ID.name(), userRolePo.getUserId()); 
			dataObject.setValue(UserRolePo.COLUMNS.ROLE_ID.name(), userRolePo.getRoleId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserRolePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserRolePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(UserRolePo.COLUMNS.USER_ID.name(), po.getUserId()); 
		sqlWhere.add(UserRolePo.COLUMNS.ROLE_ID.name(), po.getRoleId()); 
		return sqlWhere; 
	} 
 
} 
