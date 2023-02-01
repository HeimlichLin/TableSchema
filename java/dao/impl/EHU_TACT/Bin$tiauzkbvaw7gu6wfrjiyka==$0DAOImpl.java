package com.doc.common.dao.impl; 
 
public class Bin$tiauzkbvaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkbvaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkbvaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkbvaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkbvaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKBVAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkbvaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkbvaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkbvaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkbvaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkbvaw7gu6wfrjiyka==$0Po bin$tiauzkbvaw7gu6wfrjiyka==$0Po = new Bin$tiauzkbvaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkbvaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkbvaw7gu6wfrjiyka==$0Po bin$tiauzkbvaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkbvaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkbvaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
