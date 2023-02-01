package com.doc.common.dao.impl; 
 
public class Bin$tiauzj+naw7gu6wfrjiyka==$0DAOImpl extends GeneralDAOImpl<Bin$tiauzj+naw7gu6wfrjiyka==$0Po> implements Bin$tiauzj+naw7gu6wfrjiyka==$0DAO { 
	public static final Bin$tiauzj+naw7gu6wfrjiyka==$0DAOImpl INSTANCE = new Bin$tiauzj+naw7gu6wfrjiyka==$0DAOImpl(); 
	public static final String TABLENAME = "BIN$TIAUZJ+NAW7GU6WFRJIYKA==$0"; 

	public Bin$tiauzj+naw7gu6wfrjiyka==$0DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Bin$tiauzj+naw7gu6wfrjiyka==$0Po> CONVERTER = new MapConverter<Bin$tiauzj+naw7gu6wfrjiyka==$0Po>() { 
 
		@Override 
		public Bin$tiauzj+naw7gu6wfrjiyka==$0Po convert(final DataObject dataObject) { 
			final Bin$tiauzj+naw7gu6wfrjiyka==$0Po bin$tiauzj+naw7gu6wfrjiyka==$0Po = new Bin$tiauzj+naw7gu6wfrjiyka==$0Po(); 
			return bin$tiauzj+naw7gu6wfrjiyka==$0Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Bin$tiauzj+naw7gu6wfrjiyka==$0Po bin$tiauzj+naw7gu6wfrjiyka==$0Po) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Bin$tiauzj+naw7gu6wfrjiyka==$0Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Bin$tiauzj+naw7gu6wfrjiyka==$0Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
