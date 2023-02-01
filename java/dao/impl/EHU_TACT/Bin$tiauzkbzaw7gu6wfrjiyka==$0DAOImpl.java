package com.doc.common.dao.impl; 
 
public class Bin$tiauzkbzaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkbzaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkbzaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkbzaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkbzaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKBZAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkbzaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkbzaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkbzaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkbzaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkbzaw7gu6wfrjiyka==$0Po bin$tiauzkbzaw7gu6wfrjiyka==$0Po = new Bin$tiauzkbzaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkbzaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkbzaw7gu6wfrjiyka==$0Po bin$tiauzkbzaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkbzaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkbzaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
