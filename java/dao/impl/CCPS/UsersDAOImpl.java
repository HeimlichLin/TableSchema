package com.doc.common.dao.impl; 
 
public class UsersDAOImpl extends GeneralDAOImpl<UsersPo> implements UsersDAO { 
	public static final UsersDAOImpl INSTANCE = new UsersDAOImpl(); 
	public static final String TABLENAME = "USERS"; 

	public UsersDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UsersPo> CONVERTER = new MapConverter<UsersPo>() { 
 
		@Override 
		public UsersPo convert(final DataObject dataObject) { 
			final UsersPo usersPo = new UsersPo(); 
			usersPo.setUsername(dataObject.getString(UsersPo.COLUMNS.USERNAME.name())); 
			usersPo.setPassword(dataObject.getString(UsersPo.COLUMNS.PASSWORD.name())); 
			usersPo.setEnabled(dataObject.getString(UsersPo.COLUMNS.ENABLED.name())); 
			return usersPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UsersPo usersPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UsersPo.COLUMNS.USERNAME.name(), usersPo.getUsername()); 
			dataObject.setValue(UsersPo.COLUMNS.PASSWORD.name(), usersPo.getPassword()); 
			dataObject.setValue(UsersPo.COLUMNS.ENABLED.name(), usersPo.getEnabled()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UsersPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UsersPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(UsersPo.COLUMNS.USERNAME.name(), po.getUsername()); 
		return sqlWhere; 
	} 
 
} 
