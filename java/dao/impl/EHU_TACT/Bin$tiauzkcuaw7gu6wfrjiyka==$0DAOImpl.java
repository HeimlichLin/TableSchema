package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcuaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcuaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcuaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcuaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcuaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCUAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcuaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcuaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcuaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcuaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcuaw7gu6wfrjiyka==$0Po bin$tiauzkcuaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcuaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcuaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcuaw7gu6wfrjiyka==$0Po bin$tiauzkcuaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcuaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcuaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
