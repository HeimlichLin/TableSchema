package com.doc.common.dao.impl; 
 
public class Bin$tiauzkauaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkauaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkauaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkauaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkauaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKAUAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkauaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkauaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkauaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkauaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkauaw7gu6wfrjiyka==$0Po bin$tiauzkauaw7gu6wfrjiyka==$0Po = new Bin$tiauzkauaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkauaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkauaw7gu6wfrjiyka==$0Po bin$tiauzkauaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkauaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkauaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
