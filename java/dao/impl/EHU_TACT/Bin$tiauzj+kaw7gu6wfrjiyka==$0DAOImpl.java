package com.doc.common.dao.impl; 
 
public class Bin$tiauzj+kaw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzj+kaw7gu6wfrjiyka==$0Po> implements Bin$tiauzj+kaw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzj+kaw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzj+kaw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZJ+KAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzj+kaw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzj+kaw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzj+kaw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzj+kaw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzj+kaw7gu6wfrjiyka==$0Po bin$tiauzj+kaw7gu6wfrjiyka==$0Po = new Bin$tiauzj+kaw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzj+kaw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzj+kaw7gu6wfrjiyka==$0Po bin$tiauzj+kaw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzj+kaw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzj+kaw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
