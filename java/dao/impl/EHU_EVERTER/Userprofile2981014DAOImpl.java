package com.doc.common.dao.impl; 
 
public class Userprofile2981014DAOImpl extends GeneralDAOImpl<Userprofile2981014Po> implements Userprofile2981014DAO { 
	public static final Userprofile2981014DAOImpl INSTANCE = new Userprofile2981014DAOImpl(); 
	public static final String TABLENAME = "USERPROFILE2_981014"; 

	public Userprofile2981014DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Userprofile2981014Po> CONVERTER = new MapConverter<Userprofile2981014Po>() { 
 
		@Override 
		public Userprofile2981014Po convert(final DataObject dataObject) { 
			final Userprofile2981014Po userprofile2981014Po = new Userprofile2981014Po(); 
			userprofile2981014Po.setUserid(dataObject.getString(Userprofile2981014Po.COLUMNS.USERID.name())); 
			userprofile2981014Po.setPassword(dataObject.getString(Userprofile2981014Po.COLUMNS.PASSWORD.name())); 
			userprofile2981014Po.setUsername(dataObject.getString(Userprofile2981014Po.COLUMNS.USERNAME.name())); 
			userprofile2981014Po.setPrividge(dataObject.getString(Userprofile2981014Po.COLUMNS.PRIVIDGE.name())); 
			userprofile2981014Po.setExpressid(dataObject.getString(Userprofile2981014Po.COLUMNS.EXPRESSID.name())); 
			return userprofile2981014Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Userprofile2981014Po userprofile2981014Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Userprofile2981014Po.COLUMNS.USERID.name(), userprofile2981014Po.getUserid()); 
			dataObject.setValue(Userprofile2981014Po.COLUMNS.PASSWORD.name(), userprofile2981014Po.getPassword()); 
			dataObject.setValue(Userprofile2981014Po.COLUMNS.USERNAME.name(), userprofile2981014Po.getUsername()); 
			dataObject.setValue(Userprofile2981014Po.COLUMNS.PRIVIDGE.name(), userprofile2981014Po.getPrividge()); 
			dataObject.setValue(Userprofile2981014Po.COLUMNS.EXPRESSID.name(), userprofile2981014Po.getExpressid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Userprofile2981014Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Userprofile2981014Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
