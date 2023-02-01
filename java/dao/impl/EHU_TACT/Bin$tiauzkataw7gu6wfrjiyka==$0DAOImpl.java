package com.doc.common.dao.impl; 
 
public class Bin$tiauzkataw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkataw7gu6wfrjiyka==$0Po> implements Bin$tiauzkataw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkataw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkataw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKATAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkataw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkataw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkataw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkataw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkataw7gu6wfrjiyka==$0Po bin$tiauzkataw7gu6wfrjiyka==$0Po = new Bin$tiauzkataw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkataw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkataw7gu6wfrjiyka==$0Po bin$tiauzkataw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkataw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkataw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
