package com.doc.common.dao.impl; 
 
public class UserLogDAO extends GeneralDAOImpl<UserLogDo> implements UserLogDAO { 
	public static final UserLogDAOImpl INSTANCE = new UserLogDAOImpl(); 
	public static final String TABLENAME = "USER_LOG"; 

	public UserLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<UserLogDo> CONVERTER = new MapConverter<UserLogDo>() { 
 
		@Override 
		public UserLogDo convert(final DataObject dataObject) { 
			final UserLogDo userLogDo = new UserLogDo(); 
			userLogDo.setBondno(dataObject.getString(UserLogDo.COLUMNS.BONDNO.name())); 
			userLogDo.setBondban(dataObject.getString(UserLogDo.COLUMNS.BONDBAN.name())); 
			userLogDo.setBondname(dataObject.getString(UserLogDo.COLUMNS.BONDNAME.name())); 
			userLogDo.setSpecialst(dataObject.getString(UserLogDo.COLUMNS.SPECIALST.name())); 
			userLogDo.setBondid(dataObject.getString(UserLogDo.COLUMNS.BONDID.name())); 
			userLogDo.setAuthority(dataObject.getString(UserLogDo.COLUMNS.AUTHORITY.name())); 
			userLogDo.setCustomsoffice(dataObject.getString(UserLogDo.COLUMNS.CUSTOMSOFFICE.name())); 
			userLogDo.setLogintime(dataObject.getString(UserLogDo.COLUMNS.LOGINTIME.name())); 
			return userLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserLogDo userLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserLogDo.COLUMNS.BONDNO.name(), userLogDo.getBondno()); 
			dataObject.setValue(UserLogDo.COLUMNS.BONDBAN.name(), userLogDo.getBondban()); 
			dataObject.setValue(UserLogDo.COLUMNS.BONDNAME.name(), userLogDo.getBondname()); 
			dataObject.setValue(UserLogDo.COLUMNS.SPECIALST.name(), userLogDo.getSpecialst()); 
			dataObject.setValue(UserLogDo.COLUMNS.BONDID.name(), userLogDo.getBondid()); 
			dataObject.setValue(UserLogDo.COLUMNS.AUTHORITY.name(), userLogDo.getAuthority()); 
			dataObject.setValue(UserLogDo.COLUMNS.CUSTOMSOFFICE.name(), userLogDo.getCustomsoffice()); 
			dataObject.setValue(UserLogDo.COLUMNS.LOGINTIME.name(), userLogDo.getLogintime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserLogDo po) { 
		sqlWhere.add(UserLogDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(UserLogDo.COLUMNS.BONDBAN.name(), po.getBondban()); 
		sqlWhere.add(UserLogDo.COLUMNS.BONDNAME.name(), po.getBondname()); 
		sqlWhere.add(UserLogDo.COLUMNS.SPECIALST.name(), po.getSpecialst()); 
		sqlWhere.add(UserLogDo.COLUMNS.BONDID.name(), po.getBondid()); 
		sqlWhere.add(UserLogDo.COLUMNS.AUTHORITY.name(), po.getAuthority()); 
		sqlWhere.add(UserLogDo.COLUMNS.CUSTOMSOFFICE.name(), po.getCustomsoffice()); 
		sqlWhere.add(UserLogDo.COLUMNS.LOGINTIME.name(), po.getLogintime()); 
	} 
 
} 
