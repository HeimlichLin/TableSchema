package com.doc.common.dao.impl; 
 
public class Bin$tiauzkcmaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzkcmaw7gu6wfrjiyka==$0Po> implements Bin$tiauzkcmaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzkcmaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzkcmaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZKCMAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzkcmaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzkcmaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzkcmaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzkcmaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzkcmaw7gu6wfrjiyka==$0Po bin$tiauzkcmaw7gu6wfrjiyka==$0Po = new Bin$tiauzkcmaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzkcmaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzkcmaw7gu6wfrjiyka==$0Po bin$tiauzkcmaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzkcmaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzkcmaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
