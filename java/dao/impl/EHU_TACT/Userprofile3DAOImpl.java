package com.doc.common.dao.impl; 
 
public class Userprofile3DAOImpl extends GeneralDAOImpl<Userprofile3Po> implements Userprofile3DAO { 
	public static final Userprofile3DAOImpl INSTANCE = new Userprofile3DAOImpl(); 
	public static final String TABLENAME = "USERPROFILE3"; 

	public Userprofile3DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Userprofile3Po> CONVERTER = new MapConverter<Userprofile3Po>() { 
 
		@Override 
		public Userprofile3Po convert(final DataObject dataObject) { 
			final Userprofile3Po userprofile3Po = new Userprofile3Po(); 
			userprofile3Po.setUserid(dataObject.getString(Userprofile3Po.COLUMNS.USERID.name())); 
			userprofile3Po.setPassword(dataObject.getString(Userprofile3Po.COLUMNS.PASSWORD.name())); 
			userprofile3Po.setUsername(dataObject.getString(Userprofile3Po.COLUMNS.USERNAME.name())); 
			userprofile3Po.setPrividge(dataObject.getString(Userprofile3Po.COLUMNS.PRIVIDGE.name())); 
			userprofile3Po.setExpressid(dataObject.getString(Userprofile3Po.COLUMNS.EXPRESSID.name())); 
			userprofile3Po.setUserarea(dataObject.getString(Userprofile3Po.COLUMNS.USERAREA.name())); 
			userprofile3Po.setPassword1(dataObject.getString(Userprofile3Po.COLUMNS.PASSWORD1.name())); 
			userprofile3Po.setPassword2(dataObject.getString(Userprofile3Po.COLUMNS.PASSWORD2.name())); 
			userprofile3Po.setPassword3(dataObject.getString(Userprofile3Po.COLUMNS.PASSWORD3.name())); 
			userprofile3Po.setPassworddate1(TimestampUtils.of(dataObject.getValue(Userprofile3Po.COLUMNS.PASSWORDDATE1.name()))); 
			userprofile3Po.setPassworddate2(TimestampUtils.of(dataObject.getValue(Userprofile3Po.COLUMNS.PASSWORDDATE2.name()))); 
			userprofile3Po.setPassworddate3(TimestampUtils.of(dataObject.getValue(Userprofile3Po.COLUMNS.PASSWORDDATE3.name()))); 
			userprofile3Po.setForcepwddate(TimestampUtils.of(dataObject.getValue(Userprofile3Po.COLUMNS.FORCEPWDDATE.name()))); 
			return userprofile3Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Userprofile3Po userprofile3Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Userprofile3Po.COLUMNS.USERID.name(), userprofile3Po.getUserid()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.PASSWORD.name(), userprofile3Po.getPassword()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.USERNAME.name(), userprofile3Po.getUsername()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.PRIVIDGE.name(), userprofile3Po.getPrividge()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.EXPRESSID.name(), userprofile3Po.getExpressid()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.USERAREA.name(), userprofile3Po.getUserarea()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.PASSWORD1.name(), userprofile3Po.getPassword1()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.PASSWORD2.name(), userprofile3Po.getPassword2()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.PASSWORD3.name(), userprofile3Po.getPassword3()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.PASSWORDDATE1.name(), userprofile3Po.getPassworddate1()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.PASSWORDDATE2.name(), userprofile3Po.getPassworddate2()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.PASSWORDDATE3.name(), userprofile3Po.getPassworddate3()); 
			dataObject.setValue(Userprofile3Po.COLUMNS.FORCEPWDDATE.name(), userprofile3Po.getForcepwddate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Userprofile3Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Userprofile3Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
