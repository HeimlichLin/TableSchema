package com.doc.common.dao.impl; 
 
public class Bin$tiauzkdzaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkdzaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkdzaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkdzaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkdzaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKDZAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkdzaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkdzaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkdzaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkdzaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkdzaw7gu6wfrjiyka==$0Po bin$tiauzkdzaw7gu6wfrjiyka==$0Po = new Bin$tiauzkdzaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkdzaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkdzaw7gu6wfrjiyka==$0Po bin$tiauzkdzaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkdzaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkdzaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
