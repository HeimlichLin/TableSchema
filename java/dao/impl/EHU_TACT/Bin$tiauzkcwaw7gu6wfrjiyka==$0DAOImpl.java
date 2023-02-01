package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcwaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcwaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcwaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcwaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcwaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCWAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcwaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcwaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcwaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcwaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcwaw7gu6wfrjiyka==$0Po bin$tiauzkcwaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcwaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcwaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcwaw7gu6wfrjiyka==$0Po bin$tiauzkcwaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcwaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcwaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
