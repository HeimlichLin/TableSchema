package com.doc.common.dao.impl; 
 
public class Bin$tiauzkckaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkckaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkckaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkckaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkckaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCKAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkckaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkckaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkckaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkckaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkckaw7gu6wfrjiyka==$0Po bin$tiauzkckaw7gu6wfrjiyka==$0Po = new Bin$tiauzkckaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkckaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkckaw7gu6wfrjiyka==$0Po bin$tiauzkckaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkckaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkckaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
