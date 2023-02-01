package com.doc.common.dao.impl; 
 
public class Bin$tiauzkbwaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkbwaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkbwaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkbwaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkbwaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKBWAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkbwaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkbwaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkbwaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkbwaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkbwaw7gu6wfrjiyka==$0Po bin$tiauzkbwaw7gu6wfrjiyka==$0Po = new Bin$tiauzkbwaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkbwaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkbwaw7gu6wfrjiyka==$0Po bin$tiauzkbwaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkbwaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkbwaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
