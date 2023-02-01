package com.doc.common.dao.impl; 
 
public class UsermodifylogDAOImpl extends GeneralDAOImpl<UsermodifylogPo> implements UsermodifylogDAO { 
	public static final UsermodifylogDAOImpl INSTANCE = new UsermodifylogDAOImpl(); 
	public static final String TABLENAME = "USERMODIFYLOG"; 

	public UsermodifylogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UsermodifylogPo> CONVERTER = new MapConverter<UsermodifylogPo>() { 
 
		@Override 
		public UsermodifylogPo convert(final DataObject dataObject) { 
			final UsermodifylogPo usermodifylogPo = new UsermodifylogPo(); 
			usermodifylogPo.setLoguserid(dataObject.getString(UsermodifylogPo.COLUMNS.LOGUSERID.name())); 
			usermodifylogPo.setLogdate(TimestampUtils.of(dataObject.getValue(UsermodifylogPo.COLUMNS.LOGDATE.name()))); 
			usermodifylogPo.setAction(dataObject.getString(UsermodifylogPo.COLUMNS.ACTION.name())); 
			usermodifylogPo.setOlduserid(dataObject.getString(UsermodifylogPo.COLUMNS.OLDUSERID.name())); 
			usermodifylogPo.setOldpassword(dataObject.getString(UsermodifylogPo.COLUMNS.OLDPASSWORD.name())); 
			usermodifylogPo.setOldusername(dataObject.getString(UsermodifylogPo.COLUMNS.OLDUSERNAME.name())); 
			usermodifylogPo.setOldprividge(dataObject.getString(UsermodifylogPo.COLUMNS.OLDPRIVIDGE.name())); 
			usermodifylogPo.setNewuserid(dataObject.getString(UsermodifylogPo.COLUMNS.NEWUSERID.name())); 
			usermodifylogPo.setNewpassword(dataObject.getString(UsermodifylogPo.COLUMNS.NEWPASSWORD.name())); 
			usermodifylogPo.setNewusername(dataObject.getString(UsermodifylogPo.COLUMNS.NEWUSERNAME.name())); 
			usermodifylogPo.setNewprividge(dataObject.getString(UsermodifylogPo.COLUMNS.NEWPRIVIDGE.name())); 
			return usermodifylogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UsermodifylogPo usermodifylogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.LOGUSERID.name(), usermodifylogPo.getLoguserid()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.LOGDATE.name(), usermodifylogPo.getLogdate()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.ACTION.name(), usermodifylogPo.getAction()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.OLDUSERID.name(), usermodifylogPo.getOlduserid()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.OLDPASSWORD.name(), usermodifylogPo.getOldpassword()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.OLDUSERNAME.name(), usermodifylogPo.getOldusername()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.OLDPRIVIDGE.name(), usermodifylogPo.getOldprividge()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.NEWUSERID.name(), usermodifylogPo.getNewuserid()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.NEWPASSWORD.name(), usermodifylogPo.getNewpassword()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.NEWUSERNAME.name(), usermodifylogPo.getNewusername()); 
			dataObject.setValue(UsermodifylogPo.COLUMNS.NEWPRIVIDGE.name(), usermodifylogPo.getNewprividge()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UsermodifylogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UsermodifylogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
