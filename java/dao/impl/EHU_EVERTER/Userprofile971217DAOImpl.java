package com.doc.common.dao.impl; 
 
public class Userprofile971217DAOImpl extends GeneralDAOImpl<Userprofile971217Po> implements Userprofile971217DAO { 
	public static final Userprofile971217DAOImpl INSTANCE = new Userprofile971217DAOImpl(); 
	public static final String TABLENAME = "USERPROFILE_971217"; 

	public Userprofile971217DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Userprofile971217Po> CONVERTER = new MapConverter<Userprofile971217Po>() { 
 
		@Override 
		public Userprofile971217Po convert(final DataObject dataObject) { 
			final Userprofile971217Po userprofile971217Po = new Userprofile971217Po(); 
			userprofile971217Po.setUserid(dataObject.getString(Userprofile971217Po.COLUMNS.USERID.name())); 
			userprofile971217Po.setPassword(dataObject.getString(Userprofile971217Po.COLUMNS.PASSWORD.name())); 
			userprofile971217Po.setUsername(dataObject.getString(Userprofile971217Po.COLUMNS.USERNAME.name())); 
			userprofile971217Po.setPrividge(dataObject.getString(Userprofile971217Po.COLUMNS.PRIVIDGE.name())); 
			userprofile971217Po.setExpressid(dataObject.getString(Userprofile971217Po.COLUMNS.EXPRESSID.name())); 
			return userprofile971217Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Userprofile971217Po userprofile971217Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Userprofile971217Po.COLUMNS.USERID.name(), userprofile971217Po.getUserid()); 
			dataObject.setValue(Userprofile971217Po.COLUMNS.PASSWORD.name(), userprofile971217Po.getPassword()); 
			dataObject.setValue(Userprofile971217Po.COLUMNS.USERNAME.name(), userprofile971217Po.getUsername()); 
			dataObject.setValue(Userprofile971217Po.COLUMNS.PRIVIDGE.name(), userprofile971217Po.getPrividge()); 
			dataObject.setValue(Userprofile971217Po.COLUMNS.EXPRESSID.name(), userprofile971217Po.getExpressid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Userprofile971217Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Userprofile971217Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
