package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcvaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcvaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcvaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcvaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcvaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCVAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcvaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcvaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcvaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcvaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcvaw7gu6wfrjiyka==$0Po bin$tiauzkcvaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcvaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcvaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcvaw7gu6wfrjiyka==$0Po bin$tiauzkcvaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcvaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcvaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
