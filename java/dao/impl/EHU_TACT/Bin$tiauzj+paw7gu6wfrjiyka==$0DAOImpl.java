package com.doc.common.dao.impl; 
 
public class Bin$tiauzj+paw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzj+paw7gu6wfrjiyka==$0Po> implements Bin$tiauzj+paw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzj+paw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzj+paw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZJ+PAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzj+paw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzj+paw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzj+paw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzj+paw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzj+paw7gu6wfrjiyka==$0Po bin$tiauzj+paw7gu6wfrjiyka==$0Po = new Bin$tiauzj+paw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzj+paw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzj+paw7gu6wfrjiyka==$0Po bin$tiauzj+paw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzj+paw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzj+paw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
