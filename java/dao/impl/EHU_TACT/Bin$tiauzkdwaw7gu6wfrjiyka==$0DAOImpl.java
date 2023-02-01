package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdwaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdwaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdwaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdwaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdwaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDWAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdwaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdwaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdwaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdwaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdwaw7gu6wfrjiyka==$0Po bin$tiauzkdwaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdwaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdwaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdwaw7gu6wfrjiyka==$0Po bin$tiauzkdwaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdwaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdwaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
