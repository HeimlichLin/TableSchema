package com.doc.common.dao.impl; 
 
public class Usermodifylog971217DAOImpl extends GeneralDAOImpl<Usermodifylog971217Po> implements Usermodifylog971217DAO { 
	public static final Usermodifylog971217DAOImpl INSTANCE = new Usermodifylog971217DAOImpl(); 
	public static final String TABLENAME = "USERMODIFYLOG_971217"; 

	public Usermodifylog971217DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Usermodifylog971217Po> CONVERTER = new MapConverter<Usermodifylog971217Po>() { 
 
		@Override 
		public Usermodifylog971217Po convert(final DataObject dataObject) { 
			final Usermodifylog971217Po usermodifylog971217Po = new Usermodifylog971217Po(); 
			usermodifylog971217Po.setLoguserid(dataObject.getString(Usermodifylog971217Po.COLUMNS.LOGUSERID.name())); 
			usermodifylog971217Po.setLogdate(TimestampUtils.of(dataObject.getValue(Usermodifylog971217Po.COLUMNS.LOGDATE.name()))); 
			usermodifylog971217Po.setAction(dataObject.getString(Usermodifylog971217Po.COLUMNS.ACTION.name())); 
			usermodifylog971217Po.setOlduserid(dataObject.getString(Usermodifylog971217Po.COLUMNS.OLDUSERID.name())); 
			usermodifylog971217Po.setOldpassword(dataObject.getString(Usermodifylog971217Po.COLUMNS.OLDPASSWORD.name())); 
			usermodifylog971217Po.setOldusername(dataObject.getString(Usermodifylog971217Po.COLUMNS.OLDUSERNAME.name())); 
			usermodifylog971217Po.setOldprividge(dataObject.getString(Usermodifylog971217Po.COLUMNS.OLDPRIVIDGE.name())); 
			usermodifylog971217Po.setNewuserid(dataObject.getString(Usermodifylog971217Po.COLUMNS.NEWUSERID.name())); 
			usermodifylog971217Po.setNewpassword(dataObject.getString(Usermodifylog971217Po.COLUMNS.NEWPASSWORD.name())); 
			usermodifylog971217Po.setNewusername(dataObject.getString(Usermodifylog971217Po.COLUMNS.NEWUSERNAME.name())); 
			usermodifylog971217Po.setNewprividge(dataObject.getString(Usermodifylog971217Po.COLUMNS.NEWPRIVIDGE.name())); 
			return usermodifylog971217Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Usermodifylog971217Po usermodifylog971217Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.LOGUSERID.name(), usermodifylog971217Po.getLoguserid()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.LOGDATE.name(), usermodifylog971217Po.getLogdate()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.ACTION.name(), usermodifylog971217Po.getAction()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.OLDUSERID.name(), usermodifylog971217Po.getOlduserid()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.OLDPASSWORD.name(), usermodifylog971217Po.getOldpassword()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.OLDUSERNAME.name(), usermodifylog971217Po.getOldusername()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.OLDPRIVIDGE.name(), usermodifylog971217Po.getOldprividge()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.NEWUSERID.name(), usermodifylog971217Po.getNewuserid()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.NEWPASSWORD.name(), usermodifylog971217Po.getNewpassword()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.NEWUSERNAME.name(), usermodifylog971217Po.getNewusername()); 
			dataObject.setValue(Usermodifylog971217Po.COLUMNS.NEWPRIVIDGE.name(), usermodifylog971217Po.getNewprividge()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Usermodifylog971217Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Usermodifylog971217Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
