package com.doc.common.dao.impl; 
 
public class UserLogDAOImpl extends GeneralDAOImpl<UserLogPo> implements UserLogDAO { 
	public static final UserLogDAOImpl INSTANCE = new UserLogDAOImpl(); 
	public static final String TABLENAME = "USER_LOG"; 

	public UserLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UserLogPo> CONVERTER = new MapConverter<UserLogPo>() { 
 
		@Override 
		public UserLogPo convert(final DataObject dataObject) { 
			final UserLogPo userLogPo = new UserLogPo(); 
			userLogPo.setBondno(dataObject.getString(UserLogPo.COLUMNS.BONDNO.name())); 
			userLogPo.setBondban(dataObject.getString(UserLogPo.COLUMNS.BONDBAN.name())); 
			userLogPo.setBondname(dataObject.getString(UserLogPo.COLUMNS.BONDNAME.name())); 
			userLogPo.setSpecialst(dataObject.getString(UserLogPo.COLUMNS.SPECIALST.name())); 
			userLogPo.setBondid(dataObject.getString(UserLogPo.COLUMNS.BONDID.name())); 
			userLogPo.setAuthority(dataObject.getString(UserLogPo.COLUMNS.AUTHORITY.name())); 
			userLogPo.setCustomsoffice(dataObject.getString(UserLogPo.COLUMNS.CUSTOMSOFFICE.name())); 
			userLogPo.setLogintime(dataObject.getString(UserLogPo.COLUMNS.LOGINTIME.name())); 
			return userLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UserLogPo userLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UserLogPo.COLUMNS.BONDNO.name(), userLogPo.getBondno()); 
			dataObject.setValue(UserLogPo.COLUMNS.BONDBAN.name(), userLogPo.getBondban()); 
			dataObject.setValue(UserLogPo.COLUMNS.BONDNAME.name(), userLogPo.getBondname()); 
			dataObject.setValue(UserLogPo.COLUMNS.SPECIALST.name(), userLogPo.getSpecialst()); 
			dataObject.setValue(UserLogPo.COLUMNS.BONDID.name(), userLogPo.getBondid()); 
			dataObject.setValue(UserLogPo.COLUMNS.AUTHORITY.name(), userLogPo.getAuthority()); 
			dataObject.setValue(UserLogPo.COLUMNS.CUSTOMSOFFICE.name(), userLogPo.getCustomsoffice()); 
			dataObject.setValue(UserLogPo.COLUMNS.LOGINTIME.name(), userLogPo.getLogintime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UserLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UserLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
