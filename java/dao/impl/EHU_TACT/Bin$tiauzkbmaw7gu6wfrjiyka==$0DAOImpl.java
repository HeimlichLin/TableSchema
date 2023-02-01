package com.doc.common.dao.impl; 
 
public class Bin$tiauzkbmaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkbmaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkbmaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkbmaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkbmaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKBMAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkbmaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkbmaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkbmaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkbmaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkbmaw7gu6wfrjiyka==$0Po bin$tiauzkbmaw7gu6wfrjiyka==$0Po = new Bin$tiauzkbmaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkbmaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkbmaw7gu6wfrjiyka==$0Po bin$tiauzkbmaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkbmaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkbmaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
